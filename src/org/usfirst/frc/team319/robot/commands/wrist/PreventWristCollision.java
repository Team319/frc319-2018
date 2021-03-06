package org.usfirst.frc.team319.robot.commands.wrist;

import org.usfirst.frc.team319.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PreventWristCollision extends Command {

	boolean isSafe = false;
	private int safePosition = Robot.wrist.getSafePosition();
	private int homePosition = Robot.wrist.getHomePosition();

	public PreventWristCollision() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.wrist);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		int position = Robot.wrist.getCurrentPosition();
		System.out.println("Wrist position: " + position);
		if (position < safePosition) {
			isSafe = false;
			Robot.wrist.setTargetPosition(homePosition);
		} else {
			isSafe = true;
		}
		System.out.println("Wrist is safe: " + isSafe);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		if (!isSafe) {
			Robot.wrist.motionMagicControl();
			
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		boolean beyondTarget = Robot.wrist.getCurrentPosition() > safePosition;
		return isSafe || beyondTarget;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
