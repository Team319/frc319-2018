package org.usfirst.frc.team319.controllers;

import org.usfirst.frc.team319.controllers.BobAxisButton.ThresholdType;

import edu.wpi.first.wpilibj.Joystick;

public class BobXboxController extends Joystick {

	public BobXboxController(int port) {
		super(port);
	}

	public BobXboxController(int port, double xDeadband, double yDeadband) {
		this(port);
		this.leftStick.setDeadband(xDeadband, yDeadband);
		this.rightStick.setDeadband(xDeadband, yDeadband);
	}

	public BobButton xButton = new BobButton(this, XboxButton.X);
	public BobButton yButton = new BobButton(this, XboxButton.Y);
	public BobButton aButton = new BobButton(this, XboxButton.A);
	public BobButton bButton = new BobButton(this, XboxButton.B);
	public BobButton rightBumper = new BobButton(this, XboxButton.RIGHT_BUMPER);
	public BobButton leftBumper = new BobButton(this, XboxButton.LEFT_BUMPER);
	public BobButton startButton = new BobButton(this, XboxButton.START);
	public BobButton selectButton = new BobButton(this, XboxButton.SELECT);
	public BobButton leftStickButton = new BobButton(this, XboxButton.LEFT_STICK);
	public BobButton rightStickButton = new BobButton(this, XboxButton.RIGHT_STICK);

	public BobAxisButton leftTriggerButton = new BobAxisButton(this, XboxAxis.LEFT_TRIGGER, .25,
			ThresholdType.GREATER_THAN);
	public BobAxisButton rightTriggerButton = new BobAxisButton(this, XboxAxis.RIGHT_TRIGGER, .25,
			ThresholdType.GREATER_THAN);
	public BobDpad Dpad = new BobDpad(this);

	public BobThumbStick leftStick = new BobThumbStick(this, XboxAxis.LEFT_X, XboxAxis.LEFT_Y);
	public BobThumbStick rightStick = new BobThumbStick(this, XboxAxis.RIGHT_X, XboxAxis.RIGHT_Y);

	public BobTriggers triggers = new BobTriggers(this);

	public void setRumble(double leftValue, double rightValue) {
		setRumble(RumbleType.kLeftRumble, leftValue);
		setRumble(RumbleType.kRightRumble, rightValue);
	}

	static enum XboxButton {

		A(1), B(2), X(3), Y(4), LEFT_BUMPER(5), RIGHT_BUMPER(6), SELECT(7), START(8), LEFT_STICK(9), RIGHT_STICK(10);

		final int value;

		XboxButton(int value) {
			this.value = value;
		}

		public int getValue() {
			return this.value;
		}
	}

	static enum XboxAxis {
		LEFT_X(0), LEFT_Y(1), LEFT_TRIGGER(2), RIGHT_TRIGGER(3), RIGHT_X(4), RIGHT_Y(5), DPAD(6);

		final int value;

		XboxAxis(int value) {
			this.value = value;
		}

		public int getValue() {
			return this.value;
		}
	}

	static enum XboxDpad {
		UNPRESSED(-1), UP(0), UP_RIGHT(45), RIGHT(90), DOWN_RIGHT(135), DOWN(180), DOWN_LEFT(225), LEFT(270), UP_LEFT(
				315);

		final int value;

		XboxDpad(int value) {
			this.value = value;
		}

		public int getValue() {
			return this.value;
		}
	}

}
