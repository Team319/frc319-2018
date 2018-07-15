package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.BackwardsThreeFeetArc;
import org.usfirst.frc.team319.arcs.BackwardsTwoFeetArc;
import org.usfirst.frc.team319.arcs.GetOutTheWayArc;
import org.usfirst.frc.team319.arcs.LeftNullZoneDriveAwayFromScaleArc;
import org.usfirst.frc.team319.arcs.LeftNullZoneToLeftNullZoneWallArc;
import org.usfirst.frc.team319.arcs.LeftNullZoneWallToLeftScaleArc;
import org.usfirst.frc.team319.arcs.LeftWallToLeftScaleCornerArc;
import org.usfirst.frc.team319.arcs.LeftWallToLeftScaleNullZoneArc;
import org.usfirst.frc.team319.arcs.OneFootArc;
import org.usfirst.frc.team319.arcs.RightWallToRightScaleNullZoneArc;
import org.usfirst.frc.team319.arcs.ThreeFeetArc;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.GoToHomePose;
import org.usfirst.frc.team319.robot.commands.TeleopGoToDunkPose;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToDunkPose;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.drivetrain.ResetPigeon;
import org.usfirst.frc.team319.robot.commands.elevator.GoToCollectPose;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 
 */
public class LeftWallToLeftScaleNullZone extends CommandGroup {

    public LeftWallToLeftScaleNullZone() {
    	addSequential(new FollowArc(new LeftWallToLeftScaleNullZoneArc()));
    	//addSequential(new ResetPigeon());
    	//addSequential(new FollowArc(new ThreeFeetArc()));
    	//addSequential(new FollowArc(new BackwardsThreeFeetArc()));

    	addParallel(new GoToDunkPose(0.0));
    	addSequential(new FollowArc(new LeftNullZoneWallToLeftScaleArc()));
    	addSequential(new CubeCollectorSpit(-1.0), 0.5);
    	addSequential(new GoToHomePose(0.0));
    	//addSequential(new FollowArc(new LeftNullZoneDriveAwayFromScaleArc()));
    	//addSequential(new FollowArc(new GetOutTheWayArc()));
    	
    	
    }
}
