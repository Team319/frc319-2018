package org.usfirst.frc.team319.robot.commands.autonomous;

import org.usfirst.frc.team319.models.GameState;
import org.usfirst.frc.team319.models.GameState.Side;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.pneumatics.DrivetrainShiftDown;
import org.usfirst.frc.team319.robot.commands.pneumatics.DrivetrainShiftToggle;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CenterAuto extends CommandGroup {

    public CenterAuto(GameState gameState) {
    	
    	addSequential(new DrivetrainShiftDown());
    	
    	if(gameState.mySwitchSide == Side.LEFT) {
			addSequential(new DoubleSwitchLeft());
		}else {
			addSequential(new DoubleSwitchRight());
		}
    }
}
