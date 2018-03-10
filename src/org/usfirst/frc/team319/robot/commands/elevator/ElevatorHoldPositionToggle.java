package org.usfirst.frc.team319.robot.commands.elevator;

import org.usfirst.frc.team319.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ElevatorHoldPositionToggle extends Command {

	public ElevatorHoldPositionToggle() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.elevator);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		if (!Robot.elevator.isHoldingPosition()) {
			Robot.elevator.setTargetPosition(Robot.elevator.getCurrentPosition());
			Robot.elevator.setIsHoldingPosition(true);
		} else {
			Robot.elevator.setIsHoldingPosition(false);
		}
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
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
