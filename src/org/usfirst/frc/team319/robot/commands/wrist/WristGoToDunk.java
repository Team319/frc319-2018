package org.usfirst.frc.team319.robot.commands.wrist;

import org.usfirst.frc.team319.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class WristGoToDunk extends Command {

	private int dunkPosition = Robot.wrist.getDunkPosition();
	private boolean allowedToMove = false;

	public WristGoToDunk() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	protected void initialize() {

		allowedToMove = Robot.wrist.setTargetPosition(dunkPosition);// Robot.wrist.getUpwardLimit() <
																	// Robot.wrist.homePosition;

		if (allowedToMove) {
			System.out.println("Allowed to move");
		} else {
			System.out.println("Not allowed to move");
		}
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		if (allowedToMove) {
			Robot.wrist.motionMagicControl();
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		if (allowedToMove) {
			return Robot.wrist.isInPosition(dunkPosition);
		} else {
			return true;
		}
	}

	// Called once after isFinished returns true
	protected void end() {
		System.out.println("Wrist is in Dunk Position");
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
