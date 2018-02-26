package org.usfirst.frc.team319.robot.subsystems;

import java.util.concurrent.TimeUnit;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.models.IPositionControlledSubsystem;
import org.usfirst.frc.team319.models.Instrum;
import org.usfirst.frc.team319.models.SRXGains;
import org.usfirst.frc.team319.robot.Robot;
import org.usfirst.frc.team319.robot.commands.wrist.WristMotionMagicControl;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Wrist extends Subsystem implements IPositionControlledSubsystem {

	public final static int maxUpTravelPosition = -1750;
	public final static int dunkPosition = -1713;
	public final static int homePosition = 0;
	public final static int switchPosition = 1000;
	public final static int exchangePosition = 3289;
	public final static int collectPosition = 3700;

	public final static int WRIST_PROFILE_UP = 0;
	public final static int WRIST_PROFILE_DOWN = 1;
	StringBuilder _sb = new StringBuilder();
	int loops = 0;
	private int upPositionLimit = homePosition;
	private int downPositionLimit = 4000;
	private final static int threshold = 200;
	private int targetPosition = 0;
	private final static int upAcceleration = 2000;
	private final static int downAcceleration = 5000;
	private final static int upCruiseVelocity = 1024;
	private final static int downCruiseVelocity = 512;

	public final static SRXGains upGains = new SRXGains(WRIST_PROFILE_UP, 0.800, 0.010, 8.0, 0.799, 100);
	public final static SRXGains downGains = new SRXGains(WRIST_PROFILE_DOWN, 0.400, 0.010, 15.0, 0.799, 100);

	public final BobTalonSRX wristMotor = new BobTalonSRX(5);

	public Wrist() {

		this.wristMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, WRIST_PROFILE_UP);

		this.wristMotor.setInverted(false);
		this.wristMotor.setSensorPhase(true);

		this.wristMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_13_Base_PIDF0, 10);
		this.wristMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10);

		this.wristMotor.configPeakOutputForward(1);
		this.wristMotor.configPeakOutputReverse(-1);

		this.wristMotor.configMotionAcceleration(2000);
		this.wristMotor.configMotionCruiseVelocity(1024);

		this.wristMotor.configForwardSoftLimitThreshold(downPositionLimit);
		this.wristMotor.configReverseSoftLimitThreshold(upPositionLimit);

		this.wristMotor.configForwardSoftLimitEnable(true);
		this.wristMotor.configReverseSoftLimitEnable(true);

		///////////////////

		this.wristMotor.setNeutralMode(NeutralMode.Brake); // would we rather have this be brake? JD

		this.wristMotor.configPIDF(upGains);
		this.wristMotor.configPIDF(downGains);

	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new WristMotionMagicTest()); //WristStop
		// setDefaultCommand(new WristMaintainPosition());
		// setDefaultCommand(new WristJoystick());
		setDefaultCommand(new WristMotionMagicControl());
	}

	public void wristMove(ControlMode controlMode, double targetPosition) {
		this.manageMotion(targetPosition);
		wristMotor.set(controlMode, targetPosition);
	}

	public void motionMagicControl() {
		this.manageMotion(targetPosition);
		this.wristMotor.set(ControlMode.MotionMagic, targetPosition);
		// System.out.println("Closed Loop Error " +
		// this.elevatorLead.getClosedLoopError(0));
	}

	/*
	 * controls the position of the collector between upPositionLimit and
	 * downPositionLimit based on the scalar input between -1 and 1.
	 */
	public void motionMagicPositionControl(double positionScalar) {
		double encoderPosition = 0;

		if (positionScalar > 0) {
			encoderPosition = positionScalar * upPositionLimit;
		} else {
			encoderPosition = -positionScalar * downPositionLimit;
		}

		// manageGainProfile(encoderPosition);
		wristMotor.set(ControlMode.MotionMagic, encoderPosition);
	}

	/*
	 * choose which set of gains to use based on direction of travel.
	 */
	public void manageMotion(double targetPosition) {
		double currentPosition = getCurrentPosition();

		manageLimits();
		// if we're in negative position
		if (currentPosition < homePosition) {
			if (currentPosition > targetPosition) {
				useDownGains();
			} else {
				useUpGains();
			}
		} else {
			if (currentPosition > targetPosition) {
				useUpGains();
			} else {
				useDownGains();
			}
		}
		this.wristMotor.configForwardSoftLimitThreshold(downPositionLimit);
		this.wristMotor.configReverseSoftLimitThreshold(upPositionLimit);
	}
	
	private void manageLimits() {
		if (Robot.elevator.getCurrentPosition() > Robot.elevator.topOfFirstStagePosition) {
			this.upPositionLimit = maxUpTravelPosition;
			//System.out.println("Setting up position limit to " + upPositionLimit);
		} else {
			this.upPositionLimit = homePosition;
			//System.out.println("Setting up position limit to " + upPositionLimit);
			if (this.targetPosition < homePosition) {
				this.targetPosition = homePosition;
			}
		}
	}

	private void useUpGains() {
		wristMotor.selectProfileSlot(WRIST_PROFILE_UP, 0);
		wristMotor.configMotionAcceleration(upAcceleration);
		wristMotor.configMotionCruiseVelocity(upCruiseVelocity);
	}

	private void useDownGains() {
		wristMotor.selectProfileSlot(WRIST_PROFILE_DOWN, 0);
		wristMotor.configMotionAcceleration(downAcceleration);
		wristMotor.configMotionCruiseVelocity(downCruiseVelocity);
	}

	public int getTargetPosition() {
		return this.targetPosition;
	}

	public boolean setTargetPosition(int position) {
		manageLimits();
		if (position < upPositionLimit || position > downPositionLimit) {
			return false;
		}else {
			this.targetPosition = position;
			return true;
		}
	}

	public int getUpwardLimit() {
		return this.upPositionLimit;
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

	public int getCurrentPosition() {
		return this.wristMotor.getSelectedSensorPosition(0);
	}

	@Override
	public void periodic() {
		SmartDashboard.putNumber("Wrist Position", this.getCurrentPosition());
		SmartDashboard.putNumber("Wrist Velocity", this.getCurrentVelocity());
		// System.out.println("Wrist Position " + this.getWristPosition());

	}


	@Override
	public double getCurrentVelocity() {
		return wristMotor.getSelectedSensorVelocity(0);
	}

	@Override
	public boolean isInPosition(int targetPosition) {
		int currentPosition = this.getCurrentPosition();
		int positionError = Math.abs(currentPosition - targetPosition);
		if (positionError < threshold) {
			return true;
		} else {
			return false;
		}
	}

}
