package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.robot.Robot;
import org.usfirst.frc.team319.robot.commands.CubeCollectorStop;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CubeCollector extends Subsystem {
	
	public final BobTalonSRX collectorLeftMotor = new BobTalonSRX(0);
	public final BobTalonSRX collectorRightMotor = new BobTalonSRX(10);
	Ultrasonic collectorDistanceSensor = new Ultrasonic(0,1);
	
	public CubeCollector() {
		
		this.collectorLeftMotor.setInverted(false);
		this.collectorRightMotor.setInverted(true);
		collectorDistanceSensor.setAutomaticMode(true);
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
   
    public double ultrasonicSensorValue() {
    	return this.collectorDistanceSensor.getRangeInches();
    }
    
    public boolean isCubeCollected() {
    	if(ultrasonicSensorValue() < 7.0) {
    		return true;
    	}else 
    	{
    		return false; 	
    	}
    }
    
}

