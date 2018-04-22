package org.usfirst.frc.team319.robot.commands.elevator;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class ElevatorGoToSwitchPositionTimeout extends CommandGroup {

    public ElevatorGoToSwitchPositionTimeout(double secondsToWait) {
        
    	if (secondsToWait > 0) {
			addSequential(new WaitCommand(secondsToWait));
		}
    	
        addSequential(new ElevatorGoToSwitchPosition());
    }
}
