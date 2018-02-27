package org.usfirst.frc.team319.canifier;

import com.ctre.phoenix.CANifier;

import edu.wpi.first.wpilibj.Joystick;

public class Hardware {
	public static CANifier canifier = new CANifier(0);
	public static Joystick gamepad = new Joystick(0);
}
