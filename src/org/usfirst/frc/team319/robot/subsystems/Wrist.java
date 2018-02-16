package org.usfirst.frc.team319.robot.subsystems;

import java.util.concurrent.TimeUnit;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.models.Instrum;
import org.usfirst.frc.team319.robot.Robot;
import org.usfirst.frc.team319.robot.commands.wrist.WristJoystick;
import org.usfirst.frc.team319.robot.commands.wrist.WristMaintainPosition;
import org.usfirst.frc.team319.robot.commands.wrist.WristMotionMagicTest;
import org.usfirst.frc.team319.robot.commands.wrist.WristStop;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Wrist extends Subsystem {

	public final static int WRIST_PROFILE_UP = 0;
	public final static int WRIST_PROFILE_DOWN = 1;
	StringBuilder _sb = new StringBuilder();
	int loops = 0;
	public final static int upPositionLimit = 0;
	public final static int downPositionLimit = 3319;
	private final static int threshold = 200;

	public final BobTalonSRX wristMotor = new BobTalonSRX(5);

	public Wrist() {

		this.wristMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, WRIST_PROFILE_UP);

		this.wristMotor.setInverted(false);
		this.wristMotor.setSensorPhase(true);

		this.wristMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_13_Base_PIDF0, 10);
		this.wristMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10);

		this.wristMotor.configPeakOutputForward(1);
		this.wristMotor.configPeakOutputReverse(-1);

		this.wristMotor.setSelectedSensorPosition(0, WRIST_PROFILE_UP);

		this.wristMotor.configMotionAcceleration(500);
		this.wristMotor.configMotionCruiseVelocity(2000);

		this.wristMotor.configForwardSoftLimitThreshold(downPositionLimit);
		this.wristMotor.configReverseSoftLimitThreshold(upPositionLimit);

		this.wristMotor.configForwardSoftLimitEnable(true);
		this.wristMotor.configReverseSoftLimitEnable(true);

		///////////////////

		this.wristMotor.setNeutralMode(NeutralMode.Coast); //would we rather have this be brake? JD

		this.wristMotor.configPIDF(WRIST_PROFILE_UP, 0.419, 0.0, 0.0, 0.799);
		this.wristMotor.configPIDF(WRIST_PROFILE_DOWN, 0.10, 0.0, 0.0, 0.799);

	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new WristMotionMagicTest()); //WristStop
		setDefaultCommand(new WristMaintainPosition());
		//setDefaultCommand(new WristJoystick());
	}

	public void wristMove(ControlMode controlMode, double targetPosition) {
		wristMotor.set(controlMode, targetPosition);
	}
	
	
	/*controls the position of the collector between upPositionLimit
	 * and downPositionLimit based on the scalar input between -1 and 1.
	 */
	public void motionMagicPositionControl(double positionScalar) {
		double encoderPosition = 0;
		
		if (positionScalar > 0) {
			encoderPosition = positionScalar * upPositionLimit;
		}else {
			encoderPosition = -positionScalar * downPositionLimit;
		}		
		
		//manageGainProfile(encoderPosition);
		wristMotor.set(ControlMode.MotionMagic, encoderPosition);		
	}
	
	
	/*
	 * choose which set of gains to use based on direction of travel.
	 */
	public void manageGainProfile(double targetPosition) {
		double currentPosition = getWristPosition();
		// negative direction moves wrist up
		if (currentPosition < targetPosition) {
			wristMotor.selectProfileSlot(WRIST_PROFILE_DOWN, 0);
		}
		else {
			wristMotor.selectProfileSlot(WRIST_PROFILE_UP, 0);
		}
	}

	public void motionMagicTest() {

		BobTalonSRX _talon = this.wristMotor;

		/* get gamepad axis - forward stick is positive */
		double leftYstick = Robot.oi.operatorController.leftStick.getY();
		/* calculate the percent motor output */
		double motorOutput = _talon.getMotorOutputPercent();
		/* prepare line to print */
		_sb.append("\tOut%:");
		_sb.append(motorOutput);
		_sb.append("\tVel:");
		_sb.append(_talon.getSelectedSensorVelocity(this.WRIST_PROFILE_UP));

		if (Robot.oi.operatorController.getRawButton(1)) {
			/* Motion Magic - 4096 ticks/rev * 10 Rotations in either direction */
			double targetPos = leftYstick * 4096 * 10.0;
			_talon.set(ControlMode.MotionMagic, targetPos);

			/* append more signals to print when in speed mode. */
			_sb.append("\terr:");
			_sb.append(_talon.getClosedLoopError(this.WRIST_PROFILE_UP));
			_sb.append("\ttrg:");
			_sb.append(targetPos);
		} else {
			/* Percent voltage mode */
			_talon.set(ControlMode.PercentOutput, leftYstick);
		}
		/* instrumentation */
		Instrum.Process(_talon, _sb);
		try {
			TimeUnit.MILLISECONDS.sleep(10);
		} catch (Exception e) {

		}
	}

	public int getWristPosition() {
		return this.wristMotor.getSelectedSensorPosition(WRIST_PROFILE_UP);
	}

	@Override
	public void periodic() {
		SmartDashboard.putNumber("Wrist Position", this.getWristPosition());
		//System.out.println("Wrist Position " + this.getWristPosition());
		
	}
	
	public boolean isWristInPostion(int targetPosition) {
		int currentPosition = this.getWristPosition();
		 int positionError = Math.abs(currentPosition - targetPosition);
			if (positionError < threshold) {
				return true;
			} else {
				return false;
			}
	}

}
