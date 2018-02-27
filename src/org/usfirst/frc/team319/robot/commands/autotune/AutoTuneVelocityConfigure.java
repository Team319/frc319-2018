package org.usfirst.frc.team319.robot.commands.autotune;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.models.SRXGains;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class AutoTuneVelocityConfigure extends Command {

	private BobTalonSRX _talon;
	private int parameterSlot;
	private boolean _sensorInPhase;
	private boolean _outputInverted;
	private FeedbackDevice _srxFeedbackDevice;

	public AutoTuneVelocityConfigure(Subsystem requiredSubsystem, BobTalonSRX talon, int srxParameterSlot,
			FeedbackDevice srxFeedbackDevice, boolean sensorInPhase, boolean outputInverted) {
		this._talon = talon;
		this.parameterSlot = srxParameterSlot;
		this._srxFeedbackDevice = srxFeedbackDevice;
		this._sensorInPhase = sensorInPhase;
		this._outputInverted = outputInverted;
		requires(requiredSubsystem);
	}

	// Called just before this Command runs the first time
	protected void initialize() {

		_talon.configSelectedFeedbackSensor(this._srxFeedbackDevice, 0);
		_talon.setSensorPhase(this._sensorInPhase);
		_talon.setInverted(this._outputInverted);
		_talon.configNominalOutputForward(1.0);
		_talon.configNominalOutputReverse(1.0);

		_talon.setGains(new SRXGains(parameterSlot, 0, 0, 0, 0, 0));

		System.out.println("Starting motor in 5 seconds.  STAND CLEAR.");
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return true;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
