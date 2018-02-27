package org.usfirst.frc.team319.robot.commands.autonomous;

import org.usfirst.frc.team319.paths.BackwardsThreeFeet;
import org.usfirst.frc.team319.paths.LeftWallToScaleLeftSide;
import org.usfirst.frc.team319.paths.OneFoot;
import org.usfirst.frc.team319.paths.RightWallToScaleRightSide;
import org.usfirst.frc.team319.paths.ScaleToSwitchCubeLeftSide;
import org.usfirst.frc.team319.paths.ScaleToSwitchCubeRightSide;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeOpened;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToDunkPosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToHomePosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToSwitchPosition;
import org.usfirst.frc.team319.robot.commands.pneumatics.OpenCollector;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToCollectCube;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToDunk;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftSideRightSwitchLeftScale extends CommandGroup {

    public LeftSideRightSwitchLeftScale() {
    	
    	addParallel(new GoToDunkPose());
    	addSequential(new FollowTrajectory(new LeftWallToScaleLeftSide()));
        addSequential(new CubeCollectorSpit(-0.75), 0.5);
        addSequential(new WristGoToSwitch());
        addParallel(new WristGoToCollectCube());
        addSequential(new ElevatorGoToHomePosition());
        addParallel(new WristGoToCollectCube());
        addParallel(new OpenCollector());
        addSequential(new FollowTrajectory(new ScaleToSwitchCubeLeftSide()));
        addSequential(new AutoCollectCubeOpened());
        addParallel(new GoToDunkPose());
        addSequential(new FollowTrajectory(new BackwardsThreeFeet()));
        addSequential(new CubeCollectorSpit(-1.0), 0.5);
        
    }
}
