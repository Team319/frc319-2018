package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.CrossTheLineArc;
import org.usfirst.frc.team319.models.GameState;
import org.usfirst.frc.team319.models.GameState.Side;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.pneumatics.CloseCollector;
import org.usfirst.frc.team319.robot.commands.pneumatics.DrivetrainShiftUp;
import org.usfirst.frc.team319.robot.commands.pneumatics.ElevatorShiftUp;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightScaleNullZoneAuto extends CommandGroup {

    public RightScaleNullZoneAuto(GameState gamestate) {
      
    	addSequential(new CloseCollector());
    	addSequential(new DrivetrainShiftUp());
    	addSequential(new ElevatorShiftUp());
    	
    	if (gamestate.scaleSide == Side.RIGHT) {
			addSequential(new RightWallToRightScaleNullZone());
		}else if(gamestate.scaleSide == Side.LEFT) {
			addSequential(new FollowArc(new CrossTheLineArc())); //place holder
		}
    	
    }
}
