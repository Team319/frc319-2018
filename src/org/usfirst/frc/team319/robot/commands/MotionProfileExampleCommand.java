package org.usfirst.frc.team319.robot.commands;

import org.usfirst.frc.team319.models.MotionProfileExample;
import org.usfirst.frc.team319.paths.CrossTheLine;
import org.usfirst.frc.team319.robot.Robot;

import com.ctre.phoenix.motion.SetValueMotionProfile;
import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MotionProfileExampleCommand extends Command {

	private MotionProfileExample left;
	private MotionProfileExample right;

	public MotionProfileExampleCommand() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.drivetrain);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		left = new MotionProfileExample(new CrossTheLine().leftProfile, Robot.drivetrain.leftLead);
		right = new MotionProfileExample(new CrossTheLine().rightProfile, Robot.drivetrain.rightLead);
		System.out.println("running motion profile");

		Robot.drivetrain.leftLead.set(ControlMode.MotionProfile, SetValueMotionProfile.Disable.value);
		Robot.drivetrain.rightLead.set(ControlMode.MotionProfile, SetValueMotionProfile.Disable.value);

		left.startMotionProfile();
		right.startMotionProfile();
		left.control();
		right.control();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {

		SetValueMotionProfile setOutput = left.getSetValue();
		Robot.drivetrain.leftLead.set(ControlMode.MotionProfile, setOutput.value);

		setOutput = right.getSetValue();
		Robot.drivetrain.rightLead.set(ControlMode.MotionProfile, setOutput.value);

		left.control();
		right.control();

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return left.getSetValue() == SetValueMotionProfile.Hold;
	}

	// Called once after isFinished returns true
	protected void end() {

		Robot.drivetrain.leftLead.set(ControlMode.PercentOutput, 0);
		Robot.drivetrain.rightLead.set(ControlMode.PercentOutput, 0);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
