package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.DriveSignal;
import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.robot.commands.BobDrive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {

	private int[] leftFollowers = {2, 3, 4};
	private int[] rightFollowers = {7, 8, 9};
    public final LeaderBobTalonSRX leftLead = new LeaderBobTalonSRX(1, leftFollowers);
    public final LeaderBobTalonSRX rightLead = new LeaderBobTalonSRX(6, rightFollowers);
    
    public Drivetrain() {
    	
    	this.leftLead.setInverted(false);
    	//this.leftLead.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0);
    	this.rightLead.setInverted(true);
    	//this.rightLead.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0);
    	/*
    	this.leftLead.enableCurrentLimit(true);
    	this.leftLead.configContinuousCurrentLimit(30);
    	this.rightLead.enableCurrentLimit(true);
    	this.rightLead.configContinuousCurrentLimit(30);
    	
    	this.leftLead.configOpenloopRamp(0.25);
    	this.rightLead.configOpenloopRamp(0.25);
    	
    	this.leftLead.setNeutralMode(NeutralMode.Brake);
    	this.rightLead.setNeutralMode(NeutralMode.Brake);
    	*/
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new BobDrive());
    }
    
    public void drive(ControlMode controlMode, double left, double right){
    	this.leftLead.set(controlMode, left);
    	this.rightLead.set(controlMode, right);
    }
    
    public void drive(ControlMode controlMode, DriveSignal driveSignal) {
    	this.drive(controlMode, driveSignal.getLeft(), driveSignal.getRight());
    }
}

