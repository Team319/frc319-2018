package org.usfirst.frc.team319.robot.commands.autonomous_subsystems;

import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToAutoSwitchPosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToSwitchPosition;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToAutoSwitchPosition;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToParallel;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class GoToSwitchPoseNoWait extends CommandGroup {

	public GoToSwitchPoseNoWait() {
		
		addParallel(new WristGoToAutoSwitchPosition());
		addSequential(new ElevatorGoToAutoSwitchPosition());
		addSequential(new WristGoToParallel());
		

	}
}
