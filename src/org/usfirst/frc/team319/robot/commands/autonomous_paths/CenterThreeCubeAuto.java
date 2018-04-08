package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.models.GameState;
import org.usfirst.frc.team319.models.GameState.Side;
import org.usfirst.frc.team319.robot.commands.pneumatics.CloseCollector;
import org.usfirst.frc.team319.robot.commands.pneumatics.DrivetrainShiftUp;
import org.usfirst.frc.team319.robot.commands.pneumatics.ElevatorShiftUp;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CenterThreeCubeAuto extends CommandGroup {

	public CenterThreeCubeAuto(GameState gameState) {

		addSequential(new CloseCollector());
		addSequential(new ElevatorShiftUp());
		addSequential(new DrivetrainShiftUp());
		

		if (gameState.mySwitchSide == Side.LEFT) {
			if (gameState.scaleSide == Side.LEFT) {
				addSequential(new DoubleSwitchLeft(gameState));
			}else {
				addSequential(new LeftSwitchTripleCube(gameState));
			}
		} else {
			if (gameState.scaleSide == Side.LEFT) {
				addSequential(new RightSwitchTripleCube(gameState));
			}else {
				addSequential(new DoubleSwitchRight(gameState));
			}
		
		}
	}
}
