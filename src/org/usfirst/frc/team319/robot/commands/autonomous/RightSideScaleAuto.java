package org.usfirst.frc.team319.robot.commands.autonomous;

import org.usfirst.frc.team319.paths.ScaleToSwitchCubeRightSide;
import org.usfirst.frc.team319.paths.WallToScaleRightSide;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeOpened;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToDunkPosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToHomePosition;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToCollectCube;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToDunk;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightSideScaleAuto extends CommandGroup {

    public RightSideScaleAuto() {
    	addSequential(new FollowTrajectory(new WallToScaleRightSide()));
        addSequential(new WristGoToSwitch());
        addSequential(new ElevatorGoToDunkPosition());
        addSequential(new WristGoToDunk());
        addSequential(new CubeCollectorSpit(-1.0), 0.5);
        addSequential(new WristGoToSwitch());
        addParallel(new WristGoToCollectCube());
        addSequential(new ElevatorGoToHomePosition());
        addParallel(new AutoCollectCubeOpened());
        addSequential(new FollowTrajectory(new ScaleToSwitchCubeRightSide()));
        addSequential(new WristGoToSwitch());
        addSequential(new CubeCollectorSpit(-1.0), 0.5);
    }
}
