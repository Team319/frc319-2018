package org.usfirst.frc.team319.robot.commands.climber;

import org.usfirst.frc.team319.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class JoystickClimber extends Command {

	public JoystickClimber() {
		// Use requires() here to declare subsystem dependencies
		// requires(Robot.climber);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		double signal = Robot.oi.operatorController.leftStick.getY();
		// Robot.climber.climberTest(ControlMode.PercentOutput, signal);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
