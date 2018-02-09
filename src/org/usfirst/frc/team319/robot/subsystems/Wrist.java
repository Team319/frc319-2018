package org.usfirst.frc.team319.robot.subsystems;

import java.util.concurrent.TimeUnit;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.models.Instrum;
import org.usfirst.frc.team319.robot.Robot;
import org.usfirst.frc.team319.robot.commands.wrist.WristMotionMagicTest;
import org.usfirst.frc.team319.robot.commands.wrist.WristStop;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Wrist extends Subsystem {

	public final static int WRIST_PROFILE = 0;
	StringBuilder _sb = new StringBuilder();
	int loops = 0;
	
   public final BobTalonSRX wristMotor = new BobTalonSRX(4);
   
   public Wrist() {
	   
	   this.wristMotor.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, WRIST_PROFILE);
	   
	   this.wristMotor.setInverted(false);
	   this.wristMotor.setSensorPhase(true);
	   
	   this.wristMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_13_Base_PIDF0, 10);
	   this.wristMotor.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10);
	   
	   this.wristMotor.configPeakOutputForward(1);
	   this.wristMotor.configPeakOutputReverse(-1);
	   
	   this.wristMotor.setSelectedSensorPosition(0, WRIST_PROFILE);
	   
	   this.wristMotor.configMotionAcceleration(500);
	   this.wristMotor.configMotionCruiseVelocity(2000); 
	   
	   ///////////////////
	   
	   this.wristMotor.setNeutralMode(NeutralMode.Coast);
	   
	   this.wristMotor.configPIDF(WRIST_PROFILE, 0.219, 0.0, 0.0, 0.799);
	   
}	
   
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new WristMotionMagicTest()); //WristStop
    	setDefaultCommand(new WristStop());
    }
    
    public void wristMove(ControlMode controlMode, double signal) {
    	wristMotor.set(controlMode, signal);
    }
    
 public void motionMagicTest() {
    	
    	BobTalonSRX _talon = this.wristMotor;
    	
		/* get gamepad axis - forward stick is positive */
		double leftYstick = Robot.oi.operatorController.leftStick.getY();
		/* calculate the percent motor output */
		double motorOutput = _talon.getMotorOutputPercent();
		/* prepare line to print */
		_sb.append("\tOut%:");
		_sb.append(motorOutput);
		_sb.append("\tVel:");
		_sb.append(_talon.getSelectedSensorVelocity(this.WRIST_PROFILE));

		if (Robot.oi.operatorController.getRawButton(1)) {
			/* Motion Magic - 4096 ticks/rev * 10 Rotations in either direction */
			double targetPos = leftYstick * 4096 * 10.0;
			_talon.set(ControlMode.MotionMagic, targetPos);

			/* append more signals to print when in speed mode. */
			_sb.append("\terr:");
			_sb.append(_talon.getClosedLoopError(this.WRIST_PROFILE));
			_sb.append("\ttrg:");
			_sb.append(targetPos);
		} else {
			/* Percent voltage mode */
			_talon.set(ControlMode.PercentOutput, leftYstick);
		}
		/* instrumentation */
		Instrum.Process(_talon, _sb);
		try {
			TimeUnit.MILLISECONDS.sleep(10);
		} catch (Exception e) {
		
	}  
 	}
 
 	public double getWristPosition() {
 		return this.wristMotor.getSelectedSensorPosition(WRIST_PROFILE);
 	}
 	
 	@Override
 	public void periodic() {
 		SmartDashboard.putNumber("Wrist Position", this.getWristPosition());
 	}
 
}

