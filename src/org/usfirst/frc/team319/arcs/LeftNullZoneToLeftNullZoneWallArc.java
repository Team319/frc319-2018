package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class LeftNullZoneToLeftNullZoneWallArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (25.13,19.15,-89.99)
	// (25.13,20.15,-89.99)
	
    public LeftNullZoneToLeftNullZoneWallArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public LeftNullZoneToLeftNullZoneWallArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.419,8.371,10.000,90.010},
				{2.093,25.114,10.000,90.010},
				{5.860,50.227,10.000,90.010},
				{12.557,83.712,10.000,90.010},
				{23.021,125.569,10.000,90.010},
				{38.089,175.796,10.000,90.010},
				{58.599,234.395,10.000,90.010},
				{85.387,301.365,10.000,90.010},
				{119.290,376.706,10.000,90.010},
				{161.146,460.418,10.000,90.010},
				{211.792,552.502,10.000,90.010},
				{272.065,652.957,10.000,90.010},
				{342.802,761.783,10.000,90.010},
				{424.841,878.981,10.000,90.010},
				{518.599,996.178,10.000,90.010},
				{624.076,1113.375,10.000,90.010},
				{741.274,1230.573,10.000,90.009},
				{870.191,1347.770,10.000,90.009},
				{1010.828,1464.968,10.000,90.009},
				{1163.184,1582.165,10.000,90.008},
				{1327.261,1699.362,10.000,90.008},
				{1503.057,1816.560,10.000,90.008},
				{1690.573,1933.757,10.000,90.007},
				{1889.808,2050.955,10.000,90.006},
				{2100.763,2168.152,10.000,90.006},
				{2323.438,2285.349,10.000,90.005},
				{2557.833,2402.547,10.000,90.004},
				{2803.948,2519.744,10.000,90.003},
				{3061.782,2636.942,10.000,90.002},
				{3331.336,2754.139,10.000,90.001},
				{3612.191,2862.965,10.000,90.000},
				{3903.511,2963.420,10.000,89.999},
				{4204.457,3055.504,10.000,89.998},
				{4514.193,3139.216,10.000,89.997},
				{4831.881,3214.557,10.000,89.996},
				{5156.686,3281.527,10.000,89.995},
				{5487.768,3340.126,10.000,89.994},
				{5824.292,3390.353,10.000,89.993},
				{6165.420,3432.210,10.000,89.992},
				{6510.316,3465.695,10.000,89.992},
				{6858.141,3490.808,10.000,89.992},
				{7208.059,3507.551,10.000,89.991},
				{7559.084,3512.951,10.000,89.991},
				{7909.812,3501.608,10.000,89.991},
				{8258.987,3481.894,10.000,89.992},
				{8605.772,3453.809,10.000,89.992},
				{8949.330,3417.353,10.000,89.993},
				{9288.824,3372.525,10.000,89.993},
				{9623.417,3319.327,10.000,89.994},
				{9952.271,3257.757,10.000,89.995},
				{10274.549,3187.815,10.000,89.996},
				{10589.415,3109.503,10.000,89.997},
				{10896.031,3022.819,10.000,89.998},
				{11193.561,2927.764,10.000,89.999},
				{11481.166,2824.338,10.000,90.000},
				{11758.010,2712.540,10.000,90.001},
				{12023.404,2595.343,10.000,90.002},
				{12277.078,2478.146,10.000,90.003},
				{12519.033,2360.948,10.000,90.004},
				{12749.268,2243.751,10.000,90.005},
				{12967.783,2126.553,10.000,90.006},
				{13174.578,2009.356,10.000,90.007},
				{13369.654,1892.159,10.000,90.007},
				{13553.010,1774.961,10.000,90.008},
				{13724.646,1657.764,10.000,90.008},
				{13884.563,1540.566,10.000,90.009},
				{14032.760,1423.369,10.000,90.009},
				{14169.237,1306.172,10.000,90.009},
				{14293.994,1188.974,10.000,90.009},
				{14407.032,1071.777,10.000,90.010},
				{14508.349,954.579,10.000,90.010},
				{14597.947,837.382,10.000,90.010},
				{14675.974,723.156,10.000,90.010},
				{14742.997,617.301,10.000,90.010},
				{14799.853,519.817,10.000,90.010},
				{14847.379,430.705,10.000,90.010},
				{14886.413,349.964,10.000,90.010},
				{14917.791,277.594,10.000,90.010},
				{14942.350,213.596,10.000,90.010},
				{14960.928,157.968,10.000,90.010},
				{14974.362,110.712,10.000,90.010},
				{14983.489,71.827,10.000,90.010},
				{14989.146,41.313,10.000,90.010},
				{14992.170,19.171,10.000,90.010},
				{14993.399,5.400,10.000,90.010},
				{14993.669,0.000,10.000,90.010},
				{14993.669,0.000,10.000,90.010}		};

}