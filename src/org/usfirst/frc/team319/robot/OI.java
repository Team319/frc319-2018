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
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToDunkPosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToHomePosition;
import org.usfirst.frc.team319.robot.commands.elevator.ElevatorGoToSwitchPosition;
import org.usfirst.frc.team319.robot.commands.pneumatics.CollectorToggle;
import org.usfirst.frc.team319.robot.commands.pneumatics.DrivetrainShiftToggle;
import org.usfirst.frc.team319.robot.commands.pneumatics.ElevatorShiftToggle;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoHome;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToCollectCube;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToDunk;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToExchange;
import org.usfirst.frc.team319.robot.commands.wrist.WristGoToSwitch;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static BobXboxController driverController;
	public static BobXboxController operatorController;

	public OI() {

		driverController = new BobXboxController(0, 0.10, 0.08);

		driverController.rightBumper.whenPressed(new AutoCollectCubeOpened());
		driverController.leftBumper.whenPressed(new AutoCollectCubeClosed());
		driverController.rightTriggerButton.whenPressed(new CollectorToggle());
		driverController.leftTriggerButton.whileHeld(new CubeCollectorSpit());
		driverController.bButton.whenPressed(new CubeCollectorStop());
		driverController.startButton.whenPressed(new DrivetrainBrakeMode());
		driverController.leftStickButton.whenPressed(new DrivetrainShiftToggle());

		// this.driverController.xButton.whenPressed(new FollowTrajectory(new
		// FiveFeetAndTurn()));

		operatorController = new BobXboxController(1, 0.08, 0.08);

		operatorController.leftBumper.whenPressed(new WristGoHome());
		operatorController.rightBumper.whenPressed(new WristGoToCollectCube());
		operatorController.aButton.whenPressed(new WristGoToExchange());
		operatorController.xButton.whenPressed(new WristGoToSwitch());
		operatorController.yButton.whenPressed(new WristGoToDunk());
		operatorController.startButton.whenPressed(new ElevatorShiftToggle());
		
		operatorController.Dpad.Up.whenPressed(new ElevatorGoToDunkPosition());
		operatorController.Dpad.Left.whenPressed(new ElevatorGoToSwitchPosition());
		operatorController.Dpad.Down.whenPressed(new ElevatorGoToHomePosition());
		// this.operatorController.xButton.whenPressed(new ElevatorMotionMagicTest());
		// this.operatorController.bButton.whenPressed(new ElevatorGoToHomePosition());

		// ---------------test buttons-------------------//

		// this.driverController.xButton.whenPressed(new RightSideScaleAuto());
		// this.driverController.xButton.whenPressed(new RightSideLeftSwitchRightScale());
		// this.driverController.aButton.whenPressed(new CubeCollectorLeftSideSpit());

	}
}
