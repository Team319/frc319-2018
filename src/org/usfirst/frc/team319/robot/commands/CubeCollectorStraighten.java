package org.usfirst.frc.team319.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CubeCollectorStraighten extends CommandGroup {

    public CubeCollectorStraighten() {
        
    	addSequential(new CubeCollectorStraightenCube(), 0.2);
    	addSequential(new CubeCollectorTest(), 0.5);
    }
}
