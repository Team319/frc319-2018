package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.DriveSignal;
import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.robot.Robot;
import org.usfirst.frc.team319.robot.commands.BobDrive;

import com.ctre.phoenix.ErrorCode;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.*;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {

	public static final int LOW_GEAR_PROFILE = 0;
	public static final int HIGH_GEAR_PROFILE = 1;
	private int[] leftFollower = {9};
	private int[] rightFollower = {0};
	
    public LeaderBobTalonSRX leftLead = new LeaderBobTalonSRX(8, leftFollower);
    public LeaderBobTalonSRX rightLead = new LeaderBobTalonSRX(1, rightFollower);
    //775 drivetrain code
	//private int[] leftFollowers = {2, 3, 4};
	//private int[] rightFollowers = {7, 8, 9};
    //public LeaderBobTalonSRX leftLead = new LeaderBobTalonSRX(1, leftFollowers);
    //public LeaderBobTalonSRX rightLead = new LeaderBobTalonSRX(6, rightFollowers);
    
    public Drivetrain() {
    	
    	this.leftLead.setInverted(true);//false
    	this.leftLead.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0);
    	this.leftLead.setSensorPhase(false);
    	
    	this.rightLead.setInverted(false);//true
    	this.rightLead.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0);
    	this.rightLead.setSensorPhase(false);
    	
    	
    	this.leftLead.enableCurrentLimit(true);
    	this.leftLead.configContinuousCurrentLimit(30);
    	this.rightLead.enableCurrentLimit(true);
    	this.rightLead.configContinuousCurrentLimit(30);
    	
    	this.leftLead.configOpenloopRamp(0.25);
    	this.rightLead.configOpenloopRamp(0.25);
    	
    	this.leftLead.setNeutralMode(NeutralMode.Coast);
    	this.rightLead.setNeutralMode(NeutralMode.Coast);
    	
    	this.configPIDF(HIGH_GEAR_PROFILE, 0.45, 0.0, 0.45, 0.238);
		
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
       // setDefaultCommand(new BobDrive());
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
    if (Robot.oi.driverController.getLeftStickY() < 0.2 && Robot.oi.driverController.getLeftStickY() > -0.2) {
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
    	
}

