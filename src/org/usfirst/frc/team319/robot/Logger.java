package org.usfirst.frc.team319.robot;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * 
 * @author Based on 1114 - 2015 code
 */
public class Logger {

	private BufferedWriter writer;
	private boolean logging = true;
	private final String loggerBoolean = "Logging";
	private static Logger instance;
	private String fileName = "log";
	private final String SDFileName = "File Name: ";
	DriverStation ds;

	private int max = 0;

	private String path;

	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}

	private Logger() {
		this.ds = DriverStation.getInstance();
		SmartDashboard.putBoolean(this.loggerBoolean, this.logging);
		this.logging = SmartDashboard.getBoolean(this.loggerBoolean, false);
		SmartDashboard.putString(this.SDFileName, this.fileName);
		this.fileName = SmartDashboard.getString(SDFileName, null);
		File f = new File("/home/lvuser/logs");
		if (!f.exists()) {
			System.out.println("/logs did not exist!");
			System.out.println(f.mkdir());
		} else {
			System.out.println("/logs exists!");
		}

		File[] files = new File("/home/lvuser/logs").listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isFile()) {
					// System.out.println(file.getName());
					try {
						int index = Integer.parseInt(file.getName().split("_")[0]);
						if (index > max) {
							max = index;
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		} else {
			max = 0;
		}
	}

	public void openFile() {
		if (this.wantToLog() || this.ds.isFMSAttached()) {
			try {
				path = this.getPath();
				this.writer = new BufferedWriter(new FileWriter(path));
				this.writer.write("time,leftleadcurrent_A,rightleadcurrent_A\n");
				// this.writer.write("Time, Battery Voltage, Brownout Stage 1, Brownout Stage 2,
				// left Lead Current, Left 1 Current, Left 2 Current, Left 3 Current, Right Lead
				// Current, Right 5 Current, Right 6 Current, Right 7 Current, Left Lead
				// Voltage, Left 1 Voltage. Left 2 Voltage, Left 3 Voltage, Right Lead Voltage,
				// Right 5 Voltage, Right 6 Voltage, Right 7 Voltage, pdp Current 0, pdp Current
				// 1, pdp Current 2, pdp Current 3, pdp Current 12, pdp Current 13, pdp Current
				// 14, pdp Current 15, left Y Throttle, right X Throttle, Left Speed, Right
				// Speed");
				// this.writer.newLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private String getPath() {
		this.fileName = SmartDashboard.getString(SDFileName, null);
		if (this.ds.isFMSAttached()) {
			return String.format("/home/lvuser/logs/%d_%s_%d_log.csv", ++this.max, this.ds.getAlliance().name(),
					this.ds.getLocation());
		} else if (this.fileName != null) {
			return String.format("/home/lvuser/logs/%d_%s.csv", ++this.max, this.fileName);
		} else {
			return String.format("/home/lvuser/logs/%d_log.csv", ++this.max);
		}
	}

	public void logAll() {
		if (this.wantToLog()) {
			try {

				// stringbuilder option
				StringBuilder sb = new StringBuilder();
				sb.append(String.format("%f,", Timer.getFPGATimestamp()));

				// sb.append(String.format("%f,",
				// Robot.drivetrain.getTalonDirectionalCurrent(Robot.drivetrain.getLeftLeadTalon())));
				// sb.append(String.format("%f,",
				// Robot.drivetrain.getTalonDirectionalCurrent(Robot.drivetrain.getLeft1Talon())));
				// sb.append(String.format("%f,",
				// Robot.drivetrain.getTalonDirectionalCurrent(Robot.drivetrain.getLeft2Talon())));
				// sb.append(String.format("%f,",
				// Robot.drivetrain.getTalonDirectionalCurrent(Robot.drivetrain.getLeft3Talon())));

				// sb.append(String.format("%f,", Robot.drivetrain.getLeftLeadVoltage();
				// sb.append(String.format("%f,",
				// Robot.drivetrain.getTalonVoltage(Robot.drivetrain.getLeft1Talon())));
				// sb.append(String.format("%f,",
				// Robot.drivetrain.getTalonVoltage(Robot.drivetrain.getLeft2Talon())));
				// sb.append(String.format("%f,",
				// Robot.drivetrain.getTalonVoltage(Robot.drivetrain.getLeft3Talon())));

				sb.append(String.format("%f,", Robot.oi.driverController.leftStick.getY()));
				sb.append(String.format("%f,", Robot.drivetrain.getLeftDriveLeadVelocity()));

				// sb.append(String.format("%f,",
				// Robot.drivetrain.getTalonDirectionalCurrent(Robot.drivetrain.getRightLeadTalon())));
				// sb.append(String.format("%f,",
				// Robot.drivetrain.getTalonDirectionalCurrent(Robot.drivetrain.getRight1Talon())));
				// sb.append(String.format("%f,",
				// Robot.drivetrain.getTalonDirectionalCurrent(Robot.drivetrain.getRight2Talon())));
				// sb.append(String.format("%f,",
				// Robot.drivetrain.getTalonDirectionalCurrent(Robot.drivetrain.getRight3Talon())));
				// --/\---------fix all of these---------------/\--//

				sb.append(String.format("%f,", Robot.drivetrain.getRightLeadVoltage()));
				// sb.append(String.format("%f,", Robot.drivetrain.getRight5Voltage()));
				// sb.append(String.format("%f,", Robot.drivetrain.getRight6Voltage()));
				// sb.append(String.format("%f,", Robot.drivetrain.getRight7Voltage()));

				sb.append(String.format("%f,", Robot.oi.driverController.rightStick.getX()));
				sb.append(String.format("%f,", Robot.drivetrain.getRightDriveLeadVelocity()));

				// sb.append(String.format("%f,", Robot.drivetrain.getpdp0Current())); // talon
				// sb.append(String.format("%f,", Robot.drivetrain.getpdp1Current())); // talon
				// 1
				// sb.append(String.format("%f,", Robot.drivetrain.getpdp2Current())); // talon
				// 2
				// sb.append(String.format("%f,", Robot.drivetrain.getpdp3Current())); // talon
				// 3
				// sb.append(String.format("%f,", Robot.drivetrain.getpdp11Current())); // talon
				// 9
				// sb.append(String.format("%f,", Robot.drivetrain.getpdp12Current())); //talon
				// 8
				// sb.append(String.format("%f,", Robot.drivetrain.getpdp13Current())); // talon
				// 7
				// sb.append(String.format("%f\n", Robot.drivetrain.getpdp14Current())); //
				// talon 6

				this.writer.write(sb.toString());

				// buffered writer option
				/*
				 * this.writer.append(String.format("%f,",
				 * Robot.drivetrain.getLeftLeadCurrent())); /*this.writer.flush();
				 * 
				 * 
				 * //worst option /* this.writer.write(String.format("%f,",
				 * Timer.getFPGATimestamp()));
				 * 
				 * //Voltage, Currents, Brownout States, Motor Speed Settings, 775 Pro
				 * enable/disable
				 * 
				 * //Battery Voltage this.writer.write(String.format("%f",
				 * RobotMap.pdp.getVoltage()));
				 * 
				 * //Brownout States //this.writer.write(String.format("%.3f,",
				 * ControllerPower.getEnabled6V())); //this.writer.write(String.format("%.3f,",
				 * ControllerPower.getEnabled5V()));
				 * 
				 * this.writer.write(String.format("%f,",
				 * Robot.drivetrain.getLeftLeadCurrent()));
				 * this.writer.write(String.format("%f,", Robot.drivetrain.getLeft1Current()));
				 * this.writer.write(String.format("%f,", Robot.drivetrain.getLeft2Current()));
				 * this.writer.write(String.format("%f,", Robot.drivetrain.getLeft3Current()));
				 * this.writer.write(String.format("%f,",
				 * Robot.drivetrain.getRightLeadCurrent()));
				 * this.writer.write(String.format("%f,", Robot.drivetrain.getRight5Current()));
				 * this.writer.write(String.format("%f,", Robot.drivetrain.getRight6Current()));
				 * this.writer.write(String.format("%f,", Robot.drivetrain.getRight7Current()));
				 * this.writer.write(String.format("%f,",
				 * Robot.drivetrain.getLeftLeadVoltage()));
				 * this.writer.write(String.format("%f,", Robot.drivetrain.getLeft1Voltage()));
				 * this.writer.write(String.format("%f,", Robot.drivetrain.getLeft2Voltage()));
				 * this.writer.write(String.format("%f,", Robot.drivetrain.getLeft3Voltage()));
				 * this.writer.write(String.format("%f,",
				 * Robot.drivetrain.getRightLeadVoltage()));
				 * this.writer.write(String.format("%f,", Robot.drivetrain.getRight5Voltage()));
				 * this.writer.write(String.format("%f,", Robot.drivetrain.getRight6Voltage()));
				 * this.writer.write(String.format("%f,", Robot.drivetrain.getRight7Voltage()));
				 * this.writer.write(String.format("%f,", Robot.drivetrain.getpdp0Current()));
				 * this.writer.write(String.format("%f,", Robot.drivetrain.getpdp1Current()));
				 * this.writer.write(String.format("%f,", Robot.drivetrain.getpdp2Current()));
				 * this.writer.write(String.format("%f,", Robot.drivetrain.getpdp3Current()));
				 * this.writer.write(String.format("%f,", Robot.drivetrain.getpdp12Current()));
				 * this.writer.write(String.format("%f,", Robot.drivetrain.getpdp13Current()));
				 * this.writer.write(String.format("%f,", Robot.drivetrain.getpdp14Current()));
				 * this.writer.write(String.format("%f,", Robot.drivetrain.getpdp15Current()));
				 * this.writer.write(String.format("%f,",
				 * Robot.oi.driverController.getLeftStickY()));
				 * this.writer.write(String.format("%f,",
				 * Robot.oi.driverController.getRightStickX()));
				 * this.writer.write(String.format("%f,",
				 * Robot.drivetrain.getLeftDriveVelocity()));
				 * this.writer.write(String.format("%f",
				 * Robot.drivetrain.getRightDriveVelocity())); this.writer.newLine();
				 */
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean wantToLog() {
		this.logging = SmartDashboard.getBoolean(this.loggerBoolean, false);
		return this.logging;
	}

	public void turnLoggingOn() {
		this.logging = true;
		SmartDashboard.putBoolean(this.loggerBoolean, this.logging);
	}

	public void turnLoggingOff() {
		this.logging = false;
		SmartDashboard.putBoolean(this.loggerBoolean, this.logging);
	}

	public void close() {
		if (this.wantToLog()) {
			if (this.writer != null) {
				try {
					this.writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
