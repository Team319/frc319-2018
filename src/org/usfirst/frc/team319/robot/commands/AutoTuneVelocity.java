package org.usfirst.frc.team319.robot.commands;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.models.SRXGains;

import com.ctre.phoenix.ParamEnum;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutoTuneVelocity extends CommandGroup {

    public AutoTuneVelocity(Subsystem requiredSubsystem, BobTalonSRX talon, int srxParameterSlot,
    		double desiredVelocity, int numSamplesRequired) {
    	
    	addSequential(new WaitCommand("safety_wait_command", 5.0));
    	
    	addSequential(new AutoTuneVelocitySpinUp(requiredSubsystem, talon, ControlMode.PercentOutput, 1.0));
    	
    	addSequential(new WaitCommand("spin_up_wait_command", 2.0));
    	
    	addSequential(new AutoTuneVelocityCalculateF(requiredSubsystem, talon, srxParameterSlot, numSamplesRequired));
    	
    	addSequential(new AutoTuneVelocitySpinDown(requiredSubsystem, talon));
    	
    	addSequential(new AutoTuneVelocitySpinUp(requiredSubsystem, talon, ControlMode.Velocity, desiredVelocity));
    	
    	addSequential(new WaitCommand("spin_up_wait_command", 5.0));
    	
    	addSequential(new AutoTuneVelocityCalculateP(requiredSubsystem, talon, srxParameterSlot, desiredVelocity, numSamplesRequired));
    	
    	addSequential(new AutoTuneVelocitySpinDown(requiredSubsystem, talon));
    	
    	addSequential(new AutoTuneVelocityEnd(requiredSubsystem, talon, srxParameterSlot));
    
    }
    
}