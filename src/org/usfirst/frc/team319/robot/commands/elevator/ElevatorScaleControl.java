package org.usfirst.frc.team319.robot.commands.elevator;

import org.usfirst.frc.team319.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ElevatorScaleControl extends Command {


	private double upRange = 0;
	private double downRange = 0;

	private double targetPosition = 0;
	private int scaleTopPosition = 0;
	private int scaleMiddlePosition = 0;
	private int scaleBottomPosition = 0;
	
    public ElevatorScaleControl() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.elevator);
        scaleTopPosition = Robot.elevator.getScaleTopPosition();
		scaleMiddlePosition = Robot.elevator.getScaleMiddlePosition();
		scaleBottomPosition = Robot.elevator.getScaleBottomPosition();
		upRange = scaleTopPosition - scaleMiddlePosition;
		downRange = scaleMiddlePosition - scaleBottomPosition;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	double triggerTwist = Robot.oi.operatorController.triggers.getTwist();
		
		if (triggerTwist > 0) {
			//adjust up
			targetPosition = triggerTwist * upRange + scaleMiddlePosition;
		} else if (triggerTwist < 0) {
			//adjust down
			targetPosition = triggerTwist * downRange + scaleMiddlePosition;
		} else {
			//stay in the middle
			targetPosition = scaleMiddlePosition;
		}
		Robot.elevator.setTargetPosition((int) targetPosition);
		Robot.elevator.motionMagicControl();
		
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
