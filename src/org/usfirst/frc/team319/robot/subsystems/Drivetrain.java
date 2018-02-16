package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.models.DriveSignal;
import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.robot.Robot;
import org.usfirst.frc.team319.robot.commands.drivetrain.BobDrive;
import org.usfirst.frc.team319.robot.commands.drivetrain.DrivetrainVelocityPIDTest;

import com.ctre.phoenix.ErrorCode;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.*;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Drivetrain extends Subsystem {

	public static final int LOW_GEAR_PROFILE = 0;
	public static final int HIGH_GEAR_PROFILE = 1;
	StringBuilder _sb = new StringBuilder();
	private static int _loops = 0;
	
    public LeaderBobTalonSRX leftLead = new LeaderBobTalonSRX(1, new BobTalonSRX(0)); // 8
    public LeaderBobTalonSRX rightLead = new LeaderBobTalonSRX(8, new BobTalonSRX(9)); // 1
    //775 drivetrain code
	//private int[] leftFollowers = {2, 3, 4};
	//private int[] rightFollowers = {7, 8, 9};
    //public LeaderBobTalonSRX leftLead = new LeaderBobTalonSRX(1, leftFollowers);
    //public LeaderBobTalonSRX rightLead = new LeaderBobTalonSRX(6, rightFollowers);
    
    public Drivetrain() {
    	
    	this.leftLead.setInverted(true);//false
    	this.leftLead.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0);
    	this.leftLead.setSensorPhase(true);
    	
    	this.rightLead.setInverted(false);//true
    	this.rightLead.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0);
    	this.rightLead.setSensorPhase(false);
    	
    	this.leftLead.configPeakOutputForward(1);
		this.leftLead.configPeakOutputReverse(-1);
		
		this.rightLead.configPeakOutputForward(1);
		this.rightLead.configPeakOutputReverse(-1);
    	
    	this.leftLead.enableCurrentLimit(true);
    	this.leftLead.configContinuousCurrentLimit(30);
    	this.rightLead.enableCurrentLimit(true);
    	this.rightLead.configContinuousCurrentLimit(30);
    	
    	this.leftLead.configOpenloopRamp(0.25);
    	this.rightLead.configOpenloopRamp(0.25);
    	
    	this.leftLead.setNeutralMode(NeutralMode.Coast);
    	this.rightLead.setNeutralMode(NeutralMode.Coast);
    	
    	this.configPIDF(HIGH_GEAR_PROFILE, 0.0, 0.0, 0.0, 0.146);
    	this.configPIDF(LOW_GEAR_PROFILE, 0.233, 0.0, 0.0, 0.664); //0.332 //.155
    	//this.configPIDF(HIGH_GEAR_PROFILE, 0.45, 0.0, 0.45, 0.238); //gearbob values
		
    }
    
    public void initDefaultCommand() {
        // et the default command for a subsystem here.
    	//setDefaultCommand(new BobDrive());
    	//setDefaultCommand(new DrivetrainVelocityPIDTest());
    }
    
    public void configPIDF(int profile, double p, double i, double d, double f) {
    	this.leftLead.configPIDF(profile, p, i, d, f);
    	this.rightLead.configPIDF(profile, p, i, d, f);

    }
    
    public void drive(ControlMode controlMode, double left, double right){
    	this.leftLead.set(controlMode, left);
    	this.rightLead.set(controlMode, right);
    }
    
    public void drive(ControlMode controlMode, DriveSignal driveSignal) {
    	//System.out.println(driveSignal.toString());
    	this.drive(controlMode, driveSignal.getLeft(), driveSignal.getRight());
    }
    
    public boolean quickTurnController() {
    if (Robot.oi.driverController.leftStick.getY() < 0.2 && Robot.oi.driverController.leftStick.getY() > -0.2) {
		return true;	
	} else {
		return false;
		}
    }
    
    public double getLeftDriveLeadDistance() {
    	return this.leftLead.getSelectedSensorPosition(LOW_GEAR_PROFILE);
    }
    
    public double getRightDriveLeadDistance() {
    	return this.rightLead.getSelectedSensorPosition(LOW_GEAR_PROFILE);
    }
    
    public double getLeftDriveLeadVelocity() {
    	return this.leftLead.getSelectedSensorVelocity(LOW_GEAR_PROFILE);
    }
    
    public double getRightDriveLeadVelocity() {
    	return this.rightLead.getSelectedSensorVelocity(LOW_GEAR_PROFILE);
    }
    
    public void setDrivetrainPositionToZero() {
    	this.leftLead.setSelectedSensorPosition(0, LOW_GEAR_PROFILE);
    	this.rightLead.setSelectedSensorPosition(0, LOW_GEAR_PROFILE);
    }
    
    public double getLeftLeadVoltage() {
    	return this.leftLead.getMotorOutputVoltage();
    }
    
    public double getRightLeadVoltage() {
    	return this.rightLead.getMotorOutputVoltage();
    }
    
    public TalonSRX getLeftLeadTalon() {
    	return this.getLeftLeadTalon();
    }
    
    public TalonSRX getRightLeadTalon() {
    	return this.rightLead;
    }
    
    @Override
    public void periodic() {
		SmartDashboard.putNumber("Left Drive Position", getLeftDriveLeadDistance());
		SmartDashboard.putNumber("Right Lead Position", getRightDriveLeadDistance());
		SmartDashboard.putNumber("Left Drive Velocity", getLeftDriveLeadVelocity());
		SmartDashboard.putNumber("Right Drive Velocity", getRightDriveLeadVelocity());
    }
    	
public void velocityPIDTest() {
    	
    	BobTalonSRX _talon = this.leftLead;
    	double leftYstick = Robot.oi.operatorController.leftStick.getY();
    	double motorOutput = _talon.getMotorOutputPercent();
    	
	/* prepare line to print */
	_sb.append("\tout:");
	_sb.append(motorOutput);
	_sb.append("\tspd:");
	_sb.append(_talon.getSelectedSensorVelocity(this.HIGH_GEAR_PROFILE));
	//_sb.append("LowLevelspeed:");
	//_sb.append(_talon.getSensorCollection());

	if (Robot.oi.operatorController.getRawButton(1)) {
		/* Speed mode */
		/* Convert 500 RPM to units / 100ms.
		 * 4096 Units/Rev * 500 RPM / 600 100ms/min in either direction:
		 * velocity setpoint is in units/100ms
		 */
		double targetVelocity_UnitsPer100ms = Robot.oi.operatorController.leftStick.getY() * 4700;
		/* 500 RPM in either direction */
		_talon.set(ControlMode.Velocity, targetVelocity_UnitsPer100ms);

		/* append more signals to print when in speed mode. */
		_sb.append("\terr:");
		_sb.append(_talon.getClosedLoopError(this.HIGH_GEAR_PROFILE));
		_sb.append("\ttrg:");
		_sb.append(targetVelocity_UnitsPer100ms);
	} else {
		/* Percent voltage mode */
		_talon.set(ControlMode.PercentOutput, leftYstick);
		System.out.println("y-axis" +Robot.oi.operatorController.leftStick.getY());
	}

	if (++_loops >= 10) {
		_loops = 0;
		System.out.println(_sb.toString());
		}
	_sb.setLength(0);
	}
 

}

