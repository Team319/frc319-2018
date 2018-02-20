package org.usfirst.frc.team319.robot.commands.autonomous;

import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.PrintCommand;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.paths.CenterToRightSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DoubleSwitchRight extends CommandGroup {

    public DoubleSwitchRight() {
    	
    	addSequential(new PrintCommand("Right"));
        addSequential(new FollowTrajectory(new CenterToRightSwitch()));
        addSequential(new CubeCollectorSpit(), 1.0);
       /* addSequential(new FollowTrajectory("CenterToRightSwitchPt2"));
        addSequential(new FollowTrajectory("CenterToRightSwtichPt3"));
        addSequential(new FollowTrajectory("CenterToRightSwitchPt4"));
        addSequential(new FollowTrajectory("CenterToRightSwitchPt5")); */
    }
}
