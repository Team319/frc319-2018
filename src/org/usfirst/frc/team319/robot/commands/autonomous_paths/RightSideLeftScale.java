package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.LeftWallToRightScaleArc;
import org.usfirst.frc.team319.arcs.RightWallToLeftScaleArc;
import org.usfirst.frc.team319.arcs.RightWallToLeftSideArc;
import org.usfirst.frc.team319.arcs.ScaleToSwitchCubeLeftSideArc;
import org.usfirst.frc.team319.arcs.ScaleToSwitchCubeRightSideArc;
import org.usfirst.frc.team319.arcs.SwitchCubeToScaleLeftSideArc;
import org.usfirst.frc.team319.arcs.SwitchCubeToScaleRightSideArc;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeOpened;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.GoToCollectPose;
import org.usfirst.frc.team319.robot.commands.TeleopGoToDunkPose;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToDunkPose;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToSwitchPose;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.drivetrain.SetCrossTheFieldRotationSRXGains;
import org.usfirst.frc.team319.robot.commands.drivetrain.SetDefaultRotationSRXGains;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToSwitchPositionTimeout;
import org.usfirst.frc.team319.robot.commands.pneumatics.CloseCollector;
import org.usfirst.frc.team319.robot.commands.pneumatics.ElevatorShiftUp;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightSideLeftScale extends CommandGroup {

	public RightSideLeftScale() {
		
		addSequential(new SetCrossTheFieldRotationSRXGains());
		addParallel(new ElevatorGoToSwitchPositionTimeout(5.0));
		addSequential(new FollowArc(new RightWallToLeftScaleArc()));
		addSequential(new GoToDunkPose(0.0));
		addSequential(new CubeCollectorSpit(-0.75), 0.3);
		addSequential(new GoToCollectPose(0.0));
		addParallel(new AutoCollectCubeOpened(true));
		addSequential(new FollowArc(new ScaleToSwitchCubeLeftSideArc()));
		addSequential(new CloseCollector());
		addParallel(new GoToDunkPose(0.0));
		addSequential(new FollowArc(new SwitchCubeToScaleLeftSideArc()));
		addSequential(new CubeCollectorSpit(-0.75), 0.3);
		addSequential(new GoToCollectPose(0.0));
		addSequential(new SetDefaultRotationSRXGains());

	}
}
