package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class TestPathArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,13.08,0.00)
	// (6.63,15.08,45.00)
	
    public TestPathArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public TestPathArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.428,8.568,10.000,0.000},
				{2.142,25.703,10.000,0.000},
				{5.997,51.407,10.000,0.000},
				{12.852,85.678,10.000,0.000},
				{23.561,128.517,10.000,0.000},
				{38.984,179.924,10.000,0.000},
				{59.975,239.899,10.000,0.000},
				{87.392,308.441,10.000,0.000},
				{122.091,385.551,10.000,0.000},
				{164.930,471.230,10.000,0.000},
				{216.766,565.476,10.000,0.001},
				{278.454,668.289,10.000,0.001},
				{350.852,779.671,10.000,0.002},
				{434.816,899.620,10.000,0.003},
				{530.776,1019.569,10.000,0.004},
				{638.730,1139.519,10.000,0.005},
				{758.680,1259.468,10.000,0.008},
				{890.624,1379.418,10.000,0.011},
				{1034.563,1499.367,10.000,0.014},
				{1190.497,1619.316,10.000,0.019},
				{1358.426,1739.266,10.000,0.025},
				{1538.350,1859.215,10.000,0.032},
				{1730.269,1979.164,10.000,0.040},
				{1934.183,2099.114,10.000,0.050},
				{2150.092,2219.063,10.000,0.062},
				{2377.996,2339.012,10.000,0.075},
				{2617.895,2458.962,10.000,0.091},
				{2869.788,2578.911,10.000,0.109},
				{3133.677,2698.860,10.000,0.130},
				{3409.560,2818.810,10.000,0.154},
				{3697.439,2938.759,10.000,0.181},
				{3997.312,3058.708,10.000,0.211},
				{4309.180,3178.658,10.000,0.245},
				{4633.044,3298.607,10.000,0.283},
				{4968.902,3418.557,10.000,0.325},
				{5316.755,3538.506,10.000,0.372},
				{5676.603,3658.455,10.000,0.424},
				{6048.446,3778.405,10.000,0.480},
				{6432.284,3898.354,10.000,0.543},
				{6828.117,4018.303,10.000,0.611},
				{7235.945,4138.253,10.000,0.685},
				{7655.767,4258.202,10.000,0.766},
				{8087.585,4378.151,10.000,0.854},
				{8531.398,4498.101,10.000,0.949},
				{8987.205,4618.050,10.000,1.052},
				{9455.008,4737.999,10.000,1.163},
				{9934.805,4857.949,10.000,1.282},
				{10426.597,4977.898,10.000,1.410},
				{10930.385,5097.847,10.000,1.548},
				{11446.167,5217.797,10.000,1.696},
				{11973.944,5337.746,10.000,1.854},
				{12513.716,5457.695,10.000,2.022},
				{13065.483,5577.645,10.000,2.202},
				{13629.245,5697.594,10.000,2.393},
				{14205.002,5817.544,10.000,2.597},
				{14792.754,5937.493,10.000,2.813},
				{15392.500,6057.442,10.000,3.043},
				{16004.242,6177.392,10.000,3.286},
				{16627.979,6297.341,10.000,3.543},
				{17263.710,6417.290,10.000,3.815},
				{17911.437,6537.240,10.000,4.103},
				{18571.158,6657.189,10.000,4.406},
				{19242.875,6777.138,10.000,4.725},
				{19926.586,6897.088,10.000,5.062},
				{20622.292,7017.037,10.000,5.416},
				{21329.993,7136.986,10.000,5.788},
				{22049.689,7256.936,10.000,6.178},
				{22781.380,7376.885,10.000,6.588},
				{23525.066,7496.834,10.000,7.017},
				{24280.747,7616.784,10.000,7.466},
				{25048.423,7736.733,10.000,7.936},
				{25828.094,7856.682,10.000,8.427},
				{26619.760,7976.632,10.000,8.939},
				{27423.420,8096.581,10.000,9.474},
				{28239.076,8216.531,10.000,10.030},
				{29066.298,8327.912,10.000,10.608},
				{29904.230,8430.726,10.000,11.209},
				{30752.015,8524.972,10.000,11.830},
				{31608.796,8610.650,10.000,12.472},
				{32473.716,8687.760,10.000,13.134},
				{33345.920,8756.303,10.000,13.815},
				{34224.549,8816.277,10.000,14.513},
				{35108.747,8867.684,10.000,15.228},
				{35997.657,8910.523,10.000,15.959},
				{36890.423,8944.794,10.000,16.703},
				{37786.188,8970.498,10.000,17.459},
				{38684.094,8987.634,10.000,18.226},
				{39583.286,8996.201,10.000,19.002},
				{40482.906,8996.201,10.000,19.785},
				{41382.526,8996.201,10.000,20.574},
				{42282.146,8996.201,10.000,21.366},
				{43181.766,8996.201,10.000,22.162},
				{44081.387,8996.201,10.000,22.959},
				{44980.744,8990.942,10.000,23.757},
				{45879.146,8977.114,10.000,24.553},
				{46775.738,8954.719,10.000,25.346},
				{47669.662,8923.756,10.000,26.132},
				{48560.061,8884.225,10.000,26.911},
				{49446.079,8836.127,10.000,27.681},
				{50326.858,8779.460,10.000,28.440},
				{51201.542,8714.226,10.000,29.185},
				{52069.275,8640.424,10.000,29.916},
				{52929.199,8558.054,10.000,30.631},
				{53780.457,8467.117,10.000,31.328},
				{54622.194,8367.611,10.000,32.007},
				{55453.551,8259.538,10.000,32.666},
				{56273.673,8142.897,10.000,33.305},
				{57081.965,8022.948,10.000,33.922},
				{57878.262,7902.998,10.000,34.518},
				{58662.565,7783.049,10.000,35.092},
				{59434.872,7663.099,10.000,35.645},
				{60195.185,7543.150,10.000,36.177},
				{60943.502,7423.201,10.000,36.687},
				{61679.825,7303.251,10.000,37.178},
				{62404.153,7183.302,10.000,37.647},
				{63116.485,7063.353,10.000,38.097},
				{63816.823,6943.403,10.000,38.527},
				{64505.166,6823.454,10.000,38.938},
				{65181.514,6703.505,10.000,39.330},
				{65845.867,6583.555,10.000,39.703},
				{66498.225,6463.606,10.000,40.059},
				{67138.588,6343.657,10.000,40.397},
				{67766.956,6223.707,10.000,40.719},
				{68383.330,6103.758,10.000,41.023},
				{68987.708,5983.809,10.000,41.312},
				{69580.091,5863.859,10.000,41.585},
				{70160.480,5743.910,10.000,41.844},
				{70728.873,5623.961,10.000,42.087},
				{71285.272,5504.011,10.000,42.317},
				{71829.675,5384.062,10.000,42.533},
				{72362.084,5264.112,10.000,42.737},
				{72882.498,5144.163,10.000,42.928},
				{73390.917,5024.214,10.000,43.106},
				{73887.341,4904.264,10.000,43.274},
				{74371.770,4784.315,10.000,43.430},
				{74844.204,4664.366,10.000,43.575},
				{75304.643,4544.416,10.000,43.711},
				{75753.087,4424.467,10.000,43.836},
				{76189.536,4304.518,10.000,43.953},
				{76613.991,4184.568,10.000,44.060},
				{77026.450,4064.619,10.000,44.160},
				{77426.914,3944.670,10.000,44.251},
				{77815.384,3824.720,10.000,44.335},
				{78191.858,3704.771,10.000,44.412},
				{78556.338,3584.822,10.000,44.481},
				{78908.823,3464.872,10.000,44.545},
				{79249.312,3344.923,10.000,44.603},
				{79577.807,3224.973,10.000,44.655},
				{79894.307,3105.024,10.000,44.701},
				{80198.812,2985.075,10.000,44.743},
				{80491.322,2865.125,10.000,44.781},
				{80771.837,2745.176,10.000,44.814},
				{81040.357,2625.227,10.000,44.843},
				{81296.882,2505.277,10.000,44.869},
				{81541.413,2385.328,10.000,44.891},
				{81773.948,2265.379,10.000,44.910},
				{81994.489,2145.429,10.000,44.927},
				{82203.034,2025.480,10.000,44.941},
				{82399.585,1905.531,10.000,44.953},
				{82584.140,1785.581,10.000,44.963},
				{82756.701,1665.632,10.000,44.972},
				{82917.266,1545.683,10.000,44.978},
				{83065.837,1425.733,10.000,44.984},
				{83202.413,1305.784,10.000,44.988},
				{83326.994,1185.835,10.000,44.991},
				{83439.580,1065.885,10.000,44.994},
				{83540.171,945.936,10.000,44.996},
				{83628.767,825.986,10.000,44.997},
				{83705.631,711.297,10.000,44.998},
				{83771.455,605.175,10.000,44.999},
				{83827.095,507.620,10.000,44.999},
				{83873.407,418.634,10.000,45.000},
				{83911.250,338.216,10.000,45.000},
				{83941.479,266.365,10.000,45.000},
				{83964.951,203.082,10.000,45.000},
				{83982.524,148.367,10.000,45.000},
				{83995.053,102.219,10.000,45.000},
				{84003.396,64.640,10.000,45.000},
				{84008.409,35.628,10.000,45.000},
				{84010.950,15.184,10.000,45.000},
				{84011.875,3.308,10.000,45.000},
				{84012.040,0.000,10.000,45.000},
				{84012.040,0.000,10.000,45.000}		};

}