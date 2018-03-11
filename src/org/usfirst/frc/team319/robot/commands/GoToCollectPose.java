package org.usfirst.frc.team319.robot.commands;

import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToClimbPosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToCollectPosition;
import org.usfirst.frc.team319.robot.commands.pneumatics.ElevatorShiftDown;
import org.usfirst.frc.team319.robot.commands.wrist.PreventWristCollision;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoHome;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class GoToCollectPose extends CommandGroup {

	public GoToCollectPose() {

		addSequential(new PreventWristCollision());
		addSequential(new ElevatorGoToCollectPosition());

	}
}
