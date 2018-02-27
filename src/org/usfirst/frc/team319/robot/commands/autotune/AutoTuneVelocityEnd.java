package org.usfirst.frc.team319.robot.commands.autotune;

import org.usfirst.frc.team319.models.BobTalonSRX;

import com.ctre.phoenix.ParamEnum;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class AutoTuneVelocityEnd extends Command {

	public BobTalonSRX _talon;
	public int parameterSlot;

	public AutoTuneVelocityEnd(Subsystem requiredSubsystem, BobTalonSRX talon, int srxParameterSlot) {
		this._talon = talon;
		this.parameterSlot = srxParameterSlot;
		requires(requiredSubsystem);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return true;
	}

	// Called once after isFinished returns true
	protected void end() {

		System.out.println(
				"Talon F gain set to: " + _talon.configGetParameter(ParamEnum.eProfileParamSlot_F, parameterSlot));
		System.out.println(
				"Talon P gain set to: " + _talon.configGetParameter(ParamEnum.eProfileParamSlot_P, parameterSlot));
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
