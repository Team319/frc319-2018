package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorStop;
import org.usfirst.frc.team319.robot.commands.elevator.JoystickElevator;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Elevator extends Subsystem {

	public final static int ELEVATOR_HIGH_UP = 0;
	public final static int ELEVATOR_HIGH_DOWN = 1;
	public final static int ELEVATOR_LOW_UP = 2;
	public final static int ELEVATOR_LOW_DOWN = 0;
	
	public final static int upPositionLimit = 0;// needs to be determined manually
	public final static int downPositionLimit = 0;
	
    public final LeaderBobTalonSRX elevatorLead = new LeaderBobTalonSRX(3, new BobTalonSRX(5), new BobTalonSRX(6), new BobTalonSRX(7)); //Was talon 5
    
    public Elevator() {
    	
    	this.elevatorLead.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, ELEVATOR_HIGH_UP);
    	
    	/*
    	this.elevatorLead.configForwardSoftLimitEnable(true);
    	this.elevatorLead.configForwardSoftLimitThreshold(upPositionLimit);
    	
    	this.elevatorLead.configReverseSoftLimitEnable(true);
    	this.elevatorLead.configReverseSoftLimitThreshold(downPositionLimit);
		*/
		
    	this.elevatorLead.setInverted(false);
    	this.elevatorLead.setSensorPhase(false);
    	
    	this.elevatorLead.setStatusFramePeriod(StatusFrameEnhanced.Status_13_Base_PIDF0, 10);
		this.elevatorLead.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10);
		
		this.elevatorLead.configPeakOutputForward(1);
		this.elevatorLead.configPeakOutputReverse(-1);
		
		this.elevatorLead.setSelectedSensorPosition(0, ELEVATOR_HIGH_UP);
				
		this.elevatorLead.configMotionAcceleration(250);
		this.elevatorLead.configMotionCruiseVelocity(500);
    	
		this.elevatorLead.configPIDF(ELEVATOR_HIGH_UP, 0.2, 0.0, 0.0, 0.0);
	
	}
    
    public void initDefaultCommand() {
    	setDefaultCommand(new ElevatorStop());
    	//setDefaultCommand(new JoystickElevator());
    }
    
    public void setElevator(ControlMode controlMode, double signal) {
    	elevatorLead.set(controlMode, -signal);
    }
    
    public double getElevatorPosition() {
    	return this.elevatorLead.getSelectedSensorPosition(ELEVATOR_HIGH_UP);
    }
    
    @Override
	public void periodic() {
		SmartDashboard.putNumber("Elevator Position", this.getElevatorPosition());
	}
}

