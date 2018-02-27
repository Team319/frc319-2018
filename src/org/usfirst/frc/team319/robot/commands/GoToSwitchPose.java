package org.usfirst.frc.team319.robot.commands;

import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToSwitchPosition;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToCollectCube;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class GoToSwitchPose extends CommandGroup {

	public GoToSwitchPose() {

		addSequential(new WaitCommand(1.0));
		addParallel(new WristGoToCollectCube());
		addSequential(new ElevatorGoToSwitchPosition());

	}
}
