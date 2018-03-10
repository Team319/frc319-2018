package org.usfirst.frc.team319.robot.commands.elevator;

import org.usfirst.frc.team319.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.DemandType;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class JoystickElevator extends Command {
	
	private int positionIncrement = 200;

	public JoystickElevator() {
		requires(Robot.elevator);

	}

	// Called just before this Command runs the first time
	protected void initialize() {

	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {

		if (!Robot.elevator.isHoldingPosition()) {
			// joystick control
			double signal = -Robot.oi.operatorController.leftStick.getY();
			Robot.elevator.incrementTargetPosition((int)(signal * positionIncrement));
			Robot.elevator.motionMagicControl();
			//Robot.elevator.setElevator(ControlMode.PercentOutput, signal, DemandType.ArbitraryFeedForward, Robot.elevator.getArbitraryFeedForward() );
		} else {
			// else hold position
			Robot.elevator.motionMagicControl();
		}

		// System.out.println("Elevator Velocity" +
		// Robot.elevator.elevatorLead.getSelectedSensorVelocity(0));
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
