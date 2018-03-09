package org.usfirst.frc.team319.robot.commands;

import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToClimbPosition;
import org.usfirst.frc.team319.robot.commands.pneumatics.ElevatorShiftDown;
import org.usfirst.frc.team319.robot.commands.pneumatics.ElevatorShiftUp;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoHome;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class GoToClimbPose extends CommandGroup {

    public GoToClimbPose() {
        
    	addSequential(new ElevatorShiftDown());
    	addParallel(new WristGoHome());
    	addSequential(new ElevatorGoToClimbPosition());
    	
    }
}
