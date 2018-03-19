package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.utils.BobCircularBuffer;
import org.usfirst.frc.team319.utils.HelperFunctions;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class CubeCollector extends Subsystem {

	private boolean isOpen = false;
	private BobCircularBuffer irSensorValuesBuffer;

	public final BobTalonSRX collectorLeftMotor = new BobTalonSRX(3); // 11
	public final BobTalonSRX collectorRightMotor = new BobTalonSRX(4);
	AnalogInput collectorDistanceSensor = new AnalogInput(0);

	private static final double cubeCollectedOpenThreshhold = 1.5;
	private double cubeCollectedClosedThreshold = 2.2;
	private static final double cubeLostDistanceThreshhold = 1.5;
	private static final double cubeCloseThreshold = 1.0;

	public CubeCollector() {

		this.collectorLeftMotor.setInverted(true);
		this.collectorRightMotor.setInverted(false);

		this.collectorLeftMotor.setNeutralMode(NeutralMode.Coast);
		this.collectorRightMotor.setNeutralMode(NeutralMode.Coast);
		
		this.irSensorValuesBuffer = new BobCircularBuffer(5);

	}

	public void initDefaultCommand() {
	}

	// set leftmotor speed to negative to combat issues with it running full
	// speed and not PIDing to the set speed
	public void setCubeCollector(ControlMode controlMode, double speed) {
		collectorLeftMotor.set(controlMode, speed);
		collectorRightMotor.set(controlMode, speed);
	}

	public void setCubeCollectorIndependently(ControlMode controlMode, double left, double right) {
		collectorLeftMotor.set(controlMode, left);
		collectorRightMotor.set(controlMode, right);
	}

	public void setCubeCollectorLeftMotor(ControlMode controlMode, double speed) {
		collectorLeftMotor.set(controlMode, speed);
	}

	public double getCollectorDistanceSensorValue() {
		
		return HelperFunctions.mean(irSensorValuesBuffer.toArray());
	}

	public double getLeftCurrent() {
		return this.collectorLeftMotor.getOutputCurrent();
	}

	public double getRightCurrent() {
		return this.collectorRightMotor.getOutputCurrent();
	}

	@Override
	public void periodic() {
		irSensorValuesBuffer.addLast(this.collectorDistanceSensor.getVoltage());
		SmartDashboard.putNumber("IR Sensor", this.getCollectorDistanceSensorValue());
		SmartDashboard.putBoolean("Collector Open", isOpen);
		// SmartDashboard.putNumber("Left Collector Current", this.getLeftCurrent());
		// SmartDashboard.putNumber("Right Collector Current", this.getRightCurrent());

	}

	public boolean isCubeCollected() {
		if (isOpen) {
			return this.getCollectorDistanceSensorValue() > cubeCollectedOpenThreshhold;
		} else {
			return this.getCollectorDistanceSensorValue() > cubeCollectedClosedThreshold;
		}
	}
	
	public boolean isCubeClose() {
		return this.getCollectorDistanceSensorValue() > cubeCloseThreshold;
	}

	public boolean isCubeLost() {
		return this.getCollectorDistanceSensorValue() < cubeLostDistanceThreshhold;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setIsOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

}
