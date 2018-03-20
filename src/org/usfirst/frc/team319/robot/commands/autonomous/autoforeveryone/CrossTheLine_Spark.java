package org.usfirst.frc.team319.robot.commands.autonomous.autoforeveryone;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * A command to drive in a straight line using Sparks.
 * Use @reverseDirection to change the direction of the robot.
 * Use @percentOutput to change how fast the robot moves.
 * Use @secondsToDrive to change how long the robot drives for.
 */
public class CrossTheLine_Spark extends Command {
	private Spark _leftMotor;
	private Spark _rightMotor;
	private double _setpoint;
	private double _timeoutSeconds;
	private boolean _reverseDirection;

	
	// Pass in the subsystem that contains your drive motors.
    public CrossTheLine_Spark(Subsystem requiredSubsystem, Spark leftMotor, Spark rightMotor, double percentOutput, double secondsToDrive, boolean reverseDirection) {
        _leftMotor = leftMotor;
        _rightMotor = rightMotor;
        _setpoint = percentOutput;
        _timeoutSeconds = secondsToDrive;
        requires(requiredSubsystem);
    }
    
    public CrossTheLine_Spark(Subsystem requiredSubsystem, int leftMotorPort, int rightMotorPort, double percentOutput, double secondsToDrive, boolean reverseDirection) {
        _leftMotor = new Spark(leftMotorPort);
        _rightMotor = new Spark(rightMotorPort);
        _setpoint = percentOutput;
        _timeoutSeconds = secondsToDrive;
        requires(requiredSubsystem);
    }

    protected void initialize() {
    	
    	//set the command to time out after the defined number of seconds.
    	setTimeout(_timeoutSeconds);
    	
    	//if we're reversing the direction, flip the sign of the setpoint.
    	if (_reverseDirection)
    	{
    		_setpoint *= -1;
    	}
		_leftMotor.set(_setpoint);
    	_rightMotor.set(-_setpoint);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	_leftMotor.set(0);
    	_rightMotor.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
