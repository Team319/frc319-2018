package org.usfirst.frc.team319.robot.commands;

import edu.wpi.first.wpilibj.Notifier;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;
import org.usfirst.frc.team319.robot.Robot;
import org.usfirst.frc.team319.utils.SrxTrajectoryImporter;

import com.ctre.phoenix.motion.MotionProfileStatus;
import com.ctre.phoenix.motion.SetValueMotionProfile;
import com.ctre.phoenix.motion.TrajectoryPoint;
import com.ctre.phoenix.motion.TrajectoryPoint.TrajectoryDuration;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class FollowTrajectory_OldWay extends Command {

	private String trajectoryToFollow;
	private int kMinPointsInTalon = 5;
	
	private boolean isFinished = false;

	private SrxTrajectory traj;
	private SrxTrajectoryImporter importer = new SrxTrajectoryImporter("/home/lvuser/Autos");

	private MotionProfileStatus rightStatus = new MotionProfileStatus();
	private MotionProfileStatus leftStatus = new MotionProfileStatus();

	/**
	 * this is only either Disable, Enable, or Hold. Since we'd never want one
	 * side to be enabled while the other is disabled, we'll use the same status
	 * for both sides.
	 */
	private SetValueMotionProfile setValue = SetValueMotionProfile.Disable;

	// periodically tells the SRXs to do the thing
	private class PeriodicRunnable implements java.lang.Runnable {
		public void run() {
			Robot.drivetrain.leftLead.processMotionProfileBuffer();
			Robot.drivetrain.rightLead.processMotionProfileBuffer();
		}
	}

	// Runs the runnable
	private Notifier SrxNotifier = new Notifier(new PeriodicRunnable());

	// constructor
	public FollowTrajectory_OldWay(String trajectoryName) {
		requires(Robot.drivetrain);
		this.trajectoryToFollow = trajectoryName;
	}

	// Called just before this Command runs the first time
	protected void initialize() {

		setUpTalon(Robot.drivetrain.leftLead);
		setUpTalon(Robot.drivetrain.rightLead);

		setValue = SetValueMotionProfile.Disable;
		
		Robot.drivetrain.leftLead.set(ControlMode.MotionProfile, setValue.value);
		Robot.drivetrain.rightLead.set(ControlMode.MotionProfile, setValue.value);

		SrxNotifier.startPeriodic(.005);
		
	//	this.traj = importer.importSrxTrajectory(trajectoryToFollow);

		
		try {
			this.traj = importer.importSrxTrajectory(trajectoryToFollow);
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int pidfSlot = Robot.drivetrain.LOW_GEAR_PROFILE;
		
		System.out.println("OMG WTF BBQ");
		fillTalonBuffer(Robot.drivetrain.rightLead, this.traj.rightProfile, pidfSlot);
		fillTalonBuffer(Robot.drivetrain.leftLead, this.traj.leftProfile, pidfSlot);

	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {

		Robot.drivetrain.rightLead.getMotionProfileStatus(rightStatus);
		Robot.drivetrain.leftLead.getMotionProfileStatus(leftStatus);
		//System.out.println("Bottom buffer count: " + rightStatus.btmBufferCnt);
		//System.out.println("Top buffer count: " + rightStatus.topBufferCnt);
		

		if (rightStatus.isUnderrun || leftStatus.isUnderrun)
		{
			// if either MP has underrun, stop both
			System.out.println("Motion profile has underrun!");
			setValue = SetValueMotionProfile.Disable;
		}
		else if (rightStatus.btmBufferCnt > kMinPointsInTalon && leftStatus.btmBufferCnt > kMinPointsInTalon)
		{
			// if we have enough points in the talon, go.
			setValue = SetValueMotionProfile.Enable;
		}	
		else if (rightStatus.activePointValid && rightStatus.isLast && leftStatus.activePointValid
				&& leftStatus.isLast)
		{
			// if both profiles are at their last points, hold the last point
			setValue = SetValueMotionProfile.Hold;
		}
		
		Robot.drivetrain.leftLead.set(ControlMode.MotionProfile, setValue.value);
		Robot.drivetrain.rightLead.set(ControlMode.MotionProfile, setValue.value);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		boolean leftComplete = leftStatus.activePointValid && leftStatus.isLast;
		boolean rightComplete = rightStatus.activePointValid && rightStatus.isLast;
		boolean trajectoryComplete = leftComplete && rightComplete;
		return trajectoryComplete || isFinished;
	}

	// Called once after isFinished returns true
	protected void end() {
		SrxNotifier.stop();
		resetTalon(Robot.drivetrain.rightLead, ControlMode.PercentOutput, 0);
		resetTalon(Robot.drivetrain.leftLead, ControlMode.PercentOutput, 0);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		SrxNotifier.stop();
		resetTalon(Robot.drivetrain.rightLead, ControlMode.PercentOutput, 0);
		resetTalon(Robot.drivetrain.leftLead, ControlMode.PercentOutput, 0);
	}	

	// set up the talon for motion profile control
	public void setUpTalon(TalonSRX talon) {
		talon.clearMotionProfileTrajectories();
		talon.changeMotionControlFramePeriod(5);
	}

	// set the to the desired controlMode
	// used at the end of the motion profile
	public void resetTalon(TalonSRX talon, ControlMode controlMode, double setValue) {
		//System.out.println("Clearing MP Trajectories");
		talon.clearMotionProfileTrajectories();
		talon.set(ControlMode.MotionProfile, SetValueMotionProfile.Disable.value);
		talon.set(controlMode, setValue);
	}

	// Send all the profile points to the talon object
	public void fillTalonBuffer(TalonSRX talon, SrxMotionProfile prof, int pidfSlot) {
		System.out.println("filling talon buffer");
		TrajectoryPoint point = new TrajectoryPoint();

		for (int i = 0; i < prof.numPoints; ++i) {
			/* for each point, fill our structure and pass it to API */
			point.position = prof.points[i][0];
			point.velocity = prof.points[i][1];
			point.timeDur = TrajectoryDuration.Trajectory_Duration_10ms;
			point.profileSlotSelect0 = pidfSlot;
			point.zeroPos = false;
			if (i == 0)
				point.zeroPos = true; /* set this to true on the first point */

			point.isLastPoint = false;
			if ((i + 1) == prof.numPoints)
				point.isLastPoint = true; /*
											 * set this to true on the last point
											 */

			talon.pushMotionProfileTrajectory(point);
		}
	}
}
