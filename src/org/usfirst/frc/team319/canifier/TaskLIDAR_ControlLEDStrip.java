package org.usfirst.frc.team319.canifier;

import com.ctre.phoenix.CANifier;
import com.ctre.phoenix.ILoopable;

public class TaskLIDAR_ControlLEDStrip implements ILoopable {
	/* ILoopable */
	public void onStart() {

	}

	public void onStop() {

	}

	public boolean isDone() {
		return false;
	}

	public void onLoop() {
		/* PWM values from TaskMeasurePulseSensors */
		float pulse = (float) Tasks.taskMeasurePulseSensors.getMeasuredPulseWidthsUs(CANifier.PWMChannel.PWMChannel3);

		/* Scale [0,8000] us to [0,360] Hue in Degrees */
		float hue = LinearInterpolation.calculate(pulse, 0f, 0f, 8000f, 360f);

		/* Update LEDStrip with LIDAR */
		Tasks.taskHSV_ControlLedStrip.Hue = hue;
		Tasks.taskHSV_ControlLedStrip.Saturation = 1;
		Tasks.taskHSV_ControlLedStrip.Value = 0.05f; /*
														 * hard-code the brightness
														 */
	}
}
