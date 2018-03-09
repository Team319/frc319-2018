package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.RightWallToLeftSideArc;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToSwitchPose;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightSideLeftSwitchLeftScale extends CommandGroup {

	public RightSideLeftSwitchLeftScale() {
		addParallel(new GoToSwitchPose());
		addSequential(new FollowArc(new RightWallToLeftSideArc()));

	}
}
