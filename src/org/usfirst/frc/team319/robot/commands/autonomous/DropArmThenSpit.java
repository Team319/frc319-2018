package org.usfirst.frc.team319.robot.commands.autonomous;

import org.usfirst.frc.team319.models.GameState;
import org.usfirst.frc.team319.models.GameState.Side;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.pneumantics.OpenCollector;
import org.usfirst.frc.team319.robot.commands.pneumantics.CloseCollector;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToCollectCube;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DropArmThenSpit extends CommandGroup {

    public DropArmThenSpit() {
    	
    	addSequential(new WristGoToSwitch());
       	addSequential(new CubeCollectorSpit(), 1);
    	addSequential(new OpenCollector());
    	addSequential(new WristGoToCollectCube());
    	
    }
}
