package org.usfirst.frc.team319.robot.commands.cubecollector;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CubeCollectorStraighten extends CommandGroup {

    public CubeCollectorStraighten() {
        
    	System.out.println("test");
    	addSequential(new CubeCollectorStraightenCube(), 0.25);
    	addSequential(new CubeCollectorCollect(), 0.5);
    }
}
