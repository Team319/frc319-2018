package org.usfirst.frc.team319.robot.commands.autonomous_paths;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.usfirst.frc.team319.models.SrxTrajectory;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.utils.SrxTrajectoryImporter;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CenterToRightSwitch extends CommandGroup {
	SrxTrajectoryImporter importer = new SrxTrajectoryImporter("/home/lvuser/Autos");
	SrxTrajectory toFollow = null;

	public CenterToRightSwitch() {
		try {
			this.toFollow = importer.importSrxTrajectory("CenterToRightSwitch");
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		addSequential(new FollowTrajectory(toFollow));
		// Add Commands here:
		// e.g. addSequential(new Command1());
		// addSequential(new Command2());
		// these will run in order.

		// To run multiple commands at the same time,
		// use addParallel()
		// e.g. addParallel(new Command1());
		// addSequential(new Command2());
		// Command1 and Command2 will run in parallel.

		// A command group will require all of the subsystems that each member
		// would require.
		// e.g. if Command1 requires chassis, and Command2 requires arm,
		// a CommandGroup containing them would require both the chassis and the
		// arm.
	}
}
