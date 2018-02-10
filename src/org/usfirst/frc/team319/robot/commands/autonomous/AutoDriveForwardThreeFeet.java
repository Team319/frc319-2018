package org.usfirst.frc.team319.robot.commands.autonomous;

import org.usfirst.frc.team319.paths.CrossTheLine;
import org.usfirst.frc.team319.paths.FiveFeetAndTurn;
import org.usfirst.frc.team319.paths.ThreeFeet;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoDriveForwardThreeFeet extends CommandGroup {

    public AutoDriveForwardThreeFeet() {
    	
    	//addSequential(new FollowTrajectory("ThreeFeet"));
    	addSequential(new FollowTrajectory(new ThreeFeet()));
        //addSequential(new FollowTrajectory(new FiveFeetAndTurn()));
    	// Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
