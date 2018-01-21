package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.robot.commands.climber.ClimberStop;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {

	private int[] climbFollower = {16};
	public final LeaderBobTalonSRX climberLead = new LeaderBobTalonSRX(15, climbFollower);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ClimberStop());
    }
    
    public void climberTest(ControlMode controlMode, double signal) {
    	climberLead.set(controlMode, signal);
    }
}

