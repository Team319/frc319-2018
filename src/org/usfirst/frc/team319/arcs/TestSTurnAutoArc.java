package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class TestSTurnAutoArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (8.38,5.50,0.00)
	
    public TestSTurnAutoArc() {
		super();
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public TestSTurnAutoArc(boolean flipped) {
		super();
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	double[][] centerPoints = {
				{0.142,2.835,10.000,0.000},
				{0.709,5.670,10.000,0.000},
				{1.984,12.756,10.000,0.000},
				{4.252,22.676,10.000,0.000},
				{7.795,35.427,10.000,0.000},
				{12.895,51.007,10.000,0.000},
				{19.836,69.410,10.000,0.000},
				{28.758,89.215,10.000,0.000},
				{39.658,109.000,10.000,0.000},
				{52.534,128.760,10.000,0.001},
				{67.383,148.492,10.000,0.001},
				{84.202,168.190,10.000,0.002},
				{102.987,187.851,10.000,0.002},
				{123.734,207.470,10.000,0.003},
				{146.438,227.043,10.000,0.005},
				{171.095,246.565,10.000,0.007},
				{197.698,266.034,10.000,0.009},
				{226.243,285.443,10.000,0.011},
				{256.722,304.790,10.000,0.015},
				{289.129,324.071,10.000,0.019},
				{323.457,343.280,10.000,0.023},
				{359.698,362.415,10.000,0.029},
				{397.845,381.472,10.000,0.035},
				{437.890,400.446,10.000,0.043},
				{479.823,419.334,10.000,0.051},
				{523.637,438.133,10.000,0.061},
				{569.320,456.838,10.000,0.073},
				{616.865,475.445,10.000,0.085},
				{666.260,493.952,10.000,0.099},
				{717.496,512.355,10.000,0.115},
				{770.561,530.650,10.000,0.133},
				{825.444,548.834,10.000,0.153},
				{882.134,566.902,10.000,0.175},
				{940.620,584.853,10.000,0.199},
				{1000.888,602.682,10.000,0.225},
				{1062.926,620.386,10.000,0.254},
				{1126.723,637.962,10.000,0.286},
				{1192.263,655.406,10.000,0.320},
				{1259.535,672.714,10.000,0.358},
				{1328.523,689.885,10.000,0.398},
				{1399.214,706.913,10.000,0.442},
				{1471.594,723.795,10.000,0.489},
				{1545.647,740.529,10.000,0.541},
				{1621.358,757.110,10.000,0.595},
				{1698.711,773.536,10.000,0.654},
				{1777.692,789.801,10.000,0.718},
				{1858.282,805.904,10.000,0.785},
				{1940.466,821.839,10.000,0.857},
				{2024.226,837.604,10.000,0.934},
				{2109.545,853.193,10.000,1.016},
				{2196.406,868.604,10.000,1.104},
				{2284.789,883.831,10.000,1.196},
				{2374.676,898.872,10.000,1.295},
				{2466.048,913.721,10.000,1.399},
				{2558.886,928.374,10.000,1.509},
				{2653.168,942.826,10.000,1.626},
				{2748.876,957.073,10.000,1.749},
				{2845.987,971.110,10.000,1.880},
				{2944.480,984.932,10.000,2.017},
				{3044.333,998.533,10.000,2.162},
				{3145.524,1011.908,10.000,2.314},
				{3248.029,1025.053,10.000,2.474},
				{3351.825,1037.960,10.000,2.642},
				{3456.888,1050.626,10.000,2.819},
				{3563.192,1063.043,10.000,3.005},
				{3670.713,1075.206,10.000,3.199},
				{3779.423,1087.109,10.000,3.404},
				{3889.298,1098.745,10.000,3.617},
				{4000.309,1110.109,10.000,3.841},
				{4112.428,1121.194,10.000,4.075},
				{4225.628,1131.993,10.000,4.320},
				{4339.878,1142.502,10.000,4.575},
				{4455.149,1152.713,10.000,4.842},
				{4571.411,1162.620,10.000,5.121},
				{4688.633,1172.217,10.000,5.412},
				{4806.783,1181.499,10.000,5.715},
				{4925.829,1190.460,10.000,6.032},
				{5045.738,1199.095,10.000,6.361},
				{5166.478,1207.400,10.000,6.704},
				{5288.015,1215.371,10.000,7.061},
				{5410.316,1223.004,10.000,7.432},
				{5533.345,1230.297,10.000,7.819},
				{5657.070,1237.248,10.000,8.220},
				{5781.456,1243.857,10.000,8.637},
				{5906.468,1250.125,10.000,9.070},
				{6032.074,1256.054,10.000,9.520},
				{6158.238,1261.648,10.000,9.986},
				{6284.930,1266.914,10.000,10.469},
				{6412.116,1271.859,10.000,10.970},
				{6539.765,1276.495,10.000,11.489},
				{6667.849,1280.834,10.000,12.027},
				{6796.338,1284.893,10.000,12.583},
				{6925.207,1288.692,10.000,13.157},
				{7054.432,1292.252,10.000,13.751},
				{7183.993,1295.602,10.000,14.365},
				{7313.870,1298.772,10.000,14.998},
				{7444.050,1301.798,10.000,15.651},
				{7574.522,1304.719,10.000,16.324},
				{7705.280,1307.581,10.000,17.017},
				{7836.323,1310.432,10.000,17.730},
				{7967.656,1313.328,10.000,18.463},
				{8099.288,1316.328,10.000,19.216},
				{8231.238,1319.497,10.000,19.988},
				{8363.529,1322.905,10.000,20.780},
				{8496.191,1326.627,10.000,21.591},
				{8629.265,1330.739,10.000,22.420},
				{8762.798,1335.326,10.000,23.268},
				{8896.845,1340.471,10.000,24.133},
				{9031.471,1346.262,10.000,25.014},
				{9166.750,1352.788,10.000,25.911},
				{9302.764,1360.137,10.000,26.823},
				{9439.603,1368.398,10.000,27.748},
				{9577.369,1377.657,10.000,28.686},
				{9716.168,1387.994,10.000,29.636},
				{9856.117,1399.489,10.000,30.595},
				{9997.339,1412.213,10.000,31.562},
				{10139.962,1426.228,10.000,32.536},
				{10284.121,1441.591,10.000,33.516},
				{10429.955,1458.348,10.000,34.499},
				{10577.609,1476.532,10.000,35.484},
				{10727.225,1496.168,10.000,36.470},
				{10878.952,1517.268,10.000,37.454},
				{11032.935,1539.833,10.000,38.435},
				{11189.320,1563.850,10.000,39.410},
				{11348.250,1589.298,10.000,40.380},
				{11509.865,1616.142,10.000,41.341},
				{11674.298,1644.339,10.000,42.292},
				{11841.682,1673.837,10.000,43.231},
				{12012.139,1704.573,10.000,44.158},
				{12185.788,1736.481,10.000,45.071},
				{12362.736,1769.489,10.000,45.968},
				{12543.088,1803.519,10.000,46.848},
				{12726.937,1838.492,10.000,47.711},
				{12914.370,1874.327,10.000,48.555},
				{13105.464,1910.943,10.000,49.378},
				{13300.291,1948.261,10.000,50.182},
				{13498.911,1986.202,10.000,50.964},
				{13701.380,2024.692,10.000,51.724},
				{13907.746,2063.658,10.000,52.461},
				{14118.049,2103.033,10.000,53.175},
				{14332.325,2142.755,10.000,53.866},
				{14550.601,2182.766,10.000,54.533},
				{14772.903,2223.013,10.000,55.176},
				{14999.248,2263.450,10.000,55.795},
				{15229.651,2304.035,10.000,56.389},
				{15464.124,2344.731,10.000,56.959},
				{15702.675,2385.509,10.000,57.504},
				{15945.309,2426.342,10.000,58.024},
				{16192.030,2467.210,10.000,58.520},
				{16442.840,2508.096,10.000,58.990},
				{16697.615,2547.751,10.000,59.436},
				{16956.102,2584.872,10.000,59.856},
				{17218.039,2619.366,10.000,60.251},
				{17483.154,2651.153,10.000,60.620},
				{17751.170,2680.155,10.000,60.963},
				{18021.800,2706.303,10.000,61.280},
				{18294.753,2729.533,10.000,61.571},
				{18569.863,2751.102,10.000,61.837},
				{18847.096,2772.323,10.000,62.078},
				{19126.418,2793.223,10.000,62.294},
				{19407.801,2813.833,10.000,62.486},
				{19691.220,2834.183,10.000,62.654},
				{19976.650,2854.304,10.000,62.798},
				{20264.073,2874.227,10.000,62.919},
				{20553.471,2893.983,10.000,63.016},
				{20844.832,2913.604,10.000,63.091},
				{21138.144,2933.122,10.000,63.142},
				{21433.401,2952.568,10.000,63.170},
				{21730.598,2971.975,10.000,63.176},
				{22029.736,2991.374,10.000,63.158},
				{22330.815,3010.798,10.000,63.118},
				{22633.843,3030.278,10.000,63.054},
				{22938.828,3049.845,10.000,62.968},
				{23245.781,3069.533,10.000,62.858},
				{23554.718,3089.373,10.000,62.725},
				{23865.658,3109.395,10.000,62.569},
				{24178.621,3129.633,10.000,62.388},
				{24493.633,3150.115,10.000,62.183},
				{24810.720,3170.873,10.000,61.954},
				{25129.914,3191.938,10.000,61.700},
				{25451.247,3213.337,10.000,61.421},
				{25774.676,3234.287,10.000,61.116},
				{26100.000,3253.235,10.000,60.785},
				{26426.939,3269.398,10.000,60.429},
				{26755.210,3282.709,10.000,60.047},
				{27084.520,3293.096,10.000,59.639},
				{27414.568,3300.479,10.000,59.205},
				{27745.045,3304.770,10.000,58.746},
				{28075.718,3306.731,10.000,58.263},
				{28406.510,3307.920,10.000,57.754},
				{28737.418,3309.082,10.000,57.221},
				{29068.438,3310.199,10.000,56.663},
				{29399.563,3311.247,10.000,56.080},
				{29730.783,3312.199,10.000,55.473},
				{30062.085,3313.022,10.000,54.841},
				{30393.452,3313.674,10.000,54.186},
				{30724.864,3314.114,10.000,53.506},
				{31056.293,3314.290,10.000,52.803},
				{31387.707,3314.147,10.000,52.076},
				{31719.070,3313.626,10.000,51.327},
				{32050.336,3312.660,10.000,50.555},
				{32381.454,3311.181,10.000,49.762},
				{32712.365,3309.114,10.000,48.948},
				{33043.004,3306.384,10.000,48.114},
				{33373.295,3302.910,10.000,47.260},
				{33703.156,3298.613,10.000,46.388},
				{34032.497,3293.411,10.000,45.499},
				{34361.220,3287.224,10.000,44.593},
				{34689.217,3279.974,10.000,43.673},
				{35016.376,3271.587,10.000,42.739},
				{35342.575,3261.991,10.000,41.793},
				{35667.687,3251.124,10.000,40.837},
				{35991.580,3238.928,10.000,39.871},
				{36314.116,3225.356,10.000,38.899},
				{36635.152,3210.368,10.000,37.920},
				{36954.546,3193.936,10.000,36.937},
				{37272.151,3176.045,10.000,35.952},
				{37587.819,3156.688,10.000,34.967},
				{37901.407,3135.872,10.000,33.982},
				{38212.768,3113.616,10.000,33.001},
				{38521.763,3089.948,10.000,32.024},
				{38828.254,3064.911,10.000,31.053},
				{39132.109,3038.554,10.000,30.090},
				{39433.203,3010.938,10.000,29.136},
				{39731.416,2982.130,10.000,28.192},
				{40026.637,2952.205,10.000,27.261},
				{40318.761,2921.243,10.000,26.342},
				{40607.694,2889.329,10.000,25.438},
				{40893.349,2856.549,10.000,24.549},
				{41175.648,2822.993,10.000,23.676},
				{41454.523,2788.748,10.000,22.821},
				{41729.913,2753.903,10.000,21.983},
				{42001.768,2718.545,10.000,21.163},
				{42270.043,2682.757,10.000,20.362},
				{42534.705,2646.619,10.000,19.580},
				{42795.726,2610.207,10.000,18.818},
				{43053.085,2573.594,10.000,18.075},
				{43306.770,2536.846,10.000,17.353},
				{43556.773,2500.025,10.000,16.650},
				{43803.091,2463.190,10.000,15.968},
				{44045.731,2426.391,10.000,15.306},
				{44284.698,2389.676,10.000,14.663},
				{44520.007,2353.087,10.000,14.040},
				{44751.673,2316.661,10.000,13.437},
				{44979.716,2280.432,10.000,12.853},
				{45204.159,2244.428,10.000,12.288},
				{45425.026,2208.674,10.000,11.742},
				{45642.345,2173.192,10.000,11.215},
				{45856.145,2137.999,10.000,10.705},
				{46066.456,2103.109,10.000,10.213},
				{46273.310,2068.535,10.000,9.739},
				{46476.738,2034.286,10.000,9.282},
				{46676.775,2000.369,10.000,8.841},
				{46873.454,1966.789,10.000,8.416},
				{47066.809,1933.549,10.000,8.008},
				{47256.874,1900.651,10.000,7.614},
				{47443.684,1868.095,10.000,7.236},
				{47627.272,1835.879,10.000,6.872},
				{47807.672,1804.003,10.000,6.522},
				{47984.918,1772.463,10.000,6.187},
				{48159.044,1741.255,10.000,5.864},
				{48330.081,1710.375,10.000,5.555},
				{48498.063,1679.818,10.000,5.258},
				{48663.021,1649.579,10.000,4.974},
				{48824.986,1619.653,10.000,4.701},
				{48983.989,1590.033,10.000,4.440},
				{49140.061,1560.713,10.000,4.190},
				{49293.229,1531.688,10.000,3.951},
				{49443.524,1502.951,10.000,3.722},
				{49590.974,1474.496,10.000,3.504},
				{49735.606,1446.316,10.000,3.295},
				{49877.446,1418.406,10.000,3.096},
				{50016.522,1390.759,10.000,2.906},
				{50152.859,1363.369,10.000,2.725},
				{50286.482,1336.230,10.000,2.553},
				{50417.416,1309.336,10.000,2.389},
				{50545.684,1282.681,10.000,2.233},
				{50671.310,1256.260,10.000,2.085},
				{50794.316,1230.067,10.000,1.944},
				{50914.726,1204.097,10.000,1.811},
				{51032.561,1178.345,10.000,1.684},
				{51147.841,1152.805,10.000,1.564},
				{51260.589,1127.473,10.000,1.451},
				{51370.823,1102.344,10.000,1.344},
				{51478.564,1077.413,10.000,1.242},
				{51583.832,1052.676,10.000,1.147},
				{51686.645,1028.128,10.000,1.057},
				{51787.021,1003.764,10.000,0.973},
				{51884.979,979.582,10.000,0.893},
				{51980.537,955.576,10.000,0.819},
				{52073.711,931.744,10.000,0.749},
				{52164.519,908.080,10.000,0.684},
				{52252.977,884.581,10.000,0.623},
				{52339.102,861.243,10.000,0.566},
				{52422.908,838.063,10.000,0.513},
				{52504.412,815.037,10.000,0.464},
				{52583.628,792.162,10.000,0.419},
				{52660.571,769.434,10.000,0.376},
				{52735.256,746.850,10.000,0.338},
				{52807.697,724.406,10.000,0.302},
				{52877.907,702.098,10.000,0.269},
				{52945.899,679.924,10.000,0.239},
				{53011.687,657.880,10.000,0.211},
				{53075.283,635.962,10.000,0.186},
				{53136.700,614.168,10.000,0.163},
				{53195.950,592.494,10.000,0.142},
				{53253.043,570.936,10.000,0.124},
				{53307.992,549.491,10.000,0.107},
				{53360.808,528.155,10.000,0.092},
				{53411.500,506.925,10.000,0.078},
				{53460.080,485.798,10.000,0.067},
				{53506.557,464.770,10.000,0.056},
				{53550.941,443.836,10.000,0.047},
				{53593.240,422.995,10.000,0.039},
				{53633.464,402.241,10.000,0.032},
				{53671.621,381.571,10.000,0.026},
				{53707.719,360.982,10.000,0.021},
				{53741.766,340.469,10.000,0.017},
				{53773.769,320.028,10.000,0.013},
				{53803.735,299.657,10.000,0.010},
				{53831.670,279.349,10.000,0.008},
				{53857.580,259.102,10.000,0.006},
				{53881.471,238.912,10.000,0.004},
				{53903.349,218.774,10.000,0.003},
				{53923.217,198.684,10.000,0.002},
				{53941.081,178.638,10.000,0.001},
				{53956.944,158.631,10.000,0.001},
				{53970.810,138.660,10.000,0.000},
				{53982.682,118.719,10.000,0.000},
				{53992.562,98.805,10.000,0.000},
				{54000.453,78.913,10.000,0.000},
				{54006.432,59.785,10.000,0.000},
				{54010.715,42.834,10.000,0.000},
				{54013.588,28.726,10.000,0.000},
				{54015.334,17.458,10.000,0.000},
				{54016.236,9.027,10.000,0.000},
				{54016.580,3.432,10.000,-0.000},
				{54016.647,0.671,10.000,-0.000},
				{54016.647,0.000,10.000,-0.000}		};

}