package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.RightWallToRightScaleNullZoneArc;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.TeleopGoToDunkPose;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToDunkPose;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.elevator.GoToCollectPose;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 
 */
public class RightWallToRightScaleNullZone extends CommandGroup {

    public RightWallToRightScaleNullZone() {
      
    	addSequential(new FollowArc(new RightWallToRightScaleNullZoneArc()));
    	addSequential(new TeleopGoToDunkPose());
    	addSequential(new CubeCollectorSpit(-0.75), 0.5);
    	addSequential(new GoToCollectPose());
    	
    	
    }
}
