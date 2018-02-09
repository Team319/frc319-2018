package org.usfirst.frc.team319.robot.commands.pneumantics;

import org.usfirst.frc.team319.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ElevatorShiftToggle extends Command {

    public ElevatorShiftToggle() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.pneumatics);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if(Robot.pneumatics.isDrivetrainHighGear == false) {
    		Robot.pneumatics.elevatorShiftUp();
    		System.out.println("Elevaotr is in High Gear");
    	}else if (Robot.pneumatics.isDrivetrainHighGear == true) {
    		Robot.pneumatics.elevatorShiftDown();
    		System.out.println("Elevator is in Low Gear");
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
