/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team319.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Ultrasonic;

import org.usfirst.frc.team319.models.GameState;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;
import org.usfirst.frc.team319.robot.commands.autonomous.CenterAuto;
import org.usfirst.frc.team319.robot.commands.autonomous.CenterToSwitchAuto;
import org.usfirst.frc.team319.robot.commands.autonomous.DefaultAuto;
import org.usfirst.frc.team319.robot.commands.autonomous.LeftAuto;
import org.usfirst.frc.team319.robot.commands.autonomous.LeftAutoTest;
import org.usfirst.frc.team319.robot.subsystems.Climber;
import org.usfirst.frc.team319.robot.subsystems.CubeCollector;
import org.usfirst.frc.team319.robot.subsystems.Drivetrain;
import org.usfirst.frc.team319.robot.subsystems.Elevator;
import org.usfirst.frc.team319.robot.subsystems.Pneumatics;
import org.usfirst.frc.team319.robot.subsystems.Wrist;

import com.ctre.phoenix.motorcontrol.ControlMode;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends TimedRobot {
	
	Command autonomousCommand;
	SendableChooser<String> autoChooser;
	
	public GameState gameState;
	
	public static final CubeCollector cubeCollector = new CubeCollector();
	public static final Drivetrain drivetrain = new Drivetrain();
	public static final Pneumatics pneumatics = new Pneumatics();
	public static final Elevator elevator = new Elevator();
	public static final Wrist wrist = new Wrist();
	//public static final Climber climber = new Climber();
	public static OI oi;
	

	//SendableChooser<Command> m_chooser = new SendableChooser<>();

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		
		 
		oi = new OI();
		this.drivetrain.setDrivetrainPositionToZero();		
	 
        autoChooser = new SendableChooser<String>();
        autoChooser.addDefault("Center Auto", "CenterAuto");
        autoChooser.addObject("Left Auto", "LeftAuto");
		//autoChooser.addDefault("Default", new DefaultAuto());
		//autoChooser.addObject("Center", new CenterToSwitchAuto());
		//autoChooser.addObject("Left", new LeftAutoTest());
		//autoChooser.addObject("Right", new RightAuto());
		//autoChooser.addObject("Test", new FollowTrajectory("OneFoot"));

		SmartDashboard.putData("Autonomous Chooser", autoChooser);
		//drivetrain = new Drivetrain();
		//m_chooser.addDefault("Default Auto", new ExampleCommand());
		// chooser.addObject("My Auto", new MyAutoCommand());
	 

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	}
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		this.gameState = new GameState(DriverStation.getInstance().getGameSpecificMessage());
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * <p>You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		//m_autonomousCommand = m_chooser.getSelected();

		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */
		//SmartDashboard.putData("Auto mode", m_chooser);
		String selectedAuto = (String)autoChooser.getSelected();
		switch (selectedAuto) {
		case "CenterAuto": 
			autonomousCommand = new CenterAuto(gameState);
			 break;
		case "LeftAuto":
			autonomousCommand = new LeftAuto(gameState);
		default:
			autonomousCommand = new FollowTrajectory("CrossTheLine");
			break; 
		}

		// schedule the autonomous command (example)
		if (autonomousCommand != null) {
			autonomousCommand.start();
		}
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		System.out.println("left drive position" +Robot.drivetrain.getLeftDriveLeadDistance());
		System.out.println(" right drive position"+ Robot.drivetrain.getRightDriveLeadDistance());
		
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (autonomousCommand != null) {
			autonomousCommand.cancel();
		}
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		
		//System.out.println("Wrist Error " + this.wrist.wristMotor.getClosedLoopError(0));
		SmartDashboard.putNumber("Dpad value: ", this.oi.driverController.getPOV());
		SmartDashboard.putNumber("Operator Left Stick Y", this.oi.operatorController.leftStick.getY());
		SmartDashboard.putNumber("Driver Left Stick Y", this.oi.driverController.leftStick.getY());
		
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}
