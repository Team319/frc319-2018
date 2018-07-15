package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.LeftSwitchToLeftSwitchCubeArc;
import org.usfirst.frc.team319.arcs.LeftWallToLeftSwitchPt1Arc;
import org.usfirst.frc.team319.arcs.LeftWallToLeftSwitchPt2Arc;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.GoToCollectPose;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToSwitchPose;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftWallToLeftSwitchAuto extends CommandGroup {

    public LeftWallToLeftSwitchAuto() {
        
    	addSequential(new FollowArc(new LeftWallToLeftSwitchPt1Arc()));
    	addSequential(new GoToSwitchPose(0.0));
    	addSequential(new FollowArc(new LeftWallToLeftSwitchPt2Arc()));
    	addSequential(new CubeCollectorSpit(-1.0), 0.3);
    	addSequential(new FollowArc(new LeftSwitchToLeftSwitchCubeArc()));
    	addSequential(new GoToCollectPose(0.0));
    	
    }
}
