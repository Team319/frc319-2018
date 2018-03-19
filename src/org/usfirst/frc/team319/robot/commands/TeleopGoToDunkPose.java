package org.usfirst.frc.team319.robot.commands;

import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToDunkPosition;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToDunk;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class TeleopGoToDunkPose extends CommandGroup {

	public TeleopGoToDunkPose() {

		addParallel(new WristGoToSwitch());
		addSequential(new ElevatorGoToDunkPosition());
		addSequential(new WristGoToDunk());

	}
}
