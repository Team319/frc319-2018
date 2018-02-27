package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.paths.CrossTheLine;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DriveForwardThreeFeet extends CommandGroup {

    public DriveForwardThreeFeet() {
    	
    	addSequential(new FollowTrajectory(new CrossTheLine()));
        
    }
}
