package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class RightWallToRightScaleArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,3.79,0.00)
	// (13.63,4.79,10.00)
	// (23.38,8.54,10.00)
	
    public RightWallToRightScaleArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public RightWallToRightScaleArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.428,-8.568,10.000,0.000},
				{-2.142,-25.703,10.000,0.000},
				{-5.997,-51.407,10.000,0.000},
				{-12.852,-85.678,10.000,0.000},
				{-23.561,-128.517,10.000,0.000},
				{-38.984,-179.924,10.000,0.000},
				{-59.975,-239.899,10.000,0.000},
				{-87.392,-308.441,10.000,0.000},
				{-122.091,-385.551,10.000,0.000},
				{-164.930,-471.230,10.000,0.000},
				{-216.766,-565.476,10.000,0.000},
				{-278.454,-668.289,10.000,0.000},
				{-350.852,-779.671,10.000,0.000},
				{-434.816,-899.620,10.000,0.000},
				{-530.776,-1019.569,10.000,0.000},
				{-638.730,-1139.519,10.000,0.000},
				{-758.680,-1259.468,10.000,0.000},
				{-890.624,-1379.418,10.000,0.001},
				{-1034.563,-1499.367,10.000,0.001},
				{-1190.497,-1619.316,10.000,0.001},
				{-1358.426,-1739.266,10.000,0.001},
				{-1538.350,-1859.215,10.000,0.002},
				{-1730.269,-1979.164,10.000,0.002},
				{-1934.183,-2099.114,10.000,0.003},
				{-2150.092,-2219.063,10.000,0.003},
				{-2377.996,-2339.012,10.000,0.004},
				{-2617.895,-2458.962,10.000,0.005},
				{-2869.788,-2578.911,10.000,0.006},
				{-3133.677,-2698.860,10.000,0.007},
				{-3409.560,-2818.810,10.000,0.008},
				{-3697.439,-2938.759,10.000,0.009},
				{-3997.312,-3058.708,10.000,0.011},
				{-4309.180,-3178.658,10.000,0.013},
				{-4633.044,-3298.607,10.000,0.015},
				{-4968.902,-3418.557,10.000,0.017},
				{-5316.755,-3538.506,10.000,0.019},
				{-5676.603,-3658.455,10.000,0.022},
				{-6048.446,-3778.405,10.000,0.025},
				{-6432.284,-3898.354,10.000,0.028},
				{-6828.117,-4018.303,10.000,0.032},
				{-7235.945,-4138.253,10.000,0.036},
				{-7655.767,-4258.202,10.000,0.040},
				{-8087.585,-4378.151,10.000,0.045},
				{-8531.398,-4498.101,10.000,0.050},
				{-8987.205,-4618.050,10.000,0.055},
				{-9455.008,-4737.999,10.000,0.061},
				{-9934.805,-4857.949,10.000,0.067},
				{-10426.597,-4977.898,10.000,0.074},
				{-10930.385,-5097.847,10.000,0.082},
				{-11446.167,-5217.797,10.000,0.089},
				{-11973.944,-5337.746,10.000,0.098},
				{-12513.716,-5457.695,10.000,0.107},
				{-13065.483,-5577.645,10.000,0.116},
				{-13629.245,-5697.594,10.000,0.126},
				{-14205.002,-5817.544,10.000,0.137},
				{-14792.754,-5937.493,10.000,0.148},
				{-15392.500,-6057.442,10.000,0.161},
				{-16004.242,-6177.392,10.000,0.173},
				{-16627.979,-6297.341,10.000,0.187},
				{-17263.710,-6417.290,10.000,0.201},
				{-17911.437,-6537.240,10.000,0.216},
				{-18571.158,-6657.189,10.000,0.232},
				{-19242.875,-6777.138,10.000,0.249},
				{-19926.586,-6897.088,10.000,0.267},
				{-20622.292,-7017.037,10.000,0.286},
				{-21329.993,-7136.986,10.000,0.305},
				{-22049.689,-7256.936,10.000,0.326},
				{-22781.380,-7376.885,10.000,0.347},
				{-23525.066,-7496.834,10.000,0.370},
				{-24280.747,-7616.784,10.000,0.393},
				{-25048.423,-7736.733,10.000,0.418},
				{-25828.094,-7856.682,10.000,0.444},
				{-26619.760,-7976.632,10.000,0.471},
				{-27423.420,-8096.581,10.000,0.499},
				{-28239.076,-8216.531,10.000,0.528},
				{-29066.726,-8336.480,10.000,0.559},
				{-29906.372,-8456.429,10.000,0.590},
				{-30758.012,-8576.379,10.000,0.623},
				{-31621.648,-8696.328,10.000,0.658},
				{-32497.278,-8816.277,10.000,0.693},
				{-33384.903,-8936.227,10.000,0.731},
				{-34284.523,-9056.176,10.000,0.769},
				{-35196.138,-9176.125,10.000,0.809},
				{-36119.748,-9296.075,10.000,0.850},
				{-37055.353,-9416.024,10.000,0.893},
				{-38002.953,-9535.973,10.000,0.937},
				{-38962.548,-9655.923,10.000,0.983},
				{-39934.138,-9775.872,10.000,1.031},
				{-40917.722,-9895.821,10.000,1.080},
				{-41913.302,-10015.771,10.000,1.131},
				{-42920.877,-10135.720,10.000,1.183},
				{-43940.446,-10255.670,10.000,1.237},
				{-44972.010,-10375.619,10.000,1.292},
				{-46015.570,-10495.568,10.000,1.350},
				{-47071.124,-10615.518,10.000,1.409},
				{-48138.673,-10735.467,10.000,1.470},
				{-49218.217,-10855.416,10.000,1.532},
				{-50309.757,-10975.366,10.000,1.597},
				{-51413.291,-11095.315,10.000,1.663},
				{-52528.820,-11215.264,10.000,1.731},
				{-53656.343,-11335.214,10.000,1.801},
				{-54795.862,-11455.163,10.000,1.873},
				{-55947.376,-11575.112,10.000,1.947},
				{-57110.885,-11695.062,10.000,2.022},
				{-58286.388,-11815.011,10.000,2.100},
				{-59473.887,-11934.960,10.000,2.179},
				{-60673.380,-12054.910,10.000,2.260},
				{-61884.869,-12174.859,10.000,2.343},
				{-63108.352,-12294.808,10.000,2.429},
				{-64343.831,-12414.758,10.000,2.516},
				{-65591.304,-12534.707,10.000,2.605},
				{-66850.772,-12654.657,10.000,2.696},
				{-68122.235,-12774.606,10.000,2.789},
				{-69405.693,-12894.555,10.000,2.883},
				{-70701.146,-13014.505,10.000,2.980},
				{-72008.594,-13134.454,10.000,3.079},
				{-73328.037,-13254.403,10.000,3.179},
				{-74659.475,-13374.353,10.000,3.282},
				{-76002.908,-13494.302,10.000,3.386},
				{-77358.335,-13614.251,10.000,3.492},
				{-78725.758,-13734.201,10.000,3.601},
				{-80105.175,-13854.150,10.000,3.710},
				{-81496.588,-13974.099,10.000,3.822},
				{-82899.995,-14094.049,10.000,3.935},
				{-84315.398,-14213.998,10.000,4.050},
				{-85742.366,-14325.380,10.000,4.167},
				{-87180.045,-14428.193,10.000,4.285},
				{-88627.577,-14522.439,10.000,4.405},
				{-90084.105,-14608.117,10.000,4.526},
				{-91548.772,-14685.228,10.000,4.648},
				{-93020.722,-14753.770,10.000,4.771},
				{-94499.097,-14813.745,10.000,4.895},
				{-95983.042,-14865.152,10.000,5.020},
				{-97471.699,-14907.991,10.000,5.146},
				{-98964.212,-14942.262,10.000,5.271},
				{-100459.723,-14967.965,10.000,5.398},
				{-101957.377,-14985.101,10.000,5.524},
				{-103456.315,-14993.669,10.000,5.651},
				{-104955.682,-14993.669,10.000,5.777},
				{-106455.049,-14993.669,10.000,5.903},
				{-107954.416,-14993.669,10.000,6.029},
				{-109453.783,-14993.669,10.000,6.154},
				{-110953.150,-14993.669,10.000,6.279},
				{-112452.517,-14993.669,10.000,6.404},
				{-113951.883,-14993.669,10.000,6.527},
				{-115451.250,-14993.669,10.000,6.651},
				{-116950.617,-14993.669,10.000,6.773},
				{-118449.984,-14993.669,10.000,6.894},
				{-119949.351,-14993.669,10.000,7.015},
				{-121448.718,-14993.669,10.000,7.134},
				{-122948.085,-14993.669,10.000,7.252},
				{-124447.452,-14993.669,10.000,7.369},
				{-125946.819,-14993.669,10.000,7.485},
				{-127446.185,-14993.669,10.000,7.599},
				{-128945.552,-14993.669,10.000,7.712},
				{-130444.919,-14993.669,10.000,7.824},
				{-131944.286,-14993.669,10.000,7.933},
				{-133443.653,-14993.669,10.000,8.041},
				{-134943.020,-14993.669,10.000,8.147},
				{-136442.387,-14993.669,10.000,8.251},
				{-137941.754,-14993.669,10.000,8.353},
				{-139441.121,-14993.669,10.000,8.453},
				{-140940.487,-14993.669,10.000,8.551},
				{-142439.854,-14993.669,10.000,8.646},
				{-143939.221,-14993.669,10.000,8.739},
				{-145438.588,-14993.669,10.000,8.830},
				{-146937.955,-14993.669,10.000,8.918},
				{-148437.322,-14993.669,10.000,9.003},
				{-149936.689,-14993.669,10.000,9.086},
				{-151436.056,-14993.669,10.000,9.166},
				{-152935.423,-14993.669,10.000,9.242},
				{-154434.789,-14993.669,10.000,9.316},
				{-155934.156,-14993.669,10.000,9.386},
				{-157433.523,-14993.669,10.000,9.453},
				{-158932.890,-14993.669,10.000,9.517},
				{-160432.257,-14993.669,10.000,9.578},
				{-161931.624,-14993.669,10.000,9.634},
				{-163430.991,-14993.669,10.000,9.687},
				{-164930.358,-14993.669,10.000,9.737},
				{-166429.725,-14993.669,10.000,9.782},
				{-167929.091,-14993.669,10.000,9.824},
				{-169428.458,-14993.669,10.000,9.861},
				{-170927.825,-14993.669,10.000,9.894},
				{-172427.192,-14993.669,10.000,9.923},
				{-173926.559,-14993.669,10.000,9.948},
				{-175425.926,-14993.669,10.000,9.967},
				{-176925.293,-14993.669,10.000,9.983},
				{-178424.660,-14993.669,10.000,9.993},
				{-179924.027,-14993.669,10.000,9.999},
				{-181423.393,-14993.669,10.000,10.004},
				{-182922.760,-14993.669,10.000,10.051},
				{-184422.127,-14993.669,10.000,10.152},
				{-185921.494,-14993.669,10.000,10.302},
				{-187420.861,-14993.669,10.000,10.500},
				{-188920.228,-14993.669,10.000,10.742},
				{-190419.595,-14993.669,10.000,11.025},
				{-191918.962,-14993.669,10.000,11.348},
				{-193418.329,-14993.669,10.000,11.707},
				{-194917.695,-14993.669,10.000,12.101},
				{-196417.062,-14993.669,10.000,12.526},
				{-197916.429,-14993.669,10.000,12.980},
				{-199415.796,-14993.669,10.000,13.462},
				{-200915.163,-14993.669,10.000,13.967},
				{-202414.530,-14993.669,10.000,14.495},
				{-203913.897,-14993.669,10.000,15.042},
				{-205413.264,-14993.669,10.000,15.606},
				{-206912.631,-14993.669,10.000,16.184},
				{-208411.997,-14993.669,10.000,16.775},
				{-209911.364,-14993.669,10.000,17.376},
				{-211410.731,-14993.669,10.000,17.984},
				{-212910.098,-14993.669,10.000,18.598},
				{-214409.465,-14993.669,10.000,19.214},
				{-215908.832,-14993.669,10.000,19.831},
				{-217408.199,-14993.669,10.000,20.445},
				{-218907.566,-14993.669,10.000,21.057},
				{-220406.933,-14993.669,10.000,21.662},
				{-221906.299,-14993.669,10.000,22.259},
				{-223405.666,-14993.669,10.000,22.846},
				{-224905.033,-14993.669,10.000,23.422},
				{-226404.400,-14993.669,10.000,23.985},
				{-227903.767,-14993.669,10.000,24.532},
				{-229403.134,-14993.669,10.000,25.063},
				{-230902.501,-14993.669,10.000,25.576},
				{-232401.868,-14993.669,10.000,26.070},
				{-233901.235,-14993.669,10.000,26.543},
				{-235400.580,-14993.234,10.000,26.995},
				{-236899.453,-14984.232,10.000,27.424},
				{-238396.998,-14966.662,10.000,27.830},
				{-239892.357,-14940.524,10.000,28.210},
				{-241384.674,-14905.818,10.000,28.566},
				{-242873.092,-14862.544,10.000,28.894},
				{-244356.754,-14810.703,10.000,29.197},
				{-245834.804,-14750.293,10.000,29.471},
				{-247306.385,-14681.316,10.000,29.719},
				{-248770.639,-14603.771,10.000,29.938},
				{-250226.711,-14517.659,10.000,30.131},
				{-251673.742,-14422.978,10.000,30.295},
				{-253110.878,-14319.730,10.000,30.432},
				{-254537.260,-14207.914,10.000,30.543},
				{-255952.054,-14087.964,10.000,30.626},
				{-257354.853,-13968.015,10.000,30.684},
				{-258745.657,-13848.065,10.000,30.716},
				{-260124.466,-13728.116,10.000,30.723},
				{-261491.280,-13608.167,10.000,30.706},
				{-262846.099,-13488.217,10.000,30.665},
				{-264188.923,-13368.268,10.000,30.601},
				{-265519.753,-13248.319,10.000,30.515},
				{-266838.587,-13128.369,10.000,30.407},
				{-268145.427,-13008.420,10.000,30.279},
				{-269440.271,-12888.471,10.000,30.130},
				{-270723.121,-12768.521,10.000,29.962},
				{-271993.975,-12648.572,10.000,29.776},
				{-273252.835,-12528.623,10.000,29.571},
				{-274499.700,-12408.673,10.000,29.350},
				{-275734.570,-12288.724,10.000,29.112},
				{-276957.445,-12168.775,10.000,28.859},
				{-278168.325,-12048.825,10.000,28.591},
				{-279367.210,-11928.876,10.000,28.309},
				{-280554.100,-11808.926,10.000,28.014},
				{-281728.995,-11688.977,10.000,27.707},
				{-282891.895,-11569.028,10.000,27.389},
				{-284042.801,-11449.078,10.000,27.060},
				{-285181.711,-11329.129,10.000,26.721},
				{-286308.626,-11209.180,10.000,26.373},
				{-287423.547,-11089.230,10.000,26.018},
				{-288526.473,-10969.281,10.000,25.655},
				{-289617.403,-10849.332,10.000,25.285},
				{-290696.339,-10729.382,10.000,24.911},
				{-291763.280,-10609.433,10.000,24.531},
				{-292818.225,-10489.484,10.000,24.147},
				{-293861.176,-10369.534,10.000,23.761},
				{-294892.132,-10249.585,10.000,23.372},
				{-295911.093,-10129.636,10.000,22.981},
				{-296918.059,-10009.686,10.000,22.589},
				{-297913.031,-9889.737,10.000,22.198},
				{-298896.007,-9769.788,10.000,21.806},
				{-299866.988,-9649.838,10.000,21.416},
				{-300825.974,-9529.889,10.000,21.028},
				{-301772.966,-9409.939,10.000,20.643},
				{-302707.962,-9289.990,10.000,20.260},
				{-303630.964,-9170.041,10.000,19.882},
				{-304541.970,-9050.091,10.000,19.507},
				{-305440.982,-8930.142,10.000,19.137},
				{-306327.999,-8810.193,10.000,18.773},
				{-307203.021,-8690.243,10.000,18.414},
				{-308066.048,-8570.294,10.000,18.061},
				{-308917.079,-8450.345,10.000,17.715},
				{-309756.116,-8330.395,10.000,17.375},
				{-310583.159,-8210.446,10.000,17.042},
				{-311398.206,-8090.497,10.000,16.717},
				{-312201.258,-7970.547,10.000,16.400},
				{-312992.315,-7850.598,10.000,16.091},
				{-313771.377,-7730.649,10.000,15.789},
				{-314538.445,-7610.699,10.000,15.496},
				{-315293.517,-7490.750,10.000,15.212},
				{-316036.595,-7370.801,10.000,14.936},
				{-316767.677,-7250.851,10.000,14.669},
				{-317486.765,-7130.902,10.000,14.410},
				{-318193.858,-7010.952,10.000,14.160},
				{-318888.956,-6891.003,10.000,13.919},
				{-319572.058,-6771.054,10.000,13.687},
				{-320243.166,-6651.104,10.000,13.463},
				{-320902.279,-6531.155,10.000,13.249},
				{-321549.397,-6411.206,10.000,13.043},
				{-322184.520,-6291.256,10.000,12.845},
				{-322807.649,-6171.307,10.000,12.656},
				{-323418.782,-6051.358,10.000,12.476},
				{-324017.920,-5931.408,10.000,12.304},
				{-324605.063,-5811.459,10.000,12.140},
				{-325180.212,-5691.510,10.000,11.984},
				{-325743.365,-5571.560,10.000,11.836},
				{-326294.524,-5451.611,10.000,11.695},
				{-326833.688,-5331.662,10.000,11.562},
				{-327360.856,-5211.712,10.000,11.437},
				{-327876.030,-5091.763,10.000,11.318},
				{-328379.209,-4971.813,10.000,11.207},
				{-328870.393,-4851.864,10.000,11.102},
				{-329349.582,-4731.915,10.000,11.004},
				{-329816.776,-4611.965,10.000,10.912},
				{-330271.975,-4492.016,10.000,10.827},
				{-330715.179,-4372.067,10.000,10.747},
				{-331146.388,-4252.117,10.000,10.673},
				{-331565.602,-4132.168,10.000,10.604},
				{-331972.822,-4012.219,10.000,10.540},
				{-332368.046,-3892.269,10.000,10.482},
				{-332751.276,-3772.320,10.000,10.428},
				{-333122.510,-3652.371,10.000,10.379},
				{-333481.750,-3532.421,10.000,10.334},
				{-333828.994,-3412.472,10.000,10.292},
				{-334164.244,-3292.523,10.000,10.255},
				{-334487.499,-3172.573,10.000,10.222},
				{-334798.759,-3052.624,10.000,10.191},
				{-335098.024,-2932.675,10.000,10.164},
				{-335385.294,-2812.725,10.000,10.140},
				{-335660.569,-2692.776,10.000,10.119},
				{-335923.849,-2572.826,10.000,10.100},
				{-336175.134,-2452.877,10.000,10.083},
				{-336414.424,-2332.928,10.000,10.069},
				{-336641.719,-2212.978,10.000,10.057},
				{-336857.020,-2093.029,10.000,10.046},
				{-337060.325,-1973.080,10.000,10.037},
				{-337251.636,-1853.130,10.000,10.029},
				{-337430.951,-1733.181,10.000,10.023},
				{-337598.272,-1613.232,10.000,10.017},
				{-337753.598,-1493.282,10.000,10.013},
				{-337896.928,-1373.333,10.000,10.010},
				{-338028.264,-1253.384,10.000,10.007},
				{-338147.605,-1133.434,10.000,10.005},
				{-338254.951,-1013.485,10.000,10.003},
				{-338350.302,-893.536,10.000,10.002},
				{-338433.680,-774.021,10.000,10.002},
				{-338505.535,-663.074,10.000,10.001},
				{-338566.723,-560.695,10.000,10.001},
				{-338618.102,-466.883,10.000,10.000},
				{-338660.528,-381.640,10.000,10.000},
				{-338694.858,-304.964,10.000,10.000},
				{-338721.949,-236.856,10.000,10.000},
				{-338742.658,-177.316,10.000,10.000},
				{-338757.841,-126.344,10.000,10.000},
				{-338768.355,-83.940,10.000,10.000},
				{-338775.057,-50.103,10.000,10.000},
				{-338778.804,-24.834,10.000,10.000},
				{-338780.453,-8.133,10.000,10.000},
				{-338780.859,-0.000,10.000,10.000},
				{-338780.859,-0.000,10.000,10.000}		};

}