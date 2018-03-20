package org.usfirst.frc.team319.robot.commands.autotune;

import org.usfirst.frc.team319.models.BobTalonSRX;
import org.usfirst.frc.team319.utils.HelperFunctions;
import org.usfirst.frc.team319.utils.BobCircularBuffer;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class AutoTuneVelocityCalculateP extends Command {

	private int samplesRequired;
	private int samplesGathered = 0;
	private int paramterSlot = 0;
	private double _desiredVelocity = 0;

	private BobTalonSRX _talon;
	private StringBuilder _sb;
	private BobCircularBuffer cBuff;

	public AutoTuneVelocityCalculateP(Subsystem requiredSubsystem, BobTalonSRX talon, int srxParameterSlot,
			double desiredVelocity, int numSamplesRequired) {
		this._talon = talon;
		this.samplesRequired = numSamplesRequired;
		this.cBuff = new BobCircularBuffer(samplesRequired);
		this.paramterSlot = srxParameterSlot;
		this._desiredVelocity = desiredVelocity;
		this._sb = new StringBuilder();
		requires(requiredSubsystem);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		System.out.println("Calculating proportional gain (P).");
		System.out.println("Gathering Data...");
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		double outputSignal = _talon.getMotorOutputVoltage() / _talon.getBusVoltage();
		double speed = _talon.getSelectedSensorVelocity(paramterSlot);
		double closedLoopError = _talon.getClosedLoopError(paramterSlot);

		cBuff.addLast(Math.abs(closedLoopError));
		samplesGathered++;

		_sb.append("\tOutput: ");
		_sb.append(outputSignal);
		_sb.append("\tSpeed: ");
		_sb.append(speed);
		_sb.append("\tError: ");
		_sb.append(closedLoopError);
		_sb.append("\tTarget: ");
		_sb.append(_desiredVelocity);
		_sb.append("\n");
		if (samplesGathered % 10 == 0) {
			System.out.println(_sb.toString());
		}

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return samplesGathered >= samplesRequired;
	}

	// Called once after isFinished returns true
	protected void end() {
		double avgError = HelperFunctions.mean(cBuff.toArray());
		double kP = 0.1 * 1023 / avgError;
		_talon.config_kP(paramterSlot, kP);
		System.out.println("Average Error = " + avgError);
		System.out.println("Calculated P gain = " + kP);
		System.out.println("Finished calculating P gain.  Switching to percent output mode.");
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		_talon.set(ControlMode.PercentOutput, 0);
	}
}