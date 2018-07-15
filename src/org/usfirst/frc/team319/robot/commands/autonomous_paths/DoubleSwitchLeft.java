package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.CenterToLeftScalePt1Arc;
import org.usfirst.frc.team319.arcs.CenterToLeftScalePt2Arc;
import org.usfirst.frc.team319.arcs.CenterToLeftSwitchArc;
import org.usfirst.frc.team319.arcs.CenterToLeftSwitchPt2Arc;
import org.usfirst.frc.team319.arcs.CenterToLeftSwitchPt3Arc;
import org.usfirst.frc.team319.arcs.CenterToLeftSwitchPt4Arc;
import org.usfirst.frc.team319.arcs.CenterToLeftSwitchPt5Arc;
import org.usfirst.frc.team319.arcs.CenterToRightScalePt1Arc;
import org.usfirst.frc.team319.arcs.CenterToRightScalePt2Arc;
import org.usfirst.frc.team319.arcs.CenterToRightScaleReverseArc;
import org.usfirst.frc.team319.arcs.CenterToRightSwitchPt4Arc;
import org.usfirst.frc.team319.models.GameState;
import org.usfirst.frc.team319.models.GameState.Side;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeClosed;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeOpened;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.GoToCollectPose;
import org.usfirst.frc.team319.robot.commands.PrintCommand;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.AutoGoToSwitchPose;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.cubecollector.HoldCube;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToCollectPosition;
import org.usfirst.frc.team319.robot.commands.pneumatics.CloseCollector;
import org.usfirst.frc.team319.robot.commands.pneumatics.OpenCollector;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DoubleSwitchLeft extends CommandGroup {

	public DoubleSwitchLeft(GameState gamestate) {

		addSequential(new PrintCommand("Left"));
		addParallel(new AutoGoToSwitchPose());
		addSequential(new FollowArc(new CenterToLeftSwitchArc()));
		addSequential(new CubeCollectorSpit(-0.5), 0.2);
		addParallel(new GoToCollectPose(1.0));
		addSequential(new FollowArc(new CenterToLeftSwitchPt2Arc()));
		addParallel(new AutoCollectCubeOpened(false));
		addSequential(new FollowArc(new CenterToLeftSwitchPt3Arc()));
		addSequential(new AutoCollectCubeClosed(false));

		
		if (gamestate.scaleSide == Side.LEFT) {
			addSequential(new FollowArc(new CenterToLeftScalePt1Arc()));
			addParallel(new WristGoToSwitch());
			addSequential(new FollowArc(new CenterToLeftScalePt2Arc()));
		}else {
			addSequential(new FollowArc(new CenterToRightScalePt1Arc()));
			addParallel(new WristGoToSwitch());
			addSequential(new FollowArc(new CenterToRightScalePt2Arc()));
		}
		/*addParallel(new HoldCube());
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
