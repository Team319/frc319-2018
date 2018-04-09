package org.usfirst.frc.team319.robot.commands.pneumatics;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class DeployForkliftThenRetract extends CommandGroup {

    public DeployForkliftThenRetract() {

    	addSequential(new ForkliftDeploy());
    	addSequential(new WaitCommand(3.0));
    	addSequential(new ForkliftRetract());
    }
}
