package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.paths.CenterToLeftSwitchPt4;
import org.usfirst.frc.team319.paths.CenterToLeftSwitchPt5;
import org.usfirst.frc.team319.paths.CenterToRightSwitch;
import org.usfirst.frc.team319.paths.CenterToRightSwitchPt2;
import org.usfirst.frc.team319.paths.CenterToRightSwitchPt3;
import org.usfirst.frc.team319.paths.CenterToRightSwitchPt4;
import org.usfirst.frc.team319.paths.CenterToRightSwitchPt5;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeClosed;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeOpened;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.PrintCommand;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToSwitchPoseNoWait;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.cubecollector.HoldCube;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToCollectPosition;
import org.usfirst.frc.team319.robot.commands.pneumatics.CloseCollector;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DoubleSwitchRight extends CommandGroup {

	public DoubleSwitchRight() {

		addSequential(new PrintCommand("Right"));
		addParallel(new GoToSwitchPoseNoWait());
		addSequential(new FollowTrajectory(new CenterToRightSwitch()));
		addSequential(new CubeCollectorSpit(-0.5), 1.0);
		addParallel(new ElevatorGoToCollectPosition());
		addSequential(new FollowTrajectory(new CenterToRightSwitchPt2()));
		addParallel(new AutoCollectCubeOpened());
		addSequential(new FollowTrajectory(new CenterToRightSwitchPt3()));
		addParallel(new CloseCollector());
		addParallel(new HoldCube());
		addSequential(new FollowTrajectory(new CenterToRightSwitchPt4()));
		addParallel(new GoToSwitchPoseNoWait());
		addSequential(new FollowTrajectory(new CenterToRightSwitchPt5()));
		//addSequential(new CubeCollectorSpit(-0.5), 1.0);
		
		/*
		 * addSequential(new FollowTrajectory("CenterToRightSwitchPt4"));
		 * addSequential(new FollowTrajectory("CenterToRightSwitchPt5"));
		 */
	}
}
