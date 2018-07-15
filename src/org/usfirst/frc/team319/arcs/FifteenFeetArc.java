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
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public FifteenFeetArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.564,11.280,10.000,0.000},
				{2.820,33.839,10.000,0.000},
				{7.896,67.678,10.000,0.000},
				{16.920,112.797,10.000,0.000},
				{31.019,169.196,10.000,0.000},
				{51.323,236.874,10.000,0.000},
				{78.958,315.832,10.000,0.000},
				{115.053,406.070,10.000,0.000},
				{160.736,507.587,10.000,0.000},
				{217.134,620.384,10.000,0.000},
				{285.377,744.461,10.000,0.000},
				{366.591,879.817,10.000,0.000},
				{461.904,1026.454,10.000,0.000},
				{572.445,1184.369,10.000,0.000},
				{698.778,1342.285,10.000,0.000},
				{840.902,1500.201,10.000,0.000},
				{998.818,1658.117,10.000,0.000},
				{1172.526,1816.033,10.000,0.000},
				{1362.025,1973.949,10.000,0.000},
				{1567.316,2131.865,10.000,0.000},
				{1788.398,2289.781,10.000,0.000},
				{2025.272,2447.697,10.000,0.000},
				{2277.937,2605.613,10.000,0.000},
				{2546.394,2763.529,10.000,0.000},
				{2830.643,2921.445,10.000,0.000},
				{3130.683,3079.361,10.000,0.000},
				{3446.515,3237.277,10.000,0.000},
				{3778.139,3395.192,10.000,0.000},
				{4125.554,3553.108,10.000,0.000},
				{4488.760,3711.024,10.000,0.000},
				{4867.758,3868.940,10.000,0.000},
				{5262.548,4026.856,10.000,0.000},
				{5673.130,4184.772,10.000,0.000},
				{6099.503,4342.688,10.000,0.000},
				{6541.667,4500.604,10.000,0.000},
				{6999.624,4658.520,10.000,0.000},
				{7473.371,4816.436,10.000,0.000},
				{7962.911,4974.352,10.000,0.000},
				{8468.242,5132.268,10.000,0.000},
				{8989.364,5290.184,10.000,0.000},
				{9526.278,5448.100,10.000,0.000},
				{10078.984,5606.015,10.000,0.000},
				{10647.481,5763.931,10.000,0.000},
				{11231.770,5921.847,10.000,0.000},
				{11831.851,6079.763,10.000,0.000},
				{12447.723,6237.679,10.000,0.000},
				{13079.387,6395.595,10.000,0.000},
				{13726.842,6553.511,10.000,0.000},
				{14390.089,6711.427,10.000,0.000},
				{15069.127,6869.343,10.000,0.000},
				{15763.958,7027.259,10.000,0.000},
				{16474.579,7185.175,10.000,0.000},
				{17200.992,7343.091,10.000,0.000},
				{17943.197,7501.007,10.000,0.000},
				{18701.194,7658.923,10.000,0.000},
				{19474.982,7816.838,10.000,0.000},
				{20264.561,7974.754,10.000,0.000},
				{21069.933,8132.670,10.000,0.000},
				{21891.096,8290.586,10.000,0.000},
				{22728.050,8448.502,10.000,0.000},
				{23580.796,8606.418,10.000,0.000},
				{24449.334,8764.334,10.000,0.000},
				{25333.663,8922.250,10.000,0.000},
				{26233.784,9080.166,10.000,0.000},
				{27149.696,9238.082,10.000,0.000},
				{28081.400,9395.998,10.000,0.000},
				{29028.896,9553.914,10.000,0.000},
				{29992.183,9711.830,10.000,0.000},
				{30971.261,9869.746,10.000,0.000},
				{31966.132,10027.661,10.000,0.000},
				{32976.794,10185.577,10.000,0.000},
				{34003.247,10343.493,10.000,0.000},
				{35045.492,10501.409,10.000,0.000},
				{36103.529,10659.325,10.000,0.000},
				{37177.357,10817.241,10.000,0.000},
				{38266.413,10963.877,10.000,0.000},
				{39369.569,11099.234,10.000,0.000},
				{40485.696,11223.311,10.000,0.000},
				{41613.667,11336.108,10.000,0.000},
				{42752.354,11437.625,10.000,0.000},
				{43900.628,11527.863,10.000,0.000},
				{45057.362,11606.821,10.000,0.000},
				{46221.428,11674.499,10.000,0.000},
				{47391.698,11730.898,10.000,0.000},
				{48567.044,11776.016,10.000,0.000},
				{49746.337,11809.855,10.000,0.000},
				{50928.451,11832.415,10.000,0.000},
				{52112.256,11843.695,10.000,0.000},
				{53296.626,11843.695,10.000,0.000},
				{54480.995,11843.695,10.000,0.000},
				{55665.365,11843.695,10.000,0.000},
				{56849.734,11843.695,10.000,0.000},
				{58034.104,11843.695,10.000,0.000},
				{59218.473,11843.695,10.000,0.000},
				{60402.843,11843.695,10.000,0.000},
				{61587.212,11843.695,10.000,0.000},
				{62771.581,11843.695,10.000,0.000},
				{63955.951,11843.695,10.000,0.000},
				{65140.320,11843.695,10.000,0.000},
				{66324.690,11843.695,10.000,0.000},
				{67509.059,11843.695,10.000,0.000},
				{68693.429,11843.695,10.000,0.000},
				{69877.798,11843.695,10.000,0.000},
				{71062.168,11843.695,10.000,0.000},
				{72246.537,11843.695,10.000,0.000},
				{73430.907,11843.695,10.000,0.000},
				{74615.276,11843.695,10.000,0.000},
				{75799.646,11843.695,10.000,0.000},
				{76984.015,11843.695,10.000,0.000},
				{78168.384,11843.695,10.000,0.000},
				{79352.754,11843.695,10.000,0.000},
				{80537.123,11843.695,10.000,0.000},
				{81721.493,11843.695,10.000,0.000},
				{82905.862,11843.695,10.000,0.000},
				{84090.232,11843.695,10.000,0.000},
				{85274.601,11843.695,10.000,0.000},
				{86458.971,11843.695,10.000,0.000},
				{87643.340,11843.695,10.000,0.000},
				{88827.710,11843.695,10.000,0.000},
				{90012.079,11843.695,10.000,0.000},
				{91196.449,11843.695,10.000,0.000},
				{92380.818,11843.695,10.000,0.000},
				{93565.187,11843.695,10.000,0.000},
				{94749.557,11843.695,10.000,0.000},
				{95933.926,11843.695,10.000,0.000},
				{97118.296,11843.695,10.000,0.000},
				{98302.665,11843.695,10.000,0.000},
				{99487.035,11843.695,10.000,0.000},
				{100671.404,11843.695,10.000,0.000},
				{101855.774,11843.695,10.000,0.000},
				{103040.143,11843.695,10.000,0.000},
				{104224.513,11843.695,10.000,0.000},
				{105408.882,11843.695,10.000,0.000},
				{106593.252,11843.695,10.000,0.000},
				{107777.621,11843.695,10.000,0.000},
				{108961.990,11843.695,10.000,0.000},
				{110146.360,11843.695,10.000,0.000},
				{111330.729,11843.695,10.000,0.000},
				{112515.099,11843.695,10.000,0.000},
				{113699.468,11843.695,10.000,0.000},
				{114883.838,11843.695,10.000,0.000},
				{116068.207,11843.695,10.000,0.000},
				{117252.577,11843.695,10.000,0.000},
				{118436.946,11843.695,10.000,0.000},
				{119621.316,11843.695,10.000,0.000},
				{120805.685,11843.695,10.000,0.000},
				{121990.055,11843.695,10.000,0.000},
				{123174.424,11843.695,10.000,0.000},
				{124358.793,11843.695,10.000,0.000},
				{125543.163,11843.695,10.000,0.000},
				{126727.532,11843.695,10.000,0.000},
				{127911.902,11843.695,10.000,0.000},
				{129096.271,11843.695,10.000,0.000},
				{130280.641,11843.695,10.000,0.000},
				{131465.010,11843.695,10.000,0.000},
				{132649.380,11843.695,10.000,0.000},
				{133833.749,11843.695,10.000,0.000},
				{135018.119,11843.695,10.000,0.000},
				{136202.488,11843.695,10.000,0.000},
				{137386.858,11843.695,10.000,0.000},
				{138571.227,11843.695,10.000,0.000},
				{139755.596,11843.695,10.000,0.000},
				{140939.966,11843.695,10.000,0.000},
				{142124.335,11843.695,10.000,0.000},
				{143308.705,11843.695,10.000,0.000},
				{144493.074,11843.695,10.000,0.000},
				{145677.444,11843.695,10.000,0.000},
				{146861.813,11843.695,10.000,0.000},
				{148046.183,11843.695,10.000,0.000},
				{149230.552,11843.695,10.000,0.000},
				{150414.922,11843.695,10.000,0.000},
				{151599.291,11843.695,10.000,0.000},
				{152783.661,11843.695,10.000,0.000},
				{153968.030,11843.695,10.000,0.000},
				{155152.399,11843.695,10.000,0.000},
				{156336.769,11843.695,10.000,0.000},
				{157521.138,11843.695,10.000,0.000},
				{158705.508,11843.695,10.000,0.000},
				{159889.877,11843.695,10.000,0.000},
				{161074.247,11843.695,10.000,0.000},
				{162258.616,11843.695,10.000,0.000},
				{163442.986,11843.695,10.000,0.000},
				{164627.355,11843.695,10.000,0.000},
				{165811.725,11843.695,10.000,0.000},
				{166996.094,11843.695,10.000,0.000},
				{168180.464,11843.695,10.000,0.000},
				{169364.833,11843.695,10.000,0.000},
				{170549.202,11843.695,10.000,0.000},
				{171733.572,11843.695,10.000,0.000},
				{172917.941,11843.695,10.000,0.000},
				{174102.311,11843.695,10.000,0.000},
				{175286.680,11843.695,10.000,0.000},
				{176471.050,11843.695,10.000,0.000},
				{177655.419,11843.695,10.000,0.000},
				{178839.789,11843.695,10.000,0.000},
				{180024.158,11843.695,10.000,0.000},
				{181208.528,11843.695,10.000,0.000},
				{182392.897,11843.695,10.000,0.000},
				{183577.267,11843.695,10.000,0.000},
				{184761.636,11843.695,10.000,0.000},
				{185946.005,11843.695,10.000,0.000},
				{187130.375,11843.695,10.000,0.000},
				{188314.744,11843.695,10.000,0.000},
				{189499.114,11843.695,10.000,0.000},
				{190683.483,11843.695,10.000,0.000},
				{191867.853,11843.695,10.000,0.000},
				{193052.222,11843.695,10.000,0.000},
				{194236.592,11843.695,10.000,0.000},
				{195420.961,11843.695,10.000,0.000},
				{196605.331,11843.695,10.000,0.000},
				{197789.700,11843.695,10.000,0.000},
				{198974.070,11843.695,10.000,0.000},
				{200158.439,11843.695,10.000,0.000},
				{201342.808,11843.695,10.000,0.000},
				{202527.178,11843.695,10.000,0.000},
				{203711.547,11843.695,10.000,0.000},
				{204895.917,11843.695,10.000,0.000},
				{206080.286,11843.695,10.000,0.000},
				{207264.656,11843.695,10.000,0.000},
				{208449.025,11843.695,10.000,0.000},
				{209633.395,11843.695,10.000,0.000},
				{210817.764,11843.695,10.000,0.000},
				{212002.134,11843.695,10.000,0.000},
				{213186.503,11843.695,10.000,0.000},
				{214370.873,11843.695,10.000,0.000},
				{215555.242,11843.695,10.000,0.000},
				{216739.611,11843.695,10.000,0.000},
				{217923.981,11843.695,10.000,0.000},
				{219108.350,11843.695,10.000,0.000},
				{220292.720,11843.695,10.000,0.000},
				{221477.089,11843.695,10.000,0.000},
				{222661.459,11843.695,10.000,0.000},
				{223845.828,11843.695,10.000,0.000},
				{225030.198,11843.695,10.000,0.000},
				{226214.567,11843.695,10.000,0.000},
				{227398.937,11843.695,10.000,0.000},
				{228583.306,11843.695,10.000,0.000},
				{229767.676,11843.695,10.000,0.000},
				{230952.045,11843.695,10.000,0.000},
				{232136.414,11843.695,10.000,0.000},
				{233320.784,11843.695,10.000,0.000},
				{234505.153,11843.695,10.000,0.000},
				{235689.523,11843.695,10.000,0.000},
				{236873.892,11843.695,10.000,0.000},
				{238058.262,11843.695,10.000,0.000},
				{239242.631,11843.695,10.000,0.000},
				{240427.001,11843.695,10.000,0.000},
				{241611.370,11843.695,10.000,0.000},
				{242795.740,11843.695,10.000,0.000},
				{243980.109,11843.695,10.000,0.000},
				{245163.915,11832.415,10.000,0.000},
				{246346.028,11809.855,10.000,0.000},
				{247525.322,11776.016,10.000,0.000},
				{248700.667,11730.898,10.000,0.000},
				{249870.937,11674.499,10.000,0.000},
				{251035.003,11606.821,10.000,0.000},
				{252191.737,11527.863,10.000,0.000},
				{253340.012,11437.625,10.000,0.000},
				{254478.698,11336.108,10.000,0.000},
				{255606.669,11223.311,10.000,0.000},
				{256722.797,11099.234,10.000,0.000},
				{257825.952,10963.877,10.000,0.000},
				{258915.008,10817.241,10.000,0.000},
				{259988.836,10659.325,10.000,0.000},
				{261046.873,10501.409,10.000,0.000},
				{262089.118,10343.493,10.000,0.000},
				{263115.572,10185.577,10.000,0.000},
				{264126.234,10027.661,10.000,0.000},
				{265121.104,9869.746,10.000,0.000},
				{266100.183,9711.830,10.000,0.000},
				{267063.470,9553.914,10.000,0.000},
				{268010.965,9395.998,10.000,0.000},
				{268942.669,9238.082,10.000,0.000},
				{269858.582,9080.166,10.000,0.000},
				{270758.703,8922.250,10.000,0.000},
				{271643.032,8764.334,10.000,0.000},
				{272511.569,8606.418,10.000,0.000},
				{273364.315,8448.502,10.000,0.000},
				{274201.270,8290.586,10.000,0.000},
				{275022.433,8132.670,10.000,0.000},
				{275827.804,7974.754,10.000,0.000},
				{276617.384,7816.838,10.000,0.000},
				{277391.172,7658.923,10.000,0.000},
				{278149.168,7501.007,10.000,0.000},
				{278891.373,7343.091,10.000,0.000},
				{279617.786,7185.175,10.000,0.000},
				{280328.408,7027.259,10.000,0.000},
				{281023.238,6869.343,10.000,0.000},
				{281702.276,6711.427,10.000,0.000},
				{282365.523,6553.511,10.000,0.000},
				{283012.979,6395.595,10.000,0.000},
				{283644.642,6237.679,10.000,0.000},
				{284260.515,6079.763,10.000,0.000},
				{284860.595,5921.847,10.000,0.000},
				{285444.884,5763.931,10.000,0.000},
				{286013.381,5606.015,10.000,0.000},
				{286566.087,5448.100,10.000,0.000},
				{287103.001,5290.184,10.000,0.000},
				{287624.124,5132.268,10.000,0.000},
				{288129.455,4974.352,10.000,0.000},
				{288618.994,4816.436,10.000,0.000},
				{289092.742,4658.520,10.000,0.000},
				{289550.698,4500.604,10.000,0.000},
				{289992.863,4342.688,10.000,0.000},
				{290419.236,4184.772,10.000,0.000},
				{290829.817,4026.856,10.000,0.000},
				{291224.607,3868.940,10.000,0.000},
				{291603.605,3711.024,10.000,0.000},
				{291966.812,3553.108,10.000,0.000},
				{292314.227,3395.192,10.000,0.000},
				{292645.850,3237.277,10.000,0.000},
				{292961.682,3079.361,10.000,0.000},
				{293261.722,2921.445,10.000,0.000},
				{293545.971,2763.529,10.000,0.000},
				{293814.428,2605.613,10.000,0.000},
				{294067.094,2447.697,10.000,0.000},
				{294303.968,2289.781,10.000,0.000},
				{294525.050,2131.865,10.000,0.000},
				{294730.341,1973.949,10.000,0.000},
				{294919.840,1816.033,10.000,0.000},
				{295093.547,1658.117,10.000,0.000},
				{295251.463,1500.201,10.000,0.000},
				{295393.587,1342.285,10.000,0.000},
				{295519.920,1184.369,10.000,0.000},
				{295630.461,1026.454,10.000,0.000},
				{295725.775,879.817,10.000,0.000},
				{295806.989,744.461,10.000,0.000},
				{295875.231,620.384,10.000,0.000},
				{295931.630,507.587,10.000,0.000},
				{295977.312,406.070,10.000,0.000},
				{296013.407,315.832,10.000,0.000},
				{296041.043,236.874,10.000,0.000},
				{296061.346,169.196,10.000,0.000},
				{296075.446,112.797,10.000,0.000},
				{296084.470,67.678,10.000,0.000},
				{296089.545,33.839,10.000,0.000},
				{296091.801,11.280,10.000,0.000},
				{296092.365,0.000,10.000,0.000},
				{296092.365,0.000,10.000,0.000}		};

}