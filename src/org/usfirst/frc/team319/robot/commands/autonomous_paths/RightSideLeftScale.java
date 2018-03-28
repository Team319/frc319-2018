package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.RightWallToLeftScaleArc;
import org.usfirst.frc.team319.arcs.RightWallToLeftSideArc;
import org.usfirst.frc.team319.arcs.ScaleToSwitchCubeLeftSideArc;
import org.usfirst.frc.team319.arcs.SwitchCubeToScaleLeftSideArc;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeOpened;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.GoToCollectPose;
import org.usfirst.frc.team319.robot.commands.TeleopGoToDunkPose;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToDunkPose;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToSwitchPose;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.pneumatics.ElevatorShiftUp;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightSideLeftScale extends CommandGroup {

	public RightSideLeftScale() {
		
		addSequential(new FollowArc(new RightWallToLeftScaleArc()));
		addSequential(new TeleopGoToDunkPose());
		addSequential(new CubeCollectorSpit(-0.75), 0.5);
		addSequential(new GoToCollectPose(0.0));
		addParallel(new AutoCollectCubeOpened());
		addSequential(new FollowArc(new ScaleToSwitchCubeLeftSideArc()));
		addSequential(new WristGoToSwitch());
		addParallel(new GoToDunkPose(0.0));
		addSequential(new FollowTrajectory(new SwitchCubeToScaleLeftSideArc()));
		addSequential(new GoToDunkPose(0.0));
		addSequential(new CubeCollectorSpit(-0.75), 0.5);

	}
}
