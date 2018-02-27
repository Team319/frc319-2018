package org.usfirst.frc.team319.robot.commands.cubecollector;

import org.usfirst.frc.team319.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CubeCollectorStraightenCube extends Command {

	public CubeCollectorStraightenCube() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.cubeCollector);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		ControlMode controlMode = ControlMode.PercentOutput;
		double left = 0.5; // 1.0
		double right = -0.2;
		Robot.cubeCollector.setCubeCollectorIndependently(controlMode, left, right);
		// Commented out so I can try out an auto-straightener(7-in. arms)

		/*
		 * if
		 * Robot.cubeCollector.leftUltrasonic()>Robot.cubeCollector.rightUltrasonic(){
		 * //(If the left side of the cube is farther away than the right side) double
		 * left = 0.5;//Pull in the left side double right = -0.5;
		 */
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
