package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.models.BobVictorSPX;
import org.usfirst.frc.team319.models.IPositionControlledSubsystem;
import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.models.SRXGains;
import org.usfirst.frc.team319.robot.Robot;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorMotionMagicControl;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorStop;
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
public class Elevator extends Subsystem implements IPositionControlledSubsystem{
	
	public final static int homePosition = 0;
	public final static int topOfFirstStagePosition = 24000;
	public final static int dunkPosition = 33500;
	
	public final static int ELEVATOR_HIGH_UP = 0;
	public final static int ELEVATOR_HIGH_DOWN = 1;
	public final static int ELEVATOR_LOW_UP = 2;
	public final static int ELEVATOR_LOW_DOWN = 3;
	
	public final static int upPositionLimit = 48000;// needs to be determined manually
	public final static int downPositionLimit = 0;
	
	private boolean isHighGear = false;
	private int targetPosition = 0;
	
	private final static int threshold = 100;
	
	private final SRXGains lowGearUpGains = new SRXGains(ELEVATOR_LOW_UP, 0.560, 0.0, 5.600, 0.620, 100);
	private final SRXGains lowGearDownGains = new SRXGains(ELEVATOR_LOW_DOWN, 0.560, 0.0, 5.600, 0.427, 0);

	private final SRXGains highGearUpGains = new SRXGains(ELEVATOR_HIGH_UP, 0.0, 0.0, 0.0, 0.427, 0);
	private final SRXGains highGearDownGains = new SRXGains(ELEVATOR_HIGH_DOWN, 0.0, 0.0, 0.0, 0.427, 0);	

    public final LeaderBobTalonSRX elevatorLead = new LeaderBobTalonSRX(11, new BobVictorSPX(8), 
    		new BobVictorSPX(9), new BobVictorSPX(10)); //Was talon 5

    
    public Elevator() {
    	
    	this.elevatorLead.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, ELEVATOR_HIGH_UP);    	
    	
    	this.elevatorLead.configForwardSoftLimitEnable(true);
    	this.elevatorLead.configForwardSoftLimitThreshold(upPositionLimit);
    	
    	this.elevatorLead.configReverseSoftLimitEnable(true);
    	this.elevatorLead.configReverseSoftLimitThreshold(downPositionLimit);		
		
    	this.elevatorLead.setInverted(true);
    	this.elevatorLead.setSensorPhase(false);
    	
    	this.elevatorLead.setStatusFramePeriod(StatusFrameEnhanced.Status_13_Base_PIDF0, 10);
		this.elevatorLead.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10);
		
		this.elevatorLead.configPeakOutputForward(1);
		this.elevatorLead.configPeakOutputReverse(-1);
				
		this.elevatorLead.configMotionAcceleration(2600);
		this.elevatorLead.configMotionCruiseVelocity(1321);

		this.elevatorLead.setGains(this.lowGearDownGains);
		this.elevatorLead.setGains(this.lowGearUpGains);
		this.elevatorLead.setGains(this.highGearDownGains);
		this.elevatorLead.setGains(this.highGearUpGains);
		
		this.elevatorLead.setNeutralMode(NeutralMode.Brake);
	
	}
    
    public void initDefaultCommand() {
    	//setDefaultCommand(new ElevatorStop());
    	//setDefaultCommand(new ElevatorMotionMagicControl());
    	setDefaultCommand(new JoystickElevator());
    }
    
    public void setElevator(ControlMode controlMode, double signal) {
    	if(controlMode == ControlMode.MotionMagic) {
    		this.manageGainProfile(signal);
    	}
    	elevatorLead.set(controlMode, signal);
    }
    
    public void motionMagicControl() {
    	this.manageGainProfile(targetPosition);
    	this.elevatorLead.set(ControlMode.MotionMagic, targetPosition);
    	//System.out.println("Closed Loop Error " + this.elevatorLead.getClosedLoopError(0));
    }
    
    public int getCurrentPosition() {
    	return this.elevatorLead.getSelectedSensorPosition(0);
    }
    
    public boolean getHighGear() {
    	return this.isHighGear;
    }
    
    public void setHighGear(boolean isHighGear) {
    	this.isHighGear = isHighGear;
    }
    
    public int getTargetPosition() {
    	return this.targetPosition;
    }
    
    public boolean setTargetPosition(int position) {
    	if (position > upPositionLimit || position < downPositionLimit) {
			return false;
		}else {
	    	this.targetPosition = position;
	    	return true;
		}
    }
    
    public void manageGainProfile(double targetPosition) {
		double currentPosition = getCurrentPosition();
		if (currentPosition < targetPosition) {
			if(isHighGear) {
				elevatorLead.selectProfileSlot(ELEVATOR_HIGH_UP, 0);
			}
			else{
				elevatorLead.selectProfileSlot(ELEVATOR_LOW_UP, 0);
			}
		} else {
			if(isHighGear) {
				elevatorLead.selectProfileSlot(ELEVATOR_HIGH_DOWN, 0);
			}
			else{
				elevatorLead.selectProfileSlot(ELEVATOR_LOW_DOWN, 0);
			}
		}
	} 
    
    @Override
	public void periodic() {
		SmartDashboard.putNumber("Elevator Position", this.getCurrentPosition());
		SmartDashboard.putNumber("Elevator Closed Loop Error", this.elevatorLead.getClosedLoopError(0));
	}

	@Override
	public double getCurrentVelocity() {
		return 0;
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

