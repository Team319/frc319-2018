package org.usfirst.frc.team319.robot.subsystems;

import java.util.concurrent.TimeUnit;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.models.Instrum;
import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.robot.Robot;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorStop;
import org.usfirst.frc.team319.robot.commands.cubecollector.SetCubeCollectorLeftMotor;

import com.ctre.phoenix.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.can.*;

import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class CubeCollector extends Subsystem {
	
	public final static int COLLECTOR_PROFILE = 0;
	public final VictorSPX collectorLeftMotor = new VictorSPX(3); // 11
	public final VictorSPX collectorRightMotor = new VictorSPX(4);
	AnalogInput collectorDistanceSensor = new AnalogInput(0);
	StringBuilder _sb = new StringBuilder();
	int loops = 0;
	private static int _loops = 0;

	private static int _timesInMotionMagic = 0;
	private static final double cubeDistanceThreshhold = 1.5;

	
	

	
	public CubeCollector() {
		

		this.collectorLeftMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, COLLECTOR_PROFILE, 10);
		this.collectorRightMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, COLLECTOR_PROFILE, 10);
		
		
		this.collectorLeftMotor.setSensorPhase(true);
		this.collectorRightMotor.setSensorPhase(true);
		
		this.collectorLeftMotor.setInverted(false);
		this.collectorRightMotor.setInverted(true);
		
		////////////////////////////motion magic//////////////////////////////////
		/*
		this.collectorLeftMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_13_Base_PIDF0, 10);
		this.collectorLeftMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10);
		
		this.collectorLeftMotor.configPeakOutputForward(1);
		this.collectorLeftMotor.configPeakOutputReverse(-1);
		
		this.collectorLeftMotor.setSelectedSensorPosition(0, COLLECTOR_PROFILE);
				
		this.collectorLeftMotor.configMotionAcceleration(500);
		this.collectorLeftMotor.configMotionCruiseVelocity(2000);
		
		this.collectorRightMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_13_Base_PIDF0, 10);
		this.collectorRightMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10);
		
		this.collectorRightMotor.configPeakOutputForward(1);
		this.collectorRightMotor.configPeakOutputReverse(-1);
		
		this.collectorRightMotor.setSelectedSensorPosition(0, COLLECTOR_PROFILE);
				
		this.collectorRightMotor.configMotionAcceleration(500);
		this.collectorRightMotor.configMotionCruiseVelocity(2000);
		*/
		//////////////////////////////////////////////////////////////////////////
		
		//this.collectorSensorLeft.setAutomaticMode(true);
		//this.collectorSensorRight.setAutomaticMode(true);
		
		this.collectorLeftMotor.setNeutralMode(NeutralMode.Coast);
		this.collectorRightMotor.setNeutralMode(NeutralMode.Coast);
		
		//this.collectorLeftMotor.configPIDF(COLLECTOR_PROFILE, 0.105, 0.0, 0.0, 0.345); // p: 0.008, f: 0.374
		//this.collectorRightMotor.configPIDF(COLLECTOR_PROFILE, 0.0734, 0.0, 0.0, 0.299);
	
	}


    public void initDefaultCommand() {
    	//setDefaultCommand(new CubeCollectorVelocityPIDTest());
    	setDefaultCommand(new CubeCollectorStop());
    	//setDefaultCommand(new SetCubeCollectorLeftMotor());
    	//setDefaultCommand(new CubeCollectorMotionMagicTest());
    }
    
    // set leftmotor speed to negative to combat issues with it running full 
    // speed and not PIDing to the set speed
    public void setCubeCollector(ControlMode controlMode, double speed) {
    	collectorLeftMotor.set(controlMode, speed);
    	collectorRightMotor.set(controlMode, speed);
    }
    
    public void setCubeCollectorIndependently(ControlMode controlMode, double left, double right) {
    	collectorLeftMotor.set(controlMode, left);
    	collectorRightMotor.set(controlMode, right);
    }
    
    public void setCubeCollectorLeftMotor(ControlMode controlMode, double speed) {
    	collectorLeftMotor.set(controlMode, speed);
    }

    @Override
    public void periodic() {
		SmartDashboard.putNumber("IR Sensor", this.getCollectorDistanceSensorValue());
    }
    
    public double getCollectorDistanceSensorValue() {
    	return this.collectorDistanceSensor.getVoltage();
	}


	public boolean isCubeCollected() {
    	double irSensorValue = this.getCollectorDistanceSensorValue();
    	if(irSensorValue > cubeDistanceThreshhold) {
    		return true;
    	}else {
    		return false;
    	}
    	
    	
    }
    
}

