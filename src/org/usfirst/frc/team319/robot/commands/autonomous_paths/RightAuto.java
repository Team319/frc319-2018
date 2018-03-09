package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.models.GameState;
import org.usfirst.frc.team319.models.GameState.Side;
import org.usfirst.frc.team319.robot.commands.PrintCommand;
import org.usfirst.frc.team319.robot.commands.pneumatics.CloseCollector;
import org.usfirst.frc.team319.robot.commands.pneumatics.DrivetrainShiftUp;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightAuto extends CommandGroup {

	public RightAuto(GameState gameState) {

		addSequential(new CloseCollector());
		addSequential(new DrivetrainShiftUp());
		addSequential(new PrintCommand("Right Auto Command Called"));
		
		if (gameState.mySwitchSide == Side.LEFT && gameState.scaleSide == Side.LEFT) {
			addParallel(new PrintCommand("Left Left Auto"));
			addSequential(new RightSideLeftSwitchLeftScale());
		} else if (gameState.mySwitchSide == Side.LEFT && gameState.scaleSide == Side.RIGHT) {
			addSequential(new RightSideLeftSwitchRightScale());
		} else if (gameState.mySwitchSide == Side.RIGHT && gameState.scaleSide == Side.LEFT) {
			addSequential(new RightSideRightSwitchLeftScale());
		} else if (gameState.mySwitchSide == Side.RIGHT && gameState.scaleSide == Side.RIGHT) {
			addSequential(new RightSideRightSwitchRightScale());
		}
	}
}
