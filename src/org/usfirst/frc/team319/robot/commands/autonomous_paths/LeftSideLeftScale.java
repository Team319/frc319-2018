package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.LeftWallToLeftScaleArc;
import org.usfirst.frc.team319.arcs.OneFootArc;
import org.usfirst.frc.team319.arcs.ScaleToSwitchCubeLeftSideArc;
import org.usfirst.frc.team319.arcs.SwitchCubeToScaleLeftSideArc;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeOpened;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToDunkPose;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorStop;
import org.usfirst.frc.team319.robot.commands.cubecollector.HoldCube;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToCollectPosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToHomePosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToSwitchPosition;
import org.usfirst.frc.team319.robot.commands.elevator.GoToCollectPose;
import org.usfirst.frc.team319.robot.commands.pneumatics.CloseCollector;
import org.usfirst.frc.team319.robot.commands.pneumatics.OpenCollector;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToParallel;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftSideLeftScale extends CommandGroup {

	public LeftSideLeftScale() {

		addParallel(new GoToDunkPose(1.5));
		addSequential(new FollowArc(new LeftWallToLeftScaleArc()));
		addSequential(new CubeCollectorSpit(-0.75), 0.5);
		addSequential(new WristGoToSwitch());
		addSequential(new ElevatorGoToCollectPosition());
		addParallel(new AutoCollectCubeOpened());
		addSequential(new FollowArc(new ScaleToSwitchCubeLeftSideArc()));
		addSequential(new CloseCollector());
		addSequential(new HoldCube());
		addSequential(new FollowArc(new SwitchCubeToScaleLeftSideArc()));
		addSequential(new GoToDunkPose(0.0));
		addSequential(new CubeCollectorSpit(-0.75), 0.5);
		addSequential(new WristGoToSwitch());
		addSequential(new GoToCollectPose());
	}
}
