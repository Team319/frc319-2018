package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.RightWallToRightSwitchArc;
import org.usfirst.frc.team319.arcs.RightWallToRightSwitchPt2Arc;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToSwitchPose;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightSideRightSwitchLeftScale extends CommandGroup {

	public RightSideRightSwitchLeftScale() {

		addParallel(new GoToSwitchPose());
		addSequential(new FollowArc(new RightWallToRightSwitchArc()));
		addSequential(new FollowArc(new RightWallToRightSwitchPt2Arc()));
		addSequential(new CubeCollectorSpit(-1.0));

	}
}
