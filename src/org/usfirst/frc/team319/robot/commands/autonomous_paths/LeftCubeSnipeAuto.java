package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.arcs.CrossTheLineArc;
import org.usfirst.frc.team319.arcs.CrossTheLineReverseArc;
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
public class LeftCubeSnipeAuto extends CommandGroup {

	public LeftCubeSnipeAuto(GameState gamestate) {

		addSequential(new CloseCollector());
		addSequential(new DrivetrainShiftUp());
		addSequential(new ElevatorShiftUp());

		if (gamestate.scaleSide == Side.LEFT) {
			addSequential(new LeftWallToLeftCubeSnipe());
		} else if (gamestate.scaleSide == Side.RIGHT && gamestate.mySwitchSide == Side.LEFT) {
				addSequential(new LeftWallToLeftSwitchAuto());
		} else if (gamestate.scaleSide == Side.RIGHT && gamestate.mySwitchSide == Side.RIGHT){
				addSequential(new LeftWallToRightSideAuto());
		}else {
				addSequential(new FollowArc(new CrossTheLineReverseArc()));
		}

	}
}
