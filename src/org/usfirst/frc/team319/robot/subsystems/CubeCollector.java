package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.robot.commands.CubeCollectorStop;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CubeCollector extends Subsystem {
	
	public final BobTalonSRX collectorLeftMotor = new BobTalonSRX(0);
	public final BobTalonSRX collectorRightMotor = new BobTalonSRX(10);
	
	public CubeCollector() {
		
		this.collectorLeftMotor.setInverted(false);
		this.collectorRightMotor.setInverted(true);
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
}

