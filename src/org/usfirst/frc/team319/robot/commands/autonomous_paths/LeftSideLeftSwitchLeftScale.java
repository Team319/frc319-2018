package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.OneFootArc;
import org.usfirst.frc.team319.paths.LeftWallToLeftScalePath;
import org.usfirst.frc.team319.paths.ScaleToSwitchCubeLeftSidePath;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeOpened;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToDunkPose;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToHomePosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToSwitchPosition;
import org.usfirst.frc.team319.robot.commands.pneumatics.OpenCollector;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToParallel;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftSideLeftSwitchLeftScale extends CommandGroup {

	public LeftSideLeftSwitchLeftScale() {

		addParallel(new GoToDunkPose());
		addSequential(new FollowTrajectory(new LeftWallToLeftScalePath()));
		addSequential(new CubeCollectorSpit(-0.75), 0.5);
		addSequential(new WristGoToSwitch());
		addParallel(new WristGoToParallel());
		addSequential(new ElevatorGoToHomePosition());
		addParallel(new WristGoToParallel());
		addParallel(new OpenCollector());
		addSequential(new FollowTrajectory(new ScaleToSwitchCubeLeftSidePath()));
		addSequential(new AutoCollectCubeOpened());
		addSequential(new ElevatorGoToSwitchPosition());
		addSequential(new FollowArc(new OneFootArc()));
		addSequential(new CubeCollectorSpit(-1.0), 0.5);
	}
}
