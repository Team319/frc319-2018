package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.paths.BackwardsThreeFeet;
import org.usfirst.frc.team319.paths.RightWallToRightScale;
import org.usfirst.frc.team319.paths.ScaleToSwitchCubeRightSide;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeOpened;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToDunkPose;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToHomePosition;
import org.usfirst.frc.team319.robot.commands.pneumatics.OpenCollector;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToCollectCube;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightSideLeftSwitchRightScale extends CommandGroup {

	public RightSideLeftSwitchRightScale() {

		addParallel(new GoToDunkPose());
		addSequential(new FollowTrajectory(new RightWallToRightScale()));
		addSequential(new CubeCollectorSpit(-0.75), 0.5);
		addSequential(new WristGoToSwitch());
		addParallel(new WristGoToCollectCube());
		addSequential(new ElevatorGoToHomePosition());
		addParallel(new WristGoToCollectCube());
		addParallel(new OpenCollector());
		addSequential(new FollowTrajectory(new ScaleToSwitchCubeRightSide()));
		addSequential(new AutoCollectCubeOpened());
		addParallel(new GoToDunkPose());
		addSequential(new FollowTrajectory(new BackwardsThreeFeet()));
		addSequential(new CubeCollectorSpit(-1.0), 0.5);

	}
}