package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterToRightSwitchPt5Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (2.93,13.08,0.00)
	// (9.31,9.08,0.00)
	
    public CenterToRightSwitchPt5Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToRightSwitchPt5Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.445,8.895,10.000,0.000},
				{2.224,26.684,10.000,-0.000},
				{6.226,53.367,10.000,-0.000},
				{13.342,88.945,10.000,-0.000},
				{24.460,133.418,10.000,-0.000},
				{40.470,186.785,10.000,-0.000},
				{62.262,249.046,10.000,-0.000},
				{90.724,320.202,10.000,-0.000},
				{126.747,400.253,10.000,-0.001},
				{171.219,489.198,10.000,-0.001},
				{225.031,587.037,10.000,-0.002},
				{289.071,693.771,10.000,-0.004},
				{364.230,809.400,10.000,-0.006},
				{451.396,933.923,10.000,-0.009},
				{551.459,1067.341,10.000,-0.013},
				{665.309,1209.653,10.000,-0.020},
				{793.835,1360.859,10.000,-0.028},
				{937.926,1520.960,10.000,-0.039},
				{1098.471,1689.956,10.000,-0.053},
				{1276.361,1867.846,10.000,-0.071},
				{1472.041,2045.736,10.000,-0.095},
				{1685.509,2223.626,10.000,-0.124},
				{1916.766,2401.516,10.000,-0.160},
				{2165.812,2579.406,10.000,-0.203},
				{2432.647,2757.297,10.000,-0.256},
				{2717.271,2935.187,10.000,-0.318},
				{3019.684,3113.077,10.000,-0.391},
				{3339.887,3290.967,10.000,-0.477},
				{3677.878,3468.857,10.000,-0.576},
				{4033.658,3646.747,10.000,-0.691},
				{4407.227,3824.637,10.000,-0.821},
				{4798.586,4002.527,10.000,-0.970},
				{5207.733,4180.417,10.000,-1.139},
				{5634.669,4358.308,10.000,-1.329},
				{6079.394,4536.198,10.000,-1.541},
				{6541.909,4714.088,10.000,-1.779},
				{7022.212,4891.978,10.000,-2.043},
				{7520.304,5069.868,10.000,-2.336},
				{8036.185,5247.758,10.000,-2.659},
				{8569.856,5425.648,10.000,-3.016},
				{9121.315,5603.538,10.000,-3.407},
				{9690.563,5781.428,10.000,-3.836},
				{10277.601,5959.318,10.000,-4.305},
				{10882.427,6137.209,10.000,-4.816},
				{11505.042,6315.099,10.000,-5.372},
				{12145.447,6492.989,10.000,-5.977},
				{12803.640,6670.879,10.000,-6.631},
				{13479.623,6848.769,10.000,-7.339},
				{14173.394,7026.659,10.000,-8.104},
				{14884.954,7204.549,10.000,-8.927},
				{15613.859,7373.545,10.000,-9.812},
				{16359.219,7533.646,10.000,-10.760},
				{17120.143,7684.852,10.000,-11.772},
				{17895.744,7827.165,10.000,-12.849},
				{18685.132,7960.582,10.000,-13.990},
				{19487.416,8085.105,10.000,-15.196},
				{20301.708,8200.734,10.000,-16.465},
				{21127.118,8307.468,10.000,-17.795},
				{21962.757,8405.307,10.000,-19.182},
				{22807.735,8494.252,10.000,-20.623},
				{23661.163,8574.303,10.000,-22.113},
				{24522.151,8645.459,10.000,-23.646},
				{25389.810,8707.721,10.000,-25.215},
				{26263.250,8761.088,10.000,-26.812},
				{27141.582,8805.560,10.000,-28.430},
				{28023.917,8841.138,10.000,-30.058},
				{28909.365,8867.822,10.000,-31.689},
				{29797.037,8885.611,10.000,-33.312},
				{30686.043,8894.505,10.000,-34.920},
				{31575.493,8894.505,10.000,-36.503},
				{32464.944,8894.505,10.000,-38.054},
				{33354.394,8894.505,10.000,-39.569},
				{34243.845,8894.505,10.000,-41.040},
				{35133.295,8894.505,10.000,-42.466},
				{36022.746,8894.505,10.000,-43.841},
				{36912.196,8894.505,10.000,-45.163},
				{37801.647,8894.505,10.000,-46.430},
				{38691.097,8894.505,10.000,-47.640},
				{39580.548,8894.505,10.000,-48.793},
				{40469.998,8894.505,10.000,-49.888},
				{41359.449,8894.505,10.000,-50.924},
				{42248.899,8894.505,10.000,-51.903},
				{43138.350,8894.505,10.000,-52.825},
				{44027.800,8894.505,10.000,-53.690},
				{44917.251,8894.505,10.000,-54.500},
				{45806.701,8894.505,10.000,-55.255},
				{46696.152,8894.505,10.000,-55.958},
				{47585.602,8894.505,10.000,-56.609},
				{48475.053,8894.505,10.000,-57.209},
				{49364.504,8894.505,10.000,-57.759},
				{50253.954,8894.505,10.000,-58.262},
				{51143.405,8894.505,10.000,-58.717},
				{52032.855,8894.505,10.000,-59.126},
				{52922.306,8894.505,10.000,-59.490},
				{53811.756,8894.505,10.000,-59.811},
				{54701.207,8894.505,10.000,-60.088},
				{55590.657,8894.505,10.000,-60.322},
				{56480.108,8894.505,10.000,-60.514},
				{57369.558,8894.505,10.000,-60.665},
				{58259.009,8894.505,10.000,-60.775},
				{59148.459,8894.505,10.000,-60.844},
				{60037.910,8894.505,10.000,-60.873},
				{60927.360,8894.505,10.000,-60.861},
				{61816.811,8894.505,10.000,-60.809},
				{62706.261,8894.505,10.000,-60.716},
				{63595.712,8894.505,10.000,-60.582},
				{64485.162,8894.505,10.000,-60.407},
				{65374.613,8894.505,10.000,-60.190},
				{66264.063,8894.505,10.000,-59.930},
				{67153.514,8894.505,10.000,-59.628},
				{68042.964,8894.505,10.000,-59.282},
				{68932.415,8894.505,10.000,-58.891},
				{69821.865,8894.505,10.000,-58.455},
				{70711.316,8894.505,10.000,-57.973},
				{71600.766,8894.505,10.000,-57.442},
				{72490.217,8894.505,10.000,-56.863},
				{73379.667,8894.505,10.000,-56.233},
				{74269.118,8894.505,10.000,-55.552},
				{75158.568,8894.505,10.000,-54.819},
				{76048.019,8894.505,10.000,-54.031},
				{76937.469,8894.505,10.000,-53.189},
				{77826.920,8894.505,10.000,-52.291},
				{78716.370,8894.505,10.000,-51.336},
				{79605.821,8894.505,10.000,-50.323},
				{80495.272,8894.505,10.000,-49.253},
				{81384.722,8894.505,10.000,-48.124},
				{82274.173,8894.505,10.000,-46.937},
				{83163.623,8894.505,10.000,-45.693},
				{84053.074,8894.505,10.000,-44.394},
				{84942.524,8894.505,10.000,-43.040},
				{85831.975,8894.505,10.000,-41.635},
				{86721.425,8894.505,10.000,-40.182},
				{87610.876,8894.505,10.000,-38.685},
				{88500.326,8894.505,10.000,-37.148},
				{89389.777,8894.505,10.000,-35.577},
				{90278.966,8889.286,10.000,-33.979},
				{91167.189,8875.173,10.000,-32.361},
				{92053.556,8852.165,10.000,-30.733},
				{92937.177,8820.263,10.000,-29.102},
				{93817.164,8779.466,10.000,-27.480},
				{94692.626,8729.775,10.000,-25.873},
				{95562.674,8671.189,10.000,-24.292},
				{96426.419,8603.708,10.000,-22.743},
				{97282.971,8527.334,10.000,-21.235},
				{98131.441,8442.064,10.000,-19.773},
				{98970.939,8347.900,10.000,-18.363},
				{99800.576,8244.842,10.000,-17.009},
				{100619.463,8132.889,10.000,-15.715},
				{101426.709,8012.042,10.000,-14.483},
				{102221.427,7882.300,10.000,-13.315},
				{103002.725,7743.663,10.000,-12.212},
				{103769.714,7596.133,10.000,-11.173},
				{104521.506,7439.707,10.000,-10.199},
				{105257.211,7274.387,10.000,-9.288},
				{105975.939,7100.173,10.000,-8.439},
				{106677.062,6922.283,10.000,-7.650},
				{107360.396,6744.393,10.000,-6.919},
				{108025.940,6566.503,10.000,-6.243},
				{108673.696,6388.612,10.000,-5.618},
				{109303.663,6210.722,10.000,-5.042},
				{109915.841,6032.832,10.000,-4.513},
				{110510.229,5854.942,10.000,-4.027},
				{111086.829,5677.052,10.000,-3.581},
				{111645.640,5499.162,10.000,-3.175},
				{112186.661,5321.272,10.000,-2.804},
				{112709.894,5143.382,10.000,-2.467},
				{113215.338,4965.492,10.000,-2.162},
				{113702.992,4787.601,10.000,-1.886},
				{114172.858,4609.711,10.000,-1.637},
				{114624.935,4431.821,10.000,-1.415},
				{115059.222,4253.931,10.000,-1.216},
				{115475.721,4076.041,10.000,-1.038},
				{115874.431,3898.151,10.000,-0.882},
				{116255.351,3720.261,10.000,-0.743},
				{116618.483,3542.371,10.000,-0.622},
				{116963.825,3364.481,10.000,-0.517},
				{117291.379,3186.591,10.000,-0.425},
				{117601.143,3008.700,10.000,-0.347},
				{117893.119,2830.810,10.000,-0.280},
				{118167.306,2652.920,10.000,-0.224},
				{118423.703,2475.030,10.000,-0.177},
				{118662.312,2297.140,10.000,-0.138},
				{118883.131,2119.250,10.000,-0.106},
				{119086.162,1941.360,10.000,-0.081},
				{119271.403,1763.470,10.000,-0.060},
				{119439.116,1590.798,10.000,-0.044},
				{119590.007,1427.022,10.000,-0.032},
				{119724.965,1272.139,10.000,-0.023},
				{119844.880,1126.152,10.000,-0.016},
				{119950.641,989.058,10.000,-0.011},
				{120043.136,860.860,10.000,-0.007},
				{120123.257,741.555,10.000,-0.005},
				{120191.892,631.146,10.000,-0.003},
				{120249.931,529.630,10.000,-0.002},
				{120298.263,437.010,10.000,-0.001},
				{120337.778,353.283,10.000,-0.000},
				{120369.364,278.452,10.000,-0.000},
				{120393.913,212.514,10.000,-0.000},
				{120412.312,155.472,10.000,-0.000},
				{120425.452,107.323,10.000,-0.000},
				{120434.221,68.070,10.000,-0.000},
				{120439.510,37.711,10.000,-0.000},
				{120442.208,16.246,10.000,-0.000},
				{120443.204,3.676,10.000,0.000},
				{120443.388,0.000,10.000,0.000},
				{120443.388,0.000,10.000,0.000}		};

}