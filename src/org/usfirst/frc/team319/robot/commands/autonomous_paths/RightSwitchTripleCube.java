package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.CenterToLeftSwitchArc;
import org.usfirst.frc.team319.arcs.CenterToRightScaleArc;
import org.usfirst.frc.team319.arcs.CenterToRightSwitchArc;
import org.usfirst.frc.team319.arcs.FirstCubeToLeftSwitchPt1Arc;
import org.usfirst.frc.team319.arcs.FirstCubeToLeftSwitchPt2Arc;
import org.usfirst.frc.team319.arcs.FirstCubeToRightSwitchPt1Arc;
import org.usfirst.frc.team319.arcs.FirstCubeToRightSwitchPt2Arc;
import org.usfirst.frc.team319.arcs.LeftSecondCubeToLeftScaleArc;
import org.usfirst.frc.team319.arcs.LeftSecondCubeToRightScalePt1Arc;
import org.usfirst.frc.team319.arcs.LeftSecondCubeToRightScalePt2Arc;
import org.usfirst.frc.team319.arcs.LeftSwitchToFirstCubePt1Arc;
import org.usfirst.frc.team319.arcs.LeftSwitchToFirstCubePt2Arc;
import org.usfirst.frc.team319.arcs.LeftSwitchToSecondCubePt1Arc;
import org.usfirst.frc.team319.arcs.LeftSwitchToSecondCubePt2Arc;
import org.usfirst.frc.team319.arcs.RightSecondCubeToLeftScalePt1Arc;
import org.usfirst.frc.team319.arcs.RightSecondCubeToLeftScalePt2Arc;
import org.usfirst.frc.team319.arcs.RightSecondCubeToRightScaleArc;
import org.usfirst.frc.team319.arcs.RightSwitchToFirstCubePt1Arc;
import org.usfirst.frc.team319.arcs.RightSwitchToFirstCubePt2Arc;
import org.usfirst.frc.team319.arcs.RightSwitchToSecondCubePt1Arc;
import org.usfirst.frc.team319.arcs.RightSwitchToSecondCubePt2Arc;
import org.usfirst.frc.team319.arcs.TripleCubeCenterToRightSwitchArc;
import org.usfirst.frc.team319.models.GameState;
import org.usfirst.frc.team319.models.GameState.Side;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeClosed;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.GoToCollectPose;
import org.usfirst.frc.team319.robot.commands.GoToCollectSecondLevelCubePose;
import org.usfirst.frc.team319.robot.commands.autonomous_subsystems.GoToSwitchPose;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightSwitchTripleCube extends CommandGroup {

    public RightSwitchTripleCube(GameState gameState) {
       
    	addParallel(new GoToSwitchPose(0.0));
    	addSequential(new FollowArc(new TripleCubeCenterToRightSwitchArc()));
    	addParallel(new CubeCollectorSpit(-.75), 0.2);
    	addSequential(new FollowArc(new RightSwitchToFirstCubePt1Arc()));
    	addParallel(new GoToCollectPose(0.0));
    	addParallel(new AutoCollectCubeClosed(false));
    	addSequential(new FollowArc(new RightSwitchToFirstCubePt2Arc()));
    	addSequential(new FollowArc(new FirstCubeToRightSwitchPt1Arc()));
    	addParallel(new GoToCollectPose(0.0));
    	addSequential(new FollowArc(new FirstCubeToRightSwitchPt2Arc()));
    	addParallel(new CubeCollectorSpit(-0.75), 0.2);
    	addSequential(new FollowArc(new RightSwitchToSecondCubePt1Arc()));
    	addParallel(new GoToCollectSecondLevelCubePose());
    	addParallel(new AutoCollectCubeClosed(true));
    	addSequential(new FollowArc(new RightSwitchToSecondCubePt2Arc()));

    	if (gameState.scaleSide == Side.LEFT) {
			addSequential(new FollowArc(new RightSecondCubeToLeftScalePt1Arc()));
			addSequential(new FollowArc(new RightSecondCubeToLeftScalePt2Arc()));
		}else {
			addSequential(new FollowArc(new RightSecondCubeToRightScaleArc()));
		}
    	
    }
}
