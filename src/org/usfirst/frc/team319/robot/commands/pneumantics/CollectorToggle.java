package org.usfirst.frc.team319.robot.commands.pneumantics;

import org.usfirst.frc.team319.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CollectorToggle extends Command {

    public CollectorToggle() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.pneumatics);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if(Robot.pneumatics.isCollectorSolenoidExtended == false) {
    		Robot.pneumatics.openCollector();
    		System.out.println("Collector Extended");
    	}else if (Robot.pneumatics.isCollectorSolenoidExtended == true) {
    		Robot.pneumatics.closeCollector();
    		System.out.println("Collector Retracted");
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
