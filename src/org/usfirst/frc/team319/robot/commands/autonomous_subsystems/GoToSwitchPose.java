package org.usfirst.frc.team319.robot.commands.autonomous_subsystems;

import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToSwitchPosition;
import org.usfirst.frc.team319.robot.commands.wrist.PreventWristCollision;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToParallel;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class GoToSwitchPose extends CommandGroup {
	
	public GoToSwitchPose() {		
		this(1.0);
	}

	public GoToSwitchPose(double secondsToWait) {
		if (secondsToWait > 0.0) {
			addSequential(new WaitCommand(secondsToWait));
		}
		addSequential(new PreventWristCollision());
		addParallel(new WristGoToParallel());
		addSequential(new ElevatorGoToSwitchPosition());

	}
}
