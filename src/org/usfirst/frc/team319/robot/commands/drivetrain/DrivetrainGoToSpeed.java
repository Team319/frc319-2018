package org.usfirst.frc.team319.robot.commands.drivetrain;

import org.usfirst.frc.team319.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DrivetrainGoToSpeed extends Command {

	public DrivetrainGoToSpeed() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.drivetrain);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.drivetrain.leftLead.selectProfileSlot(Robot.drivetrain.HIGH_GEAR_PROFILE, 0);
		Robot.drivetrain.rightLead.selectProfileSlot(Robot.drivetrain.HIGH_GEAR_PROFILE, 0);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.drivetrain.drive(ControlMode.Velocity, 2000, 2000);
		System.out.println("Left Error: " + Robot.drivetrain.getLeftClosedLoopError() + "Right Error: "
				+ Robot.drivetrain.getRightClosedLoopError());
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
