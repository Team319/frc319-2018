package org.usfirst.frc.team319.robot.commands.autonomous;

import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.PrintCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DoubleSwitchLeft extends CommandGroup {

    public DoubleSwitchLeft() {
        
    	addSequential(new PrintCommand("Left"));
        addSequential(new FollowTrajectory("CenterToLeftSwitch"));
        addSequential(new FollowTrajectory("CenterToLeftSwitchPt2"));
        addSequential(new FollowTrajectory("CenterToLeftSwitchPt3"));
        addSequential(new FollowTrajectory("CenterToLeftSwitchPt4"));
        addSequential(new FollowTrajectory("CenterToLeftSwitchPt5"));
    }
}
