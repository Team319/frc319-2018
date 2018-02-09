package org.usfirst.frc.team319.controllers;

import org.usfirst.frc.team319.controllers.BobXboxController.XboxAxis;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

public class BobThumbStick {
	Joystick controller;
	XboxAxis xAxis;
	XboxAxis yAxis;
	
	public BobThumbStick(Joystick controller, XboxAxis xAxis, XboxAxis yAxis) {
		this.controller = controller;
		this.xAxis = xAxis;
		this.yAxis = yAxis;
	}

	public double getX() {
		return this.controller.getRawAxis(xAxis.value);
	}
	
	public double getY() {
		return this.controller.getRawAxis(yAxis.value);
	}

}
