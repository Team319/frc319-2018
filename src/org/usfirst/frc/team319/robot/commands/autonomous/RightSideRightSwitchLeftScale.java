package org.usfirst.frc.team319.robot.commands.autonomous;

import org.usfirst.frc.team319.paths.RightWallToRightSwitch;
import org.usfirst.frc.team319.paths.RightWallToRightSwitchPt2;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.GoToSwitchPose;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightSideRightSwitchLeftScale extends CommandGroup {

    public RightSideRightSwitchLeftScale() {
       
    	addParallel(new GoToSwitchPose());
    	addSequential(new FollowTrajectory(new RightWallToRightSwitch())); 
    	addSequential(new FollowTrajectory(new RightWallToRightSwitchPt2()));
    	addSequential(new CubeCollectorSpit(-1.0));
    	
    }
}
