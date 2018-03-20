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

	public GoToDunkPose(double secondsToWait) {

		if (secondsToWait > 0.0) {
			addSequential(new WaitCommand(secondsToWait));
		}
		
		addParallel(new WristGoToSwitch());
		addSequential(new ElevatorGoToDunkPosition());
		addSequential(new WristGoToDunk());

	}
}
