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
	
	
	
	
	private BobTalonSRX _talon;
	private int parameterSlot;
	private int requiredSamples;
	private double target;

    public AutoTuneVelocity(Subsystem requiredSubsystem, BobTalonSRX talon, int srxParameterSlot, double desiredVelocity, int numSamplesRequired) {
    	
    	
    	this._talon = talon;
    	this.parameterSlot = srxParameterSlot;
    	this.requiredSamples = numSamplesRequired;
    	this.target = desiredVelocity;
    	
    	_talon.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0);
    	_talon.setSensorPhase(false);
    	_talon.configNominalOutputForward(1.0);
    	_talon.configNominalOutputReverse(1.0);
    	
    	_talon.setGains(new SRXGains(parameterSlot, 0, 0, 0, 0));
    	
    	System.out.println("Starting motor in 5 seconds.  STAND CLEAR.");
    	
    	addSequential(new WaitCommand("safety_wait_command", 5.0));
    	
    	System.out.println("Starting motor.");
    	
    	addSequential(new AutoTuneVelocitySpinUp(requiredSubsystem, _talon, ControlMode.PercentOutput, 1.0));
    	
    	addSequential(new WaitCommand("spin_up_wait_command", 2.0));
    	
    	System.out.println("Calculating feed forward gain (F).");
    	
    	addSequential(new AutoTuneVelocityCalculateF(requiredSubsystem, _talon, parameterSlot, requiredSamples));
    	
    	System.out.println("Finished calculating F gain.  Switching to speed mode.");
    	
    	addSequential(new AutoTuneVelocitySpinDown(requiredSubsystem, _talon));
    	
    	System.out.println("Calculating proportional gain (P).");
    	
    	addSequential(new AutoTuneVelocitySpinUp(requiredSubsystem, _talon, ControlMode.Velocity, target));
    	
    	addSequential(new WaitCommand("spin_up_wait_command", 2.0));
    	
    	addSequential(new AutoTuneVelocityCalculateP(requiredSubsystem, _talon,parameterSlot, target, requiredSamples));
    	
    	System.out.println("Finished calculating P gain.  Switching to percent output mode.");
    	
    	addSequential(new AutoTuneVelocitySpinDown(requiredSubsystem, _talon));
    	
    	System.out.println("Talon F gain set to: " + _talon.configGetParameter(ParamEnum.eProfileParamSlot_F, parameterSlot));   
    	
    	System.out.println("Talon P gain set to: " + _talon.configGetParameter(ParamEnum.eProfileParamSlot_P, parameterSlot));    	
    
    }
    
}