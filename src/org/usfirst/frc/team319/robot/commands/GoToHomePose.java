package org.usfirst.frc.team319.robot.commands;

import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToClimbPosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToCollectPosition;
import org.usfirst.frc.team319.robot.commands.pneumatics.ElevatorShiftDown;
import org.usfirst.frc.team319.robot.commands.wrist.PreventWristCollision;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoHome;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class GoToHomePose extends CommandGroup {

	public GoToHomePose(double secondsToWait) {

		if (secondsToWait > 0.0) {
			addSequential(new WaitCommand(secondsToWait));
		}
		
		addSequential(new PreventWristCollision());
		addSequential(new ElevatorGoToCollectPosition());

	}
}
