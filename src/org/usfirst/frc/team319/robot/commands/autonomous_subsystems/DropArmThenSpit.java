package org.usfirst.frc.team319.robot.commands.autonomous_subsystems;

import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.pneumatics.OpenCollector;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToCollectCube;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DropArmThenSpit extends CommandGroup {

    public DropArmThenSpit() {
    	
    	addSequential(new WristGoToSwitch());
       	addSequential(new CubeCollectorSpit(-1.0), 0.5);
    	addSequential(new OpenCollector());
    	addSequential(new WristGoToCollectCube());
    	
    }
}
