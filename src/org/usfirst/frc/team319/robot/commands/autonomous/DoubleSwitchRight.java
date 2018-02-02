package org.usfirst.frc.team319.robot.commands.autonomous;

import org.usfirst.frc.team319.robot.commands.FollowTrajectory;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DoubleSwitchRight extends CommandGroup {

    public DoubleSwitchRight() {
    	
        addSequential(new FollowTrajectory("CenterToRightSwitch"));
    }
}
