package org.usfirst.frc.team319.robot.commands.wrist;

import org.usfirst.frc.team319.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PreventWristCollision extends Command {

	boolean isSafe = false;
	private int safePosition = Robot.wrist.getHomePosition();

	public PreventWristCollision() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.wrist);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		if (Robot.wrist.getCurrentPosition() < safePosition) {
			Robot.wrist.setTargetPosition(safePosition);
		} else {
			isSafe = true;
		}
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		if (!isSafe) {
			Robot.wrist.manageMotion(safePosition);
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return isSafe || Robot.wrist.isInPosition(safePosition);
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
