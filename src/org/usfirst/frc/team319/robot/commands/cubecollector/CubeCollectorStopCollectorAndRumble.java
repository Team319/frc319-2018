package org.usfirst.frc.team319.robot.commands.cubecollector;

import org.usfirst.frc.team319.robot.commands.StopDriverControllerRumble;
import org.usfirst.frc.team319.robot.commands.StopOperatorControllerRumble;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CubeCollectorStopCollectorAndRumble extends CommandGroup {

	public CubeCollectorStopCollectorAndRumble() {

		addParallel(new StopDriverControllerRumble());
		addParallel(new StopOperatorControllerRumble());
		addSequential(new CubeCollectorStop());
		
	}
}
