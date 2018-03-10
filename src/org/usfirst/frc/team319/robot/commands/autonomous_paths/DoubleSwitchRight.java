package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.paths.CenterToRightSwitchPath;
import org.usfirst.frc.team319.paths.CenterToRightSwitchPt2Path;
import org.usfirst.frc.team319.paths.CenterToRightSwitchPt3Path;
import org.usfirst.frc.team319.paths.CenterToRightSwitchPt4Path;
import org.usfirst.frc.team319.paths.CenterToRightSwitchPt5Path;
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
public class DoubleSwitchRight extends CommandGroup {

	public DoubleSwitchRight() {

		addSequential(new PrintCommand("Right"));
		addParallel(new GoToSwitchPoseNoWait());
		addSequential(new FollowTrajectory(new CenterToRightSwitchPath()));
		addSequential(new CubeCollectorSpit(-0.5), 1.0);
		addParallel(new ElevatorGoToCollectPosition());
		addSequential(new FollowTrajectory(new CenterToRightSwitchPt2Path()));
		addParallel(new AutoCollectCubeOpened());
		addSequential(new FollowTrajectory(new CenterToRightSwitchPt3Path()));
		addParallel(new CloseCollector());
		addParallel(new HoldCube());
		addSequential(new FollowTrajectory(new CenterToRightSwitchPt4Path()));
		addParallel(new GoToSwitchPoseNoWait());
		addSequential(new FollowTrajectory(new CenterToRightSwitchPt5Path()));
		// addSequential(new CubeCollectorSpit(-0.5), 1.0);
		/*
		 * addSequential(new FollowTrajectory("CenterToRightSwitchPt4"));
		 * addSequential(new FollowTrajectory("CenterToRightSwitchPt5"));
		 */
	}
}
