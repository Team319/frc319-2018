/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team319.robot;

import org.usfirst.frc.team319.models.BobController;
//import org.usfirst.frc.team319.robot.commands.AutoDriveForwardThreeFeet;
import org.usfirst.frc.team319.robot.commands.AutoTuneVelocity;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorCollectAtSpeed;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorSpit;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorStop;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorStraighten;
import org.usfirst.frc.team319.robot.commands.cubecollector.CubeCollectorTest;
import org.usfirst.frc.team319.robot.commands.FollowTrajectory;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public BobController driverController;
	public BobController operatorController;
	
	public OI() {	
		this.driverController = new BobController(0);
		
		driverController.rightTriggerButton.whileHeld(new CubeCollectorCollectAtSpeed());
		driverController.leftTriggerButton.whileHeld(new CubeCollectorSpit());
		driverController.bButton.whenPressed(new CubeCollectorStop());
		driverController.xButton.whenPressed(new CubeCollectorStraighten());
		
		this.operatorController  = new BobController(1);
		
		//operatorController.aButton.whenPressed(new FollowTrajectory("CenterToRightSwitch"));
		//operatorController.bButton.whenPressed(new FollowTrajectory("CenterToRightSwitchPt2"));
		//operatorController.xButton.whenPressed(new FollowTrajectory("CenterToRightSwitchPt3"));
		operatorController.rightTriggerButton.whenPressed(new AutoTuneVelocity(Robot.cubeCollector.collectorLeftMotor, Robot.cubeCollector.COLLECTOR_PROFILE, 1000, 50));
	
	}
}
