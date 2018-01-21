package org.usfirst.frc.team319.models;

public class SRXGains {
	
	public double P,I,D,F;	
	public int parameterSlot;
	
	public SRXGains(int slot, double p, double i, double d, double f) {
		this.parameterSlot = slot;
		this.P = p;
		this.I = i;
		this.D = d;
		this.F = f;
	}

}