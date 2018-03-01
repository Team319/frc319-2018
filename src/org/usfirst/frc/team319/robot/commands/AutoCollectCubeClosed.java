package org.usfirst.frc.team319.robot.commands;

import org.usfirst.frc.team319.robot.Robot;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorCollect;
import org.usfirst.frc.team319.robot.commands.cubecollector.HoldCube;
import org.usfirst.frc.team319.robot.commands.pneumatics.CloseCollector;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToCollectCube;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToExchange;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutoCollectCubeClosed extends CommandGroup {

	public AutoCollectCubeClosed() {

		addParallel(new StartControllerRumble(Robot.oi.driverController, 1.0));
		addParallel(new StartControllerRumble(Robot.oi.operatorController, 1.0));
		addParallel(new WristGoToCollectCube());
		addParallel(new CloseCollector());
		addSequential(new CubeCollectorCollect());
		addParallel(new StopControllerRumble(Robot.oi.driverController));
		addParallel(new StopControllerRumble(Robot.oi.operatorController));
		addSequential(new WaitCommand(0.25));
		addSequential(new HoldCube());
		addSequential(new WristGoToExchange());

	}
}
