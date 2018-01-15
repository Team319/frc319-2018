/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team319.robot;

import org.usfirst.frc.team319.models.BobController;
import org.usfirst.frc.team319.robot.commands.AutoDriveForwardThreeFeet;
import org.usfirst.frc.team319.robot.commands.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.CubeCollectorStop;
import org.usfirst.frc.team319.robot.commands.CubeCollectorTest;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public BobController driverController;
	
	public OI() {	
		this.driverController = new BobController(0);
		
		driverController.rightTriggerButton.whileHeld(new CubeCollectorTest());
		driverController.leftTriggerButton.whileHeld(new CubeCollectorSpit());
		driverController.aButton.whenPressed(new CubeCollectorTest());
		driverController.bButton.whenPressed(new CubeCollectorStop());
		//driverController.leftBumper.whenPressed(new AutoDriveForwardThreeFeet());
	}
}
