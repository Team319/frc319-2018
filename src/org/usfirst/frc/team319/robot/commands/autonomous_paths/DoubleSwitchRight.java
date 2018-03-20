package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.CenterToLeftScaleArc;
import org.usfirst.frc.team319.arcs.CenterToRightScaleArc;
import org.usfirst.frc.team319.arcs.CenterToRightSwitchArc;
import org.usfirst.frc.team319.arcs.CenterToRightSwitchPt2Arc;
import org.usfirst.frc.team319.arcs.CenterToRightSwitchPt3Arc;
import org.usfirst.frc.team319.arcs.CenterToRightSwitchPt4Arc;
import org.usfirst.frc.team319.arcs.CenterToRightSwitchPt5Arc;
import org.usfirst.frc.team319.models.GameState;
import org.usfirst.frc.team319.models.GameState.Side;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeClosed;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeOpened;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.PrintCommand;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.AutoGoToSwitchPose;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.cubecollector.HoldCube;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToCollectPosition;
import org.usfirst.frc.team319.robot.commands.pneumatics.CloseCollector;
import org.usfirst.frc.team319.robot.commands.pneumatics.OpenCollector;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DoubleSwitchRight extends CommandGroup {

	public DoubleSwitchRight(GameState gamestate) {

		addSequential(new PrintCommand("Right"));
		addParallel(new AutoGoToSwitchPose());
		addSequential(new FollowArc(new CenterToRightSwitchArc()));
		addSequential(new CubeCollectorSpit(-0.5), 1.0);
		addSequential(new FollowArc(new CenterToRightSwitchPt2Arc()));
		addSequential(new ElevatorGoToCollectPosition());
		addParallel(new AutoCollectCubeOpened());
		addSequential(new FollowArc(new CenterToRightSwitchPt3Arc()));
		addParallel(new CloseCollector());
		addSequential(new AutoCollectCubeClosed());
		addSequential(new FollowArc(new CenterToRightSwitchPt4Arc()));
		
		if (gamestate.scaleSide == Side.LEFT) {
			addSequential(new FollowArc(new CenterToLeftScaleArc()));
		}else {
			addSequential(new FollowArc(new CenterToRightScaleArc()));
		}
		/*addParallel(new CloseCollector());
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
