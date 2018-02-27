/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team319.robot;

import org.usfirst.frc.team319.controllers.BobXboxController;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeClosed;
import org.usfirst.frc.team319.robot.commands.AutoCollectCubeOpened;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorStop;
import org.usfirst.frc.team319.robot.commands.drivetrain.DrivetrainBrakeMode;
import org.usfirst.frc.team319.robot.commands.pneumatics.CollectorToggle;
import org.usfirst.frc.team319.robot.commands.pneumatics.DrivetrainShiftToggle;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoHome;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToCollectCube;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToDunk;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToExchange;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

import org.usfirst.frc.team319.robot.commands.autonomous_paths.RightSideLeftSwitchRightScale;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public BobXboxController driverController;
	public BobXboxController operatorController;

	public OI() {

		this.driverController = new BobXboxController(0, 0.10, 0.08);

		this.driverController.rightBumper.whenPressed(new AutoCollectCubeOpened());
		this.driverController.leftBumper.whenPressed(new AutoCollectCubeClosed());
		this.driverController.rightTriggerButton.whenPressed(new CollectorToggle());
		this.driverController.leftTriggerButton.whileHeld(new CubeCollectorSpit());
		this.driverController.bButton.whenPressed(new CubeCollectorStop());
		this.driverController.startButton.whenPressed(new DrivetrainBrakeMode());
		this.driverController.leftStickButton.whenPressed(new DrivetrainShiftToggle());

		// this.driverController.xButton.whenPressed(new FollowTrajectory(new
		// FiveFeetAndTurn()));

		this.operatorController = new BobXboxController(1, 0.08, 0.08);

		this.operatorController.leftBumper.whenPressed(new WristGoHome());
		this.operatorController.rightBumper.whenPressed(new WristGoToCollectCube());
		this.operatorController.aButton.whenPressed(new WristGoToExchange());
		this.operatorController.xButton.whenPressed(new WristGoToSwitch());
		this.operatorController.yButton.whenPressed(new WristGoToDunk());
		// this.operatorController.xButton.whenPressed(new ElevatorMotionMagicTest());
		// this.operatorController.bButton.whenPressed(new ElevatorGoToHomePosition());

		// ---------------test buttons-------------------//

		// this.driverController.xButton.whenPressed(new RightSideScaleAuto());
		// this.driverController.xButton.whenPressed(new RightSideLeftSwitchRightScale());
		// this.driverController.aButton.whenPressed(new CubeCollectorLeftSideSpit());

	}
}
