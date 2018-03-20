package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.LeftWallToRightSideArc;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToSwitchPose;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftSideRightSwitchRightScale extends CommandGroup {

	public LeftSideRightSwitchRightScale() {

		addParallel(new GoToSwitchPose());
		addSequential(new FollowArc(new LeftWallToRightSideArc()));

	}
}
