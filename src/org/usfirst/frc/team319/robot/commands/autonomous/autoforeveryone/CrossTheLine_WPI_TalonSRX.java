package org.usfirst.frc.team319.robot.commands.autonomous.autoforeveryone;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * A command to drive in a straight line using WPI_TalonSRXs in PercentOutput Mode.
 * Use @reverseDirection to change the direction of the robot.
 * Use @percentOutput to change how fast the robot moves.
 * Use @secondsToDrive to change how long the robot drives for.
 */
public class CrossTheLine_WPI_TalonSRX extends Command {
	private WPI_TalonSRX _leftMotor;
	private WPI_TalonSRX _rightMotor;
	private double _setpoint;
	private double _timeoutSeconds;
	private boolean _reverseDirection;

	
	// Pass in the subsystem that contains your drive motors.
    public CrossTheLine_WPI_TalonSRX(Subsystem requiredSubsystem, WPI_TalonSRX leftMotor, WPI_TalonSRX rightMotor, double percentOutput, double secondsToDrive, boolean reverseDirection) {
        _leftMotor = leftMotor;
        _rightMotor = rightMotor;
        _setpoint = percentOutput;
        _timeoutSeconds = secondsToDrive;
        requires(requiredSubsystem);
    }
    
    public CrossTheLine_WPI_TalonSRX(Subsystem requiredSubsystem, int leftTalonCanId, int rightTalonCanId, double percentOutput, double secondsToDrive, boolean reverseDirection) {
        _leftMotor = new WPI_TalonSRX(leftTalonCanId);
        _rightMotor = new WPI_TalonSRX(rightTalonCanId);
        _setpoint = percentOutput;
        _timeoutSeconds = secondsToDrive;
        requires(requiredSubsystem);
    }

    protected void initialize() {
    	// Make sure there isn't any nominal output sillyness.
    	_rightMotor.configNominalOutputForward(0, 0);
    	_leftMotor.configNominalOutputForward(0, 0);
    	_rightMotor.configNominalOutputReverse(0, 0);
    	_leftMotor.configNominalOutputReverse(0, 0);
    	
    	//set the command to time out after the defined number of seconds.
    	setTimeout(_timeoutSeconds);
    	
    	//if we're reversing the direction, flip the sign of the setpoint.
    	if (_reverseDirection)
    	{
    		_setpoint *= -1;
    	}
		_leftMotor.set(ControlMode.PercentOutput, _setpoint);
    	_rightMotor.set(ControlMode.PercentOutput, -_setpoint);
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
    	_leftMotor.set(ControlMode.PercentOutput, 0);
    	_rightMotor.set(ControlMode.PercentOutput, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
