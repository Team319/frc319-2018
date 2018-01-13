package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.robot.commands.ClimberTest;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {

	private int[] climbFollower = {2};
	public final LeaderBobTalonSRX climberLead = new LeaderBobTalonSRX(1, climbFollower);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ClimberTest());
    }
    
    public void climberTest(ControlMode controlMode, double signal) {
    	climberLead.set(controlMode, signal);
    }
}

