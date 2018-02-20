package org.usfirst.frc.team319.robot.commands.cubecollector;

import org.usfirst.frc.team319.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class HoldCube extends Command {

    public HoldCube() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.cubeCollector);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.cubeCollector.setCubeCollector(ControlMode.PercentOutput, 0.15);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    	//return Robot.cubeCollector.isCubeLost();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	//Robot.cubeCollector.setCubeCollector(ControlMode.PercentOutput, 0);
    }
}
