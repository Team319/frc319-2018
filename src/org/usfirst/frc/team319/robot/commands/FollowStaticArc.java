package org.usfirst.frc.team319.robot.commands;

import org.usfirst.frc.team319.arcs.CenterToRightScaleReverseArcStatic;
import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.models.Arc;
import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;
import org.usfirst.frc.team319.robot.Robot;
import org.usfirst.frc.team319.robot.subsystems.Drivetrain;

import com.ctre.phoenix.motion.MotionProfileStatus;
import com.ctre.phoenix.motion.SetValueMotionProfile;
import com.ctre.phoenix.motion.TrajectoryPoint;
import com.ctre.phoenix.motion.TrajectoryPoint.TrajectoryDuration;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FollowerType;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Notifier;
import edu.wpi.first.wpilibj.command.Command;

public class FollowStaticArc extends Command {
	
	private BobTalonSRX rightTalon = Robot.drivetrain.rightLead;
	private BobTalonSRX leftTalon = Robot.drivetrain.leftLead;

	private int distancePidSlot = Drivetrain.HIGH_GEAR_PROFILE;
	private int rotationPidSlot = Drivetrain.ROTATION_PROFILE;

	private int kMinPointsInTalon = 5;
	private boolean isFinished = false;
	private MotionProfileStatus status = new MotionProfileStatus();
	private boolean hasPathStarted;

	/**
	 * this is only either Disable, Enable, or Hold. Since we'd never want one side
	 * to be enabled while the other is disabled, we'll use the same status for both
	 * sides.
	 */
	private SetValueMotionProfile setValue = SetValueMotionProfile.Disable;

	private class BufferLoader implements java.lang.Runnable {
		private int lastPointSent = 0;
		private TalonSRX talon;
		private double[][] trajectoryPoints;
		private double startPosition = 0;

		public BufferLoader(TalonSRX talon, double[][] trajectoryPoints, double startPosition) {
			this.talon = talon;
			this.trajectoryPoints = trajectoryPoints;
			this.startPosition = startPosition;
		}
		
		public BufferLoader(TalonSRX talon, double[][] trajectoryPoints) {
			this(talon, trajectoryPoints, 0);
		}
		
		public void reset() {
			this.startPosition = 0;
			this.lastPointSent = 0;
		}
		
		public void setStartPosition(double startPos) {
			this.startPosition = startPos;
		}

		public void run() {
			talon.processMotionProfileBuffer();

			if (lastPointSent >= this.trajectoryPoints.length) {
				return;
			}

			if (!talon.isMotionProfileTopLevelBufferFull() && lastPointSent < this.trajectoryPoints.length) {
				TrajectoryPoint point = new TrajectoryPoint();
				/* for each point, fill our structure and pass it to API */
				point.position = trajectoryPoints[lastPointSent][0] + startPosition;
				point.velocity = trajectoryPoints[lastPointSent][1];
				point.timeDur = TrajectoryDuration.Trajectory_Duration_10ms;
				point.auxiliaryPos = 10 * (trajectoryPoints[lastPointSent][3]);
				point.profileSlotSelect0 = distancePidSlot;
				point.profileSlotSelect1 = rotationPidSlot;
				point.zeroPos = false;
				point.isLastPoint = false;
				if ((lastPointSent + 1) == trajectoryPoints.length) {
					point.isLastPoint = true; /** set this to true on the last point */
				}

				talon.pushMotionProfileTrajectory(point);
				lastPointSent++;
				hasPathStarted = true;
			}
		}
	}

	// Runs the runnable
	private BufferLoader bufferLoader;
	private Notifier notifier;

	public FollowStaticArc(double[][] trajectoryPoints) {
		requires(Robot.drivetrain);		
		bufferLoader = new BufferLoader(rightTalon, trajectoryPoints);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		setUpTalon(leftTalon);
		setUpTalon(rightTalon);

		setValue = SetValueMotionProfile.Disable;

		rightTalon.set(ControlMode.MotionProfileArc, setValue.value);
		leftTalon.follow(rightTalon, FollowerType.AuxOutput1);		
		
		bufferLoader.reset();
		bufferLoader.setStartPosition(Robot.drivetrain.getDistance());
		
		notifier = new Notifier(bufferLoader);
		notifier.startPeriodic(.005);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		rightTalon.getMotionProfileStatus(status);

		if (status.isUnderrun) {
			// if either MP has underrun, stop both
			System.out.println("Motion profile has underrun!");
			setValue = SetValueMotionProfile.Disable;
		} else if (status.btmBufferCnt > kMinPointsInTalon) {
			// if we have enough points in the talon, go.
			setValue = SetValueMotionProfile.Enable;
		} else if (status.activePointValid && status.isLast) {
			// if both profiles are at their last points, hold the last point
			setValue = SetValueMotionProfile.Hold;
		}

		rightTalon.set(ControlMode.MotionProfileArc, setValue.value);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		if (!hasPathStarted) {
			return false;
		}
		boolean leftComplete = status.activePointValid && status.isLast;
		boolean trajectoryComplete = leftComplete;
		return trajectoryComplete || isFinished;
	}

	// Called once after isFinished returns true
	protected void end() {
		notifier.stop();
		resetTalon(rightTalon, ControlMode.PercentOutput, 0);
		resetTalon(leftTalon, ControlMode.PercentOutput, 0);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		notifier.stop();
		resetTalon(rightTalon, ControlMode.PercentOutput, 0);
		resetTalon(leftTalon, ControlMode.PercentOutput, 0);
	}

	// set up the talon for motion profile control
	private void setUpTalon(TalonSRX talon) {
		talon.clearMotionProfileTrajectories();
		talon.changeMotionControlFramePeriod(5);
		talon.clearMotionProfileHasUnderrun(10);
	}

	// set the to the desired controlMode
	// used at the end of the motion profile
	private void resetTalon(TalonSRX talon, ControlMode controlMode, double setValue) {
		talon.clearMotionProfileTrajectories();
		talon.clearMotionProfileHasUnderrun(10);
		talon.changeMotionControlFramePeriod(10);
		talon.set(controlMode, setValue);
	}
}