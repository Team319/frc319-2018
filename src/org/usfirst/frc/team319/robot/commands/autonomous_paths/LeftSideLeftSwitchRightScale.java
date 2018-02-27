package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.paths.LeftWallToLeftSwitch;
import org.usfirst.frc.team319.paths.LeftWallToLeftSwitchPt2;
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
		addSequential(new FollowTrajectory(new LeftWallToLeftSwitch()));
		addSequential(new FollowTrajectory(new LeftWallToLeftSwitchPt2()));
		addSequential(new CubeCollectorSpit(-1.0));

	}
}
