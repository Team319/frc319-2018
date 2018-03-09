package org.usfirst.frc.team319.models;

import com.ctre.phoenix.ErrorCode;
import com.ctre.phoenix.ParamEnum;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class BobTalonSRX extends TalonSRX {

	private static final int DEFAULT_TIMEOUT_MS = 0;
	private static final int DEFAULT_PID_INDEX = 0;

	public BobTalonSRX(int deviceNumber) {
		super(deviceNumber);
		this.configNominalOutputForward(0.0);
		this.configNominalOutputReverse(0.0);
		this.configPeakOutputForward(1);
		this.configPeakOutputReverse(-1);
		this.configMotionProfileTrajectoryPeriod(0);
	}

	public ErrorCode configPIDF(int slotIdx, double P, double I, double D, double F) {
		ErrorCode errorCode = ErrorCode.OK;

		errorCode = this.config_kP(slotIdx, P);
		if (errorCode != ErrorCode.OK) {
			return errorCode;
		}

		errorCode = this.config_kI(slotIdx, I);
		if (errorCode != ErrorCode.OK) {
			return errorCode;
		}

		errorCode = this.config_kD(slotIdx, D);
		if (errorCode != ErrorCode.OK) {
			return errorCode;
		}

		errorCode = this.config_kF(slotIdx, F);
		return errorCode;
	}

	public ErrorCode configPIDF(int slotIdx, double P, double I, double D, double F, int iZone) {
		ErrorCode eCode = this.configPIDF(slotIdx, P, I, D, F);
		eCode = this.config_IntegralZone(slotIdx, iZone);
		return eCode;
	}

	public ErrorCode configPIDF(SRXGains gains) {
		return this.configPIDF(gains.parameterSlot, gains.P, gains.I, gains.D, gains.F, gains.iZone);
	}
	
	public void configMotionParameters(MotionParameters parameters) {
		this.configMotionAcceleration(parameters.getAcceleration());
		this.configMotionCruiseVelocity(parameters.getCruiseVelocity());
		this.setGains(parameters.getGains());
	}
	
	public void selectMotionParameters(MotionParameters parameters) {
		this.selectProfileSlot(parameters.getGains().parameterSlot);
		this.configMotionAcceleration(parameters.getAcceleration());
		this.configMotionCruiseVelocity(parameters.getCruiseVelocity());
	}

	public ErrorCode config_IntegralZone(int slotIdx, int izone) {
		return super.config_IntegralZone(slotIdx, izone, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode configNominalOutputForward(double percentOut) {
		return super.configNominalOutputForward(percentOut, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode configNominalOutputReverse(double percentOut) {
		return super.configNominalOutputReverse(percentOut, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode configPeakOutputForward(double percentOut) {
		return super.configPeakOutputForward(percentOut, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode configPeakOutputReverse(double percentOut) {
		return super.configPeakOutputReverse(percentOut, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode setGains(SRXGains gains) {
		return this.configPIDF(gains.parameterSlot, gains.P, gains.I, gains.D, gains.F, gains.iZone);
	}
	
	public ErrorCode configSelectedFeedbackSensor(FeedbackDevice feedbackDevice) {
		return super.configSelectedFeedbackSensor(feedbackDevice, DEFAULT_PID_INDEX, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode configSelectedFeedbackSensor(FeedbackDevice feedbackDevice, int pidIdx) {
		return super.configSelectedFeedbackSensor(feedbackDevice, pidIdx, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode configContinuousCurrentLimit(int amps) {
		return super.configContinuousCurrentLimit(amps, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode configOpenloopRamp(double secondsFromNeutralToFull) {
		return super.configOpenloopRamp(secondsFromNeutralToFull, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode config_kP(int slotIdx, double value) {
		return super.config_kP(slotIdx, value, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode config_kD(int slotIdx, double value) {
		return super.config_kD(slotIdx, value, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode config_kF(int slotIdx, double value) {
		return super.config_kF(slotIdx, value, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode config_kI(int slotIdx, double value) {
		return super.config_kI(slotIdx, value, DEFAULT_TIMEOUT_MS);
	}
	
	public ErrorCode setSelectedSensorPosition(int sensorPos) {
		return super.setSelectedSensorPosition(sensorPos, DEFAULT_PID_INDEX, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode setSelectedSensorPosition(int sensorPos, int pidIdx) {
		return super.setSelectedSensorPosition(sensorPos, pidIdx, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode configMotionAcceleration(int sensorUnitsPer100msPerSec) {
		return super.configMotionAcceleration(sensorUnitsPer100msPerSec, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode configMotionCruiseVelocity(int sensorUnitsPer100ms) {
		return super.configMotionCruiseVelocity(sensorUnitsPer100ms, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode setStatusFramePeriod(StatusFrameEnhanced status13BasePidf0, int periodMs) {
		return super.setStatusFramePeriod(status13BasePidf0, periodMs, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode configMotionProfileTrajectoryPeriod(int baseTrajDurationMs) {
		return super.configMotionProfileTrajectoryPeriod(baseTrajDurationMs, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode configForwardSoftLimitEnable(boolean enable) {
		return super.configForwardSoftLimitEnable(enable, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode configForwardSoftLimitThreshold(int forwardSensorLimit) {
		return super.configForwardSoftLimitThreshold(forwardSensorLimit, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode configReverseSoftLimitEnable(boolean enable) {
		return super.configReverseSoftLimitEnable(enable, DEFAULT_TIMEOUT_MS);
	}

	public ErrorCode configReverseSoftLimitThreshold(int reverseSensorLimit) {
		return super.configReverseSoftLimitThreshold(reverseSensorLimit, DEFAULT_TIMEOUT_MS);
	}

	public double configGetParameter(ParamEnum param, int ordinal) {
		return super.configGetParameter(param, ordinal, DEFAULT_TIMEOUT_MS);
	}
	
	public int getSelectedSensorPosition() {
		return super.getSelectedSensorPosition(DEFAULT_PID_INDEX);
	}
	
	public int getSelectedSensorVelocity() {
		return super.getSelectedSensorVelocity(DEFAULT_PID_INDEX);
	}

	public void selectProfileSlot(int slotIdx) {
		super.selectProfileSlot(slotIdx, DEFAULT_PID_INDEX);
	}
	
	public int getClosedLoopError() {
		return super.getClosedLoopError(DEFAULT_PID_INDEX);
	}
	
	public ErrorCode configClosedloopRamp(double secondsFromNeutralToFull) {
		return super.configClosedloopRamp(secondsFromNeutralToFull, DEFAULT_TIMEOUT_MS);
	}
}
