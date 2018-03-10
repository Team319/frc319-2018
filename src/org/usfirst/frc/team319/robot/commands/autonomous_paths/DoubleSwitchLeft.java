package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.CenterToLeftSwitchArc;
import org.usfirst.frc.team319.arcs.CenterToLeftSwitchPt2Arc;
import org.usfirst.frc.team319.arcs.CenterToLeftSwitchPt3Arc;
import org.usfirst.frc.team319.arcs.CenterToLeftSwitchPt4Arc;
import org.usfirst.frc.team319.arcs.CenterToLeftSwitchPt5Arc;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeOpened;
import org.usfirst.frc.team319.robot.commands.FollowArc;
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
		addSequential(new FollowArc(new CenterToLeftSwitchArc()));
		addSequential(new CubeCollectorSpit(-0.5), 1.0);
		addParallel(new ElevatorGoToCollectPosition());
		addSequential(new FollowArc(new CenterToLeftSwitchPt2Arc()));
		addParallel(new AutoCollectCubeOpened());
		addSequential(new FollowArc(new CenterToLeftSwitchPt3Arc()));
		addParallel(new HoldCube());
		addParallel(new CloseCollector());
		addSequential(new FollowArc(new CenterToLeftSwitchPt4Arc()));
		addParallel(new GoToSwitchPoseNoWait());
		addSequential(new FollowArc(new CenterToLeftSwitchPt5Arc()));
		// addSequential(new CubeCollectorSpit(-0.5), 1.0);

		/*
		 * addSequential(new FollowTrajectory("CenterToLeftSwitchPt4"));
		 * addSequential(new FollowTrajectory("CenterToLeftSwitchPt5"));
		 */
	}
}
