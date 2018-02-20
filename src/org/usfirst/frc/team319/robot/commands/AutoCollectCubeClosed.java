package org.usfirst.frc.team319.robot.commands;

import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorCollect;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorStop;
import org.usfirst.frc.team319.robot.commands.cubecollector.HoldCube;
import org.usfirst.frc.team319.robot.commands.pneumatics.CloseCollector;
import org.usfirst.frc.team319.robot.commands.pneumatics.OpenCollector;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoHome;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToCollectCube;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToExchange;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoCollectCubeClosed extends CommandGroup {

    public AutoCollectCubeClosed() {

    	addSequential(new WristGoToCollectCube());
    	addSequential(new CloseCollector());
    	addSequential(new CubeCollectorCollect());
    	addSequential(new HoldCube());
       	addSequential(new WristGoToExchange());
     
    	
    }
}
