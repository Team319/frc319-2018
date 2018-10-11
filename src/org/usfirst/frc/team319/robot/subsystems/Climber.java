package org.usfirst.frc.team319.robot.subsystems;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.robot.commands.climber.ClimberStop;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {
	public final BobTalonSRX climberLead = new BobTalonSRX(7);

	public void initDefaultCommand() {
		setDefaultCommand(new ClimberStop());
	}

	public void climberTest(ControlMode controlMode, double signal) {
		climberLead.set(controlMode, signal);
	}
}
