package org.usfirst.frc.team319.robot.commands;

import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToClimbPosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToCollectPosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToScaleBottomPosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToScaleMiddlePosition;
import org.usfirst.frc.team319.robot.commands.pneumatics.ElevatorShiftDown;
import org.usfirst.frc.team319.robot.commands.wrist.PreventCubeCollision;
import org.usfirst.frc.team319.robot.commands.wrist.PreventWristCollision;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoHome;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class GoToCollectSecondLevelCubePose extends CommandGroup {

	public GoToCollectSecondLevelCubePose() {

		addSequential(new PreventCubeCollision());
		addSequential(new ElevatorGoToCollectPosition());

	}
}
