package org.usfirst.frc.team319.robot.commands.autonomous;

import org.usfirst.frc.team319.robot.commands.FollowTrajectory;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DoubleSwitchLeft extends CommandGroup {

    public DoubleSwitchLeft() {
        
        addSequential(new FollowTrajectory("CenterToLeftSwitch"));
    }
}
