package org.usfirst.frc.team319.robot.commands.autotune;

import org.usfirst.frc.team319.models.BobTalonSRX;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class AutoTuneVelocitySpinDown extends Command {

	private BobTalonSRX _talon;

	public AutoTuneVelocitySpinDown(Subsystem requiredSubsystem, BobTalonSRX talon) {
		_talon = talon;
		requires(requiredSubsystem);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		_talon.configOpenloopRamp(0.0);
		_talon.set(ControlMode.PercentOutput, 0.0);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return _talon.getSelectedSensorVelocity(0) == 0;
	}

	// Called once after isFinished returns true
	protected void end() {
		System.out.println("Motor stopped.");
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		_talon.set(ControlMode.PercentOutput, 0);
	}
}