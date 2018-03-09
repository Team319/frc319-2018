package org.usfirst.frc.team319.robot.commands;

import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToDunkPosition;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToDunk;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class TeleopGoToDunkPose extends CommandGroup {

	public TeleopGoToDunkPose() {

		addSequential(new WristGoToSwitch());
		addSequential(new ElevatorGoToDunkPosition());
		addSequential(new WristGoToDunk());

	}
}
