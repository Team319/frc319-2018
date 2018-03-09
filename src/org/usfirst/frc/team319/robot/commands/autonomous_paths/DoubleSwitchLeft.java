package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.paths.CenterToLeftSwitch;
import org.usfirst.frc.team319.paths.CenterToLeftSwitchPt2;
import org.usfirst.frc.team319.paths.CenterToLeftSwitchPt3;
import org.usfirst.frc.team319.paths.CenterToLeftSwitchPt4;
import org.usfirst.frc.team319.paths.CenterToLeftSwitchPt5;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeClosed;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeOpened;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.PrintCommand;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToSwitchPose;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToSwitchPoseNoWait;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.cubecollector.HoldCube;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToCollectPosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToSwitchPosition;
import org.usfirst.frc.team319.robot.commands.pneumatics.CloseCollector;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToParallel;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DoubleSwitchLeft extends CommandGroup {

	public DoubleSwitchLeft() {

		addSequential(new PrintCommand("Left"));
		addParallel(new GoToSwitchPoseNoWait());
		addSequential(new FollowTrajectory(new CenterToLeftSwitch()));
		addSequential(new CubeCollectorSpit(-0.5), 1.0);
		addParallel(new ElevatorGoToCollectPosition());
		addSequential(new FollowTrajectory(new CenterToLeftSwitchPt2()));
		addParallel(new AutoCollectCubeOpened());
		addSequential(new FollowTrajectory(new CenterToLeftSwitchPt3()));
		addParallel(new HoldCube());
		addParallel(new CloseCollector());
		addSequential(new FollowTrajectory(new CenterToLeftSwitchPt4()));
		addParallel(new GoToSwitchPoseNoWait());
		addSequential(new FollowTrajectory(new CenterToLeftSwitchPt5()));
		//addSequential(new CubeCollectorSpit(-0.5), 1.0);
		
		/*
		 * addSequential(new FollowTrajectory("CenterToLeftSwitchPt4"));
		 * addSequential(new FollowTrajectory("CenterToLeftSwitchPt5"));
		 */
	}
}
