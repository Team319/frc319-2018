package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.models.GameState;
import org.usfirst.frc.team319.models.GameState.Side;
import org.usfirst.frc.team319.robot.commands.pneumatics.DrivetrainShiftUp;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CenterAuto extends CommandGroup {

	public CenterAuto(GameState gameState) {

		addSequential(new DrivetrainShiftUp());

		if (gameState.mySwitchSide == Side.LEFT) {
			addSequential(new DoubleSwitchLeft());
		} else {
			addSequential(new DoubleSwitchRight());
		}
	}
}
