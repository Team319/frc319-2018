package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.robot.Robot;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorStop;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorVelocityPIDTest;

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
	//Ultrasonic collectorSensorRight = new Ultrasonic(2, 3);
	//Ultrasonic collectorSensorLeft = new Ultrasonic(3, 4);
	
	
	public CubeCollector() {
		

		this.collectorLeftMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, COLLECTOR_PROFILE);
		this.collectorRightMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, COLLECTOR_PROFILE);
		
		
		this.collectorLeftMotor.setSensorPhase(false);
		this.collectorRightMotor.setSensorPhase(true);
		
		this.collectorLeftMotor.setInverted(false);
		this.collectorRightMotor.setInverted(true);
		
		collectorDistanceSensor.setAutomaticMode(true);
		//collectorSensorLeft.setAutomaticMode(true);
		//collectorSensorRight.setAutomaticMode(true);
		
		
		this.collectorLeftMotor.setNeutralMode(NeutralMode.Coast);
		this.collectorLeftMotor.setNeutralMode(NeutralMode.Coast);
		
		this.collectorLeftMotor.configPIDF(COLLECTOR_PROFILE, 0.105, 0.0, 0.0, 0.345); // p: 0.008, f: 0.374
		this.collectorRightMotor.configPIDF(COLLECTOR_PROFILE, 0.005, 0.0, 0.0, 0.303);
	
	}


    public void initDefaultCommand() {
    	//setDefaultCommand(new CubeCollectorVelocityPIDTest());
    	setDefaultCommand(new CubeCollectorStop());
    }
    
    // set leftmotor speed to negative to combat issues with it running full 
    // speed and not PIDing to the set speed
    public void setCubeCollector(ControlMode controlMode, double speed) {
    	collectorLeftMotor.set(controlMode, -speed);
    	collectorRightMotor.set(controlMode, speed);
    }
    
    public void setCubeCollectorIndependently(ControlMode controlMode, double left, double right) {
    	collectorLeftMotor.set(controlMode, left);
    	collectorRightMotor.set(controlMode, right);
    }
   
    public double centerUltrasonic() {
    	return this.collectorDistanceSensor.getRangeInches();
    }
    
    public double leftCollectorVelocity() {
    	this.collectorLeftMotor.configVelocityMeasurementPeriod(VelocityMeasPeriod.Period_100Ms, 0);
    	return this.collectorLeftMotor.getSelectedSensorVelocity(COLLECTOR_PROFILE);
    }
    
    public double rightCollectorVelocity() {
    	return this.collectorRightMotor.getSelectedSensorVelocity(COLLECTOR_PROFILE);    
    }
    
    public double rightCollectorPosition() {
    	return this.collectorRightMotor.getSelectedSensorVelocity(COLLECTOR_PROFILE);
    }
    
    public void cubeCollectorMotionMagicTest(ControlMode controlMode, double degrees) {
    	double revs = degrees/360.0;
    	this.collectorRightMotor.set(controlMode, revs);
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
    	
    	BobTalonSRX _talon = this.collectorLeftMotor;
    	double leftYstick = Robot.oi.driverController.getRawAxis(1);
    	double motorOutput = _talon.getMotorOutputPercent();
    	// _talon.configPeakOutputForward(COLLECTOR_PROFILE, 1);
        // _talon.configPeakOutputReverse(COLLECTOR_PROFILE, 1);
        // _talon.configNominalOutputForward(0.0);
        // _talon.configNominalOutputReverse(0.0);
	/* prepare line to print */
	_sb.append("\tout:");
	_sb.append(motorOutput);
	_sb.append("\tspd:");
	_sb.append(_talon.getSelectedSensorVelocity(this.COLLECTOR_PROFILE));
	//_sb.append("LowLevelspeed:");
	//_sb.append(_talon.getSensorCollection());

	if (Robot.oi.driverController.getRawButton(1)) {
		/* Speed mode */
		/* Convert 500 RPM to units / 100ms.
		 * 4096 Units/Rev * 500 RPM / 600 100ms/min in either direction:
		 * velocity setpoint is in units/100ms
		 */
		double targetVelocity_UnitsPer100ms = 210.0 * 4096 / 600;
		/* 500 RPM in either direction */
		_talon.set(ControlMode.Velocity, targetVelocity_UnitsPer100ms);

		/* append more signals to print when in speed mode. */
		_sb.append("\terr:");
		_sb.append(_talon.getClosedLoopError(this.COLLECTOR_PROFILE));
		_sb.append("\ttrg:");
		_sb.append(targetVelocity_UnitsPer100ms);
	} else {
		/* Percent voltage mode */
		_talon.set(ControlMode.PercentOutput, leftYstick);
		System.out.println("y-axis" +Robot.oi.driverController.getLeftStickY());
	}

	if (++_loops >= 10) {
		_loops = 0;
		System.out.println(_sb.toString());
	}
	_sb.setLength(0);
}
    
}

