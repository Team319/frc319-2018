package org.usfirst.frc.team319.robot.commands.wrist;

import org.usfirst.frc.team319.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class WristGoToAutoSwitchPosition extends Command {

	int targetPosition = Robot.wrist.getAutoSwitchPosition();

	public WristGoToAutoSwitchPosition() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.wrist);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.wrist.setTargetPosition(targetPosition);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.wrist.motionMagicControl();
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return Robot.wrist.isInPosition(targetPosition);
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
