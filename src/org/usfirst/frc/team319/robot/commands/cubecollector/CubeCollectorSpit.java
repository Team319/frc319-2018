package org.usfirst.frc.team319.robot.commands.cubecollector;

import org.usfirst.frc.team319.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CubeCollectorSpit extends Command {

	private boolean joystickControl = true;
	private double targetSpeed = 0.0;

	public CubeCollectorSpit() {
		requires(Robot.cubeCollector);
		joystickControl = true;
	}

	public CubeCollectorSpit(double speed) {
		requires(Robot.cubeCollector);
		joystickControl = false;
		targetSpeed = speed;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		System.out.println("Cube collector is spitting");
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		if (joystickControl) {
			double spitPower = Robot.oi.driverController.triggers.getLeft();
			targetSpeed = -(spitPower * spitPower);
			Robot.cubeCollector.setCubeCollector(ControlMode.PercentOutput, targetSpeed);
		} else {
			Robot.cubeCollector.setCubeCollector(ControlMode.PercentOutput, targetSpeed);
		}

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.cubeCollector.setCubeCollector(ControlMode.PercentOutput, 0);

	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		Robot.cubeCollector.setCubeCollector(ControlMode.PercentOutput, 0);
	}
}
