package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class FifteenFeetArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (15.00,0.00,0.00)
	
    public FifteenFeetArc() {
		super();
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public FifteenFeetArc(boolean flipped) {
		super();
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	double[][] centerPoints = {
				{0.142,2.835,10.000,0.000},
				{0.709,5.670,10.000,0.000},
				{1.984,12.757,10.000,0.000},
				{4.252,22.679,10.000,0.000},
				{7.796,35.435,10.000,0.000},
				{12.898,51.027,10.000,0.000},
				{19.844,69.453,10.000,0.000},
				{28.774,89.297,10.000,0.000},
				{39.688,109.141,10.000,0.000},
				{52.586,128.985,10.000,0.000},
				{67.469,148.828,10.000,0.000},
				{84.336,168.672,10.000,0.000},
				{103.188,188.516,10.000,0.000},
				{124.024,208.360,10.000,0.000},
				{146.844,228.204,10.000,0.000},
				{171.649,248.047,10.000,0.000},
				{198.438,267.891,10.000,0.000},
				{227.211,287.735,10.000,0.000},
				{257.969,307.579,10.000,0.000},
				{290.712,327.423,10.000,0.000},
				{325.438,347.266,10.000,0.000},
				{362.149,367.110,10.000,0.000},
				{400.845,386.954,10.000,0.000},
				{441.524,406.798,10.000,0.000},
				{484.189,426.642,10.000,0.000},
				{528.837,446.485,10.000,0.000},
				{575.470,466.329,10.000,0.000},
				{624.087,486.173,10.000,0.000},
				{674.689,506.017,10.000,0.000},
				{727.275,525.861,10.000,0.000},
				{781.846,545.704,10.000,0.000},
				{838.400,565.548,10.000,0.000},
				{896.940,585.392,10.000,0.000},
				{957.463,605.236,10.000,0.000},
				{1019.971,625.080,10.000,0.000},
				{1084.463,644.923,10.000,0.000},
				{1150.940,664.767,10.000,0.000},
				{1219.401,684.611,10.000,0.000},
				{1289.847,704.455,10.000,0.000},
				{1362.277,724.299,10.000,0.000},
				{1436.691,744.142,10.000,0.000},
				{1513.089,763.986,10.000,0.000},
				{1591.472,783.830,10.000,0.000},
				{1671.840,803.674,10.000,0.000},
				{1754.191,823.517,10.000,0.000},
				{1838.528,843.361,10.000,0.000},
				{1924.848,863.205,10.000,0.000},
				{2013.153,883.049,10.000,0.000},
				{2103.442,902.893,10.000,0.000},
				{2195.716,922.736,10.000,0.000},
				{2289.974,942.580,10.000,0.000},
				{2386.216,962.424,10.000,0.000},
				{2484.443,982.268,10.000,0.000},
				{2584.654,1002.112,10.000,0.000},
				{2686.850,1021.955,10.000,0.000},
				{2791.030,1041.799,10.000,0.000},
				{2897.194,1061.643,10.000,0.000},
				{3005.343,1081.487,10.000,0.000},
				{3115.476,1101.331,10.000,0.000},
				{3227.593,1121.174,10.000,0.000},
				{3341.695,1141.018,10.000,0.000},
				{3457.781,1160.862,10.000,0.000},
				{3575.852,1180.706,10.000,0.000},
				{3695.907,1200.550,10.000,0.000},
				{3817.946,1220.393,10.000,0.000},
				{3941.970,1240.237,10.000,0.000},
				{4067.978,1260.081,10.000,0.000},
				{4195.970,1279.925,10.000,0.000},
				{4325.947,1299.769,10.000,0.000},
				{4457.909,1319.612,10.000,0.000},
				{4591.854,1339.456,10.000,0.000},
				{4727.784,1359.300,10.000,0.000},
				{4865.698,1379.144,10.000,0.000},
				{5005.597,1398.988,10.000,0.000},
				{5147.480,1418.831,10.000,0.000},
				{5291.348,1438.675,10.000,0.000},
				{5437.200,1458.519,10.000,0.000},
				{5585.036,1478.363,10.000,0.000},
				{5734.857,1498.207,10.000,0.000},
				{5886.662,1518.050,10.000,0.000},
				{6040.451,1537.894,10.000,0.000},
				{6196.225,1557.738,10.000,0.000},
				{6353.983,1577.582,10.000,0.000},
				{6513.726,1597.425,10.000,0.000},
				{6675.453,1617.269,10.000,0.000},
				{6839.164,1637.113,10.000,0.000},
				{7004.860,1656.957,10.000,0.000},
				{7172.540,1676.801,10.000,0.000},
				{7342.204,1696.644,10.000,0.000},
				{7513.853,1716.488,10.000,0.000},
				{7687.486,1736.332,10.000,0.000},
				{7863.104,1756.176,10.000,0.000},
				{8040.706,1776.020,10.000,0.000},
				{8220.292,1795.863,10.000,0.000},
				{8401.863,1815.707,10.000,0.000},
				{8585.418,1835.551,10.000,0.000},
				{8770.957,1855.395,10.000,0.000},
				{8958.481,1875.239,10.000,0.000},
				{9147.989,1895.082,10.000,0.000},
				{9339.482,1914.926,10.000,0.000},
				{9532.959,1934.770,10.000,0.000},
				{9728.420,1954.614,10.000,0.000},
				{9925.866,1974.458,10.000,0.000},
				{10125.296,1994.301,10.000,0.000},
				{10326.711,2014.145,10.000,0.000},
				{10530.110,2033.989,10.000,0.000},
				{10735.493,2053.833,10.000,0.000},
				{10942.861,2073.677,10.000,0.000},
				{11152.213,2093.520,10.000,0.000},
				{11363.549,2113.364,10.000,0.000},
				{11576.870,2133.208,10.000,0.000},
				{11792.175,2153.052,10.000,0.000},
				{12009.465,2172.896,10.000,0.000},
				{12228.739,2192.739,10.000,0.000},
				{12449.997,2212.583,10.000,0.000},
				{12673.240,2232.427,10.000,0.000},
				{12898.467,2252.271,10.000,0.000},
				{13125.678,2272.115,10.000,0.000},
				{13354.874,2291.958,10.000,0.000},
				{13586.054,2311.802,10.000,0.000},
				{13819.219,2331.646,10.000,0.000},
				{14054.368,2351.490,10.000,0.000},
				{14291.501,2371.333,10.000,0.000},
				{14530.619,2391.177,10.000,0.000},
				{14771.721,2411.021,10.000,0.000},
				{15014.807,2430.865,10.000,0.000},
				{15259.878,2450.709,10.000,0.000},
				{15506.933,2470.552,10.000,0.000},
				{15755.973,2490.396,10.000,0.000},
				{16006.997,2510.240,10.000,0.000},
				{16260.005,2530.084,10.000,0.000},
				{16514.998,2549.928,10.000,0.000},
				{16771.975,2569.771,10.000,0.000},
				{17030.937,2589.615,10.000,0.000},
				{17291.883,2609.459,10.000,0.000},
				{17554.813,2629.303,10.000,0.000},
				{17819.728,2649.147,10.000,0.000},
				{18086.627,2668.990,10.000,0.000},
				{18355.510,2688.834,10.000,0.000},
				{18626.378,2708.678,10.000,0.000},
				{18899.230,2728.522,10.000,0.000},
				{19174.067,2748.366,10.000,0.000},
				{19450.888,2768.209,10.000,0.000},
				{19729.693,2788.053,10.000,0.000},
				{20010.483,2807.897,10.000,0.000},
				{20293.257,2827.741,10.000,0.000},
				{20578.015,2847.585,10.000,0.000},
				{20864.758,2867.428,10.000,0.000},
				{21153.485,2887.272,10.000,0.000},
				{21444.197,2907.116,10.000,0.000},
				{21736.751,2925.542,10.000,0.000},
				{22030.864,2941.134,10.000,0.000},
				{22326.254,2953.891,10.000,0.000},
				{22622.635,2963.812,10.000,0.000},
				{22919.725,2970.900,10.000,0.000},
				{23217.240,2975.152,10.000,0.000},
				{23514.897,2976.569,10.000,0.000},
				{23812.554,2976.569,10.000,0.000},
				{24110.211,2976.569,10.000,0.000},
				{24407.868,2976.569,10.000,0.000},
				{24705.525,2976.569,10.000,0.000},
				{25003.181,2976.569,10.000,0.000},
				{25300.838,2976.569,10.000,0.000},
				{25598.495,2976.569,10.000,0.000},
				{25896.152,2976.569,10.000,0.000},
				{26193.809,2976.569,10.000,0.000},
				{26491.466,2976.569,10.000,0.000},
				{26789.123,2976.569,10.000,0.000},
				{27086.780,2976.569,10.000,0.000},
				{27384.437,2976.569,10.000,0.000},
				{27682.094,2976.569,10.000,0.000},
				{27979.751,2976.569,10.000,0.000},
				{28277.408,2976.569,10.000,0.000},
				{28575.065,2976.569,10.000,0.000},
				{28872.721,2976.569,10.000,0.000},
				{29170.378,2976.569,10.000,0.000},
				{29468.035,2976.569,10.000,0.000},
				{29765.692,2976.569,10.000,0.000},
				{30063.349,2976.569,10.000,0.000},
				{30361.006,2976.569,10.000,0.000},
				{30658.663,2976.569,10.000,0.000},
				{30956.320,2976.569,10.000,0.000},
				{31253.977,2976.569,10.000,0.000},
				{31551.634,2976.569,10.000,0.000},
				{31849.291,2976.569,10.000,0.000},
				{32146.948,2976.569,10.000,0.000},
				{32444.605,2976.569,10.000,0.000},
				{32742.261,2976.569,10.000,0.000},
				{33039.918,2976.569,10.000,0.000},
				{33337.575,2976.569,10.000,0.000},
				{33635.232,2976.569,10.000,0.000},
				{33932.889,2976.569,10.000,0.000},
				{34230.546,2976.569,10.000,0.000},
				{34528.203,2976.569,10.000,0.000},
				{34825.860,2976.569,10.000,0.000},
				{35123.517,2976.569,10.000,0.000},
				{35421.174,2976.569,10.000,0.000},
				{35718.831,2976.569,10.000,0.000},
				{36016.488,2976.569,10.000,0.000},
				{36314.145,2976.569,10.000,0.000},
				{36611.801,2976.569,10.000,0.000},
				{36909.458,2976.569,10.000,0.000},
				{37207.115,2976.569,10.000,0.000},
				{37504.772,2976.569,10.000,0.000},
				{37802.429,2976.569,10.000,0.000},
				{38100.086,2976.569,10.000,0.000},
				{38397.743,2976.569,10.000,0.000},
				{38695.400,2976.569,10.000,0.000},
				{38993.057,2976.569,10.000,0.000},
				{39290.714,2976.569,10.000,0.000},
				{39588.371,2976.569,10.000,0.000},
				{39886.028,2976.569,10.000,0.000},
				{40183.684,2976.569,10.000,0.000},
				{40481.341,2976.569,10.000,0.000},
				{40778.998,2976.569,10.000,0.000},
				{41076.655,2976.569,10.000,0.000},
				{41374.312,2976.569,10.000,0.000},
				{41671.969,2976.569,10.000,0.000},
				{41969.626,2976.569,10.000,0.000},
				{42267.283,2976.569,10.000,0.000},
				{42564.940,2976.569,10.000,0.000},
				{42862.597,2976.569,10.000,0.000},
				{43160.254,2976.569,10.000,0.000},
				{43457.911,2976.569,10.000,0.000},
				{43755.568,2976.569,10.000,0.000},
				{44053.224,2976.569,10.000,0.000},
				{44350.881,2976.569,10.000,0.000},
				{44648.538,2976.569,10.000,0.000},
				{44946.195,2976.569,10.000,0.000},
				{45243.852,2976.569,10.000,0.000},
				{45541.509,2976.569,10.000,0.000},
				{45839.166,2976.569,10.000,0.000},
				{46136.823,2976.569,10.000,0.000},
				{46434.480,2976.569,10.000,0.000},
				{46732.137,2976.569,10.000,0.000},
				{47029.794,2976.569,10.000,0.000},
				{47327.451,2976.569,10.000,0.000},
				{47625.108,2976.569,10.000,0.000},
				{47922.764,2976.569,10.000,0.000},
				{48220.421,2976.569,10.000,0.000},
				{48518.078,2976.569,10.000,0.000},
				{48815.735,2976.569,10.000,0.000},
				{49113.392,2976.569,10.000,0.000},
				{49411.049,2976.569,10.000,0.000},
				{49708.706,2976.569,10.000,0.000},
				{50006.363,2976.569,10.000,0.000},
				{50304.020,2976.569,10.000,0.000},
				{50601.677,2976.569,10.000,0.000},
				{50899.334,2976.569,10.000,0.000},
				{51196.991,2976.569,10.000,0.000},
				{51494.506,2975.152,10.000,0.000},
				{51791.596,2970.900,10.000,0.000},
				{52087.977,2963.812,10.000,0.000},
				{52383.366,2953.891,10.000,0.000},
				{52677.479,2941.134,10.000,0.000},
				{52970.034,2925.542,10.000,0.000},
				{53260.745,2907.116,10.000,0.000},
				{53549.472,2887.272,10.000,0.000},
				{53836.215,2867.428,10.000,0.000},
				{54120.974,2847.585,10.000,0.000},
				{54403.748,2827.741,10.000,0.000},
				{54684.538,2807.897,10.000,0.000},
				{54963.343,2788.053,10.000,0.000},
				{55240.164,2768.209,10.000,0.000},
				{55515.000,2748.366,10.000,0.000},
				{55787.853,2728.522,10.000,0.000},
				{56058.720,2708.678,10.000,0.000},
				{56327.604,2688.834,10.000,0.000},
				{56594.503,2668.990,10.000,0.000},
				{56859.417,2649.147,10.000,0.000},
				{57122.348,2629.303,10.000,0.000},
				{57383.294,2609.459,10.000,0.000},
				{57642.255,2589.615,10.000,0.000},
				{57899.232,2569.771,10.000,0.000},
				{58154.225,2549.928,10.000,0.000},
				{58407.233,2530.084,10.000,0.000},
				{58658.257,2510.240,10.000,0.000},
				{58907.297,2490.396,10.000,0.000},
				{59154.352,2470.552,10.000,0.000},
				{59399.423,2450.709,10.000,0.000},
				{59642.510,2430.865,10.000,0.000},
				{59883.612,2411.021,10.000,0.000},
				{60122.730,2391.177,10.000,0.000},
				{60359.863,2371.333,10.000,0.000},
				{60595.012,2351.490,10.000,0.000},
				{60828.176,2331.646,10.000,0.000},
				{61059.357,2311.802,10.000,0.000},
				{61288.552,2291.958,10.000,0.000},
				{61515.764,2272.115,10.000,0.000},
				{61740.991,2252.271,10.000,0.000},
				{61964.234,2232.427,10.000,0.000},
				{62185.492,2212.583,10.000,0.000},
				{62404.766,2192.739,10.000,0.000},
				{62622.055,2172.896,10.000,0.000},
				{62837.361,2153.052,10.000,0.000},
				{63050.681,2133.208,10.000,0.000},
				{63262.018,2113.364,10.000,0.000},
				{63471.370,2093.520,10.000,0.000},
				{63678.738,2073.677,10.000,0.000},
				{63884.121,2053.833,10.000,0.000},
				{64087.520,2033.989,10.000,0.000},
				{64288.934,2014.145,10.000,0.000},
				{64488.364,1994.301,10.000,0.000},
				{64685.810,1974.458,10.000,0.000},
				{64881.272,1954.614,10.000,0.000},
				{65074.749,1934.770,10.000,0.000},
				{65266.241,1914.926,10.000,0.000},
				{65455.749,1895.082,10.000,0.000},
				{65643.273,1875.239,10.000,0.000},
				{65828.813,1855.395,10.000,0.000},
				{66012.368,1835.551,10.000,0.000},
				{66193.939,1815.707,10.000,0.000},
				{66373.525,1795.863,10.000,0.000},
				{66551.127,1776.020,10.000,0.000},
				{66726.744,1756.176,10.000,0.000},
				{66900.378,1736.332,10.000,0.000},
				{67072.026,1716.488,10.000,0.000},
				{67241.691,1696.644,10.000,0.000},
				{67409.371,1676.801,10.000,0.000},
				{67575.067,1656.957,10.000,0.000},
				{67738.778,1637.113,10.000,0.000},
				{67900.505,1617.269,10.000,0.000},
				{68060.247,1597.425,10.000,0.000},
				{68218.006,1577.582,10.000,0.000},
				{68373.779,1557.738,10.000,0.000},
				{68527.569,1537.894,10.000,0.000},
				{68679.374,1518.050,10.000,0.000},
				{68829.194,1498.207,10.000,0.000},
				{68977.031,1478.363,10.000,0.000},
				{69122.883,1458.519,10.000,0.000},
				{69266.750,1438.675,10.000,0.000},
				{69408.633,1418.831,10.000,0.000},
				{69548.532,1398.988,10.000,0.000},
				{69686.446,1379.144,10.000,0.000},
				{69822.376,1359.300,10.000,0.000},
				{69956.322,1339.456,10.000,0.000},
				{70088.283,1319.612,10.000,0.000},
				{70218.260,1299.769,10.000,0.000},
				{70346.253,1279.925,10.000,0.000},
				{70472.261,1260.081,10.000,0.000},
				{70596.284,1240.237,10.000,0.000},
				{70718.324,1220.393,10.000,0.000},
				{70838.379,1200.550,10.000,0.000},
				{70956.449,1180.706,10.000,0.000},
				{71072.535,1160.862,10.000,0.000},
				{71186.637,1141.018,10.000,0.000},
				{71298.755,1121.174,10.000,0.000},
				{71408.888,1101.331,10.000,0.000},
				{71517.037,1081.487,10.000,0.000},
				{71623.201,1061.643,10.000,0.000},
				{71727.381,1041.799,10.000,0.000},
				{71829.576,1021.955,10.000,0.000},
				{71929.787,1002.112,10.000,0.000},
				{72028.014,982.268,10.000,0.000},
				{72124.257,962.424,10.000,0.000},
				{72218.515,942.580,10.000,0.000},
				{72310.788,922.736,10.000,0.000},
				{72401.078,902.893,10.000,0.000},
				{72489.382,883.049,10.000,0.000},
				{72575.703,863.205,10.000,0.000},
				{72660.039,843.361,10.000,0.000},
				{72742.391,823.517,10.000,0.000},
				{72822.758,803.674,10.000,0.000},
				{72901.141,783.830,10.000,0.000},
				{72977.540,763.986,10.000,0.000},
				{73051.954,744.142,10.000,0.000},
				{73124.384,724.299,10.000,0.000},
				{73194.829,704.455,10.000,0.000},
				{73263.290,684.611,10.000,0.000},
				{73329.767,664.767,10.000,0.000},
				{73394.259,644.923,10.000,0.000},
				{73456.767,625.080,10.000,0.000},
				{73517.291,605.236,10.000,0.000},
				{73575.830,585.392,10.000,0.000},
				{73632.385,565.548,10.000,0.000},
				{73686.955,545.704,10.000,0.000},
				{73739.542,525.861,10.000,0.000},
				{73790.143,506.017,10.000,0.000},
				{73838.760,486.173,10.000,0.000},
				{73885.393,466.329,10.000,0.000},
				{73930.042,446.485,10.000,0.000},
				{73972.706,426.642,10.000,0.000},
				{74013.386,406.798,10.000,0.000},
				{74052.081,386.954,10.000,0.000},
				{74088.792,367.110,10.000,0.000},
				{74123.519,347.266,10.000,0.000},
				{74156.261,327.423,10.000,0.000},
				{74187.019,307.579,10.000,0.000},
				{74215.793,287.735,10.000,0.000},
				{74242.582,267.891,10.000,0.000},
				{74267.386,248.047,10.000,0.000},
				{74290.207,228.204,10.000,0.000},
				{74311.043,208.360,10.000,0.000},
				{74329.894,188.516,10.000,0.000},
				{74346.762,168.672,10.000,0.000},
				{74361.644,148.828,10.000,0.000},
				{74374.543,128.985,10.000,0.000},
				{74385.457,109.141,10.000,0.000},
				{74394.387,89.297,10.000,0.000},
				{74401.332,69.453,10.000,0.000},
				{74406.435,51.027,10.000,0.000},
				{74409.978,35.435,10.000,0.000},
				{74412.246,22.679,10.000,0.000},
				{74413.522,12.757,10.000,0.000},
				{74414.089,5.670,10.000,0.000},
				{74414.231,1.417,10.000,0.000},
				{74414.231,0.000,10.000,0.000}		};

}