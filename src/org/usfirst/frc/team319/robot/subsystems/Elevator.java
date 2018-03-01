package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.BobVictorSPX;
import org.usfirst.frc.team319.models.IPositionControlledSubsystem;
import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.models.MotionParameters;
import org.usfirst.frc.team319.models.SRXGains;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorMotionMagicControl;
import org.usfirst.frc.team319.robot.commands.elevator.JoystickElevator;

import com.ctre.phoenix.motorcontrol.ControlMode;
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

	private int homePosition = 0;
	private int switchPosition = 14000;
	private int topOfFirstStagePosition = 24000;
	private int dunkPosition = 33500;
	private int maxUpTravelPosition = 48000;	

	public final static int ELEVATOR_HIGH_UP = 0;
	public final static int ELEVATOR_HIGH_DOWN = 1;
	public final static int ELEVATOR_LOW_UP = 2;
	public final static int ELEVATOR_LOW_DOWN = 3;

	public int upPositionLimit = maxUpTravelPosition;
	public int downPositionLimit = homePosition;
	private int targetPosition = 0;
	private double maxSpeedAchieved = 0;

	private final static int onTargetThreshold = 100;

	private final SRXGains lowGearUpGains = new SRXGains(ELEVATOR_LOW_UP, 0.560, 0.0, 5.600, 0.620, 100);
	private final SRXGains lowGearDownGains = new SRXGains(ELEVATOR_LOW_DOWN, 0.560, 0.0, 5.600, 0.427, 0);

	private final SRXGains highGearUpGains = new SRXGains(ELEVATOR_HIGH_UP, 2.8, 0.0, 28.0, 0.172, 0);
	private final SRXGains highGearDownGains = new SRXGains(ELEVATOR_HIGH_DOWN, 1.46, 0.0, 14.6, 0.172, 0);
	
	private MotionParameters lowGearUpMotionParameters = new MotionParameters(2600, 1321, lowGearUpGains);
	private MotionParameters lowGearDownMotionParameters = new MotionParameters(2600, 1321, lowGearDownGains);
	private MotionParameters highGearUpMotionParameters = new MotionParameters(9400, 4700, highGearUpGains);//4700
	private MotionParameters highGearDownMotionParameters = new MotionParameters(6000, 3000, highGearDownGains);

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
	}

	public void initDefaultCommand() {
		// setDefaultCommand(new ElevatorStop());
		setDefaultCommand(new ElevatorMotionMagicControl());
		//setDefaultCommand(new JoystickElevator());
	}

	public void setElevator(ControlMode controlMode, double signal) {
		if (controlMode == ControlMode.MotionMagic) {
			this.manageMotion(signal);
		}
		elevatorLead.set(controlMode, signal);
	}

	public void motionMagicControl() {
		this.manageMotion(targetPosition);
		this.elevatorLead.set(ControlMode.MotionMagic, targetPosition);
	}

	public int getCurrentPosition() {
		return this.elevatorLead.getSelectedSensorPosition();
	}
	
	public double getCurrentDraw() {
		return this.elevatorLead.getOutputCurrent();
	}

	public boolean getIsHighGear() {
		return this.isHighGear;
	}

	public void setIsHighGear(boolean isHighGear) {
		this.isHighGear = isHighGear;
	}

	public int getTargetPosition() {
		return this.targetPosition;
	}

	public boolean setTargetPosition(int position) {
		if (position > upPositionLimit || position < downPositionLimit) {
			return false;
		} else {
			this.targetPosition = position;
			return true;
		}
	}
	
	public int getHomePosition() {
		return this.homePosition;
	}
	
	public int getSwitchPosition() {
		return this.switchPosition;
	}
	
	public int getTopOfFirstStagePosition() {
		return this.topOfFirstStagePosition;
	}
	
	public int getDunkPosition() {
		return this.dunkPosition;
	}
	
	public int getMaxUpTravelPosition() {
		return this.maxUpTravelPosition;
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

	@Override
	public void periodic() {
		SmartDashboard.putNumber("Elevator Position", this.getCurrentPosition());
		SmartDashboard.putNumber("Elevator Velocity", this.getCurrentVelocity());
		SmartDashboard.putNumber("Elevator Current", this.getCurrentDraw());
		//SmartDashboard.putNumber("Elevator Closed Loop Error", this.elevatorLead.getClosedLoopError(0));
		SmartDashboard.putBoolean("Elevator High Gear", isHighGear);
		SmartDashboard.putNumber("Elevator Max Speed", maxSpeedAchieved);
	}

	@Override
	public double getCurrentVelocity() {
		double currentVelocity = this.elevatorLead.getSelectedSensorVelocity();
		
		if (currentVelocity > maxSpeedAchieved) {
			maxSpeedAchieved = currentVelocity;
		}
		
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
