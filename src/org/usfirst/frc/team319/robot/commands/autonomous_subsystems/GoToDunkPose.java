package org.usfirst.frc.team319.robot.commands.autonomous_subsystems;

import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToDunkPosition;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToDunk;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class GoToDunkPose extends CommandGroup {

	public GoToDunkPose() {

		addSequential(new WaitCommand(1.0));
		addSequential(new WristGoToSwitch());
		addSequential(new ElevatorGoToDunkPosition());
		addSequential(new WristGoToDunk());

	}
}
