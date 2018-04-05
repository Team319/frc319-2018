package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class LeftSecondCubeToRightScalePt2Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (6.50,18.58,-100.00)
	// (6.50,12.58,-100.00)
	// (21.50,4.58,-10.01)
	
    public LeftSecondCubeToRightScalePt2Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public LeftSecondCubeToRightScalePt2Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.554,11.071,10.000,-100.000},
				{2.768,33.213,10.000,-100.000},
				{7.750,66.427,10.000,-100.000},
				{16.607,110.711,10.000,-100.000},
				{30.446,166.067,10.000,-100.000},
				{50.374,232.493,10.000,-100.000},
				{77.498,309.991,10.000,-100.000},
				{112.925,398.560,10.000,-100.000},
				{157.763,498.200,10.000,-99.999},
				{213.119,608.911,10.000,-99.999},
				{280.099,730.693,10.000,-99.998},
				{359.811,863.546,10.000,-99.997},
				{453.362,1007.470,10.000,-99.996},
				{561.858,1162.466,10.000,-99.993},
				{685.855,1317.461,10.000,-99.990},
				{825.351,1472.457,10.000,-99.986},
				{980.346,1627.452,10.000,-99.980},
				{1150.841,1782.447,10.000,-99.973},
				{1336.836,1937.443,10.000,-99.963},
				{1538.330,2092.438,10.000,-99.951},
				{1755.323,2247.434,10.000,-99.937},
				{1987.816,2402.429,10.000,-99.919},
				{2235.809,2557.424,10.000,-99.898},
				{2499.301,2712.420,10.000,-99.874},
				{2778.293,2867.415,10.000,-99.845},
				{3072.784,3022.411,10.000,-99.811},
				{3382.775,3177.406,10.000,-99.772},
				{3708.265,3332.402,10.000,-99.727},
				{4049.255,3487.397,10.000,-99.677},
				{4405.745,3642.392,10.000,-99.620},
				{4777.734,3797.388,10.000,-99.556},
				{5165.222,3952.383,10.000,-99.484},
				{5568.211,4107.379,10.000,-99.404},
				{5986.698,4262.374,10.000,-99.316},
				{6420.685,4417.370,10.000,-99.219},
				{6870.172,4572.365,10.000,-99.113},
				{7335.158,4727.360,10.000,-98.997},
				{7815.644,4882.356,10.000,-98.870},
				{8311.630,5037.351,10.000,-98.733},
				{8823.114,5192.347,10.000,-98.584},
				{9350.099,5347.342,10.000,-98.424},
				{9892.583,5502.337,10.000,-98.253},
				{10450.566,5657.333,10.000,-98.068},
				{11024.049,5812.328,10.000,-97.872},
				{11613.032,5967.324,10.000,-97.662},
				{12217.514,6122.319,10.000,-97.439},
				{12837.496,6277.315,10.000,-97.203},
				{13472.977,6432.310,10.000,-96.954},
				{14123.958,6587.305,10.000,-96.690},
				{14790.438,6742.301,10.000,-96.413},
				{15472.418,6897.296,10.000,-96.123},
				{16169.897,7052.292,10.000,-95.818},
				{16882.876,7207.287,10.000,-95.500},
				{17611.355,7362.283,10.000,-95.168},
				{18355.333,7517.278,10.000,-94.823},
				{19114.810,7672.273,10.000,-94.465},
				{19889.788,7827.269,10.000,-94.095},
				{20680.264,7982.264,10.000,-93.712},
				{21486.240,8137.260,10.000,-93.317},
				{22307.716,8292.255,10.000,-92.911},
				{23144.691,8447.251,10.000,-92.495},
				{23997.166,8602.246,10.000,-92.069},
				{24865.141,8757.241,10.000,-91.635},
				{25748.615,8912.237,10.000,-91.192},
				{26647.588,9067.232,10.000,-90.742},
				{27562.061,9222.228,10.000,-90.287},
				{28492.034,9377.223,10.000,-89.827},
				{29437.506,9532.218,10.000,-89.363},
				{30398.477,9687.214,10.000,-88.897},
				{31374.948,9842.209,10.000,-88.431},
				{32366.919,9997.205,10.000,-87.965},
				{33374.389,10152.200,10.000,-87.501},
				{34397.359,10307.196,10.000,-87.041},
				{35435.828,10462.191,10.000,-86.586},
				{36489.797,10617.186,10.000,-86.139},
				{37558.712,10761.111,10.000,-85.700},
				{38641.466,10893.964,10.000,-85.272},
				{39736.951,11015.746,10.000,-84.857},
				{40844.062,11126.457,10.000,-84.457},
				{41961.689,11226.097,10.000,-84.075},
				{43088.727,11314.666,10.000,-83.710},
				{44224.069,11392.164,10.000,-83.367},
				{45366.607,11458.590,10.000,-83.045},
				{46515.233,11513.946,10.000,-82.746},
				{47668.842,11558.230,10.000,-82.472},
				{48826.326,11591.443,10.000,-82.223},
				{49986.577,11613.586,10.000,-82.001},
				{51148.489,11624.657,10.000,-81.806},
				{52310.955,11624.657,10.000,-81.639},
				{53473.421,11624.657,10.000,-81.500},
				{54635.886,11624.657,10.000,-81.389},
				{55798.352,11624.657,10.000,-81.308},
				{56960.818,11624.657,10.000,-81.255},
				{58123.283,11624.657,10.000,-81.231},
				{59285.749,11624.657,10.000,-81.236},
				{60448.215,11624.657,10.000,-81.269},
				{61610.680,11624.657,10.000,-81.332},
				{62773.146,11624.657,10.000,-81.423},
				{63935.612,11624.657,10.000,-81.543},
				{65098.077,11624.657,10.000,-81.692},
				{66260.543,11624.657,10.000,-81.868},
				{67423.009,11624.657,10.000,-82.073},
				{68585.474,11624.657,10.000,-82.305},
				{69747.940,11624.657,10.000,-82.564},
				{70910.406,11624.657,10.000,-82.849},
				{72072.871,11624.657,10.000,-83.161},
				{73235.337,11624.657,10.000,-83.498},
				{74397.803,11624.657,10.000,-83.859},
				{75560.268,11624.657,10.000,-84.245},
				{76722.734,11624.657,10.000,-84.653},
				{77885.200,11624.657,10.000,-85.084},
				{79047.665,11624.657,10.000,-85.535},
				{80210.131,11624.657,10.000,-86.007},
				{81372.597,11624.657,10.000,-86.496},
				{82535.062,11624.657,10.000,-87.003},
				{83697.528,11624.657,10.000,-87.526},
				{84859.994,11624.657,10.000,-88.062},
				{86022.459,11624.657,10.000,-88.611},
				{87184.925,11624.657,10.000,-89.171},
				{88347.391,11624.657,10.000,-89.739},
				{89509.856,11624.657,10.000,-90.314},
				{90672.322,11624.657,10.000,-90.894},
				{91834.788,11624.657,10.000,-91.476},
				{92997.253,11624.657,10.000,-92.058},
				{94159.719,11624.657,10.000,-92.638},
				{95322.185,11624.657,10.000,-93.214},
				{96484.650,11624.657,10.000,-93.784},
				{97647.116,11624.657,10.000,-94.344},
				{98809.582,11624.657,10.000,-94.892},
				{99972.047,11624.657,10.000,-95.427},
				{101134.513,11624.657,10.000,-95.944},
				{102296.979,11624.657,10.000,-96.443},
				{103459.444,11624.657,10.000,-96.920},
				{104621.910,11624.657,10.000,-97.372},
				{105784.376,11624.657,10.000,-97.798},
				{106946.841,11624.657,10.000,-98.195},
				{108109.307,11624.657,10.000,-98.559},
				{109271.773,11624.657,10.000,-98.889},
				{110434.238,11624.657,10.000,-99.182},
				{111596.704,11624.657,10.000,-99.434},
				{112759.170,11624.657,10.000,-99.644},
				{113921.635,11624.657,10.000,-99.808},
				{115084.101,11624.657,10.000,-99.924},
				{116246.567,11624.657,10.000,-99.988},
				{117409.032,11624.657,10.000,-100.000},
				{118571.498,11624.657,10.000,-99.999},
				{119733.964,11624.657,10.000,-99.998},
				{120896.429,11624.657,10.000,-99.996},
				{122058.895,11624.657,10.000,-99.994},
				{123221.361,11624.657,10.000,-99.990},
				{124383.826,11624.657,10.000,-99.987},
				{125546.292,11624.657,10.000,-99.982},
				{126708.758,11624.657,10.000,-99.977},
				{127871.223,11624.657,10.000,-99.971},
				{129033.689,11624.657,10.000,-99.964},
				{130196.155,11624.657,10.000,-99.957},
				{131358.620,11624.657,10.000,-99.949},
				{132521.086,11624.657,10.000,-99.941},
				{133683.552,11624.657,10.000,-99.932},
				{134846.017,11624.657,10.000,-99.922},
				{136008.483,11624.657,10.000,-99.912},
				{137170.949,11624.657,10.000,-99.901},
				{138333.414,11624.657,10.000,-99.889},
				{139495.880,11624.657,10.000,-99.877},
				{140658.346,11624.657,10.000,-99.864},
				{141820.811,11624.657,10.000,-99.850},
				{142983.277,11624.657,10.000,-99.836},
				{144145.743,11624.657,10.000,-99.821},
				{145308.208,11624.657,10.000,-99.805},
				{146470.674,11624.657,10.000,-99.789},
				{147633.140,11624.657,10.000,-99.772},
				{148795.605,11624.657,10.000,-99.755},
				{149958.071,11624.657,10.000,-99.736},
				{151120.537,11624.657,10.000,-99.718},
				{152283.002,11624.657,10.000,-99.698},
				{153445.468,11624.657,10.000,-99.678},
				{154607.934,11624.657,10.000,-99.657},
				{155770.399,11624.657,10.000,-99.636},
				{156932.865,11624.657,10.000,-99.613},
				{158095.331,11624.657,10.000,-99.591},
				{159257.796,11624.657,10.000,-99.567},
				{160420.262,11624.657,10.000,-99.543},
				{161582.728,11624.657,10.000,-99.518},
				{162745.193,11624.657,10.000,-99.492},
				{163907.659,11624.657,10.000,-99.466},
				{165070.125,11624.657,10.000,-99.439},
				{166232.590,11624.657,10.000,-99.411},
				{167395.056,11624.657,10.000,-99.383},
				{168557.522,11624.657,10.000,-99.354},
				{169719.987,11624.657,10.000,-99.324},
				{170882.453,11624.657,10.000,-99.293},
				{172044.919,11624.657,10.000,-99.262},
				{173207.384,11624.657,10.000,-99.230},
				{174369.850,11624.657,10.000,-99.197},
				{175532.316,11624.657,10.000,-99.164},
				{176694.781,11624.657,10.000,-99.130},
				{177857.247,11624.657,10.000,-99.095},
				{179019.713,11624.657,10.000,-99.059},
				{180182.178,11624.657,10.000,-99.022},
				{181344.644,11624.657,10.000,-98.985},
				{182507.110,11624.657,10.000,-98.946},
				{183669.575,11624.657,10.000,-98.907},
				{184832.041,11624.657,10.000,-98.868},
				{185994.507,11624.657,10.000,-98.827},
				{187156.972,11624.657,10.000,-98.786},
				{188319.438,11624.657,10.000,-98.743},
				{189481.904,11624.657,10.000,-98.700},
				{190644.369,11624.657,10.000,-98.656},
				{191806.835,11624.657,10.000,-98.611},
				{192969.301,11624.657,10.000,-98.565},
				{194131.766,11624.657,10.000,-98.518},
				{195294.232,11624.657,10.000,-98.471},
				{196456.698,11624.657,10.000,-98.422},
				{197619.163,11624.657,10.000,-98.373},
				{198781.629,11624.657,10.000,-98.322},
				{199944.095,11624.657,10.000,-98.271},
				{201106.560,11624.657,10.000,-98.218},
				{202269.026,11624.657,10.000,-98.165},
				{203431.492,11624.657,10.000,-98.110},
				{204593.957,11624.657,10.000,-98.055},
				{205756.423,11624.657,10.000,-97.999},
				{206918.889,11624.657,10.000,-97.941},
				{208081.354,11624.657,10.000,-97.882},
				{209243.820,11624.657,10.000,-97.823},
				{210406.286,11624.657,10.000,-97.762},
				{211568.751,11624.657,10.000,-97.700},
				{212731.217,11624.657,10.000,-97.637},
				{213893.683,11624.657,10.000,-97.572},
				{215056.148,11624.657,10.000,-97.507},
				{216218.614,11624.657,10.000,-97.440},
				{217381.080,11624.657,10.000,-97.372},
				{218543.545,11624.657,10.000,-97.303},
				{219706.011,11624.657,10.000,-97.232},
				{220868.477,11624.657,10.000,-97.161},
				{222030.942,11624.657,10.000,-97.087},
				{223193.408,11624.657,10.000,-97.013},
				{224355.874,11624.657,10.000,-96.937},
				{225518.339,11624.657,10.000,-96.860},
				{226680.805,11624.657,10.000,-96.781},
				{227843.271,11624.657,10.000,-96.701},
				{229005.736,11624.657,10.000,-96.619},
				{230168.202,11624.657,10.000,-96.536},
				{231330.668,11624.657,10.000,-96.451},
				{232493.133,11624.657,10.000,-96.365},
				{233655.599,11624.657,10.000,-96.277},
				{234818.065,11624.657,10.000,-96.187},
				{235980.530,11624.657,10.000,-96.095},
				{237142.996,11624.657,10.000,-96.002},
				{238305.462,11624.657,10.000,-95.907},
				{239467.927,11624.657,10.000,-95.810},
				{240630.393,11624.657,10.000,-95.712},
				{241792.859,11624.657,10.000,-95.611},
				{242955.324,11624.657,10.000,-95.509},
				{244117.790,11624.657,10.000,-95.404},
				{245280.256,11624.657,10.000,-95.297},
				{246442.721,11624.657,10.000,-95.189},
				{247605.187,11624.657,10.000,-95.078},
				{248767.653,11624.657,10.000,-94.965},
				{249930.118,11624.657,10.000,-94.849},
				{251092.584,11624.657,10.000,-94.732},
				{252255.050,11624.657,10.000,-94.612},
				{253417.515,11624.657,10.000,-94.489},
				{254579.981,11624.657,10.000,-94.364},
				{255742.447,11624.657,10.000,-94.236},
				{256904.912,11624.657,10.000,-94.106},
				{258067.378,11624.657,10.000,-93.973},
				{259229.844,11624.657,10.000,-93.837},
				{260392.309,11624.657,10.000,-93.698},
				{261554.775,11624.657,10.000,-93.556},
				{262717.241,11624.657,10.000,-93.411},
				{263879.706,11624.657,10.000,-93.263},
				{265042.172,11624.657,10.000,-93.112},
				{266204.638,11624.657,10.000,-92.957},
				{267367.103,11624.657,10.000,-92.799},
				{268529.569,11624.657,10.000,-92.638},
				{269692.035,11624.657,10.000,-92.472},
				{270854.500,11624.657,10.000,-92.303},
				{272016.966,11624.657,10.000,-92.130},
				{273179.432,11624.657,10.000,-91.953},
				{274341.897,11624.657,10.000,-91.772},
				{275504.363,11624.657,10.000,-91.586},
				{276666.829,11624.657,10.000,-91.396},
				{277829.294,11624.657,10.000,-91.201},
				{278991.760,11624.657,10.000,-91.002},
				{280154.226,11624.657,10.000,-90.798},
				{281316.691,11624.657,10.000,-90.588},
				{282479.157,11624.657,10.000,-90.373},
				{283641.623,11624.657,10.000,-90.153},
				{284804.088,11624.657,10.000,-89.927},
				{285966.554,11624.657,10.000,-89.695},
				{287129.020,11624.657,10.000,-89.457},
				{288291.485,11624.657,10.000,-89.213},
				{289453.951,11624.657,10.000,-88.962},
				{290616.417,11624.657,10.000,-88.704},
				{291778.882,11624.657,10.000,-88.439},
				{292941.348,11624.657,10.000,-88.166},
				{294103.814,11624.657,10.000,-87.886},
				{295266.279,11624.657,10.000,-87.598},
				{296428.745,11624.657,10.000,-87.301},
				{297591.211,11624.657,10.000,-86.996},
				{298753.676,11624.657,10.000,-86.681},
				{299916.142,11624.657,10.000,-86.357},
				{301078.608,11624.657,10.000,-86.023},
				{302241.073,11624.657,10.000,-85.679},
				{303403.539,11624.657,10.000,-85.324},
				{304566.005,11624.657,10.000,-84.957},
				{305728.470,11624.657,10.000,-84.578},
				{306890.936,11624.657,10.000,-84.188},
				{308053.402,11624.657,10.000,-83.784},
				{309215.867,11624.657,10.000,-83.366},
				{310378.333,11624.657,10.000,-82.934},
				{311540.799,11624.657,10.000,-82.487},
				{312703.264,11624.657,10.000,-82.024},
				{313865.730,11624.657,10.000,-81.545},
				{315028.196,11624.657,10.000,-81.048},
				{316190.661,11624.657,10.000,-80.533},
				{317353.127,11624.657,10.000,-79.998},
				{318515.593,11624.657,10.000,-79.443},
				{319678.058,11624.657,10.000,-78.867},
				{320840.524,11624.657,10.000,-78.269},
				{322002.990,11624.657,10.000,-77.646},
				{323165.455,11624.657,10.000,-76.999},
				{324327.921,11624.657,10.000,-76.325},
				{325490.387,11624.657,10.000,-75.624},
				{326652.852,11624.657,10.000,-74.893},
				{327815.318,11624.657,10.000,-74.131},
				{328977.784,11624.657,10.000,-73.336},
				{330140.249,11624.657,10.000,-72.507},
				{331302.715,11624.657,10.000,-71.642},
				{332465.181,11624.657,10.000,-70.739},
				{333627.646,11624.657,10.000,-69.795},
				{334790.112,11624.657,10.000,-68.809},
				{335952.578,11624.657,10.000,-67.778},
				{337115.043,11624.657,10.000,-66.701},
				{338277.509,11624.657,10.000,-65.574},
				{339439.975,11624.657,10.000,-64.397},
				{340602.440,11624.657,10.000,-63.167},
				{341764.906,11624.657,10.000,-61.881},
				{342927.372,11624.657,10.000,-60.538},
				{344089.837,11624.657,10.000,-59.137},
				{345252.303,11624.657,10.000,-57.675},
				{346414.769,11624.657,10.000,-56.152},
				{347577.234,11624.657,10.000,-54.567},
				{348739.700,11624.657,10.000,-52.920},
				{349902.166,11624.657,10.000,-51.213},
				{351064.631,11624.657,10.000,-49.445},
				{352227.097,11624.657,10.000,-47.620},
				{353389.563,11624.657,10.000,-45.740},
				{354552.028,11624.657,10.000,-43.811},
				{355714.494,11624.657,10.000,-41.836},
				{356876.960,11624.657,10.000,-39.822},
				{358039.425,11624.657,10.000,-37.776},
				{359201.891,11624.657,10.000,-35.706},
				{360364.357,11624.657,10.000,-33.621},
				{361526.822,11624.657,10.000,-31.528},
				{362689.288,11624.657,10.000,-29.437},
				{363851.754,11624.657,10.000,-27.357},
				{365014.219,11624.657,10.000,-25.297},
				{366176.685,11624.657,10.000,-23.266},
				{367339.151,11624.657,10.000,-21.269},
				{368501.616,11624.657,10.000,-19.315},
				{369664.082,11624.657,10.000,-17.408},
				{370826.548,11624.657,10.000,-15.555},
				{371989.013,11624.657,10.000,-13.758},
				{373151.479,11624.657,10.000,-12.020},
				{374313.945,11624.657,10.000,-10.344},
				{375476.410,11624.657,10.000,-8.730},
				{376638.876,11624.657,10.000,-7.178},
				{377801.342,11624.657,10.000,-5.690},
				{378963.807,11624.657,10.000,-4.263},
				{380126.273,11624.657,10.000,-2.897},
				{381288.739,11624.657,10.000,-1.590},
				{382451.204,11624.657,10.000,-0.340},
				{383613.670,11624.657,10.000,0.854},
				{384776.136,11624.657,10.000,1.996},
				{385938.601,11624.657,10.000,3.086},
				{387101.067,11624.657,10.000,4.127},
				{388263.533,11624.657,10.000,5.122},
				{389425.998,11624.657,10.000,6.072},
				{390588.464,11624.657,10.000,6.980},
				{391750.930,11624.657,10.000,7.847},
				{392913.396,11624.657,10.000,8.677},
				{394075.861,11624.657,10.000,9.470},
				{395238.327,11624.657,10.000,10.229},
				{396400.793,11624.657,10.000,10.955},
				{397563.258,11624.657,10.000,11.650},
				{398725.724,11624.657,10.000,12.316},
				{399888.190,11624.657,10.000,12.953},
				{401050.655,11624.657,10.000,13.565},
				{402213.121,11624.657,10.000,14.151},
				{403375.587,11624.657,10.000,14.714},
				{404538.052,11624.657,10.000,15.254},
				{405700.518,11624.657,10.000,15.772},
				{406862.984,11624.657,10.000,16.270},
				{408025.449,11624.657,10.000,16.749},
				{409187.915,11624.657,10.000,17.209},
				{410350.381,11624.657,10.000,17.651},
				{411512.846,11624.657,10.000,18.077},
				{412675.312,11624.657,10.000,18.486},
				{413837.778,11624.657,10.000,18.880},
				{415000.243,11624.657,10.000,19.260},
				{416162.709,11624.657,10.000,19.626},
				{417325.175,11624.657,10.000,19.979},
				{418487.640,11624.657,10.000,20.318},
				{419650.106,11624.657,10.000,20.646},
				{420812.572,11624.657,10.000,20.962},
				{421975.037,11624.657,10.000,21.267},
				{423137.503,11624.657,10.000,21.561},
				{424299.969,11624.657,10.000,21.845},
				{425462.434,11624.657,10.000,22.118},
				{426624.900,11624.657,10.000,22.383},
				{427787.366,11624.657,10.000,22.638},
				{428949.831,11624.657,10.000,22.885},
				{430112.297,11624.657,10.000,23.123},
				{431274.763,11624.657,10.000,23.353},
				{432437.228,11624.657,10.000,23.575},
				{433599.694,11624.657,10.000,23.790},
				{434762.160,11624.657,10.000,23.997},
				{435924.625,11624.657,10.000,24.197},
				{437087.091,11624.657,10.000,24.391},
				{438249.557,11624.657,10.000,24.578},
				{439412.022,11624.657,10.000,24.758},
				{440574.488,11624.657,10.000,24.933},
				{441736.954,11624.657,10.000,25.101},
				{442899.419,11624.657,10.000,25.264},
				{444061.885,11624.657,10.000,25.421},
				{445224.351,11624.657,10.000,25.573},
				{446386.816,11624.657,10.000,25.719},
				{447549.282,11624.657,10.000,25.860},
				{448711.748,11624.657,10.000,25.997},
				{449874.213,11624.657,10.000,26.128},
				{451036.679,11624.657,10.000,26.255},
				{452199.145,11624.657,10.000,26.377},
				{453361.610,11624.657,10.000,26.495},
				{454524.076,11624.657,10.000,26.608},
				{455686.542,11624.657,10.000,26.717},
				{456849.007,11624.657,10.000,26.822},
				{458011.473,11624.657,10.000,26.923},
				{459173.939,11624.657,10.000,27.020},
				{460336.404,11624.657,10.000,27.113},
				{461498.870,11624.657,10.000,27.202},
				{462661.336,11624.657,10.000,27.288},
				{463823.801,11624.657,10.000,27.370},
				{464986.267,11624.657,10.000,27.448},
				{466148.733,11624.657,10.000,27.523},
				{467311.198,11624.657,10.000,27.594},
				{468473.664,11624.657,10.000,27.662},
				{469636.130,11624.657,10.000,27.727},
				{470798.595,11624.657,10.000,27.789},
				{471961.061,11624.657,10.000,27.847},
				{473123.527,11624.657,10.000,27.902},
				{474285.992,11624.657,10.000,27.955},
				{475448.458,11624.657,10.000,28.004},
				{476610.924,11624.657,10.000,28.050},
				{477773.389,11624.657,10.000,28.093},
				{478935.855,11624.657,10.000,28.133},
				{480098.321,11624.657,10.000,28.171},
				{481260.786,11624.657,10.000,28.205},
				{482423.252,11624.657,10.000,28.237},
				{483585.718,11624.657,10.000,28.266},
				{484748.183,11624.657,10.000,28.292},
				{485910.649,11624.657,10.000,28.315},
				{487073.115,11624.657,10.000,28.336},
				{488235.580,11624.657,10.000,28.354},
				{489398.046,11624.657,10.000,28.369},
				{490560.512,11624.657,10.000,28.382},
				{491722.977,11624.657,10.000,28.392},
				{492885.443,11624.657,10.000,28.400},
				{494047.909,11624.657,10.000,28.405},
				{495210.374,11624.657,10.000,28.407},
				{496372.840,11624.657,10.000,28.407},
				{497535.306,11624.657,10.000,28.404},
				{498697.771,11624.657,10.000,28.399},
				{499860.237,11624.657,10.000,28.391},
				{501022.703,11624.657,10.000,28.381},
				{502185.168,11624.657,10.000,28.368},
				{503347.634,11624.657,10.000,28.352},
				{504510.100,11624.657,10.000,28.334},
				{505672.565,11624.657,10.000,28.314},
				{506835.031,11624.657,10.000,28.291},
				{507997.497,11624.657,10.000,28.265},
				{509159.962,11624.657,10.000,28.237},
				{510322.428,11624.657,10.000,28.207},
				{511484.894,11624.657,10.000,28.174},
				{512647.359,11624.657,10.000,28.138},
				{513809.825,11624.657,10.000,28.100},
				{514972.291,11624.657,10.000,28.059},
				{516134.756,11624.657,10.000,28.016},
				{517297.222,11624.657,10.000,27.970},
				{518459.688,11624.657,10.000,27.921},
				{519622.153,11624.657,10.000,27.870},
				{520784.619,11624.657,10.000,27.816},
				{521947.085,11624.657,10.000,27.760},
				{523109.550,11624.657,10.000,27.701},
				{524272.016,11624.657,10.000,27.639},
				{525434.482,11624.657,10.000,27.575},
				{526596.947,11624.657,10.000,27.507},
				{527759.413,11624.657,10.000,27.437},
				{528921.879,11624.657,10.000,27.365},
				{530084.344,11624.657,10.000,27.289},
				{531246.810,11624.657,10.000,27.210},
				{532409.276,11624.657,10.000,27.129},
				{533571.741,11624.657,10.000,27.045},
				{534734.207,11624.657,10.000,26.958},
				{535896.673,11624.657,10.000,26.868},
				{537059.138,11624.657,10.000,26.774},
				{538221.604,11624.657,10.000,26.678},
				{539384.070,11624.657,10.000,26.579},
				{540546.535,11624.657,10.000,26.476},
				{541709.001,11624.657,10.000,26.371},
				{542871.467,11624.657,10.000,26.262},
				{544033.932,11624.657,10.000,26.150},
				{545196.398,11624.657,10.000,26.034},
				{546358.864,11624.657,10.000,25.916},
				{547521.329,11624.657,10.000,25.793},
				{548683.795,11624.657,10.000,25.668},
				{549846.261,11624.657,10.000,25.539},
				{551008.726,11624.657,10.000,25.406},
				{552171.192,11624.657,10.000,25.269},
				{553333.658,11624.657,10.000,25.129},
				{554496.123,11624.657,10.000,24.985},
				{555658.589,11624.657,10.000,24.838},
				{556821.055,11624.657,10.000,24.686},
				{557983.520,11624.657,10.000,24.531},
				{559145.986,11624.657,10.000,24.371},
				{560308.452,11624.657,10.000,24.207},
				{561470.917,11624.657,10.000,24.039},
				{562633.383,11624.657,10.000,23.867},
				{563795.849,11624.657,10.000,23.691},
				{564958.314,11624.657,10.000,23.510},
				{566120.780,11624.657,10.000,23.324},
				{567283.246,11624.657,10.000,23.134},
				{568445.711,11624.657,10.000,22.940},
				{569608.177,11624.657,10.000,22.740},
				{570770.643,11624.657,10.000,22.536},
				{571933.108,11624.657,10.000,22.327},
				{573095.574,11624.657,10.000,22.112},
				{574258.040,11624.657,10.000,21.893},
				{575420.505,11624.657,10.000,21.668},
				{576582.971,11624.657,10.000,21.438},
				{577745.437,11624.657,10.000,21.202},
				{578907.902,11624.657,10.000,20.961},
				{580070.368,11624.657,10.000,20.715},
				{581232.834,11624.657,10.000,20.462},
				{582395.299,11624.657,10.000,20.204},
				{583557.765,11624.657,10.000,19.939},
				{584720.231,11624.657,10.000,19.669},
				{585882.696,11624.657,10.000,19.392},
				{587045.162,11624.657,10.000,19.109},
				{588207.628,11624.657,10.000,18.819},
				{589370.093,11624.657,10.000,18.523},
				{590532.559,11624.657,10.000,18.221},
				{591695.025,11624.657,10.000,17.911},
				{592857.490,11624.657,10.000,17.595},
				{594019.956,11624.657,10.000,17.272},
				{595182.422,11624.657,10.000,16.941},
				{596344.887,11624.657,10.000,16.604},
				{597507.353,11624.657,10.000,16.259},
				{598669.819,11624.657,10.000,15.906},
				{599832.284,11624.657,10.000,15.547},
				{600994.750,11624.657,10.000,15.179},
				{602157.216,11624.657,10.000,14.804},
				{603319.681,11624.657,10.000,14.422},
				{604482.147,11624.657,10.000,14.031},
				{605644.613,11624.657,10.000,13.633},
				{606807.078,11624.657,10.000,13.227},
				{607969.544,11624.657,10.000,12.813},
				{609132.010,11624.657,10.000,12.392},
				{610294.475,11624.657,10.000,11.962},
				{611456.941,11624.657,10.000,11.525},
				{612619.407,11624.657,10.000,11.080},
				{613781.872,11624.657,10.000,10.627},
				{614944.338,11624.657,10.000,10.166},
				{616106.804,11624.657,10.000,9.698},
				{617269.269,11624.657,10.000,9.223},
				{618431.735,11624.657,10.000,8.740},
				{619594.088,11622.410,10.000,8.251},
				{620755.663,11609.092,10.000,7.755},
				{621915.353,11584.703,10.000,7.253},
				{623072.050,11549.243,10.000,6.746},
				{624224.648,11502.711,10.000,6.236},
				{625372.039,11445.109,10.000,5.722},
				{626513.116,11376.436,10.000,5.206},
				{627646.773,11296.691,10.000,4.689},
				{628771.901,11205.875,10.000,4.172},
				{629887.394,11103.989,10.000,3.657},
				{630992.145,10991.031,10.000,3.143},
				{632085.047,10867.002,10.000,2.633},
				{633164.992,10731.902,10.000,2.127},
				{634230.874,10585.731,10.000,1.627},
				{635281.697,10430.735,10.000,1.133},
				{636317.021,10275.740,10.000,0.648},
				{637336.845,10120.744,10.000,0.170},
				{638341.169,9965.749,10.000,-0.299},
				{639329.995,9810.753,10.000,-0.759},
				{640303.320,9655.758,10.000,-1.208},
				{641261.146,9500.763,10.000,-1.648},
				{642203.473,9345.767,10.000,-2.077},
				{643130.300,9190.772,10.000,-2.495},
				{644041.627,9035.776,10.000,-2.901},
				{644937.455,8880.781,10.000,-3.296},
				{645817.783,8725.785,10.000,-3.678},
				{646682.612,8570.790,10.000,-4.048},
				{647531.941,8415.795,10.000,-4.406},
				{648365.771,8260.799,10.000,-4.751},
				{649184.101,8105.804,10.000,-5.084},
				{649986.932,7950.808,10.000,-5.403},
				{650774.263,7795.813,10.000,-5.710},
				{651546.094,7640.818,10.000,-6.003},
				{652302.426,7485.822,10.000,-6.284},
				{653043.259,7330.827,10.000,-6.552},
				{653768.592,7175.831,10.000,-6.807},
				{654478.425,7020.836,10.000,-7.050},
				{655172.759,6865.840,10.000,-7.280},
				{655851.593,6710.845,10.000,-7.498},
				{656514.928,6555.850,10.000,-7.704},
				{657162.763,6400.854,10.000,-7.898},
				{657795.099,6245.859,10.000,-8.081},
				{658411.935,6090.863,10.000,-8.253},
				{659013.271,5935.868,10.000,-8.413},
				{659599.108,5780.872,10.000,-8.564},
				{660169.446,5625.877,10.000,-8.704},
				{660724.284,5470.882,10.000,-8.834},
				{661263.622,5315.886,10.000,-8.955},
				{661787.461,5160.891,10.000,-9.066},
				{662295.800,5005.895,10.000,-9.169},
				{662788.640,4850.900,10.000,-9.264},
				{663265.980,4695.904,10.000,-9.350},
				{663727.821,4540.909,10.000,-9.429},
				{664174.162,4385.914,10.000,-9.501},
				{664605.004,4230.918,10.000,-9.567},
				{665020.346,4075.923,10.000,-9.625},
				{665420.188,3920.927,10.000,-9.678},
				{665804.531,3765.932,10.000,-9.726},
				{666173.374,3610.937,10.000,-9.768},
				{666526.718,3455.941,10.000,-9.805},
				{666864.563,3300.946,10.000,-9.838},
				{667186.908,3145.950,10.000,-9.867},
				{667493.753,2990.955,10.000,-9.892},
				{667785.098,2835.959,10.000,-9.913},
				{668060.945,2680.964,10.000,-9.932},
				{668321.291,2525.969,10.000,-9.947},
				{668566.138,2370.973,10.000,-9.960},
				{668795.486,2215.978,10.000,-9.971},
				{669009.334,2060.982,10.000,-9.980},
				{669207.682,1905.987,10.000,-9.988},
				{669390.531,1750.991,10.000,-9.994},
				{669557.881,1595.996,10.000,-9.998},
				{669709.731,1441.001,10.000,-10.002},
				{669846.081,1286.005,10.000,-10.004},
				{669966.932,1131.010,10.000,-10.006},
				{670072.395,978.261,10.000,-10.007},
				{670163.137,836.584,10.000,-10.008},
				{670240.265,705.977,10.000,-10.009},
				{670304.886,586.442,10.000,-10.009},
				{670358.107,477.978,10.000,-10.010},
				{670401.036,380.585,10.000,-10.010},
				{670434.778,294.263,10.000,-10.010},
				{670460.442,219.012,10.000,-10.010},
				{670479.134,154.832,10.000,-10.010},
				{670491.962,101.724,10.000,-10.010},
				{670500.032,59.686,10.000,-10.010},
				{670504.452,28.720,10.000,-10.010},
				{670506.330,8.824,10.000,-10.010},
				{670506.771,0.000,10.000,-10.010},
				{670506.771,0.000,10.000,-10.010}		};

}