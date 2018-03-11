package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CenterToRightSwitchArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,13.08,0.00)
	// (10.00,9.08,0.00)
	
    public CenterToRightSwitchArc() {
		super();
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToRightSwitchArc(boolean flipped) {
		super();
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	double[][] centerPoints = {
				{0.445,8.895,10.000,0.000},
				{2.224,17.789,10.000,-0.000},
				{6.226,40.028,10.000,-0.000},
				{13.343,71.166,10.000,-0.000},
				{24.464,111.212,10.000,-0.000},
				{40.482,160.177,10.000,-0.000},
				{62.290,218.078,10.000,-0.000},
				{90.784,284.941,10.000,-0.000},
				{126.864,360.797,10.000,-0.000},
				{171.432,445.688,10.000,-0.001},
				{225.399,539.665,10.000,-0.001},
				{289.678,642.791,10.000,-0.002},
				{365.192,755.140,10.000,-0.004},
				{452.872,876.799,10.000,-0.006},
				{553.659,1007.871,10.000,-0.009},
				{668.506,1148.470,10.000,-0.013},
				{798.379,1298.727,10.000,-0.018},
				{944.257,1458.788,10.000,-0.025},
				{1107.139,1628.817,10.000,-0.034},
				{1288.038,1808.992,10.000,-0.046},
				{1487.535,1994.969,10.000,-0.061},
				{1705.771,2182.357,10.000,-0.080},
				{1942.898,2371.267,10.000,-0.103},
				{2199.078,2561.805,10.000,-0.131},
				{2474.486,2754.077,10.000,-0.165},
				{2769.304,2948.182,10.000,-0.205},
				{3083.726,3144.217,10.000,-0.253},
				{3417.953,3342.276,10.000,-0.308},
				{3772.198,3542.449,10.000,-0.372},
				{4146.680,3744.824,10.000,-0.446},
				{4541.629,3949.485,10.000,-0.531},
				{4957.280,4156.515,10.000,-0.626},
				{5393.880,4365.993,10.000,-0.735},
				{5851.679,4577.997,10.000,-0.857},
				{6330.940,4792.602,10.000,-0.993},
				{6831.928,5009.884,10.000,-1.145},
				{7354.919,5229.913,10.000,-1.313},
				{7900.195,5452.761,10.000,-1.500},
				{8468.045,5678.496,10.000,-1.705},
				{9058.763,5907.183,10.000,-1.930},
				{9672.652,6138.885,10.000,-2.176},
				{10310.018,6373.663,10.000,-2.445},
				{10971.175,6611.570,10.000,-2.738},
				{11656.441,6852.656,10.000,-3.055},
				{12366.137,7096.961,10.000,-3.399},
				{13100.588,7344.517,10.000,-3.770},
				{13860.123,7595.345,10.000,-4.170},
				{14645.068,7849.447,10.000,-4.600},
				{15455.749,8106.810,10.000,-5.062},
				{16292.488,8367.398,10.000,-5.556},
				{17155.075,8625.865,10.000,-6.084},
				{18042.742,8876.670,10.000,-6.645},
				{18954.682,9119.406,10.000,-7.241},
				{19890.045,9353.629,10.000,-7.872},
				{20847.930,9578.849,10.000,-8.537},
				{21827.384,9794.538,10.000,-9.237},
				{22827.396,10000.124,10.000,-9.970},
				{23846.896,10194.999,10.000,-10.736},
				{24884.749,10378.523,10.000,-11.534},
				{25939.752,10550.030,10.000,-12.363},
				{27010.635,10708.837,10.000,-13.222},
				{28096.060,10854.251,10.000,-14.108},
				{29194.619,10985.589,10.000,-15.019},
				{30304.838,11102.183,10.000,-15.954},
				{31425.178,11203.402,10.000,-16.909},
				{32554.044,11288.663,10.000,-17.882},
				{33689.789,11357.451,10.000,-18.870},
				{34830.722,11409.329,10.000,-19.870},
				{35975.117,11443.954,10.000,-20.878},
				{37121.226,11461.086,10.000,-21.891},
				{38267.859,11466.333,10.000,-22.906},
				{39414.400,11465.406,10.000,-23.921},
				{40560.235,11458.352,10.000,-24.933},
				{41704.762,11445.272,10.000,-25.940},
				{42847.394,11426.320,10.000,-26.940},
				{43987.564,11401.700,10.000,-27.929},
				{45124.730,11371.659,10.000,-28.907},
				{46258.379,11336.484,10.000,-29.871},
				{47388.028,11296.493,10.000,-30.819},
				{48513.231,11252.031,10.000,-31.750},
				{49633.577,11203.459,10.000,-32.662},
				{50748.692,11151.152,10.000,-33.552},
				{51858.241,11095.488,10.000,-34.421},
				{52961.925,11036.845,10.000,-35.267},
				{54059.485,10975.593,10.000,-36.088},
				{55150.694,10912.091,10.000,-36.885},
				{56235.362,10846.682,10.000,-37.655},
				{57313.331,10779.689,10.000,-38.400},
				{58384.472,10711.414,10.000,-39.117},
				{59448.686,10642.136,10.000,-39.807},
				{60505.897,10572.109,10.000,-40.469},
				{61556.053,10501.562,10.000,-41.103},
				{62599.123,10430.698,10.000,-41.710},
				{63635.093,10359.698,10.000,-42.288},
				{64663.964,10288.716,10.000,-42.838},
				{65685.753,10217.886,10.000,-43.361},
				{66700.485,10147.319,10.000,-43.855},
				{67708.195,10077.106,10.000,-44.322},
				{68708.927,10007.319,10.000,-44.761},
				{69702.729,9938.014,10.000,-45.173},
				{70689.652,9869.231,10.000,-45.558},
				{71669.751,9800.993,10.000,-45.916},
				{72643.083,9733.315,10.000,-46.247},
				{73609.702,9666.196,10.000,-46.551},
				{74569.665,9599.628,10.000,-46.830},
				{75523.024,9533.593,10.000,-47.082},
				{76469.831,9468.064,10.000,-47.308},
				{77410.132,9403.008,10.000,-47.509},
				{78343.970,9338.387,10.000,-47.684},
				{79271.386,9274.156,10.000,-47.834},
				{80192.413,9210.267,10.000,-47.959},
				{81107.079,9146.667,10.000,-48.058},
				{82015.410,9083.303,10.000,-48.133},
				{82917.421,9020.117,10.000,-48.183},
				{83813.126,8957.051,10.000,-48.207},
				{84702.531,8894.044,10.000,-48.207},
				{85585.635,8831.037,10.000,-48.182},
				{86462.432,8767.969,10.000,-48.132},
				{87332.910,8704.780,10.000,-48.057},
				{88197.051,8641.412,10.000,-47.957},
				{89054.832,8577.808,10.000,-47.832},
				{89906.223,8513.912,10.000,-47.682},
				{90751.190,8449.674,10.000,-47.506},
				{91589.695,8385.044,10.000,-47.305},
				{92421.693,8319.979,10.000,-47.079},
				{93247.137,8254.441,10.000,-46.826},
				{94065.976,8188.394,10.000,-46.547},
				{94878.158,8121.815,10.000,-46.242},
				{95683.626,8054.685,10.000,-45.911},
				{96482.325,7986.994,10.000,-45.553},
				{97274.200,7918.744,10.000,-45.167},
				{98059.195,7849.947,10.000,-44.755},
				{98837.258,7780.630,10.000,-44.315},
				{99608.341,7710.831,10.000,-43.848},
				{100372.401,7640.606,10.000,-43.353},
				{101129.404,7570.028,10.000,-42.830},
				{101879.323,7499.188,10.000,-42.280},
				{102622.143,7428.198,10.000,-41.701},
				{103357.862,7357.191,10.000,-41.094},
				{104086.494,7286.323,10.000,-40.459},
				{104808.072,7215.774,10.000,-39.797},
				{105522.646,7145.747,10.000,-39.106},
				{106230.294,7076.473,10.000,-38.389},
				{106931.114,7008.206,10.000,-37.644},
				{107625.237,6941.225,10.000,-36.873},
				{108312.820,6875.832,10.000,-36.076},
				{108994.055,6812.352,10.000,-35.255},
				{109669.168,6751.126,10.000,-34.409},
				{110338.419,6692.515,10.000,-33.539},
				{111002.108,6636.889,10.000,-32.648},
				{111660.571,6584.626,10.000,-31.737},
				{112314.181,6536.103,10.000,-30.806},
				{112963.351,6491.696,10.000,-29.857},
				{113608.527,6451.766,10.000,-28.893},
				{114250.193,6416.658,10.000,-27.915},
				{114888.862,6386.689,10.000,-26.925},
				{115525.077,6362.146,10.000,-25.926},
				{116159.404,6343.276,10.000,-24.919},
				{116792.432,6330.280,10.000,-23.906},
				{117424.764,6323.314,10.000,-22.892},
				{118057.011,6322.477,10.000,-21.876},
				{118689.788,6327.768,10.000,-20.863},
				{119323.389,6336.006,10.000,-19.855},
				{119957.783,6343.945,10.000,-18.856},
				{120592.918,6351.345,10.000,-17.868},
				{121228.704,6357.863,10.000,-16.895},
				{121865.010,6363.059,10.000,-15.940},
				{122501.651,6366.416,10.000,-15.006},
				{123138.387,6367.352,10.000,-14.094},
				{123774.910,6365.233,10.000,-13.209},
				{124410.849,6359.392,10.000,-12.351},
				{125045.763,6349.145,10.000,-11.522},
				{125679.143,6333.799,10.000,-10.725},
				{126310.411,6312.671,10.000,-9.959},
				{126938.920,6285.096,10.000,-9.226},
				{127563.963,6250.432,10.000,-8.527},
				{128184.771,6208.073,10.000,-7.863},
				{128800.515,6157.448,10.000,-7.233},
				{129410.318,6098.029,10.000,-6.637},
				{130013.251,6029.327,10.000,-6.076},
				{130608.341,5950.896,10.000,-5.549},
				{131194.579,5862.388,10.000,-5.055},
				{131771.295,5767.155,10.000,-4.594},
				{132338.164,5668.696,10.000,-4.164},
				{132894.862,5566.976,10.000,-3.765},
				{133441.060,5461.979,10.000,-3.394},
				{133976.431,5353.712,10.000,-3.050},
				{134500.650,5242.193,10.000,-2.733},
				{135013.396,5127.454,10.000,-2.441},
				{135514.350,5009.538,10.000,-2.173},
				{136003.199,4888.492,10.000,-1.926},
				{136479.636,4764.371,10.000,-1.702},
				{136943.359,4637.236,10.000,-1.497},
				{137394.074,4507.149,10.000,-1.311},
				{137831.492,4374.176,10.000,-1.142},
				{138255.331,4238.385,10.000,-0.991},
				{138665.315,4099.848,10.000,-0.855},
				{139061.179,3958.635,10.000,-0.733},
				{139442.661,3814.822,10.000,-0.625},
				{139809.509,3668.484,10.000,-0.529},
				{140161.479,3519.699,10.000,-0.445},
				{140498.334,3368.546,10.000,-0.371},
				{140819.845,3215.108,10.000,-0.307},
				{141125.792,3059.470,10.000,-0.252},
				{141415.964,2901.719,10.000,-0.205},
				{141690.158,2741.946,10.000,-0.165},
				{141948.183,2580.243,10.000,-0.131},
				{142189.853,2416.709,10.000,-0.103},
				{142414.998,2251.443,10.000,-0.080},
				{142623.453,2084.549,10.000,-0.061},
				{142815.066,1916.136,10.000,-0.046},
				{142989.704,1746.377,10.000,-0.034},
				{143147.682,1579.778,10.000,-0.025},
				{143289.764,1420.823,10.000,-0.018},
				{143416.733,1269.693,10.000,-0.013},
				{143529.388,1126.550,10.000,-0.009},
				{143628.542,991.539,10.000,-0.006},
				{143715.022,864.792,10.000,-0.004},
				{143789.664,746.424,10.000,-0.002},
				{143853.317,636.535,10.000,-0.001},
				{143906.839,535.214,10.000,-0.001},
				{143951.092,442.533,10.000,-0.000},
				{143986.948,358.556,10.000,-0.000},
				{144015.281,283.334,10.000,-0.000},
				{144036.972,216.908,10.000,-0.000},
				{144052.903,159.311,10.000,-0.000},
				{144063.960,110.566,10.000,-0.000},
				{144071.029,70.691,10.000,-0.000},
				{144074.999,39.698,10.000,-0.000},
				{144076.758,17.594,10.000,0.000},
				{144077.196,4.382,10.000,-360.000},
				{144077.196,0.000,10.000,-360.000}		};

}