package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class RightWallToRightSwitchArc extends SrxTrajectory {

	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (17.00,-1.00,-30.00)

	public RightWallToRightSwitchArc() {
		super();
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public RightWallToRightSwitchArc(boolean flipped) {
		super();
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	double[][] centerPoints = { { -0.142, -2.835, 10.000, 0.000 }, { -0.709, -5.670, 10.000, 0.000 },
			{ -1.984, -12.757, 10.000, 0.000 }, { -4.252, -22.679, 10.000, 0.000 }, { -7.796, -35.437, 10.000, 0.000 },
			{ -12.899, -51.030, 10.000, 0.000 }, { -19.845, -69.461, 10.000, 0.000 },
			{ -28.776, -89.312, 10.000, 0.000 }, { -39.693, -109.166, 10.000, 0.000 },
			{ -52.595, -129.024, 10.000, 0.000 }, { -67.484, -148.888, 10.000, 0.000 },
			{ -84.360, -168.758, 10.000, 0.000 }, { -103.223, -188.634, 10.000, 0.000 },
			{ -124.075, -208.518, 10.000, 0.001 }, { -146.916, -228.410, 10.000, 0.001 },
			{ -171.747, -248.310, 10.000, 0.001 }, { -198.569, -268.221, 10.000, 0.002 },
			{ -227.383, -288.142, 10.000, 0.002 }, { -258.191, -308.074, 10.000, 0.003 },
			{ -290.992, -328.018, 10.000, 0.003 }, { -325.790, -347.974, 10.000, 0.004 },
			{ -362.584, -367.944, 10.000, 0.005 }, { -401.377, -387.927, 10.000, 0.006 },
			{ -442.170, -407.925, 10.000, 0.008 }, { -484.963, -427.939, 10.000, 0.009 },
			{ -529.760, -447.968, 10.000, 0.011 }, { -576.562, -468.014, 10.000, 0.013 },
			{ -625.369, -488.077, 10.000, 0.015 }, { -676.185, -508.158, 10.000, 0.018 },
			{ -729.011, -528.257, 10.000, 0.020 }, { -783.848, -548.375, 10.000, 0.024 },
			{ -840.699, -568.512, 10.000, 0.027 }, { -899.566, -588.669, 10.000, 0.031 },
			{ -960.451, -608.847, 10.000, 0.035 }, { -1023.356, -629.046, 10.000, 0.040 },
			{ -1088.282, -649.266, 10.000, 0.045 }, { -1155.233, -669.508, 10.000, 0.051 },
			{ -1224.210, -689.772, 10.000, 0.057 }, { -1295.216, -710.059, 10.000, 0.063 },
			{ -1368.253, -730.369, 10.000, 0.070 }, { -1443.323, -750.703, 10.000, 0.078 },
			{ -1520.429, -771.060, 10.000, 0.087 }, { -1599.573, -791.441, 10.000, 0.096 },
			{ -1680.758, -811.847, 10.000, 0.105 }, { -1763.986, -832.278, 10.000, 0.116 },
			{ -1849.259, -852.733, 10.000, 0.127 }, { -1936.580, -873.213, 10.000, 0.138 },
			{ -2025.952, -893.719, 10.000, 0.151 }, { -2117.377, -914.250, 10.000, 0.164 },
			{ -2210.858, -934.807, 10.000, 0.179 }, { -2306.397, -955.389, 10.000, 0.194 },
			{ -2403.997, -975.998, 10.000, 0.210 }, { -2503.660, -996.632, 10.000, 0.227 },
			{ -2605.389, -1017.291, 10.000, 0.245 }, { -2709.187, -1037.977, 10.000, 0.263 },
			{ -2815.056, -1058.688, 10.000, 0.283 }, { -2922.998, -1079.426, 10.000, 0.304 },
			{ -3033.017, -1100.188, 10.000, 0.326 }, { -3145.115, -1120.976, 10.000, 0.350 },
			{ -3259.294, -1141.790, 10.000, 0.374 }, { -3375.556, -1162.628, 10.000, 0.399 },
			{ -3493.905, -1183.491, 10.000, 0.426 }, { -3614.343, -1204.379, 10.000, 0.454 },
			{ -3736.872, -1225.291, 10.000, 0.483 }, { -3861.495, -1246.227, 10.000, 0.514 },
			{ -3988.214, -1267.187, 10.000, 0.545 }, { -4117.031, -1288.169, 10.000, 0.579 },
			{ -4247.948, -1309.175, 10.000, 0.613 }, { -4380.968, -1330.202, 10.000, 0.649 },
			{ -4516.094, -1351.252, 10.000, 0.686 }, { -4653.326, -1372.322, 10.000, 0.725 },
			{ -4792.667, -1393.413, 10.000, 0.765 }, { -4934.120, -1414.525, 10.000, 0.807 },
			{ -5077.685, -1435.655, 10.000, 0.850 }, { -5223.366, -1456.804, 10.000, 0.895 },
			{ -5371.163, -1477.971, 10.000, 0.941 }, { -5521.078, -1499.156, 10.000, 0.989 },
			{ -5673.114, -1520.357, 10.000, 1.039 }, { -5827.271, -1541.573, 10.000, 1.090 },
			{ -5983.552, -1562.804, 10.000, 1.143 }, { -6141.956, -1584.049, 10.000, 1.197 },
			{ -6302.487, -1605.307, 10.000, 1.253 }, { -6465.145, -1626.576, 10.000, 1.311 },
			{ -6629.930, -1647.857, 10.000, 1.371 }, { -6796.845, -1669.147, 10.000, 1.432 },
			{ -6965.890, -1690.447, 10.000, 1.495 }, { -7137.065, -1711.754, 10.000, 1.559 },
			{ -7310.372, -1733.067, 10.000, 1.626 }, { -7485.810, -1754.386, 10.000, 1.694 },
			{ -7663.381, -1775.709, 10.000, 1.764 }, { -7843.085, -1797.035, 10.000, 1.835 },
			{ -8024.921, -1818.363, 10.000, 1.909 }, { -8208.890, -1839.690, 10.000, 1.984 },
			{ -8394.992, -1861.017, 10.000, 2.061 }, { -8583.226, -1882.342, 10.000, 2.139 },
			{ -8773.592, -1903.663, 10.000, 2.220 }, { -8966.090, -1924.978, 10.000, 2.302 },
			{ -9160.719, -1946.287, 10.000, 2.385 }, { -9357.478, -1967.588, 10.000, 2.471 },
			{ -9556.365, -1988.879, 10.000, 2.558 }, { -9757.381, -2010.158, 10.000, 2.647 },
			{ -9960.524, -2031.425, 10.000, 2.738 }, { -10165.792, -2052.678, 10.000, 2.830 },
			{ -10373.183, -2073.915, 10.000, 2.924 }, { -10582.697, -2095.134, 10.000, 3.019 },
			{ -10794.330, -2116.333, 10.000, 3.117 }, { -11008.081, -2137.512, 10.000, 3.215 },
			{ -11223.948, -2158.668, 10.000, 3.315 }, { -11441.928, -2179.800, 10.000, 3.417 },
			{ -11662.018, -2200.906, 10.000, 3.520 }, { -11884.217, -2221.984, 10.000, 3.625 },
			{ -12108.520, -2243.032, 10.000, 3.731 }, { -12334.925, -2264.049, 10.000, 3.839 },
			{ -12563.428, -2285.032, 10.000, 3.948 }, { -12794.026, -2305.981, 10.000, 4.058 },
			{ -13026.716, -2326.893, 10.000, 4.169 }, { -13261.492, -2347.767, 10.000, 4.282 },
			{ -13498.352, -2368.600, 10.000, 4.396 }, { -13737.291, -2389.392, 10.000, 4.511 },
			{ -13978.305, -2410.139, 10.000, 4.627 }, { -14221.389, -2430.841, 10.000, 4.744 },
			{ -14466.539, -2451.495, 10.000, 4.862 }, { -14713.749, -2472.100, 10.000, 4.980 },
			{ -14963.014, -2492.654, 10.000, 5.100 }, { -15214.330, -2513.155, 10.000, 5.221 },
			{ -15467.690, -2533.601, 10.000, 5.342 }, { -15723.089, -2553.992, 10.000, 5.464 },
			{ -15980.521, -2574.324, 10.000, 5.586 }, { -16239.981, -2594.596, 10.000, 5.709 },
			{ -16501.462, -2614.807, 10.000, 5.832 }, { -16764.957, -2634.955, 10.000, 5.956 },
			{ -17030.461, -2655.037, 10.000, 6.080 }, { -17297.966, -2675.054, 10.000, 6.204 },
			{ -17567.466, -2695.002, 10.000, 6.328 }, { -17838.954, -2714.880, 10.000, 6.453 },
			{ -18112.423, -2734.688, 10.000, 6.577 }, { -18387.865, -2754.422, 10.000, 6.701 },
			{ -18665.274, -2774.082, 10.000, 6.825 }, { -18944.640, -2793.666, 10.000, 6.949 },
			{ -19225.958, -2813.173, 10.000, 7.072 }, { -19509.218, -2832.601, 10.000, 7.195 },
			{ -19794.413, -2851.949, 10.000, 7.317 }, { -20081.534, -2871.216, 10.000, 7.439 },
			{ -20370.574, -2890.399, 10.000, 7.559 }, { -20661.524, -2909.498, 10.000, 7.679 },
			{ -20954.375, -2928.512, 10.000, 7.798 }, { -21249.119, -2947.439, 10.000, 7.916 },
			{ -21545.747, -2966.278, 10.000, 8.032 }, { -21844.250, -2985.028, 10.000, 8.148 },
			{ -22144.619, -3003.688, 10.000, 8.262 }, { -22446.698, -3020.792, 10.000, 8.374 },
			{ -22750.186, -3034.883, 10.000, 8.484 }, { -23054.783, -3045.968, 10.000, 8.593 },
			{ -23360.188, -3054.053, 10.000, 8.700 }, { -23666.103, -3059.148, 10.000, 8.804 },
			{ -23972.229, -3061.262, 10.000, 8.905 }, { -24278.270, -3060.403, 10.000, 9.004 },
			{ -24584.073, -3058.038, 10.000, 9.100 }, { -24889.636, -3055.627, 10.000, 9.193 },
			{ -25194.953, -3053.171, 10.000, 9.284 }, { -25500.020, -3050.670, 10.000, 9.371 },
			{ -25804.833, -3048.127, 10.000, 9.456 }, { -26109.387, -3045.542, 10.000, 9.537 },
			{ -26413.679, -3042.916, 10.000, 9.615 }, { -26717.704, -3040.251, 10.000, 9.690 },
			{ -27021.458, -3037.547, 10.000, 9.762 }, { -27324.939, -3034.805, 10.000, 9.831 },
			{ -27628.141, -3032.026, 10.000, 9.896 }, { -27931.063, -3029.211, 10.000, 9.958 },
			{ -28233.699, -3026.361, 10.000, 10.017 }, { -28536.046, -3023.477, 10.000, 10.072 },
			{ -28838.102, -3020.559, 10.000, 10.124 }, { -29139.863, -3017.608, 10.000, 10.173 },
			{ -29441.326, -3014.626, 10.000, 10.218 }, { -29742.487, -3011.612, 10.000, 10.259 },
			{ -30043.343, -3008.567, 10.000, 10.297 }, { -30343.893, -3005.493, 10.000, 10.331 },
			{ -30644.132, -3002.389, 10.000, 10.361 }, { -30944.057, -2999.256, 10.000, 10.388 },
			{ -31243.667, -2996.096, 10.000, 10.411 }, { -31542.958, -2992.907, 10.000, 10.430 },
			{ -31841.927, -2989.692, 10.000, 10.446 }, { -32140.572, -2986.450, 10.000, 10.458 },
			{ -32438.890, -2983.182, 10.000, 10.465 }, { -32736.879, -2979.889, 10.000, 10.469 },
			{ -33034.536, -2976.570, 10.000, 10.469 }, { -33331.859, -2973.227, 10.000, 10.465 },
			{ -33628.844, -2969.859, 10.000, 10.457 }, { -33925.491, -2966.468, 10.000, 10.445 },
			{ -34221.797, -2963.053, 10.000, 10.430 }, { -34517.758, -2959.615, 10.000, 10.410 },
			{ -34813.374, -2956.155, 10.000, 10.385 }, { -35108.641, -2952.672, 10.000, 10.357 },
			{ -35403.558, -2949.168, 10.000, 10.325 }, { -35698.122, -2945.642, 10.000, 10.288 },
			{ -35992.331, -2942.095, 10.000, 10.248 }, { -36286.184, -2938.527, 10.000, 10.203 },
			{ -36579.678, -2934.938, 10.000, 10.154 }, { -36872.811, -2931.330, 10.000, 10.100 },
			{ -37165.581, -2927.702, 10.000, 10.043 }, { -37457.986, -2924.054, 10.000, 9.981 },
			{ -37750.025, -2920.388, 10.000, 9.915 }, { -38041.696, -2916.703, 10.000, 9.844 },
			{ -38332.996, -2913.000, 10.000, 9.769 }, { -38623.924, -2909.280, 10.000, 9.690 },
			{ -38914.478, -2905.542, 10.000, 9.606 }, { -39204.656, -2901.787, 10.000, 9.518 },
			{ -39494.458, -2898.016, 10.000, 9.425 }, { -39783.881, -2894.229, 10.000, 9.328 },
			{ -40072.924, -2890.427, 10.000, 9.226 }, { -40361.585, -2886.610, 10.000, 9.120 },
			{ -40649.863, -2882.779, 10.000, 9.010 }, { -40937.756, -2878.934, 10.000, 8.894 },
			{ -41225.264, -2875.076, 10.000, 8.775 }, { -41512.384, -2871.206, 10.000, 8.650 },
			{ -41799.117, -2867.325, 10.000, 8.522 }, { -42085.460, -2863.432, 10.000, 8.388 },
			{ -42371.413, -2859.529, 10.000, 8.250 }, { -42656.975, -2855.618, 10.000, 8.107 },
			{ -42942.144, -2851.697, 10.000, 7.960 }, { -43226.921, -2847.770, 10.000, 7.808 },
			{ -43511.305, -2843.836, 10.000, 7.652 }, { -43795.294, -2839.896, 10.000, 7.490 },
			{ -44078.890, -2835.952, 10.000, 7.325 }, { -44362.090, -2832.005, 10.000, 7.154 },
			{ -44644.896, -2828.055, 10.000, 6.979 }, { -44927.306, -2824.105, 10.000, 6.799 },
			{ -45209.322, -2820.155, 10.000, 6.615 }, { -45490.942, -2816.207, 10.000, 6.425 },
			{ -45772.169, -2812.263, 10.000, 6.232 }, { -46053.001, -2808.323, 10.000, 6.033 },
			{ -46333.440, -2804.389, 10.000, 5.830 }, { -46613.486, -2800.464, 10.000, 5.622 },
			{ -46893.141, -2796.548, 10.000, 5.410 }, { -47172.406, -2792.644, 10.000, 5.193 },
			{ -47451.281, -2788.753, 10.000, 4.972 }, { -47729.768, -2784.877, 10.000, 4.745 },
			{ -48007.870, -2781.018, 10.000, 4.515 }, { -48285.588, -2777.179, 10.000, 4.280 },
			{ -48562.924, -2773.361, 10.000, 4.040 }, { -48839.881, -2769.566, 10.000, 3.796 },
			{ -49116.461, -2765.798, 10.000, 3.547 }, { -49392.666, -2762.057, 10.000, 3.294 },
			{ -49668.501, -2758.347, 10.000, 3.037 }, { -49943.968, -2754.670, 10.000, 2.775 },
			{ -50219.071, -2751.029, 10.000, 2.509 }, { -50493.814, -2747.426, 10.000, 2.239 },
			{ -50768.200, -2743.863, 10.000, 1.964 }, { -51042.234, -2740.344, 10.000, 1.686 },
			{ -51315.921, -2736.871, 10.000, 1.403 }, { -51589.266, -2733.448, 10.000, 1.116 },
			{ -51862.274, -2730.076, 10.000, 0.825 }, { -52134.950, -2726.758, 10.000, 0.531 },
			{ -52407.299, -2723.499, 10.000, 0.232 }, { -52679.329, -2720.300, 10.000, -0.070 },
			{ -52951.046, -2717.164, 10.000, -0.376 }, { -53222.455, -2714.095, 10.000, -0.686 },
			{ -53493.565, -2711.096, 10.000, -0.999 }, { -53764.382, -2708.169, 10.000, -1.315 },
			{ -54034.914, -2705.317, 10.000, -1.635 }, { -54305.168, -2702.544, 10.000, -1.958 },
			{ -54575.153, -2699.852, 10.000, -2.285 }, { -54844.877, -2697.244, 10.000, -2.614 },
			{ -55114.350, -2694.723, 10.000, -2.947 }, { -55383.579, -2692.293, 10.000, -3.282 },
			{ -55652.574, -2689.955, 10.000, -3.620 }, { -55921.346, -2687.712, 10.000, -3.961 },
			{ -56189.903, -2685.568, 10.000, -4.304 }, { -56458.255, -2683.525, 10.000, -4.650 },
			{ -56726.414, -2681.585, 10.000, -4.998 }, { -56994.389, -2679.750, 10.000, -5.348 },
			{ -57262.191, -2678.024, 10.000, -5.700 }, { -57529.832, -2676.408, 10.000, -6.054 },
			{ -57797.322, -2674.904, 10.000, -6.410 }, { -58064.673, -2673.514, 10.000, -6.767 },
			{ -58331.897, -2672.240, 10.000, -7.126 }, { -58599.006, -2671.085, 10.000, -7.486 },
			{ -58866.011, -2670.048, 10.000, -7.848 }, { -59132.924, -2669.133, 10.000, -8.211 },
			{ -59399.758, -2668.340, 10.000, -8.574 }, { -59666.525, -2667.669, 10.000, -8.938 },
			{ -59933.237, -2667.123, 10.000, -9.303 }, { -60199.908, -2666.702, 10.000, -9.669 },
			{ -60466.548, -2666.407, 10.000, -10.035 }, { -60733.172, -2666.238, 10.000, -10.401 },
			{ -60999.792, -2666.195, 10.000, -10.767 }, { -61266.419, -2666.279, 10.000, -11.133 },
			{ -61533.068, -2666.489, 10.000, -11.499 }, { -61799.751, -2666.826, 10.000, -11.864 },
			{ -62066.480, -2667.289, 10.000, -12.229 }, { -62333.268, -2667.877, 10.000, -12.593 },
			{ -62600.120, -2668.527, 10.000, -12.956 }, { -62866.917, -2667.966, 10.000, -13.318 },
			{ -63133.415, -2664.983, 10.000, -13.679 }, { -63399.372, -2659.571, 10.000, -14.037 },
			{ -63664.545, -2651.725, 10.000, -14.392 }, { -63928.688, -2641.435, 10.000, -14.745 },
			{ -64191.558, -2628.692, 10.000, -15.094 }, { -64452.913, -2613.550, 10.000, -15.439 },
			{ -64712.640, -2597.273, 10.000, -15.780 }, { -64970.746, -2581.065, 10.000, -16.117 },
			{ -65227.238, -2564.921, 10.000, -16.449 }, { -65482.122, -2548.836, 10.000, -16.777 },
			{ -65735.402, -2532.803, 10.000, -17.100 }, { -65987.084, -2516.819, 10.000, -17.419 },
			{ -66237.172, -2500.877, 10.000, -17.733 }, { -66485.669, -2484.972, 10.000, -18.042 },
			{ -66732.579, -2469.101, 10.000, -18.347 }, { -66977.905, -2453.257, 10.000, -18.647 },
			{ -67221.649, -2437.438, 10.000, -18.943 }, { -67463.812, -2421.638, 10.000, -19.233 },
			{ -67704.398, -2405.853, 10.000, -19.519 }, { -67943.405, -2390.079, 10.000, -19.800 },
			{ -68180.837, -2374.313, 10.000, -20.076 }, { -68416.692, -2358.550, 10.000, -20.348 },
			{ -68650.971, -2342.788, 10.000, -20.614 }, { -68883.673, -2327.022, 10.000, -20.876 },
			{ -69114.798, -2311.250, 10.000, -21.133 }, { -69344.345, -2295.469, 10.000, -21.385 },
			{ -69572.312, -2279.675, 10.000, -21.632 }, { -69798.699, -2263.867, 10.000, -21.875 },
			{ -70023.503, -2248.041, 10.000, -22.113 }, { -70246.722, -2232.195, 10.000, -22.346 },
			{ -70468.355, -2216.326, 10.000, -22.575 }, { -70688.398, -2200.434, 10.000, -22.798 },
			{ -70906.850, -2184.515, 10.000, -23.018 }, { -71123.706, -2168.567, 10.000, -23.232 },
			{ -71338.965, -2152.590, 10.000, -23.442 }, { -71552.623, -2136.580, 10.000, -23.648 },
			{ -71764.677, -2120.538, 10.000, -23.849 }, { -71975.123, -2104.460, 10.000, -24.045 },
			{ -72183.958, -2088.347, 10.000, -24.237 }, { -72391.177, -2072.196, 10.000, -24.425 },
			{ -72596.778, -2056.007, 10.000, -24.609 }, { -72800.756, -2039.778, 10.000, -24.788 },
			{ -73003.107, -2023.509, 10.000, -24.963 }, { -73203.827, -2007.199, 10.000, -25.134 },
			{ -73402.911, -1990.846, 10.000, -25.301 }, { -73600.356, -1974.451, 10.000, -25.463 },
			{ -73796.158, -1958.012, 10.000, -25.622 }, { -73990.310, -1941.529, 10.000, -25.777 },
			{ -74182.811, -1925.001, 10.000, -25.928 }, { -74373.653, -1908.428, 10.000, -26.074 },
			{ -74562.834, -1891.810, 10.000, -26.218 }, { -74750.349, -1875.146, 10.000, -26.357 },
			{ -74936.193, -1858.435, 10.000, -26.493 }, { -75120.360, -1841.678, 10.000, -26.625 },
			{ -75302.848, -1824.875, 10.000, -26.753 }, { -75483.650, -1808.024, 10.000, -26.878 },
			{ -75662.763, -1791.127, 10.000, -27.000 }, { -75840.181, -1774.182, 10.000, -27.118 },
			{ -76015.900, -1757.190, 10.000, -27.232 }, { -76189.915, -1740.151, 10.000, -27.344 },
			{ -76362.222, -1723.064, 10.000, -27.452 }, { -76532.815, -1705.931, 10.000, -27.557 },
			{ -76701.690, -1688.750, 10.000, -27.658 }, { -76868.842, -1671.521, 10.000, -27.757 },
			{ -77034.266, -1654.246, 10.000, -27.853 }, { -77197.959, -1636.924, 10.000, -27.945 },
			{ -77359.914, -1619.554, 10.000, -28.035 }, { -77520.128, -1602.138, 10.000, -28.122 },
			{ -77678.596, -1584.676, 10.000, -28.206 }, { -77835.312, -1567.167, 10.000, -28.287 },
			{ -77990.273, -1549.611, 10.000, -28.366 }, { -78143.474, -1532.010, 10.000, -28.442 },
			{ -78294.911, -1514.362, 10.000, -28.516 }, { -78444.578, -1496.669, 10.000, -28.586 },
			{ -78592.471, -1478.931, 10.000, -28.655 }, { -78738.585, -1461.147, 10.000, -28.721 },
			{ -78882.917, -1443.319, 10.000, -28.784 }, { -79025.462, -1425.446, 10.000, -28.846 },
			{ -79166.215, -1407.528, 10.000, -28.905 }, { -79305.171, -1389.567, 10.000, -28.961 },
			{ -79442.328, -1371.562, 10.000, -29.016 }, { -79577.679, -1353.513, 10.000, -29.068 },
			{ -79711.221, -1335.421, 10.000, -29.119 }, { -79842.950, -1317.286, 10.000, -29.167 },
			{ -79972.860, -1299.108, 10.000, -29.214 }, { -80100.949, -1280.889, 10.000, -29.258 },
			{ -80227.212, -1262.627, 10.000, -29.301 }, { -80351.644, -1244.324, 10.000, -29.342 },
			{ -80474.242, -1225.980, 10.000, -29.381 }, { -80595.002, -1207.595, 10.000, -29.418 },
			{ -80713.919, -1189.169, 10.000, -29.454 }, { -80830.989, -1170.703, 10.000, -29.488 },
			{ -80946.209, -1152.198, 10.000, -29.520 }, { -81059.574, -1133.653, 10.000, -29.551 },
			{ -81171.081, -1115.070, 10.000, -29.580 }, { -81280.726, -1096.448, 10.000, -29.608 },
			{ -81388.505, -1077.788, 10.000, -29.635 }, { -81494.414, -1059.090, 10.000, -29.660 },
			{ -81598.449, -1040.355, 10.000, -29.684 }, { -81700.608, -1021.583, 10.000, -29.707 },
			{ -81800.885, -1002.775, 10.000, -29.728 }, { -81899.278, -983.931, 10.000, -29.749 },
			{ -81995.783, -965.052, 10.000, -29.768 }, { -82090.397, -946.137, 10.000, -29.786 },
			{ -82183.116, -927.189, 10.000, -29.803 }, { -82273.936, -908.206, 10.000, -29.819 },
			{ -82362.855, -889.190, 10.000, -29.834 }, { -82449.869, -870.140, 10.000, -29.848 },
			{ -82534.975, -851.059, 10.000, -29.861 }, { -82618.170, -831.946, 10.000, -29.873 },
			{ -82699.450, -812.801, 10.000, -29.885 }, { -82778.813, -793.625, 10.000, -29.895 },
			{ -82856.254, -774.419, 10.000, -29.905 }, { -82931.773, -755.184, 10.000, -29.915 },
			{ -83005.365, -735.920, 10.000, -29.923 }, { -83077.027, -716.627, 10.000, -29.931 },
			{ -83146.758, -697.306, 10.000, -29.938 }, { -83214.554, -677.958, 10.000, -29.945 },
			{ -83280.412, -658.583, 10.000, -29.951 }, { -83344.330, -639.182, 10.000, -29.957 },
			{ -83406.306, -619.756, 10.000, -29.962 }, { -83466.337, -600.306, 10.000, -29.966 },
			{ -83524.420, -580.831, 10.000, -29.971 }, { -83580.553, -561.333, 10.000, -29.974 },
			{ -83634.734, -541.812, 10.000, -29.978 }, { -83686.961, -522.269, 10.000, -29.981 },
			{ -83737.232, -502.705, 10.000, -29.984 }, { -83785.544, -483.121, 10.000, -29.986 },
			{ -83831.895, -463.517, 10.000, -29.988 }, { -83876.285, -443.893, 10.000, -29.990 },
			{ -83918.710, -424.252, 10.000, -29.992 }, { -83959.169, -404.592, 10.000, -29.993 },
			{ -83997.661, -384.916, 10.000, -29.994 }, { -84034.183, -365.224, 10.000, -29.996 },
			{ -84068.735, -345.516, 10.000, -29.996 }, { -84101.314, -325.794, 10.000, -29.997 },
			{ -84131.920, -306.058, 10.000, -29.998 }, { -84160.551, -286.310, 10.000, -29.998 },
			{ -84187.206, -266.549, 10.000, -29.999 }, { -84211.884, -246.777, 10.000, -29.999 },
			{ -84234.583, -226.994, 10.000, -29.999 }, { -84255.303, -207.202, 10.000, -30.000 },
			{ -84274.043, -187.401, 10.000, -30.000 }, { -84290.803, -167.592, 10.000, -30.000 },
			{ -84305.580, -147.776, 10.000, -30.000 }, { -84318.375, -127.953, 10.000, -30.000 },
			{ -84329.188, -108.125, 10.000, -30.000 }, { -84338.017, -88.293, 10.000, -30.000 },
			{ -84344.870, -68.527, 10.000, -30.000 }, { -84349.895, -50.246, 10.000, -30.000 },
			{ -84353.374, -34.798, 10.000, -30.000 }, { -84355.593, -22.184, 10.000, -30.000 },
			{ -84356.833, -12.403, 10.000, -30.000 }, { -84357.379, -5.458, 10.000, -30.000 },
			{ -84357.513, -1.347, 10.000, -30.000 }, { -84357.513, -0.000, 10.000, -30.000 } };

}