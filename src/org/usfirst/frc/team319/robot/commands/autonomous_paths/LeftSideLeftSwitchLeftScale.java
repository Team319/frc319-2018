package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.paths.LeftWallToLeftScale;
import org.usfirst.frc.team319.paths.OneFoot;
import org.usfirst.frc.team319.paths.ScaleToSwitchCubeLeftSide;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeOpened;
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
		addSequential(new FollowTrajectory(new LeftWallToLeftScale()));
		addSequential(new CubeCollectorSpit(-0.75), 0.5);
		addSequential(new WristGoToSwitch());
		addParallel(new WristGoToParallel());
		addSequential(new ElevatorGoToHomePosition());
		addParallel(new WristGoToParallel());
		addParallel(new OpenCollector());
		addSequential(new FollowTrajectory(new ScaleToSwitchCubeLeftSide()));
		addSequential(new AutoCollectCubeOpened());
		addSequential(new ElevatorGoToSwitchPosition());
		addSequential(new FollowTrajectory(new OneFoot()));
		addSequential(new CubeCollectorSpit(-1.0), 0.5);
	}
}
