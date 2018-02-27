package org.usfirst.frc.team319.robot.commands.autonomous;

import org.usfirst.frc.team319.models.GameState;
import org.usfirst.frc.team319.models.GameState.Side;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.pneumatics.DrivetrainShiftUp;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftAuto extends CommandGroup {

    public LeftAuto(GameState gameState) {
    	
    	addSequential(new DrivetrainShiftUp());
    	
    	if(gameState.mySwitchSide == Side.LEFT && gameState.scaleSide == Side.LEFT) {
			addSequential(new LeftSideLeftSwitchLeftScale());
		}else if(gameState.mySwitchSide == Side.LEFT && gameState.scaleSide == Side.RIGHT){
			addSequential(new LeftSideLeftSwitchRightScale());
		}else if(gameState.mySwitchSide == Side.RIGHT && gameState.scaleSide == Side.LEFT) {
			addSequential(new LeftSideRightSwitchLeftScale());
		}else if(gameState.mySwitchSide == Side.RIGHT && gameState.scaleSide == Side.RIGHT) {
			addSequential(new LeftSideRightSwitchRightScale());
		}
    }
}
