package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class LeftWallToLeftSwitchPt2Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (18.63,24.15,30.00)
	// (20.63,25.15,60.00)
	
    public LeftWallToLeftSwitchPt2Arc() {
		super();
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public LeftWallToLeftSwitchPt2Arc(boolean flipped) {
		super();
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	double[][] centerPoints = {
				{0.436,8.719,10.000,0.000},
				{2.180,17.444,10.000,-0.000},
				{6.108,39.274,10.000,-0.000},
				{13.099,69.911,10.000,-0.000},
				{24.045,109.465,10.000,-0.000},
				{39.857,158.120,10.000,-0.001},
				{61.472,216.146,10.000,-0.002},
				{89.863,283.915,10.000,-0.004},
				{126.055,361.917,10.000,-0.007},
				{171.132,450.769,10.000,-0.013},
				{226.254,551.223,10.000,-0.022},
				{292.672,664.178,10.000,-0.037},
				{371.739,790.672,10.000,-0.058},
				{464.928,931.884,10.000,-0.089},
				{573.840,1089.126,10.000,-0.131},
				{700.223,1263.823,10.000,-0.190},
				{845.972,1457.492,10.000,-0.268},
				{1013.143,1671.713,10.000,-0.370},
				{1203.952,1908.087,10.000,-0.502},
				{1420.770,2168.185,10.000,-0.669},
				{1665.556,2447.853,10.000,-0.878},
				{1939.756,2742.007,10.000,-1.135},
				{2244.799,3050.429,10.000,-1.444},
				{2582.051,3372.517,10.000,-1.812},
				{2952.776,3707.248,10.000,-2.242},
				{3358.091,4053.150,10.000,-2.741},
				{3798.917,4408.267,10.000,-3.311},
				{4275.931,4770.135,10.000,-3.955},
				{4789.507,5135.762,10.000,-4.674},
				{5339.670,5501.626,10.000,-5.469},
				{5926.039,5863.696,10.000,-6.338},
				{6547.788,6217.491,10.000,-7.278},
				{7203.605,6558.163,10.000,-8.284},
				{7891.669,6880.641,10.000,-9.348},
				{8609.648,7179.796,10.000,-10.461},
				{9354.714,7450.652,10.000,-11.612},
				{10122.865,7681.511,10.000,-12.788},
				{10909.035,7861.701,10.000,-13.970},
				{11707.940,7989.052,10.000,-15.143},
				{12514.218,8062.775,10.000,-16.288},
				{13322.557,8083.398,10.000,-17.388},
				{14127.815,8052.580,10.000,-18.426},
				{14925.101,7972.853,10.000,-19.386},
				{15709.831,7847.303,10.000,-20.254},
				{16477.757,7679.261,10.000,-21.015},
				{17224.959,7472.016,10.000,-21.659},
				{17947.817,7228.583,10.000,-22.173},
				{18642.972,6951.548,10.000,-22.549},
				{19307.271,6642.988,10.000,-22.778},
				{19937.717,6304.460,10.000,-22.850},
				{20531.423,5937.069,10.000,-22.759},
				{21085.583,5541.596,10.000,-22.496},
				{21597.453,5118.704,10.000,-22.054},
				{22064.374,4669.202,10.000,-21.426},
				{22483.813,4194.392,10.000,-20.605},
				{22853.291,3694.786,10.000,-19.587},
				{23170.792,3175.010,10.000,-18.367},
				{23435.073,2642.803,10.000,-16.946},
				{23645.676,2106.033,10.000,-15.323},
				{23803.194,1575.183,10.000,-13.505},
				{23909.531,1063.366,10.000,-11.504},
				{23968.120,585.891,10.000,-9.335},
				{23984.047,159.268,10.000,-7.022},
				{24004.086,200.387,10.000,-4.596},
				{24052.012,479.263,10.000,-2.091},
				{24118.805,667.936,10.000,0.453},
				{24195.091,762.858,10.000,2.995},
				{24271.794,767.030,10.000,5.498},
				{24340.751,689.563,10.000,7.924},
				{24395.180,544.297,10.000,10.244},
				{24429.965,347.847,10.000,12.435},
				{24441.724,117.594,10.000,14.478},
				{24454.725,130.008,10.000,16.365},
				{24492.779,380.533,10.000,18.090},
				{24554.997,622.183,10.000,19.653},
				{24639.650,846.531,10.000,21.060},
				{24744.533,1048.835,10.000,22.318},
				{24867.188,1226.549,10.000,23.437},
				{25005.036,1378.473,10.000,24.427},
				{25155.480,1504.442,10.000,25.299},
				{25315.977,1604.974,10.000,26.062},
				{25484.078,1681.006,10.000,26.726},
				{25657.448,1733.706,10.000,27.301},
				{25833.883,1764.347,10.000,27.795},
				{26011.305,1774.221,10.000,28.216},
				{26187.765,1764.597,10.000,28.571},
				{26361.434,1736.695,10.000,28.870},
				{26530.602,1691.678,10.000,29.117},
				{26693.668,1630.661,10.000,29.319},
				{26849.140,1554.719,10.000,29.482},
				{26995.631,1464.903,10.000,29.613},
				{27132.121,1364.900,10.000,29.714},
				{27258.104,1259.838,10.000,29.793},
				{27373.350,1152.459,10.000,29.853},
				{27477.784,1044.336,10.000,29.898},
				{27571.474,936.899,10.000,29.931},
				{27654.618,831.440,10.000,29.954},
				{27727.530,729.121,10.000,29.971},
				{27790.627,630.972,10.000,29.982},
				{27844.417,537.902,10.000,29.989},
				{27889.487,450.697,10.000,29.994},
				{27926.490,370.029,10.000,29.997},
				{27956.136,296.458,10.000,29.998},
				{27979.180,230.444,10.000,29.999},
				{27996.415,172.352,10.000,30.000},
				{28008.661,122.462,10.000,30.000},
				{28016.759,80.980,10.000,30.000},
				{28021.564,48.048,10.000,30.000},
				{28023.940,23.756,10.000,30.000},
				{28024.755,8.154,10.000,30.000},
				{28024.882,1.265,10.000,30.000},
				{28024.882,0.000,10.000,30.000}		};

}