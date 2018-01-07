package org.usfirst.frc.team319.models;

import com.ctre.phoenix.ErrorCode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class BobTalonSRX extends TalonSRX {
	
	private static final int DEFAULT_TIMEOUT_MS = 10;
	
	public BobTalonSRX(int deviceNumber) {
		super(deviceNumber);
		// TODO Auto-generated constructor stub
	}
	
	public ErrorCode configPIDF(int slotIdx, double P, double I, double D, double F){
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

	public ErrorCode configSelectedFeedbackSensor(FeedbackDevice feedbackDevice, int pidIdx) {
		// TODO Auto-generated method stub
		return super.configSelectedFeedbackSensor(feedbackDevice, pidIdx, DEFAULT_TIMEOUT_MS);
	}
	
	public ErrorCode configContinuousCurrentLimit(int amps) {
		// TODO Auto-generated method stub
		return super.configContinuousCurrentLimit(amps, DEFAULT_TIMEOUT_MS);
	}
	
	public ErrorCode configOpenloopRamp(double secondsFromNeutralToFull) {
		// TODO Auto-generated method stub
		return super.configOpenloopRamp(secondsFromNeutralToFull, DEFAULT_TIMEOUT_MS);
	}
	
	public ErrorCode config_kP(int slotIdx, double value) {
		// TODO Auto-generated method stub
		return super.config_kP(slotIdx, value, DEFAULT_TIMEOUT_MS);
	}
	
	public ErrorCode config_kD(int slotIdx, double value) {
		// TODO Auto-generated method stub
		return super.config_kD(slotIdx, value, DEFAULT_TIMEOUT_MS);
	}
	
	public ErrorCode config_kF(int slotIdx, double value) {
		// TODO Auto-generated method stub
		return super.config_kF(slotIdx, value, DEFAULT_TIMEOUT_MS);
	}
	
	public ErrorCode config_kI(int slotIdx, double value) {
		// TODO Auto-generated method stub
		return super.config_kI(slotIdx, value, DEFAULT_TIMEOUT_MS);
	}
}
