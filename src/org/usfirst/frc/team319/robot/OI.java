/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team319.robot;

import org.usfirst.frc.team319.controllers.BobXboxController;
import org.usfirst.frc.team319.models.BobController;
import org.usfirst.frc.team319.robot.commands.AutoTuneCollectorLeft;
import org.usfirst.frc.team319.robot.commands.AutoTuneCollectorRight;
import org.usfirst.frc.team319.robot.commands.AutoTuneDrivetrainLeft;
//import org.usfirst.frc.team319.robot.commands.AutoDriveForwardThreeFeet;
import org.usfirst.frc.team319.robot.commands.AutoTuneVelocity;
import org.usfirst.frc.team319.robot.commands.AutoTuneWrist;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorGoToPosition;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorGoToZero;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorMotionMagicTest;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorStop;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorStraighten;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorTest;
import org.usfirst.frc.team319.robot.commands.pneumantics.DrivetrainShiftToggle;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoHome;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToCollectCube;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;

import org.usfirst.frc.team319.robot.commands.FollowTrajectory;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public BobXboxController driverController;
	public BobXboxController operatorController;
	
	public OI() {	
		
		this.driverController = new BobXboxController(0);
		
		this.driverController.rightTriggerButton.whileHeld(new CubeCollectorTest());
		this.driverController.leftTriggerButton.whileHeld(new CubeCollectorSpit());
		this.driverController.bButton.whenPressed(new CubeCollectorStop());
		this.driverController.xButton.whenPressed(new CubeCollectorStraighten());
		this.driverController.rightBumper.whenPressed(new DrivetrainShiftToggle());
		this.driverController.Dpad.Up.whileHeld(new CubeCollectorTest());
		
		this.operatorController  = new BobXboxController(1);
		
		this.operatorController.rightTriggerButton.whenPressed(new CubeCollectorGoToPosition());
		this.operatorController.leftTriggerButton.whenPressed(new CubeCollectorGoToZero());
		operatorController.aButton.whenPressed(new WristGoHome());
		operatorController.bButton.whenPressed(new WristGoToCollectCube());
		//operatorController.xButton.whenPressed(new FollowTrajectory("CenterToRightSwitchPt3"));
		//operatorController.rightTriggerButton.whenPressed(new AutoTuneWrist());
		
	
	}
}
