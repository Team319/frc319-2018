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

	public boolean isDrivetrainHighGear;
	public boolean isElevatorHighGear;
	public boolean isWinchBrakeHighGear;
	
	Compressor compressor = new Compressor(0);
	DoubleSolenoid drivetrainShifter = new DoubleSolenoid(2, 3);
	DoubleSolenoid elevatorShifter = new DoubleSolenoid(4, 5);
	DoubleSolenoid winchBrakeShifter = new DoubleSolenoid(6, 7);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new CompressorRun());
    }
    
    public void compressorRun() {
    	compressor.setClosedLoopControl(true);
    }
    
    public void drivetrainShiftUp() {
    	this.drivetrainShifter.set(DoubleSolenoid.Value.kForward);
    	this.isDrivetrainHighGear = true;
    }
    
    public void drivetrainShiftDown() {
    	this.drivetrainShifter.set(DoubleSolenoid.Value.kReverse);
    	this.isDrivetrainHighGear = false;
    }
    
    public void elevatorShiftUp() {
    	this.elevatorShifter.set(DoubleSolenoid.Value.kForward);
    	this.isElevatorHighGear = true;
    }
    
    public void elevatorShiftDown() {
    	this.elevatorShifter.set(DoubleSolenoid.Value.kReverse);
    	this.isElevatorHighGear = false;
    }
    
    public void winchBreakShiftUp() {
    	this.winchBrakeShifter.set(DoubleSolenoid.Value.kForward);
    	this.isWinchBrakeHighGear = true;
    }
    
    public void winchBreakShiftDown() {
    	this.winchBrakeShifter.set(DoubleSolenoid.Value.kReverse);
    	this.isWinchBrakeHighGear = false;
    }
}

