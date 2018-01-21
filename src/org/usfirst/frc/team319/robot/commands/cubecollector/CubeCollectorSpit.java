package org.usfirst.frc.team319.robot.commands.cubecollector;

import org.usfirst.frc.team319.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CubeCollectorSpit extends Command {

    public CubeCollectorSpit() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.cubeCollector);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	// does not work, the left motor spins in the wrong direction at the right speed
    	// or spins in the right direction at the wrong speed, we don't know why.
    	double rpm = -210; 
    	double speed = rpm * 4096 / 600;
    	ControlMode controlMode = ControlMode.Velocity;
    	Robot.cubeCollector.setCubeCollector(controlMode, speed);
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
