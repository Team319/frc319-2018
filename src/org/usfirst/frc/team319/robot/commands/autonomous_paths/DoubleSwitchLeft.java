package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.paths.CenterToLeftSwitchPath;
import org.usfirst.frc.team319.paths.CenterToLeftSwitchPt2Path;
import org.usfirst.frc.team319.paths.CenterToLeftSwitchPt3Path;
import org.usfirst.frc.team319.paths.CenterToLeftSwitchPt4Path;
import org.usfirst.frc.team319.paths.CenterToLeftSwitchPt5Path;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeOpened;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.PrintCommand;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToSwitchPoseNoWait;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.cubecollector.HoldCube;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToCollectPosition;
import org.usfirst.frc.team319.robot.commands.pneumatics.CloseCollector;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DoubleSwitchLeft extends CommandGroup {

	public DoubleSwitchLeft() {

		addSequential(new PrintCommand("Left"));
		addParallel(new GoToSwitchPoseNoWait());
		addSequential(new FollowTrajectory(new CenterToLeftSwitchPath()));
		addSequential(new CubeCollectorSpit(-0.5), 1.0);
		addParallel(new ElevatorGoToCollectPosition());
		addSequential(new FollowTrajectory(new CenterToLeftSwitchPt2Path()));
		addParallel(new AutoCollectCubeOpened());
		addSequential(new FollowTrajectory(new CenterToLeftSwitchPt3Path()));
		addParallel(new HoldCube());
		addParallel(new CloseCollector());
		addSequential(new FollowTrajectory(new CenterToLeftSwitchPt4Path()));
		addParallel(new GoToSwitchPoseNoWait());
		addSequential(new FollowTrajectory(new CenterToLeftSwitchPt5Path()));
		// addSequential(new CubeCollectorSpit(-0.5), 1.0);

		/*
		 * addSequential(new FollowTrajectory("CenterToLeftSwitchPt4"));
		 * addSequential(new FollowTrajectory("CenterToLeftSwitchPt5"));
		 */
	}
}
