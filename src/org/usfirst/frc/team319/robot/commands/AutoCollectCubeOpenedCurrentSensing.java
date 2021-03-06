package org.usfirst.frc.team319.robot.commands;

import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorCollect;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorCollectCurrentSensing;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorWaitForCubeInRange;
import org.usfirst.frc.team319.robot.commands.cubecollector.HoldCube;
import org.usfirst.frc.team319.robot.commands.pneumatics.CloseCollector;
import org.usfirst.frc.team319.robot.commands.pneumatics.OpenCollector;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToCollectCube;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutoCollectCubeOpenedCurrentSensing extends CommandGroup {

	public AutoCollectCubeOpenedCurrentSensing(boolean liftWristAfterCubeCollected) {

		addParallel(new StartDriverControllerRumble(1.0));
		addParallel(new StartOperatorControllerRumble(1.0));
		addParallel(new WristGoToCollectCube());
		addParallel(new OpenCollector());
		//addSequential(new CubeCollectorWaitForCubeInRange());
		addSequential(new CubeCollectorCollectCurrentSensing());
		addSequential(new CloseCollector());
		addParallel(new StopDriverControllerRumble());
		addParallel(new StopOperatorControllerRumble());
		//addSequential(new CloseCollector());
		addSequential(new WaitCommand(0.2));
		addSequential(new HoldCube());
		
		if (liftWristAfterCubeCollected) {
			addSequential(new WristGoToSwitch());
		}

	}
}