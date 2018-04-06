package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.BobVictorSPX;
import org.usfirst.frc.team319.models.IPositionControlledSubsystem;
import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.models.MotionParameters;
import org.usfirst.frc.team319.models.SRXGains;
import org.usfirst.frc.team319.robot.Robot;
import org.usfirst.frc.team319.robot.commands.elevator.JoystickElevator;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.DemandType;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Elevator extends Subsystem implements IPositionControlledSubsystem {

	private boolean isHighGear = false;
	private boolean isHoldingPosition = false;
	private boolean atScale = false;

	private int homePosition = 0;
	private int collectPosition = 1000;
	private int switchPosition = 14000;
	private int autoSwitchPostion = 20000;
	private int topOfFirstStagePosition = 24000;
	private int minimumDunkHeight = 26500;
	private int dunkPosition = 33500;
	private int climbPosition = 48000;
	private int maxUpTravelPosition = 52000;

	private int scaleMiddlePosition = 38500;
	private int scaleBottomPosition = 35000;
	private int scaleTopPosition = 51000;

	public final static int ELEVATOR_HIGH_UP = 0;
	public final static int ELEVATOR_HIGH_DOWN = 1;
	public final static int ELEVATOR_LOW_UP = 2;
	public final static int ELEVATOR_LOW_DOWN = 3;

	public int upPositionLimit = maxUpTravelPosition;
	public int downPositionLimit = homePosition;
	private int targetPosition = 0;
	private double arbitraryFeedForward = 0.0;

	private final static int onTargetThreshold = 500; // changed to 500 from 100 for testing on practice field
	
	private final SRXGains lowGearUpGains = new SRXGains(ELEVATOR_LOW_UP, 0.560, 0.0, 5.600, 0.620, 100);
	private final SRXGains lowGearDownGains = new SRXGains(ELEVATOR_LOW_DOWN, 0.560, 0.0, 5.600, 0.427, 0);

	private final SRXGains highGearUpGains = new SRXGains(ELEVATOR_HIGH_UP, 0.02, 0.001, 4.0, 0.172, 300);
	private final SRXGains highGearDownGains = new SRXGains(ELEVATOR_HIGH_DOWN, 0.200, 0.001, 0.0, 0.172, 300);

	private MotionParameters lowGearUpMotionParameters = new MotionParameters(2600, 2000, lowGearUpGains);
	private MotionParameters lowGearDownMotionParameters = new MotionParameters(2600, 2000, lowGearDownGains);
	private MotionParameters highGearUpMotionParameters = new MotionParameters(11000, 5500, highGearUpGains);// 4700
	private MotionParameters highGearDownMotionParameters = new MotionParameters(11000, 5000, highGearDownGains);
	
	private double highGearPeakOutputReverse = -0.6;

	public final LeaderBobTalonSRX elevatorLead = new LeaderBobTalonSRX(11, new BobVictorSPX(8), new BobVictorSPX(9),
			new BobVictorSPX(10));

	public Elevator() {

		this.elevatorLead.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative);

		this.elevatorLead.configForwardSoftLimitEnable(true);
		this.elevatorLead.configForwardSoftLimitThreshold(upPositionLimit);

		this.elevatorLead.configReverseSoftLimitEnable(true);
		this.elevatorLead.configReverseSoftLimitThreshold(downPositionLimit);

		this.elevatorLead.setInverted(true);
		this.elevatorLead.setSensorPhase(false);

		this.elevatorLead.setStatusFramePeriod(StatusFrameEnhanced.Status_13_Base_PIDF0, 10);
		this.elevatorLead.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10);

		this.elevatorLead.configMotionParameters(highGearUpMotionParameters);
		this.elevatorLead.configMotionParameters(highGearDownMotionParameters);
		this.elevatorLead.configMotionParameters(lowGearDownMotionParameters);
		this.elevatorLead.configMotionParameters(lowGearUpMotionParameters);

		this.elevatorLead.setNeutralMode(NeutralMode.Brake);
		this.elevatorLead.configClosedloopRamp(0.25);

		this.elevatorLead.configVoltageCompSaturation(11.5);
		this.elevatorLead.enableVoltageCompensation(true);

		this.elevatorLead.configPeakOutputReverse(-1.0);
	}

	public void initDefaultCommand() {
		// setDefaultCommand(new ElevatorStop());
		// setDefaultCommand(new ElevatorMotionMagicControl());
		setDefaultCommand(new JoystickElevator());
	}

	public void setElevator(ControlMode controlMode, double signal) {
		if (controlMode == ControlMode.MotionMagic) {
			this.manageMotion(signal);
		}
		elevatorLead.set(controlMode, signal);
	}

	public void setElevator(ControlMode controlMode, double signal, DemandType demandType, double demand) {
		if (controlMode == ControlMode.MotionMagic) {
			this.manageMotion(signal);
		}
		elevatorLead.set(controlMode, signal, demandType, demand);
	}

	public void motionMagicControl() {
		this.manageMotion(targetPosition);
		this.elevatorLead.set(ControlMode.MotionMagic, targetPosition, DemandType.ArbitraryFeedForward, 0.1);
	}

	public int getCurrentPosition() {
		return this.elevatorLead.getSelectedSensorPosition();
	}

	public double getCurrentDraw() {
		return this.elevatorLead.getOutputCurrent();
	}

	public boolean isHighGear() {
		return this.isHighGear;
	}

	public void setHighGear(boolean isHighGear) {
		if (isHighGear) {
			this.elevatorLead.configPeakOutputReverse(highGearPeakOutputReverse);
			this.arbitraryFeedForward = 0.1;
		} else {
			this.elevatorLead.configPeakOutputReverse(-1.0);
			this.arbitraryFeedForward = 0.0;
		}
		this.isHighGear = isHighGear;
	}

	public boolean isHoldingPosition() {
		return this.isHoldingPosition;
	}

	public void setIsHoldingPosition(boolean isHoldingPosition) {
		this.isHoldingPosition = isHoldingPosition;
	}

	public int getTargetPosition() {
		return this.targetPosition;
	}

	public boolean setTargetPosition(int position) {
		if (!isValidPosition(position)) {
			return false;
		} else {
			this.targetPosition = position;
			return true;
		}
	}

	public void forceSetTargetPosition(int position) {
		this.targetPosition = position;
	}

	public void incrementTargetPosition(int increment) {
		int currentTargetPosition = this.targetPosition;
		int newTargetPosition = currentTargetPosition + increment;
		if (isValidPosition(newTargetPosition) && isWristSafe(newTargetPosition)) {
			this.targetPosition = newTargetPosition;
		}
	}

	public boolean isValidPosition(int position) {
		boolean withinBounds = position <= upPositionLimit && position >= downPositionLimit;
		return withinBounds;
	}

	public int getHomePosition() {
		return this.homePosition;
	}

	public int getCollectPosition() {
		return this.collectPosition;
	}

	public int getSwitchPosition() {
		return this.switchPosition;
	}

	public int getAutoSwitchPosition() {
		return this.autoSwitchPostion;
	}

	public int getTopOfFirstStagePosition() {
		return this.topOfFirstStagePosition;
	}

	public int getMinimumDunkPosition() {
		return this.minimumDunkHeight;
	}

	public int getDunkPosition() {
		return this.dunkPosition;
	}

	public int getClimbPosition() {
		return this.climbPosition;
	}

	public int getMaxUpTravelPosition() {
		return this.maxUpTravelPosition;
	}

	public int getScaleMiddlePosition() {
		return this.scaleMiddlePosition;
	}

	public int getScaleBottomPosition() {
		return this.scaleBottomPosition;
	}

	public int getScaleTopPosition() {
		return this.scaleTopPosition;
	}

	public double getArbitraryFeedForward() {
		return this.arbitraryFeedForward;
	}

	public void manageMotion(double targetPosition) {
		double currentPosition = getCurrentPosition();
		if (currentPosition < targetPosition) {
			if (isHighGear) {
				elevatorLead.selectMotionParameters(highGearUpMotionParameters);
			} else {
				elevatorLead.selectMotionParameters(lowGearUpMotionParameters);
			}
		} else {
			if (isHighGear) {
				elevatorLead.selectMotionParameters(highGearDownMotionParameters);
			} else {
				elevatorLead.selectMotionParameters(lowGearDownMotionParameters);
			}
		}
	}

	public boolean isWristSafe(double targetElevatorPosition) {
		boolean atRisk = Robot.wrist.getCurrentPosition() < Robot.wrist.getSafePosition();
		System.out.println("is wrist at risk: " + atRisk);
		if (atRisk && targetElevatorPosition < minimumDunkHeight && getCurrentPosition() > topOfFirstStagePosition) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void periodic() {
		SmartDashboard.putNumber("Elevator Position", this.getCurrentPosition());
		SmartDashboard.putNumber("Elevator Velocity", this.getCurrentVelocity());
		SmartDashboard.putNumber("Elevator Current", this.getCurrentDraw());
		// SmartDashboard.putNumber("Elevator Closed Loop
		// Error",this.elevatorLead.getClosedLoopError(0));
		SmartDashboard.putBoolean("Elevator High Gear", isHighGear);
		// SmartDashboard.putNumber("Elevator Max Speed", maxSpeedAchieved);
		 SmartDashboard.putNumber("Elevator Voltage",
		 this.elevatorLead.getMotorOutputVoltage());
	}

	@Override
	public double getCurrentVelocity() {
		double currentVelocity = this.elevatorLead.getSelectedSensorVelocity();
		return currentVelocity;
	}

	@Override
	public boolean isInPosition(int targetPosition) {
		int currentPosition = this.getCurrentPosition();
		int positionError = Math.abs(currentPosition - targetPosition);
		if (positionError < onTargetThreshold) {
			return true;
		} else {
			return false;
		}
	}
}
