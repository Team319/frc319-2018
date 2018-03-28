package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.BackwardsThreeFeetArc;
import org.usfirst.frc.team319.arcs.OneFootArc;
import org.usfirst.frc.team319.arcs.RightWallToRightScaleArc;
import org.usfirst.frc.team319.arcs.ScaleToSwitchCubeRightSideArc;
import org.usfirst.frc.team319.arcs.SwitchCubeToScaleRightSideArc;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeOpened;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.GoToCollectPose;
import org.usfirst.frc.team319.robot.commands.TeleopGoToDunkPose;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToDunkPose;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToCollectPosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToHomePosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToSwitchPosition;
import org.usfirst.frc.team319.robot.commands.pneumatics.CloseCollector;
import org.usfirst.frc.team319.robot.commands.pneumatics.OpenCollector;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToCollectCube;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToDunk;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToParallel;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.PrintCommand;

/**
 *
 */
public class RightSideRightScale extends CommandGroup {

	public RightSideRightScale() {

		addSequential(new PrintCommand("Right wall to right scale"));
		addSequential(new FollowArc(new RightWallToRightScaleArc()));
		addSequential(new GoToDunkPose(0.0));
		addSequential(new CubeCollectorSpit(-0.75), 0.5);
		addSequential(new GoToCollectPose(0.0));
		addParallel(new AutoCollectCubeOpened());
		addSequential(new FollowArc(new ScaleToSwitchCubeRightSideArc()));
		/*
		addSequential(new CloseCollector());
		addParallel(new GoToDunkPose(0.0));
		addSequential(new FollowArc(new SwitchCubeToScaleRightSideArc()));
		addSequential(new TeleopGoToDunkPose());
		addSequential(new CubeCollectorSpit(-0.75), 0.5);
		*/
	}
}
