package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class CrossTheLine extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (10.00,0.00,0.00)
	
	public CrossTheLine() {
		this(false);
	}
			
    public CrossTheLine(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.067,1.338,10.000},
				{0.335,2.677,10.000},
				{0.937,6.022,10.000},
				{2.007,10.706,10.000},
				{3.680,16.729,10.000},
				{6.089,24.090,10.000},
				{9.368,32.789,10.000},
				{13.651,42.826,10.000},
				{19.071,54.202,10.000},
				{25.762,66.915,10.000},
				{33.859,80.968,10.000},
				{43.495,96.358,10.000},
				{54.804,113.087,10.000},
				{67.919,131.154,10.000},
				{82.975,150.560,10.000},
				{100.106,171.304,10.000},
				{119.444,193.386,10.000},
				{141.058,216.137,10.000},
				{164.947,238.888,10.000},
				{191.111,261.640,10.000},
				{219.550,284.391,10.000},
				{250.264,307.142,10.000},
				{283.253,329.893,10.000},
				{318.518,352.645,10.000},
				{356.057,375.396,10.000},
				{395.872,398.147,10.000},
				{437.962,420.898,10.000},
				{482.327,443.650,10.000},
				{528.967,466.401,10.000},
				{577.882,489.152,10.000},
				{629.072,511.903,10.000},
				{682.538,534.655,10.000},
				{738.278,557.406,10.000},
				{796.294,580.157,10.000},
				{856.585,602.908,10.000},
				{919.151,625.660,10.000},
				{983.992,648.411,10.000},
				{1051.108,671.162,10.000},
				{1120.500,693.914,10.000},
				{1192.166,716.665,10.000},
				{1266.041,738.747,10.000},
				{1341.990,759.491,10.000},
				{1419.880,778.896,10.000},
				{1499.576,796.963,10.000},
				{1580.945,813.692,10.000},
				{1663.853,829.083,10.000},
				{1748.167,843.135,10.000},
				{1833.752,855.849,10.000},
				{1920.474,867.225,10.000},
				{2008.200,877.262,10.000},
				{2096.797,885.961,10.000},
				{2186.129,893.322,10.000},
				{2276.063,899.344,10.000},
				{2366.466,904.028,10.000},
				{2457.203,907.374,10.000},
				{2548.141,909.381,10.000},
				{2639.146,910.051,10.000},
				{2730.152,910.051,10.000},
				{2821.157,910.051,10.000},
				{2912.162,910.051,10.000},
				{3003.167,910.051,10.000},
				{3094.172,910.051,10.000},
				{3185.177,910.051,10.000},
				{3276.182,910.051,10.000},
				{3367.187,910.051,10.000},
				{3458.192,910.051,10.000},
				{3549.197,910.051,10.000},
				{3640.202,910.051,10.000},
				{3731.207,910.051,10.000},
				{3822.212,910.051,10.000},
				{3913.217,910.051,10.000},
				{4004.222,910.051,10.000},
				{4095.227,910.051,10.000},
				{4186.232,910.051,10.000},
				{4277.237,910.051,10.000},
				{4368.242,910.051,10.000},
				{4459.248,910.051,10.000},
				{4550.253,910.051,10.000},
				{4641.258,910.051,10.000},
				{4732.263,910.051,10.000},
				{4823.268,910.051,10.000},
				{4914.273,910.051,10.000},
				{5005.278,910.051,10.000},
				{5096.283,910.051,10.000},
				{5187.288,910.051,10.000},
				{5278.293,910.051,10.000},
				{5369.298,910.051,10.000},
				{5460.303,910.051,10.000},
				{5551.308,910.051,10.000},
				{5642.313,910.051,10.000},
				{5733.318,910.051,10.000},
				{5824.323,910.051,10.000},
				{5915.328,910.051,10.000},
				{6006.333,910.051,10.000},
				{6097.338,910.051,10.000},
				{6188.343,910.051,10.000},
				{6279.349,910.051,10.000},
				{6370.354,910.051,10.000},
				{6461.359,910.051,10.000},
				{6552.364,910.051,10.000},
				{6643.369,910.051,10.000},
				{6734.374,910.051,10.000},
				{6825.379,910.051,10.000},
				{6916.384,910.051,10.000},
				{7007.389,910.051,10.000},
				{7098.394,910.051,10.000},
				{7189.399,910.051,10.000},
				{7280.404,910.051,10.000},
				{7371.409,910.051,10.000},
				{7462.414,910.051,10.000},
				{7553.419,910.051,10.000},
				{7644.424,910.051,10.000},
				{7735.429,910.051,10.000},
				{7826.434,910.051,10.000},
				{7917.439,910.051,10.000},
				{8008.444,910.051,10.000},
				{8099.450,910.051,10.000},
				{8190.455,910.051,10.000},
				{8281.460,910.051,10.000},
				{8372.465,910.051,10.000},
				{8463.470,910.051,10.000},
				{8554.475,910.051,10.000},
				{8645.480,910.051,10.000},
				{8736.485,910.051,10.000},
				{8827.490,910.051,10.000},
				{8918.495,910.051,10.000},
				{9009.500,910.051,10.000},
				{9100.505,910.051,10.000},
				{9191.510,910.051,10.000},
				{9282.515,910.051,10.000},
				{9373.520,910.051,10.000},
				{9464.525,910.051,10.000},
				{9555.530,910.051,10.000},
				{9646.535,910.051,10.000},
				{9737.540,910.051,10.000},
				{9828.546,910.051,10.000},
				{9919.551,910.051,10.000},
				{10010.556,910.051,10.000},
				{10101.561,910.051,10.000},
				{10192.566,910.051,10.000},
				{10283.571,910.051,10.000},
				{10374.576,910.051,10.000},
				{10465.581,910.051,10.000},
				{10556.586,910.051,10.000},
				{10647.591,910.051,10.000},
				{10738.596,910.051,10.000},
				{10829.601,910.051,10.000},
				{10920.606,910.051,10.000},
				{11011.611,910.051,10.000},
				{11102.616,910.051,10.000},
				{11193.621,910.051,10.000},
				{11284.626,910.051,10.000},
				{11375.631,910.051,10.000},
				{11466.636,910.051,10.000},
				{11557.641,910.051,10.000},
				{11648.647,910.051,10.000},
				{11739.652,910.051,10.000},
				{11830.657,910.051,10.000},
				{11921.662,910.051,10.000},
				{12012.667,910.051,10.000},
				{12103.672,910.051,10.000},
				{12194.677,910.051,10.000},
				{12285.682,910.051,10.000},
				{12376.687,910.051,10.000},
				{12467.692,910.051,10.000},
				{12558.697,910.051,10.000},
				{12649.702,910.051,10.000},
				{12740.707,910.051,10.000},
				{12831.712,910.051,10.000},
				{12922.717,910.051,10.000},
				{13013.722,910.051,10.000},
				{13104.727,910.051,10.000},
				{13195.732,910.051,10.000},
				{13286.737,910.051,10.000},
				{13377.743,910.051,10.000},
				{13468.748,910.051,10.000},
				{13559.753,910.051,10.000},
				{13650.758,910.051,10.000},
				{13741.763,910.051,10.000},
				{13832.768,910.051,10.000},
				{13923.773,910.051,10.000},
				{14014.778,910.051,10.000},
				{14105.783,910.051,10.000},
				{14196.788,910.051,10.000},
				{14287.793,910.051,10.000},
				{14378.798,910.051,10.000},
				{14469.803,910.051,10.000},
				{14560.808,910.051,10.000},
				{14651.813,910.051,10.000},
				{14742.818,910.051,10.000},
				{14833.823,910.051,10.000},
				{14924.828,910.051,10.000},
				{15015.833,910.051,10.000},
				{15106.838,910.051,10.000},
				{15197.844,910.051,10.000},
				{15288.849,910.051,10.000},
				{15379.854,910.051,10.000},
				{15470.859,910.051,10.000},
				{15561.864,910.051,10.000},
				{15652.869,910.051,10.000},
				{15743.874,910.051,10.000},
				{15834.879,910.051,10.000},
				{15925.884,910.051,10.000},
				{16016.889,910.051,10.000},
				{16107.894,910.051,10.000},
				{16198.899,910.051,10.000},
				{16289.904,910.051,10.000},
				{16380.909,910.051,10.000},
				{16471.914,910.051,10.000},
				{16562.919,910.051,10.000},
				{16653.924,910.051,10.000},
				{16744.929,910.051,10.000},
				{16835.934,910.051,10.000},
				{16926.940,910.051,10.000},
				{17017.945,910.051,10.000},
				{17108.950,910.051,10.000},
				{17199.955,910.051,10.000},
				{17290.960,910.051,10.000},
				{17381.965,910.051,10.000},
				{17472.970,910.051,10.000},
				{17563.975,910.051,10.000},
				{17654.980,910.051,10.000},
				{17745.985,910.051,10.000},
				{17836.990,910.051,10.000},
				{17927.995,910.051,10.000},
				{18019.000,910.051,10.000},
				{18110.005,910.051,10.000},
				{18201.010,910.051,10.000},
				{18292.015,910.051,10.000},
				{18383.020,910.051,10.000},
				{18474.025,910.051,10.000},
				{18565.030,910.051,10.000},
				{18656.035,910.051,10.000},
				{18747.041,910.051,10.000},
				{18838.046,910.051,10.000},
				{18929.051,910.051,10.000},
				{19020.056,910.051,10.000},
				{19111.061,910.051,10.000},
				{19202.066,910.051,10.000},
				{19293.071,910.051,10.000},
				{19384.076,910.051,10.000},
				{19475.081,910.051,10.000},
				{19566.086,910.051,10.000},
				{19657.091,910.051,10.000},
				{19748.096,910.051,10.000},
				{19839.101,910.051,10.000},
				{19930.106,910.051,10.000},
				{20021.111,910.051,10.000},
				{20112.116,910.051,10.000},
				{20203.121,910.051,10.000},
				{20294.059,909.381,10.000},
				{20384.797,907.374,10.000},
				{20475.200,904.028,10.000},
				{20565.134,899.344,10.000},
				{20654.466,893.322,10.000},
				{20743.062,885.961,10.000},
				{20830.789,877.262,10.000},
				{20917.511,867.225,10.000},
				{21003.096,855.849,10.000},
				{21087.409,843.135,10.000},
				{21170.318,829.083,10.000},
				{21251.687,813.692,10.000},
				{21331.383,796.963,10.000},
				{21409.273,778.896,10.000},
				{21485.222,759.491,10.000},
				{21559.097,738.747,10.000},
				{21630.763,716.665,10.000},
				{21700.154,693.914,10.000},
				{21767.271,671.162,10.000},
				{21832.112,648.411,10.000},
				{21894.678,625.660,10.000},
				{21954.969,602.908,10.000},
				{22012.984,580.157,10.000},
				{22068.725,557.406,10.000},
				{22122.190,534.655,10.000},
				{22173.381,511.903,10.000},
				{22222.296,489.152,10.000},
				{22268.936,466.401,10.000},
				{22313.301,443.650,10.000},
				{22355.391,420.898,10.000},
				{22395.206,398.147,10.000},
				{22432.745,375.396,10.000},
				{22468.010,352.645,10.000},
				{22500.999,329.893,10.000},
				{22531.713,307.142,10.000},
				{22560.152,284.391,10.000},
				{22586.316,261.640,10.000},
				{22610.205,238.888,10.000},
				{22631.819,216.137,10.000},
				{22651.157,193.386,10.000},
				{22668.288,171.304,10.000},
				{22683.344,150.560,10.000},
				{22696.459,131.154,10.000},
				{22707.768,113.087,10.000},
				{22717.404,96.358,10.000},
				{22725.500,80.968,10.000},
				{22732.192,66.915,10.000},
				{22737.612,54.202,10.000},
				{22741.895,42.826,10.000},
				{22745.173,32.789,10.000},
				{22747.582,24.090,10.000},
				{22749.255,16.729,10.000},
				{22750.326,10.706,10.000},
				{22750.928,6.022,10.000},
				{22751.196,2.677,10.000},
				{22751.263,0.669,10.000},
				{22751.263,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.067,1.338,10.000},
				{0.335,2.677,10.000},
				{0.937,6.022,10.000},
				{2.007,10.706,10.000},
				{3.680,16.729,10.000},
				{6.089,24.090,10.000},
				{9.368,32.789,10.000},
				{13.651,42.826,10.000},
				{19.071,54.202,10.000},
				{25.762,66.915,10.000},
				{33.859,80.968,10.000},
				{43.495,96.358,10.000},
				{54.804,113.087,10.000},
				{67.919,131.154,10.000},
				{82.975,150.560,10.000},
				{100.106,171.304,10.000},
				{119.444,193.386,10.000},
				{141.058,216.137,10.000},
				{164.947,238.888,10.000},
				{191.111,261.640,10.000},
				{219.550,284.391,10.000},
				{250.264,307.142,10.000},
				{283.253,329.893,10.000},
				{318.518,352.645,10.000},
				{356.057,375.396,10.000},
				{395.872,398.147,10.000},
				{437.962,420.898,10.000},
				{482.327,443.650,10.000},
				{528.967,466.401,10.000},
				{577.882,489.152,10.000},
				{629.072,511.903,10.000},
				{682.538,534.655,10.000},
				{738.278,557.406,10.000},
				{796.294,580.157,10.000},
				{856.585,602.908,10.000},
				{919.151,625.660,10.000},
				{983.992,648.411,10.000},
				{1051.108,671.162,10.000},
				{1120.500,693.914,10.000},
				{1192.166,716.665,10.000},
				{1266.041,738.747,10.000},
				{1341.990,759.491,10.000},
				{1419.880,778.896,10.000},
				{1499.576,796.963,10.000},
				{1580.945,813.692,10.000},
				{1663.853,829.083,10.000},
				{1748.167,843.135,10.000},
				{1833.752,855.849,10.000},
				{1920.474,867.225,10.000},
				{2008.200,877.262,10.000},
				{2096.797,885.961,10.000},
				{2186.129,893.322,10.000},
				{2276.063,899.344,10.000},
				{2366.466,904.028,10.000},
				{2457.203,907.374,10.000},
				{2548.141,909.381,10.000},
				{2639.146,910.051,10.000},
				{2730.152,910.051,10.000},
				{2821.157,910.051,10.000},
				{2912.162,910.051,10.000},
				{3003.167,910.051,10.000},
				{3094.172,910.051,10.000},
				{3185.177,910.051,10.000},
				{3276.182,910.051,10.000},
				{3367.187,910.051,10.000},
				{3458.192,910.051,10.000},
				{3549.197,910.051,10.000},
				{3640.202,910.051,10.000},
				{3731.207,910.051,10.000},
				{3822.212,910.051,10.000},
				{3913.217,910.051,10.000},
				{4004.222,910.051,10.000},
				{4095.227,910.051,10.000},
				{4186.232,910.051,10.000},
				{4277.237,910.051,10.000},
				{4368.242,910.051,10.000},
				{4459.248,910.051,10.000},
				{4550.253,910.051,10.000},
				{4641.258,910.051,10.000},
				{4732.263,910.051,10.000},
				{4823.268,910.051,10.000},
				{4914.273,910.051,10.000},
				{5005.278,910.051,10.000},
				{5096.283,910.051,10.000},
				{5187.288,910.051,10.000},
				{5278.293,910.051,10.000},
				{5369.298,910.051,10.000},
				{5460.303,910.051,10.000},
				{5551.308,910.051,10.000},
				{5642.313,910.051,10.000},
				{5733.318,910.051,10.000},
				{5824.323,910.051,10.000},
				{5915.328,910.051,10.000},
				{6006.333,910.051,10.000},
				{6097.338,910.051,10.000},
				{6188.343,910.051,10.000},
				{6279.349,910.051,10.000},
				{6370.354,910.051,10.000},
				{6461.359,910.051,10.000},
				{6552.364,910.051,10.000},
				{6643.369,910.051,10.000},
				{6734.374,910.051,10.000},
				{6825.379,910.051,10.000},
				{6916.384,910.051,10.000},
				{7007.389,910.051,10.000},
				{7098.394,910.051,10.000},
				{7189.399,910.051,10.000},
				{7280.404,910.051,10.000},
				{7371.409,910.051,10.000},
				{7462.414,910.051,10.000},
				{7553.419,910.051,10.000},
				{7644.424,910.051,10.000},
				{7735.429,910.051,10.000},
				{7826.434,910.051,10.000},
				{7917.439,910.051,10.000},
				{8008.444,910.051,10.000},
				{8099.450,910.051,10.000},
				{8190.455,910.051,10.000},
				{8281.460,910.051,10.000},
				{8372.465,910.051,10.000},
				{8463.470,910.051,10.000},
				{8554.475,910.051,10.000},
				{8645.480,910.051,10.000},
				{8736.485,910.051,10.000},
				{8827.490,910.051,10.000},
				{8918.495,910.051,10.000},
				{9009.500,910.051,10.000},
				{9100.505,910.051,10.000},
				{9191.510,910.051,10.000},
				{9282.515,910.051,10.000},
				{9373.520,910.051,10.000},
				{9464.525,910.051,10.000},
				{9555.530,910.051,10.000},
				{9646.535,910.051,10.000},
				{9737.540,910.051,10.000},
				{9828.546,910.051,10.000},
				{9919.551,910.051,10.000},
				{10010.556,910.051,10.000},
				{10101.561,910.051,10.000},
				{10192.566,910.051,10.000},
				{10283.571,910.051,10.000},
				{10374.576,910.051,10.000},
				{10465.581,910.051,10.000},
				{10556.586,910.051,10.000},
				{10647.591,910.051,10.000},
				{10738.596,910.051,10.000},
				{10829.601,910.051,10.000},
				{10920.606,910.051,10.000},
				{11011.611,910.051,10.000},
				{11102.616,910.051,10.000},
				{11193.621,910.051,10.000},
				{11284.626,910.051,10.000},
				{11375.631,910.051,10.000},
				{11466.636,910.051,10.000},
				{11557.641,910.051,10.000},
				{11648.647,910.051,10.000},
				{11739.652,910.051,10.000},
				{11830.657,910.051,10.000},
				{11921.662,910.051,10.000},
				{12012.667,910.051,10.000},
				{12103.672,910.051,10.000},
				{12194.677,910.051,10.000},
				{12285.682,910.051,10.000},
				{12376.687,910.051,10.000},
				{12467.692,910.051,10.000},
				{12558.697,910.051,10.000},
				{12649.702,910.051,10.000},
				{12740.707,910.051,10.000},
				{12831.712,910.051,10.000},
				{12922.717,910.051,10.000},
				{13013.722,910.051,10.000},
				{13104.727,910.051,10.000},
				{13195.732,910.051,10.000},
				{13286.737,910.051,10.000},
				{13377.743,910.051,10.000},
				{13468.748,910.051,10.000},
				{13559.753,910.051,10.000},
				{13650.758,910.051,10.000},
				{13741.763,910.051,10.000},
				{13832.768,910.051,10.000},
				{13923.773,910.051,10.000},
				{14014.778,910.051,10.000},
				{14105.783,910.051,10.000},
				{14196.788,910.051,10.000},
				{14287.793,910.051,10.000},
				{14378.798,910.051,10.000},
				{14469.803,910.051,10.000},
				{14560.808,910.051,10.000},
				{14651.813,910.051,10.000},
				{14742.818,910.051,10.000},
				{14833.823,910.051,10.000},
				{14924.828,910.051,10.000},
				{15015.833,910.051,10.000},
				{15106.838,910.051,10.000},
				{15197.844,910.051,10.000},
				{15288.849,910.051,10.000},
				{15379.854,910.051,10.000},
				{15470.859,910.051,10.000},
				{15561.864,910.051,10.000},
				{15652.869,910.051,10.000},
				{15743.874,910.051,10.000},
				{15834.879,910.051,10.000},
				{15925.884,910.051,10.000},
				{16016.889,910.051,10.000},
				{16107.894,910.051,10.000},
				{16198.899,910.051,10.000},
				{16289.904,910.051,10.000},
				{16380.909,910.051,10.000},
				{16471.914,910.051,10.000},
				{16562.919,910.051,10.000},
				{16653.924,910.051,10.000},
				{16744.929,910.051,10.000},
				{16835.934,910.051,10.000},
				{16926.940,910.051,10.000},
				{17017.945,910.051,10.000},
				{17108.950,910.051,10.000},
				{17199.955,910.051,10.000},
				{17290.960,910.051,10.000},
				{17381.965,910.051,10.000},
				{17472.970,910.051,10.000},
				{17563.975,910.051,10.000},
				{17654.980,910.051,10.000},
				{17745.985,910.051,10.000},
				{17836.990,910.051,10.000},
				{17927.995,910.051,10.000},
				{18019.000,910.051,10.000},
				{18110.005,910.051,10.000},
				{18201.010,910.051,10.000},
				{18292.015,910.051,10.000},
				{18383.020,910.051,10.000},
				{18474.025,910.051,10.000},
				{18565.030,910.051,10.000},
				{18656.035,910.051,10.000},
				{18747.041,910.051,10.000},
				{18838.046,910.051,10.000},
				{18929.051,910.051,10.000},
				{19020.056,910.051,10.000},
				{19111.061,910.051,10.000},
				{19202.066,910.051,10.000},
				{19293.071,910.051,10.000},
				{19384.076,910.051,10.000},
				{19475.081,910.051,10.000},
				{19566.086,910.051,10.000},
				{19657.091,910.051,10.000},
				{19748.096,910.051,10.000},
				{19839.101,910.051,10.000},
				{19930.106,910.051,10.000},
				{20021.111,910.051,10.000},
				{20112.116,910.051,10.000},
				{20203.121,910.051,10.000},
				{20294.059,909.381,10.000},
				{20384.797,907.374,10.000},
				{20475.200,904.028,10.000},
				{20565.134,899.344,10.000},
				{20654.466,893.322,10.000},
				{20743.062,885.961,10.000},
				{20830.789,877.262,10.000},
				{20917.511,867.225,10.000},
				{21003.096,855.849,10.000},
				{21087.409,843.135,10.000},
				{21170.318,829.083,10.000},
				{21251.687,813.692,10.000},
				{21331.383,796.963,10.000},
				{21409.273,778.896,10.000},
				{21485.222,759.491,10.000},
				{21559.097,738.747,10.000},
				{21630.763,716.665,10.000},
				{21700.154,693.914,10.000},
				{21767.271,671.162,10.000},
				{21832.112,648.411,10.000},
				{21894.678,625.660,10.000},
				{21954.969,602.908,10.000},
				{22012.984,580.157,10.000},
				{22068.725,557.406,10.000},
				{22122.190,534.655,10.000},
				{22173.381,511.903,10.000},
				{22222.296,489.152,10.000},
				{22268.936,466.401,10.000},
				{22313.301,443.650,10.000},
				{22355.391,420.898,10.000},
				{22395.206,398.147,10.000},
				{22432.745,375.396,10.000},
				{22468.010,352.645,10.000},
				{22500.999,329.893,10.000},
				{22531.713,307.142,10.000},
				{22560.152,284.391,10.000},
				{22586.316,261.640,10.000},
				{22610.205,238.888,10.000},
				{22631.819,216.137,10.000},
				{22651.157,193.386,10.000},
				{22668.288,171.304,10.000},
				{22683.344,150.560,10.000},
				{22696.459,131.154,10.000},
				{22707.768,113.087,10.000},
				{22717.404,96.358,10.000},
				{22725.500,80.968,10.000},
				{22732.192,66.915,10.000},
				{22737.612,54.202,10.000},
				{22741.895,42.826,10.000},
				{22745.173,32.789,10.000},
				{22747.582,24.090,10.000},
				{22749.255,16.729,10.000},
				{22750.326,10.706,10.000},
				{22750.928,6.022,10.000},
				{22751.196,2.677,10.000},
				{22751.263,0.669,10.000},
				{22751.263,0.000,10.000}
		};
		
		if (flipped) {
			rightProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			leftProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		} else {
			leftProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			rightProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		}
	}

}