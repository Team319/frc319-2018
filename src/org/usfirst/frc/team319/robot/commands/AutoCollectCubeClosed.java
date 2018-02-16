package org.usfirst.frc.team319.robot.commands;

import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorCollect;
import org.usfirst.frc.team319.robot.commands.cubecollector.HoldCube;
import org.usfirst.frc.team319.robot.commands.pneumantics.CloseCollector;
import org.usfirst.frc.team319.robot.commands.pneumantics.OpenCollector;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoHome;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToCollectCube;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoCollectCubeClosed extends CommandGroup {

    public AutoCollectCubeClosed() {

    	addSequential(new WristGoToCollectCube());
    	addSequential(new CloseCollector());
    	addSequential(new CubeCollectorCollect());
       	addSequential(new WristGoHome());
       	addSequential(new HoldCube());
    	
    }
}
