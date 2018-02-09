package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorStop;
import org.usfirst.frc.team319.robot.commands.elevator.JoystickElevator;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {

	public final static int WRIST_PROFILE = 0;
	private int[] elevatorFollowers = {5, 6, 7};
    public final LeaderBobTalonSRX elevatorLead = new LeaderBobTalonSRX(3, elevatorFollowers); //Was talon 5
    
    public Elevator() {
		
    	this.elevatorLead.setInverted(false);
    	this.elevatorLead.setSensorPhase(false);
    	
    	this.elevatorLead.setStatusFramePeriod(StatusFrameEnhanced.Status_13_Base_PIDF0, 10);
		this.elevatorLead.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10);
		
		this.elevatorLead.configPeakOutputForward(1);
		this.elevatorLead.configPeakOutputReverse(-1);
		
		this.elevatorLead.setSelectedSensorPosition(0, WRIST_PROFILE);
				
		this.elevatorLead.configMotionAcceleration(250);
		this.elevatorLead.configMotionCruiseVelocity(500);
    	
		this.elevatorLead.configPIDF(WRIST_PROFILE, 0.2, 0.0, 0.0, 0.0);
	}
    
    public void initDefaultCommand() {
    	setDefaultCommand(new ElevatorStop());
    	//setDefaultCommand(new JoystickElevator());
    }
    
    public void setElevator(ControlMode controlMode, double signal) {
    	elevatorLead.set(controlMode, signal);
    }
}

