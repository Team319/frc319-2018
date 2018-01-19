package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.robot.Robot;
import org.usfirst.frc.team319.robot.commands.CubeCollectorStop;

import com.ctre.phoenix.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.can.*;

import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CubeCollector extends Subsystem {
	
	public final static int COLLECTOR_PROFILE = 0;
	public final BobTalonSRX collectorLeftMotor = new BobTalonSRX(0);
	public final BobTalonSRX collectorRightMotor = new BobTalonSRX(10);
	Ultrasonic collectorDistanceSensor = new Ultrasonic(0,1);
	StringBuilder _sb = new StringBuilder();
	
	int _loops = 0;
	//Extra sensors on the sides.
	//Ultrasonic collectorSensorRight = new Ultrasonic(2, 3);
	//Ultrasonic collectorSensorLeft = new Ultrasonic(3, 4);
	
	
	public CubeCollector() {
		
		this.collectorLeftMotor.setInverted(false);
		this.collectorRightMotor.setInverted(true);
		collectorDistanceSensor.setAutomaticMode(true);
		//collectorSensorLeft.setAutomaticMode(true);
		//collectorSensorRight.setAutomaticMode(true);
		
		this.collectorLeftMotor.setNeutralMode(NeutralMode.Coast);
		this.collectorLeftMotor.setNeutralMode(NeutralMode.Coast);

	}


    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new CubeCollectorStop());
    }
    
    //test method for prototyping cube collector
    public void setCubeCollector(ControlMode controlMode, double speed) {
    	collectorLeftMotor.set(controlMode, speed);
    	collectorRightMotor.set(controlMode, speed);
    }
    
    public void makeCubeStraightCube(ControlMode controlMode, double left, double right) {
    	collectorLeftMotor.set(controlMode, left);
    	collectorRightMotor.set(controlMode, right);
    }
   
    public double centerUltrasonic() {
    	return this.collectorDistanceSensor.getRangeInches();
    }
    
   /*public double leftUltrasonic() {
    	return this.collectorSensorLeft.getRangeInches();
    }
    
    public double rightUltrasonic() {
    	return this.collectorSensorRight.getRangeInches();
    }*/
    
    public boolean isCubeCollected() {
    	if(centerUltrasonic() < 8.0) {
    		return true;
    	}
    	else 
    	{
    		return false; 	
    	}
    }
    
    public void velocityPIDTest() {
    	
    	double leftYstick = Robot.oi.driverController.getRawAxis(1);
    	double motorOutput = this.collectorLeftMotor.getMotorOutputPercent();
    	
	/* prepare line to print */
	_sb.append("\tout:");
	_sb.append(motorOutput);
	_sb.append("\tspd:");
	_sb.append(collectorLeftMotor.getSelectedSensorVelocity(this.COLLECTOR_PROFILE));

	if (Robot.oi.driverController.getRawButton(1)) {
		/* Speed mode */
		/* Convert 500 RPM to units / 100ms.
		 * 4096 Units/Rev * 500 RPM / 600 100ms/min in either direction:
		 * velocity setpoint is in units/100ms
		 */
		double targetVelocity_UnitsPer100ms = leftYstick * 500.0 * 4096 / 600;
		/* 500 RPM in either direction */
		collectorLeftMotor.set(ControlMode.Velocity, targetVelocity_UnitsPer100ms);

		/* append more signals to print when in speed mode. */
		_sb.append("\terr:");
		_sb.append(collectorLeftMotor.getClosedLoopError(this.COLLECTOR_PROFILE));
		_sb.append("\ttrg:");
		_sb.append(targetVelocity_UnitsPer100ms);
	} else {
		/* Percent voltage mode */
		collectorLeftMotor.set(ControlMode.PercentOutput, leftYstick);
	}

	if (++_loops >= 10) {
		_loops = 0;
		System.out.println(_sb.toString());
	}
	_sb.setLength(0);
}
    
}

