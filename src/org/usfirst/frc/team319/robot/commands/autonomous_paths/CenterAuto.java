package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.CrossTheLineArc;
import org.usfirst.frc.team319.models.GameState;
import org.usfirst.frc.team319.models.GameState.Side;
import org.usfirst.frc.team319.robot.commands.FollowArc;
import org.usfirst.frc.team319.robot.commands.autonomous.autoforeveryone.CrossTheLine_Spark;
import org.usfirst.frc.team319.robot.commands.pneumatics.CloseCollector;
import org.usfirst.frc.team319.robot.commands.pneumatics.DrivetrainShiftUp;
import org.usfirst.frc.team319.robot.commands.pneumatics.ElevatorShiftUp;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CenterAuto extends CommandGroup {

	public CenterAuto(GameState gameState) {

		addSequential(new CloseCollector());
		addSequential(new ElevatorShiftUp());
		addSequential(new DrivetrainShiftUp());

		if (gameState.mySwitchSide == Side.LEFT && gameState.scaleSide == Side.LEFT) {
			addSequential(new DoubleSwitchLeft(gameState));
		} else if (gameState.mySwitchSide == Side.LEFT && gameState.scaleSide == Side.RIGHT) {
			addSequential(new DoubleSwitchLeft(gameState));
		} else if (gameState.mySwitchSide == Side.RIGHT && gameState.scaleSide == Side.LEFT) {
			addSequential(new DoubleSwitchRight(gameState));
		} else if (gameState.mySwitchSide == Side.RIGHT && gameState.scaleSide == Side.RIGHT) {
			addSequential(new DoubleSwitchRight(gameState));
		} else {
			addSequential(new FollowArc(new CrossTheLineArc()));
		}
	}
}
