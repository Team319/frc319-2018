package org.usfirst.frc.team319.robot.commands.elevator;

import org.usfirst.frc.team319.robot.commands.pneumatics.ElevatorShiftDown;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class GoToCollectPose extends CommandGroup {

    public GoToCollectPose() {
        
    	addSequential(new ElevatorShiftDown());
    	addSequential(new ElevatorGoToCollectPosition());
    }
}
