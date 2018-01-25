package org.usfirst.frc.team319.robot.commands.autonomous;

import org.usfirst.frc.team319.robot.commands.FollowTrajectory;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LeftAutoTest extends CommandGroup {
	
	

    public LeftAutoTest() {
    	
    	String gameData;
    	gameData = DriverStation.getInstance().getGameSpecificMessage();
    	
				if(gameData.charAt(0) == 'L') {
					System.out.println("L");
					addParallel(new FollowTrajectory("OneFoot"));
				}else {
					System.out.println("R");
					addParallel(new FollowTrajectory("CrossTheLine"));
				}   	
    }
}