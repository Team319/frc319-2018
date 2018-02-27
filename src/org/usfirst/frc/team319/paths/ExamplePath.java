package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class ExamplePath extends SrxTrajectory {

	// WAYPOINTS:
	// (X,Y,degrees)
	// (0,0,0)
	// (10,0,0)

	public ExamplePath() {
		super();

		double[][] leftPoints = { { 0, 0, 0 }, { 0, 0, 0 } };

		double[][] rightPoints = { { 0, 0, 0 }, { 0, 0, 0 } };

		this.leftProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
		this.rightProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
	}

}
