package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.robot.commands.pneumantics.CompressorRun;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pneumatics extends Subsystem {

	public boolean isHighGear;
	
	Compressor compressor = new Compressor(0);
	DoubleSolenoid shifterSolenoid = new DoubleSolenoid(2, 3);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
       // setDefaultCommand(new CompressorRun());
    }
    
    public void compressorRun() {
    	compressor.setClosedLoopControl(true);
    }
    
    public void shiftUp() {
    	this.shifterSolenoid.set(DoubleSolenoid.Value.kForward);
    	this.isHighGear = true;
    }
    
    public void shiftDown() {
    	this.shifterSolenoid.set(DoubleSolenoid.Value.kReverse);
    	this.isHighGear = false;
    }
}

