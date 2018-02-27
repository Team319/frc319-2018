package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import org.usfirst.frc.team319.robot.commands.FollowTrajectory;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CenterToSwitchAuto extends Command {

    public CenterToSwitchAuto() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	String gameData;
		gameData = DriverStation.getInstance().getGameSpecificMessage();
				if(gameData.charAt(0) == 'L') {
					System.out.println("L");
					new FollowTrajectory("ThreeFeet");
				}else {
					System.out.println("R");
					new FollowTrajectory("OneFoot");
				}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
