package org.usfirst.frc.team319.robot.commands.autonomous;

import org.usfirst.frc.team319.paths.LeftWallToRightSide;
import org.usfirst.frc.team319.paths.RightWallToLeftSide;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.GoToSwitchPose;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftSideRightSwitchRightScale extends CommandGroup {

    public LeftSideRightSwitchRightScale() {
        
    	addParallel(new GoToSwitchPose());
    	addSequential(new FollowTrajectory(new LeftWallToRightSide()));
    	
    }
}
