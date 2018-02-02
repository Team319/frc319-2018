package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.robot.commands.wrist.WristStop;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Wrist extends Subsystem {

	public final static int WRIST_PROFILE = 0;
	
   public final BobTalonSRX wristMotor = new BobTalonSRX(4);
   
   public Wrist() {
	   
	   this.wristMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, WRIST_PROFILE);
	   
	   this.wristMotor.setInverted(false);
	   this.wristMotor.setSensorPhase(false);
	   
	   this.wristMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_13_Base_PIDF0, 10);
	   this.wristMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10);
	   
	   this.wristMotor.configPeakOutputForward(1);
	   this.wristMotor.configPeakOutputReverse(-1);
	   
	   this.wristMotor.setSelectedSensorPosition(0, WRIST_PROFILE);
	   
	   this.wristMotor.configMotionAcceleration(500);
	   this.wristMotor.configMotionCruiseVelocity(2000); 
	   
	   ///////////////////
	   
	   this.wristMotor.setNeutralMode(NeutralMode.Coast);
	   
	   this.wristMotor.configPIDF(WRIST_PROFILE, 0.0, 0.0, 0.0, 0.0);
	   
}	
   
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new WristStop());
    }
    
    public void wristMove(ControlMode controlMode, double signal) {
    	wristMotor.set(controlMode, signal);
    }
    
}

