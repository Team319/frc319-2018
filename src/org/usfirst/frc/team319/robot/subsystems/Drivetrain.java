package org.usfirst.frc.team319.robot.subsystems;

import java.util.ArrayList;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.models.DriveSignal;
import org.usfirst.frc.team319.models.LeaderBobTalonSRX;
import org.usfirst.frc.team319.models.SRXGains;
import org.usfirst.frc.team319.robot.commands.drivetrain.BobDrive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.sensors.PigeonIMU;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Drivetrain extends Subsystem {
	
	private boolean isHighGear = false;

	public static final int LOW_GEAR_PROFILE = 0;
	public static final int HIGH_GEAR_PROFILE = 1;

	//private SRXGains lowGearGains = new SRXGains(LOW_GEAR_PROFILE, 2.400, 0.0, 48.00, 0.400, 0); practice Bob values
	//private SRXGains highGearGains = new SRXGains(HIGH_GEAR_PROFILE, 0.40, 0.0, 10.00, 0.189, 0); practice Bob values

	private SRXGains lowGearGains = new SRXGains(LOW_GEAR_PROFILE, 0.600, 0.0, 12.00, 0.0763, 0); //
	private SRXGains highGearGains = new SRXGains(HIGH_GEAR_PROFILE, 0.10, 0.0, 2.50, 0.0341, 0); // d was 2.5
	
	public LeaderBobTalonSRX leftLead = new LeaderBobTalonSRX(6, new BobTalonSRX(7)); // 8
	public LeaderBobTalonSRX rightLead = new LeaderBobTalonSRX(1, new BobTalonSRX(2)); // 1

	public PigeonIMU pigeon = new PigeonIMU(7);
	
	public Drivetrain() {

		this.leftLead.setInverted(true);// false
		this.leftLead.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0);
		this.leftLead.setSensorPhase(false);

		this.rightLead.setInverted(false);// true
		this.rightLead.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0);
		this.rightLead.setSensorPhase(false);
		
		this.leftLead.enableCurrentLimit(false);
		this.leftLead.configContinuousCurrentLimit(60);
		this.rightLead.enableCurrentLimit(false);
		this.rightLead.configContinuousCurrentLimit(60);

		this.leftLead.configOpenloopRamp(0.25);
		this.rightLead.configOpenloopRamp(0.25);

		setNeutralMode(NeutralMode.Coast);

		this.configGains(highGearGains);
		this.configGains(lowGearGains);
	}

	public void initDefaultCommand() {
		setDefaultCommand(new BobDrive());
	}
	
	public void configGains(SRXGains gains) {
		this.leftLead.setGains(gains);
		this.rightLead.setGains(gains);
	}
	
	public void drive(ControlMode controlMode, double left, double right) {
		this.leftLead.set(controlMode, left);
		this.rightLead.set(controlMode, right);
	}

	public void drive(ControlMode controlMode, DriveSignal driveSignal) {
		this.drive(controlMode, driveSignal.getLeft(), driveSignal.getRight());
	}

	public double getLeftDriveLeadDistance() {
		return this.leftLead.getSelectedSensorPosition();
	}

	public double getRightDriveLeadDistance() {
		return this.rightLead.getSelectedSensorPosition();
	}

	public double getLeftDriveLeadVelocity() {
		return this.leftLead.getSelectedSensorVelocity();
	}

	public double getRightDriveLeadVelocity() {
		return this.rightLead.getSelectedSensorVelocity();
	}

	public void setDrivetrainPositionToZero() {
		this.leftLead.setSelectedSensorPosition(0);
		this.rightLead.setSelectedSensorPosition(0);
	}

	public double getLeftLeadVoltage() {
		return this.leftLead.getMotorOutputVoltage();
	}

	public double getRightLeadVoltage() {
		return this.rightLead.getMotorOutputVoltage();
	}

	public double getLeftClosedLoopError() {
		return this.leftLead.getClosedLoopError();
	}

	public double getRightClosedLoopError() {
		return this.rightLead.getClosedLoopError();
	}

	public TalonSRX getLeftLeadTalon() {
		return this.getLeftLeadTalon();
	}

	public TalonSRX getRightLeadTalon() {
		return this.rightLead;
	}

	public void setNeutralMode(NeutralMode neutralMode) {
		this.leftLead.setNeutralMode(neutralMode);
		this.rightLead.setNeutralMode(neutralMode);
	}
	
	public boolean isHighGear() {
		return isHighGear;
	}
	
	public void setIsHighGear(boolean isHighGear) {
		this.isHighGear = isHighGear;
	}

	@Override
	public void periodic() {
		SmartDashboard.putBoolean("Drivetrain High Gear", isHighGear);
		SmartDashboard.putNumber("Left Drive Position", getLeftDriveLeadDistance());
		SmartDashboard.putNumber("Right Drive Position", getRightDriveLeadDistance());
		SmartDashboard.putNumber("Left Drive Velocity", getLeftDriveLeadVelocity());
		SmartDashboard.putNumber("Right Drive Velocity", getRightDriveLeadVelocity());
		//SmartDashboard.putNumber("Left Drive Closed Loop Error", getLeftClosedLoopError());
		//SmartDashboard.putNumber("Right Drive Closed Loop Error", getRightClosedLoopError());

		ArrayList<Double> leftCurrents = leftLead.getOutputCurrents();

		int i = 0;
		for (Double current : leftCurrents) {
			SmartDashboard.putNumber("LeftMotorCurrent" + i, current);
			i++;
		}
	}
}
