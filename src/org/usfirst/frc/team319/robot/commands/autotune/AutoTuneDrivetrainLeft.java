package org.usfirst.frc.team319.robot.commands.autotune;

import org.usfirst.frc.team319.robot.Robot;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoTuneDrivetrainLeft extends CommandGroup {

	public AutoTuneDrivetrainLeft() {

		addSequential(new AutoTuneVelocityConfigure(Robot.drivetrain, Robot.drivetrain.leftLead,
				Robot.drivetrain.LOW_GEAR_PROFILE, FeedbackDevice.QuadEncoder, true, true));

		addSequential(new AutoTuneVelocity(Robot.drivetrain, Robot.drivetrain.leftLead,
				Robot.drivetrain.LOW_GEAR_PROFILE, 6000, 50));
	}
}
