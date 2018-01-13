package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.robot.commands.ElevatorTest;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {

	private int[] elevatorFollowers = {2, 3,};
    public final LeaderBobTalonSRX elevatorLead = new LeaderBobTalonSRX(1, elevatorFollowers);
    
    public Elevator() {
		
    	this.elevatorLead.setInverted(false);
	}
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ElevatorTest());
    }
    
    public void elevatorTest(ControlMode controlMode, double signal) {
    	elevatorLead.set(controlMode, signal);
    }
}

