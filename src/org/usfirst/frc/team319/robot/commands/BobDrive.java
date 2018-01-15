package org.usfirst.frc.team319.robot.commands;

import org.usfirst.frc.team319.models.DriveSignal;
import org.usfirst.frc.team319.robot.Robot;
import org.usfirst.frc.team319.utils.BobDriveHelper;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class BobDrive extends Command {

	BobDriveHelper helper;
	
    public BobDrive() {
    	requires(Robot.drivetrain);
    	helper = new BobDriveHelper();
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	boolean quickTurn = Robot.drivetrain.quickTurnController();
    	double moveValue = Robot.oi.driverController.getLeftStickY();
    	double rotateValue = Robot.oi.driverController.getRightStickX() * 0.5;
    	DriveSignal driveSignal = helper.cheesyDrive(0.6 * moveValue, 0.6 * rotateValue, quickTurn, false);
    	Robot.drivetrain.drive(ControlMode.PercentOutput, driveSignal);
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
