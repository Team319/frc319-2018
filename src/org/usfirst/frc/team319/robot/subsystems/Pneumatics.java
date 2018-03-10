package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.robot.Robot;
import org.usfirst.frc.team319.robot.commands.pneumatics.CompressorRun;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pneumatics extends Subsystem {

	// public boolean isCollectorSolenoidExtended;

	Compressor compressor = new Compressor(0);

	DoubleSolenoid elevatorShifter = new DoubleSolenoid(0, 1);
	DoubleSolenoid drivetrainShifter = new DoubleSolenoid(2, 3);
	DoubleSolenoid collectorSolenoid = new DoubleSolenoid(5, 4);
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
		Robot.drivetrain.setIsHighGear(true);
	}

	public void drivetrainShiftDown() {
		this.drivetrainShifter.set(DoubleSolenoid.Value.kReverse);
		Robot.drivetrain.setIsHighGear(false);
	}

	public void elevatorShiftUp() {
		this.elevatorShifter.set(DoubleSolenoid.Value.kForward);
		Robot.elevator.setHighGear(true);
	}

	public void elevatorShiftDown() {
		this.elevatorShifter.set(DoubleSolenoid.Value.kReverse);
		Robot.elevator.setHighGear(false);
	}

	public void winchBreakShiftUp() {
		this.winchBrakeShifter.set(DoubleSolenoid.Value.kForward);
	}

	public void winchBreakShiftDown() {
		this.winchBrakeShifter.set(DoubleSolenoid.Value.kReverse);
	}

	public void openCollector() {
		this.collectorSolenoid.set(DoubleSolenoid.Value.kForward);
		Robot.cubeCollector.setIsOpen(true);
	}

	public void closeCollector() {
		this.collectorSolenoid.set(DoubleSolenoid.Value.kReverse);
		Robot.cubeCollector.setIsOpen(false);
	}

}
