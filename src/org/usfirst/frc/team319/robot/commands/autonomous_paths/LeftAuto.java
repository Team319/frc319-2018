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
public class LeftAuto extends CommandGroup {

	public LeftAuto(GameState gameState) {

		addParallel(new CloseCollector());
		addParallel(new ElevatorShiftUp());
		addSequential(new DrivetrainShiftUp());

		if (gameState.scaleSide == Side.LEFT) {
			addSequential(new LeftSideLeftScale());
		} else if (gameState.scaleSide == Side.RIGHT) {
			addSequential(new LeftSideRightScale());
		} 
	}
}
