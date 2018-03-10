package org.usfirst.frc.team319.robot.commands;

import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToScalePosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorScaleControl;
import org.usfirst.frc.team319.robot.commands.pneumatics.ElevatorShiftDown;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToParallel;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class GoToScalePose extends CommandGroup {

	public GoToScalePose() {

		addSequential(new ElevatorShiftDown());
		addSequential(new ElevatorGoToScalePosition());
		addParallel(new ElevatorShiftDown());
		addSequential(new WristGoToParallel());
		addSequential(new ElevatorScaleControl());
	}
}
