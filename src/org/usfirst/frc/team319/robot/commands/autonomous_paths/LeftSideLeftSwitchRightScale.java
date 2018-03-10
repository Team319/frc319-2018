package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.LeftWallToLeftSwitchArc;
import org.usfirst.frc.team319.arcs.LeftWallToLeftSwitchPt2Arc;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToSwitchPose;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftSideLeftSwitchRightScale extends CommandGroup {

	public LeftSideLeftSwitchRightScale() {

		addParallel(new GoToSwitchPose());
		addSequential(new FollowArc(new LeftWallToLeftSwitchArc()));
		addSequential(new FollowArc(new LeftWallToLeftSwitchPt2Arc()));
		addSequential(new CubeCollectorSpit(-1.0));

	}
}
