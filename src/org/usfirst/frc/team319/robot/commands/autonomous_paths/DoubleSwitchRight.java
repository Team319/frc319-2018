package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.CenterToRightSwitchArc;
import org.usfirst.frc.team319.arcs.CenterToRightSwitchPt2Arc;
import org.usfirst.frc.team319.arcs.CenterToRightSwitchPt3Arc;
import org.usfirst.frc.team319.arcs.CenterToRightSwitchPt4Arc;
import org.usfirst.frc.team319.arcs.CenterToRightSwitchPt5Arc;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeOpened;
import org.usfirst.frc.team319.robot.commands.FollowArc;
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
		addSequential(new FollowArc(new CenterToRightSwitchArc()));
		addSequential(new CubeCollectorSpit(-0.5), 1.0);
		addParallel(new ElevatorGoToCollectPosition());
		addSequential(new FollowArc(new CenterToRightSwitchPt2Arc()));
		addParallel(new AutoCollectCubeOpened());
		addSequential(new FollowArc(new CenterToRightSwitchPt3Arc()));
		addParallel(new CloseCollector());
		addParallel(new HoldCube());
		addSequential(new FollowArc(new CenterToRightSwitchPt4Arc()));
		addParallel(new GoToSwitchPoseNoWait());
		addSequential(new FollowArc(new CenterToRightSwitchPt5Arc()));
		// addSequential(new CubeCollectorSpit(-0.5), 1.0);
		/*
		 * addSequential(new FollowTrajectory("CenterToRightSwitchPt4"));
		 * addSequential(new FollowTrajectory("CenterToRightSwitchPt5"));
		 */
	}
}
