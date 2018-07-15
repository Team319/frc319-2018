package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.models.IPositionControlledSubsystem;
import org.usfirst.frc.team319.models.MotionParameters;
import org.usfirst.frc.team319.models.SRXGains;
import org.usfirst.frc.team319.robot.Robot;
import org.usfirst.frc.team319.robot.commands.wrist.JoystickWrist;
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

	private int maxUpTravelPosition = -1431;
	private int dunkPosition = -1394;
	private int homePosition = 319;
	private int safePosition = 150;
	private int switchPosition = 1319;
	private int exchangePosition = 4200;
	private int scalePosition = 3608;
	private int autoSwitchPosition = 3344;
	private int parallelPosition = 4144;
	private int collectPosition = 4500;
	private int maxDownTravelPosition = 5100;

	public final static int WRIST_PROFILE_UP = 0;
	public final static int WRIST_PROFILE_DOWN = 1;

	private int upPositionLimit = homePosition;
	private int downPositionLimit = maxDownTravelPosition;

	private int targetPosition = homePosition;
	private final static int onTargetThreshold = 100;

	private SRXGains upGains = new SRXGains(WRIST_PROFILE_UP, 1.00, 0.005, 16.0, 0.799, 150);
	private SRXGains downGains = new SRXGains(WRIST_PROFILE_DOWN, 0.400, 0.005, 15.0, 0.799, 150);

	private MotionParameters upMotionParameters = new MotionParameters(5000, 1024, upGains);
	private MotionParameters downMotionParameters = new MotionParameters(5000, 512, downGains);

	public final BobTalonSRX wristMotor = new BobTalonSRX(5);

	public Wrist() {
		this.wristMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative);

		this.wristMotor.setInverted(false);
		this.wristMotor.setSensorPhase(true);

		this.wristMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_13_Base_PIDF0, 10);
		this.wristMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10);

		this.wristMotor.configForwardSoftLimitThreshold(downPositionLimit);
		this.wristMotor.configReverseSoftLimitThreshold(upPositionLimit);

		this.wristMotor.configForwardSoftLimitEnable(true);
		this.wristMotor.configReverseSoftLimitEnable(true);

		this.wristMotor.setNeutralMode(NeutralMode.Brake);

		wristMotor.configMotionParameters(upMotionParameters);
		wristMotor.configMotionParameters(downMotionParameters);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new WristMotionMagicTest()); //WristStop
		// setDefaultCommand(new WristMaintainPosition());
		setDefaultCommand(new JoystickWrist());
		//setDefaultCommand(new WristMotionMagicControl());
	}
	
	//sets control mode to motion magic
	public void wristMove(ControlMode controlMode, double targetPosition) {
		this.manageMotion(targetPosition);
		wristMotor.set(controlMode, targetPosition);
	}

	public void motionMagicControl() {
		manageMotion(targetPosition);
		wristMotor.set(ControlMode.MotionMagic, targetPosition);
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
				wristMotor.selectMotionParameters(downMotionParameters);
			} else {
				wristMotor.selectMotionParameters(upMotionParameters);
			}
		} else {
			if (currentPosition > targetPosition) {
				wristMotor.selectMotionParameters(upMotionParameters);
			} else {
				wristMotor.selectMotionParameters(downMotionParameters);
			}
		}
		
		this.wristMotor.configForwardSoftLimitThreshold(downPositionLimit);
		this.wristMotor.configReverseSoftLimitThreshold(upPositionLimit);
	}

	//Prevents wrist from moving behind the home position whilst elevator is not above first stage
	
	private void manageLimits() {
		if (Robot.elevator.getCurrentPosition() > Robot.elevator.getTopOfFirstStagePosition()) {
			this.upPositionLimit = maxUpTravelPosition;
			// System.out.println("Setting up position limit to " + upPositionLimit);
		} else {
			this.upPositionLimit = homePosition;
			// System.out.println("Setting up position limit to " + upPositionLimit);
			if (this.targetPosition < homePosition) {
				this.targetPosition = homePosition;
			}
		}
	}

	public int getTargetPosition() {
		return this.targetPosition;
	}
	
	//if valid position is inverted return false else, return true
	public boolean setTargetPosition(int position) {
		manageLimits();
		if (!isValidPosition(position)) {
			return false;
		} else {
			this.targetPosition = position;
			return true;
		}
	}
	
	
	public void incrementTargetPosition(int increment) {
		int currentTargetPosition = this.targetPosition;
		int newTargetPosition = currentTargetPosition + increment;
		if (isValidPosition(newTargetPosition)) {
			this.targetPosition = newTargetPosition;
		}
	}
	
	public boolean isValidPosition(int position) {
		return (position >= upPositionLimit && position <= downPositionLimit);
	}

	public int getUpwardLimit() {
		return this.upPositionLimit;
	}

	public int getCurrentPosition() {
		return this.wristMotor.getSelectedSensorPosition();
	}

	public int getMaxUpTravelPosition() {
		return this.maxUpTravelPosition;
	}

	public int getDunkPosition() {
		return this.dunkPosition;
	}
	
	public int getSafePosition() {
		return this.safePosition;
	}

	public int getHomePosition() {
		return this.homePosition;
	}

	public int getSwitchPosition() {
		return this.switchPosition;
	}

	public int getExchangePosition() {
		return this.exchangePosition;
	}

	public int getScalePosition() {
		return this.scalePosition;
	}

	public int getAutoSwitchPosition() {
		return this.autoSwitchPosition;
	}

	public int getParallelPosition() {
		return this.parallelPosition;
	}

	public int getCollectPosition() {
		return this.collectPosition;
	}

	public int getMaxDownTravelPosition() {
		return this.maxDownTravelPosition;
	}

	
	@Override
	public void periodic() {
		SmartDashboard.putNumber("Wrist Position", this.getCurrentPosition());
		SmartDashboard.putNumber("Wrist Velocity", this.getCurrentVelocity());
		SmartDashboard.putNumber("Wrist Closed Loop Error", this.wristMotor.getClosedLoopError());
	}

	@Override
	public double getCurrentVelocity() {
		return wristMotor.getSelectedSensorVelocity();
	}

	@Override
	public boolean isInPosition(int targetPosition) {
		int currentPosition = this.getCurrentPosition();
		int positionError = Math.abs(currentPosition - targetPosition);
		return positionError < onTargetThreshold;
	}

}
