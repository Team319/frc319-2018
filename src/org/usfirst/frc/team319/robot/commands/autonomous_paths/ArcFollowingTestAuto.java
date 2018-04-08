package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.BackwardsThreeFeetArc;
import org.usfirst.frc.team319.arcs.ThreeFeetArc;
import org.usfirst.frc.team319.robot.commands.FollowArc;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ArcFollowingTestAuto extends CommandGroup {

    public ArcFollowingTestAuto() {
   
    	addSequential(new FollowArc(new ThreeFeetArc()));
    	addSequential(new FollowArc(new BackwardsThreeFeetArc()));
    	
    }
}
