package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class RightNullZoneBackUpToScaleArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (25.13,5.29,89.99)
	// (25.13,6.79,89.99)
	
    public RightNullZoneBackUpToScaleArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public RightNullZoneBackUpToScaleArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.568,-11.351,10.000,89.990},
				{-2.838,-34.054,10.000,89.990},
				{-7.946,-68.108,10.000,89.990},
				{-17.027,-113.513,10.000,89.990},
				{-31.216,-170.269,10.000,89.990},
				{-51.648,-238.376,10.000,89.990},
				{-79.459,-317.835,10.000,89.990},
				{-115.783,-408.645,10.000,89.990},
				{-161.755,-510.806,10.000,89.990},
				{-218.512,-624.319,10.000,89.990},
				{-287.187,-749.183,10.000,89.990},
				{-368.916,-885.398,10.000,89.990},
				{-464.834,-1032.964,10.000,89.990},
				{-576.076,-1191.882,10.000,89.990},
				{-703.778,-1362.150,10.000,89.990},
				{-849.074,-1543.770,10.000,89.990},
				{-1013.099,-1736.742,10.000,89.990},
				{-1196.422,-1929.713,10.000,89.990},
				{-1399.042,-2122.684,10.000,89.991},
				{-1620.959,-2315.656,10.000,89.991},
				{-1862.173,-2508.627,10.000,89.991},
				{-2122.684,-2701.598,10.000,89.991},
				{-2402.493,-2894.569,10.000,89.992},
				{-2701.598,-3087.541,10.000,89.992},
				{-3020.001,-3280.512,10.000,89.993},
				{-3357.701,-3473.483,10.000,89.993},
				{-3714.697,-3666.455,10.000,89.994},
				{-4090.992,-3859.426,10.000,89.994},
				{-4486.583,-4052.397,10.000,89.995},
				{-4901.471,-4245.369,10.000,89.996},
				{-5335.656,-4438.340,10.000,89.997},
				{-5789.139,-4631.311,10.000,89.997},
				{-6261.351,-4812.931,10.000,89.998},
				{-6751.158,-4983.200,10.000,89.999},
				{-7257.423,-5142.118,10.000,90.000},
				{-7779.014,-5289.684,10.000,90.001},
				{-8314.793,-5425.899,10.000,90.002},
				{-8863.626,-5550.763,10.000,90.003},
				{-9424.378,-5664.275,10.000,90.004},
				{-9995.913,-5766.436,10.000,90.005},
				{-10577.097,-5857.246,10.000,90.006},
				{-11166.795,-5936.705,10.000,90.007},
				{-11763.871,-6004.813,10.000,90.007},
				{-12367.190,-6061.569,10.000,90.008},
				{-12975.617,-6106.974,10.000,90.008},
				{-13588.017,-6141.028,10.000,90.008},
				{-14203.255,-6163.730,10.000,90.009},
				{-14820.167,-6174.509,10.000,90.009},
				{-15437.022,-6162.585,10.000,90.009},
				{-16052.116,-6139.310,10.000,90.008},
				{-16664.316,-6104.683,10.000,90.008},
				{-17272.486,-6058.706,10.000,90.008},
				{-17875.490,-6001.377,10.000,90.007},
				{-18472.193,-5932.696,10.000,90.007},
				{-19061.461,-5852.665,10.000,90.006},
				{-19642.159,-5761.282,10.000,90.005},
				{-20213.150,-5658.548,10.000,90.004},
				{-20773.301,-5544.463,10.000,90.003},
				{-21321.475,-5419.027,10.000,90.002},
				{-21856.539,-5282.239,10.000,90.001},
				{-22377.355,-5134.100,10.000,90.000},
				{-22882.791,-4974.610,10.000,89.999},
				{-23371.710,-4803.768,10.000,89.998},
				{-23842.977,-4621.575,10.000,89.997},
				{-24295.486,-4428.604,10.000,89.997},
				{-24728.698,-4235.633,10.000,89.996},
				{-25142.612,-4042.661,10.000,89.995},
				{-25537.230,-3849.690,10.000,89.994},
				{-25912.551,-3656.719,10.000,89.994},
				{-26268.574,-3463.748,10.000,89.993},
				{-26605.300,-3270.776,10.000,89.992},
				{-26922.729,-3077.805,10.000,89.992},
				{-27220.861,-2884.834,10.000,89.992},
				{-27499.696,-2691.862,10.000,89.991},
				{-27759.233,-2498.891,10.000,89.991},
				{-27999.474,-2305.920,10.000,89.991},
				{-28220.417,-2112.948,10.000,89.991},
				{-28422.064,-1919.977,10.000,89.990},
				{-28604.413,-1727.006,10.000,89.990},
				{-28767.494,-1534.607,10.000,89.990},
				{-28911.902,-1353.560,10.000,89.990},
				{-29038.773,-1183.864,10.000,89.990},
				{-29149.242,-1025.519,10.000,89.990},
				{-29244.444,-878.525,10.000,89.990},
				{-29325.515,-742.883,10.000,89.990},
				{-29393.589,-618.592,10.000,89.990},
				{-29449.801,-505.652,10.000,89.990},
				{-29495.287,-404.064,10.000,89.990},
				{-29531.181,-313.826,10.000,89.990},
				{-29558.619,-234.940,10.000,89.990},
				{-29578.737,-167.405,10.000,89.990},
				{-29592.668,-111.222,10.000,89.990},
				{-29601.549,-66.389,10.000,89.990},
				{-29606.513,-32.908,10.000,89.990},
				{-29608.698,-10.779,10.000,89.990},
				{-29609.237,-0.000,10.000,89.990},
				{-29609.237,-0.000,10.000,89.990}		};

}