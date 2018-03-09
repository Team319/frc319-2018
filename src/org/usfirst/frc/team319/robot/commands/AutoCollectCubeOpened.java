package org.usfirst.frc.team319.robot.commands;

import org.usfirst.frc.team319.robot.Robot;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorCollect;
import org.usfirst.frc.team319.robot.commands.cubecollector.HoldCube;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToCollectPosition;
import org.usfirst.frc.team319.robot.commands.pneumatics.CloseCollector;
import org.usfirst.frc.team319.robot.commands.pneumatics.OpenCollector;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToParallel;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToCollectCube;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToExchange;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutoCollectCubeOpened extends CommandGroup {

	public AutoCollectCubeOpened() {

		addParallel(new StartDriverControllerRumble(1.0));
		addParallel(new StartOperatorControllerRumble(1.0));
		addParallel(new WristGoToCollectCube());
		addParallel(new OpenCollector());
		addSequential(new CubeCollectorCollect());
		addParallel(new StopDriverControllerRumble());
		addParallel(new StopOperatorControllerRumble());
		addSequential(new CloseCollector());
		addSequential(new WaitCommand(0.3));
		addSequential(new HoldCube());
		addSequential(new WristGoToSwitch());

	}
}