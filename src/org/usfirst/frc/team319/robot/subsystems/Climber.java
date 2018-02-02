package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.robot.commands.climber.ClimberGoOnStick;
import org.usfirst.frc.team319.robot.commands.climber.ClimberStop;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {

	//private int[] climbFollower = {3};
	//public final LeaderBobTalonSRX climberLead = new LeaderBobTalonSRX(2, climbFollower);
	public final BobTalonSRX climberLead = new BobTalonSRX(7);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ClimberStop());
    	//setDefaultCommand(new ClimberGoOnStick());
    }
    
    public void climberTest(ControlMode controlMode, double signal) {
    	climberLead.set(controlMode, signal);
    }
}

