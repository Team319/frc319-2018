package org.usfirst.frc.team319.robot.commands;

import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorStop;
import org.usfirst.frc.team319.robot.commands.drivetrain.StopDrivetrain;
import org.usfirst.frc.team319.robot.commands.elevator.StopElevatorInPlace;
import org.usfirst.frc.team319.robot.commands.wrist.StopWristInPlace;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class StopEverything extends CommandGroup {

    public StopEverything() {
     
    addSequential(new CubeCollectorStop());
    addSequential(new StopElevatorInPlace());
    addSequential(new StopWristInPlace());
    addSequential(new StopDriverControllerRumble());
    addSequential(new StopOperatorControllerRumble());
    addSequential(new StopDrivetrain());
    	
    }
}
