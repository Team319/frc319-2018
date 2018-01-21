package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.robot.commands.wrist.WristStop;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Wrist extends Subsystem {

   public final BobTalonSRX wristMotor = new BobTalonSRX(14);
   
   public Wrist() {
	   
	   this.wristMotor.setInverted(false);
	   
}	
   
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new WristStop());
    }
    
    public void wristMove(ControlMode controlMode, double signal) {
    	wristMotor.set(controlMode, signal);
    
    }
}

