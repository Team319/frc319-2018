package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class ThreeFeetArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (3.00,0.00,0.00)
	
    public ThreeFeetArc() {
		super();
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public ThreeFeetArc(boolean flipped) {
		super();
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	double[][] centerPoints = {
				{0.153,3.057,10.000,0.000},
				{0.764,6.115,10.000,0.000},
				{2.140,13.758,10.000,0.000},
				{4.586,24.459,10.000,0.000},
				{8.408,38.217,10.000,0.000},
				{13.911,55.033,10.000,0.000},
				{21.402,74.906,10.000,0.000},
				{31.185,97.836,10.000,0.000},
				{43.568,123.824,10.000,0.000},
				{58.855,152.869,10.000,0.000},
				{77.199,183.443,10.000,0.000},
				{98.601,214.017,10.000,0.000},
				{123.060,244.591,10.000,0.000},
				{150.576,275.165,10.000,0.000},
				{181.150,305.739,10.000,0.000},
				{214.781,336.313,10.000,0.000},
				{251.470,366.886,10.000,0.000},
				{291.216,397.460,10.000,0.000},
				{334.020,428.034,10.000,0.000},
				{379.880,458.608,10.000,0.000},
				{428.799,489.182,10.000,0.000},
				{480.774,519.756,10.000,0.000},
				{535.807,550.330,10.000,0.000},
				{593.897,580.904,10.000,0.000},
				{655.045,611.477,10.000,0.000},
				{719.250,642.051,10.000,0.000},
				{786.513,672.625,10.000,0.000},
				{856.833,703.199,10.000,0.000},
				{930.210,733.773,10.000,0.000},
				{1006.645,764.347,10.000,0.000},
				{1086.137,794.921,10.000,0.000},
				{1168.686,825.495,10.000,0.000},
				{1254.293,856.068,10.000,0.000},
				{1342.957,886.642,10.000,0.000},
				{1434.679,917.216,10.000,0.000},
				{1529.458,947.790,10.000,0.000},
				{1627.294,978.364,10.000,0.000},
				{1728.188,1008.938,10.000,0.000},
				{1832.139,1039.512,10.000,0.000},
				{1939.148,1070.086,10.000,0.000},
				{2049.214,1100.659,10.000,0.000},
				{2162.337,1131.233,10.000,0.000},
				{2278.518,1161.807,10.000,0.000},
				{2397.756,1192.381,10.000,0.000},
				{2520.051,1222.955,10.000,0.000},
				{2645.404,1253.529,10.000,0.000},
				{2773.814,1284.103,10.000,0.000},
				{2905.282,1314.676,10.000,0.000},
				{3039.807,1345.250,10.000,0.000},
				{3177.390,1375.824,10.000,0.000},
				{3318.029,1406.398,10.000,0.000},
				{3461.727,1436.972,10.000,0.000},
				{3608.481,1467.546,10.000,0.000},
				{3758.293,1498.120,10.000,0.000},
				{3911.163,1528.694,10.000,0.000},
				{4067.089,1559.267,10.000,0.000},
				{4226.073,1589.841,10.000,0.000},
				{4388.115,1620.415,10.000,0.000},
				{4553.214,1650.989,10.000,0.000},
				{4721.370,1681.563,10.000,0.000},
				{4892.584,1712.137,10.000,0.000},
				{5066.855,1742.711,10.000,0.000},
				{5244.183,1773.285,10.000,0.000},
				{5424.569,1803.858,10.000,0.000},
				{5608.012,1834.432,10.000,0.000},
				{5794.513,1865.006,10.000,0.000},
				{5983.918,1894.051,10.000,0.000},
				{6175.922,1920.039,10.000,0.000},
				{6370.219,1942.970,10.000,0.000},
				{6566.503,1962.843,10.000,0.000},
				{6764.469,1979.658,10.000,0.000},
				{6963.811,1993.416,10.000,0.000},
				{7164.222,2004.117,10.000,0.000},
				{7365.398,2011.761,10.000,0.000},
				{7567.033,2016.347,10.000,0.000},
				{7768.803,2017.703,10.000,0.000},
				{7970.386,2015.830,10.000,0.000},
				{8171.476,2010.899,10.000,0.000},
				{8371.767,2002.911,10.000,0.000},
				{8570.954,1991.865,10.000,0.000},
				{8768.730,1977.762,10.000,0.000},
				{8964.790,1960.602,10.000,0.000},
				{9158.829,1940.384,10.000,0.000},
				{9350.539,1917.109,10.000,0.000},
				{9539.617,1890.776,10.000,0.000},
				{9725.773,1861.558,10.000,0.000},
				{9908.871,1830.985,10.000,0.000},
				{10088.912,1800.411,10.000,0.000},
				{10265.896,1769.837,10.000,0.000},
				{10439.822,1739.263,10.000,0.000},
				{10610.691,1708.689,10.000,0.000},
				{10778.503,1678.115,10.000,0.000},
				{10943.257,1647.541,10.000,0.000},
				{11104.954,1616.968,10.000,0.000},
				{11263.593,1586.394,10.000,0.000},
				{11419.175,1555.820,10.000,0.000},
				{11571.700,1525.246,10.000,0.000},
				{11721.167,1494.672,10.000,0.000},
				{11867.577,1464.098,10.000,0.000},
				{12010.929,1433.524,10.000,0.000},
				{12151.224,1402.950,10.000,0.000},
				{12288.462,1372.377,10.000,0.000},
				{12422.642,1341.803,10.000,0.000},
				{12553.765,1311.229,10.000,0.000},
				{12681.830,1280.655,10.000,0.000},
				{12806.839,1250.081,10.000,0.000},
				{12928.789,1219.507,10.000,0.000},
				{13047.683,1188.933,10.000,0.000},
				{13163.519,1158.359,10.000,0.000},
				{13276.297,1127.786,10.000,0.000},
				{13386.018,1097.212,10.000,0.000},
				{13492.682,1066.638,10.000,0.000},
				{13596.288,1036.064,10.000,0.000},
				{13696.837,1005.490,10.000,0.000},
				{13794.329,974.916,10.000,0.000},
				{13888.763,944.342,10.000,0.000},
				{13980.140,913.768,10.000,0.000},
				{14068.460,883.195,10.000,0.000},
				{14153.722,852.621,10.000,0.000},
				{14235.926,822.047,10.000,0.000},
				{14315.074,791.473,10.000,0.000},
				{14391.164,760.899,10.000,0.000},
				{14464.196,730.325,10.000,0.000},
				{14534.171,699.751,10.000,0.000},
				{14601.089,669.177,10.000,0.000},
				{14664.949,638.604,10.000,0.000},
				{14725.752,608.030,10.000,0.000},
				{14783.498,577.456,10.000,0.000},
				{14838.186,546.882,10.000,0.000},
				{14889.817,516.308,10.000,0.000},
				{14938.390,485.734,10.000,0.000},
				{14983.906,455.160,10.000,0.000},
				{15026.365,424.587,10.000,0.000},
				{15065.766,394.013,10.000,0.000},
				{15102.110,363.439,10.000,0.000},
				{15135.397,332.865,10.000,0.000},
				{15165.626,302.291,10.000,0.000},
				{15192.798,271.717,10.000,0.000},
				{15216.912,241.143,10.000,0.000},
				{15237.969,210.569,10.000,0.000},
				{15255.968,179.996,10.000,0.000},
				{15270.928,149.594,10.000,0.000},
				{15283.017,120.894,10.000,0.000},
				{15292.542,95.251,10.000,0.000},
				{15299.809,72.665,10.000,0.000},
				{15305.122,53.137,10.000,0.000},
				{15308.789,36.666,10.000,0.000},
				{15311.114,23.252,10.000,0.000},
				{15312.404,12.896,10.000,0.000},
				{15312.964,5.598,10.000,0.000},
				{15313.099,1.356,10.000,0.000},
				{15313.099,0.000,10.000,0.000}		};

}