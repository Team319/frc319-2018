package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class LeftWallToLeftScaleNullZoneArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,23.15,0.00)
	// (11.63,24.15,0.00)
	// (22.13,24.15,0.00)
	// (25.13,21.15,-89.99)
	
    public LeftWallToLeftScaleNullZoneArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public LeftWallToLeftScaleNullZoneArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.592,-11.844,10.000,0.000},
				{-2.961,-35.531,10.000,0.000},
				{-8.291,-71.062,10.000,0.000},
				{-17.766,-118.437,10.000,0.000},
				{-32.570,-177.655,10.000,0.000},
				{-53.889,-248.718,10.000,0.000},
				{-82.906,-331.623,10.000,0.000},
				{-120.806,-426.373,10.000,0.000},
				{-168.773,-532.966,10.000,0.000},
				{-227.991,-651.403,10.000,0.000},
				{-299.645,-781.684,10.000,0.000},
				{-384.920,-923.808,10.000,0.001},
				{-484.999,-1077.776,10.000,0.001},
				{-601.068,-1243.588,10.000,0.002},
				{-734.309,-1421.243,10.000,0.002},
				{-885.908,-1610.742,10.000,0.003},
				{-1057.050,-1812.085,10.000,0.005},
				{-1248.918,-2025.272,10.000,0.007},
				{-1462.696,-2250.302,10.000,0.009},
				{-1699.570,-2487.176,10.000,0.012},
				{-1960.724,-2735.893,10.000,0.016},
				{-2247.341,-2996.455,10.000,0.021},
				{-2560.607,-3268.860,10.000,0.027},
				{-2901.705,-3553.108,10.000,0.035},
				{-3271.821,-3849.201,10.000,0.044},
				{-3672.138,-4157.137,10.000,0.056},
				{-4103.840,-4476.917,10.000,0.069},
				{-4568.113,-4808.540,10.000,0.085},
				{-5066.140,-5152.007,10.000,0.104},
				{-5599.107,-5507.318,10.000,0.127},
				{-6168.196,-5874.473,10.000,0.153},
				{-6774.593,-6253.471,10.000,0.183},
				{-7419.482,-6644.313,10.000,0.219},
				{-8104.048,-7046.998,10.000,0.259},
				{-8829.474,-7461.528,10.000,0.305},
				{-9596.946,-7887.901,10.000,0.358},
				{-10407.647,-8326.117,10.000,0.417},
				{-11262.761,-8776.178,10.000,0.484},
				{-12163.474,-9238.082,10.000,0.559},
				{-13110.970,-9711.830,10.000,0.644},
				{-14105.840,-10185.577,10.000,0.737},
				{-15148.085,-10659.325,10.000,0.841},
				{-16237.705,-11133.073,10.000,0.955},
				{-17374.700,-11606.821,10.000,1.080},
				{-18559.069,-12080.569,10.000,1.217},
				{-19790.814,-12554.316,10.000,1.365},
				{-21069.933,-13028.064,10.000,1.526},
				{-22396.427,-13501.812,10.000,1.700},
				{-23770.295,-13975.560,10.000,1.886},
				{-25191.538,-14449.307,10.000,2.085},
				{-26659.564,-14911.212,10.000,2.296},
				{-28173.189,-15361.272,10.000,2.521},
				{-29731.227,-15799.489,10.000,2.758},
				{-31332.494,-16225.862,10.000,3.007},
				{-32975.807,-16640.391,10.000,3.267},
				{-34659.980,-17043.077,10.000,3.538},
				{-36383.830,-17433.918,10.000,3.819},
				{-38146.172,-17812.917,10.000,4.109},
				{-39945.821,-18180.071,10.000,4.408},
				{-41781.594,-18535.382,10.000,4.714},
				{-43652.305,-18878.849,10.000,5.025},
				{-45556.771,-19210.473,10.000,5.342},
				{-47493.808,-19530.252,10.000,5.662},
				{-49462.230,-19838.188,10.000,5.984},
				{-51460.853,-20134.281,10.000,6.307},
				{-53488.494,-20418.530,10.000,6.629},
				{-55543.967,-20690.934,10.000,6.949},
				{-57626.088,-20951.496,10.000,7.265},
				{-59733.674,-21200.213,10.000,7.576},
				{-61865.539,-21437.087,10.000,7.880},
				{-64020.499,-21662.117,10.000,8.175},
				{-66197.370,-21875.304,10.000,8.461},
				{-68394.968,-22076.647,10.000,8.735},
				{-70612.107,-22266.146,10.000,8.997},
				{-72847.605,-22443.801,10.000,9.244},
				{-75100.275,-22609.613,10.000,9.475},
				{-77368.935,-22763.581,10.000,9.690},
				{-79652.399,-22905.705,10.000,9.887},
				{-81949.484,-23035.986,10.000,10.065},
				{-84259.004,-23154.423,10.000,10.223},
				{-86579.776,-23261.016,10.000,10.360},
				{-88910.615,-23355.766,10.000,10.476},
				{-91250.337,-23438.672,10.000,10.569},
				{-93597.758,-23509.734,10.000,10.639},
				{-95951.692,-23568.952,10.000,10.686},
				{-98310.956,-23616.327,10.000,10.709},
				{-100674.365,-23651.858,10.000,10.708},
				{-103040.735,-23675.546,10.000,10.683},
				{-105408.882,-23687.389,10.000,10.634},
				{-107777.621,-23687.389,10.000,10.561},
				{-110146.360,-23687.389,10.000,10.464},
				{-112515.099,-23687.389,10.000,10.344},
				{-114883.838,-23687.389,10.000,10.201},
				{-117252.577,-23687.389,10.000,10.036},
				{-119621.316,-23687.389,10.000,9.848},
				{-121990.055,-23687.389,10.000,9.639},
				{-124358.793,-23687.389,10.000,9.410},
				{-126727.532,-23687.389,10.000,9.160},
				{-129096.271,-23687.389,10.000,8.892},
				{-131465.010,-23687.389,10.000,8.605},
				{-133833.749,-23687.389,10.000,8.302},
				{-136202.488,-23687.389,10.000,7.982},
				{-138571.227,-23687.389,10.000,7.648},
				{-140939.966,-23687.389,10.000,7.301},
				{-143308.705,-23687.389,10.000,6.942},
				{-145677.444,-23687.389,10.000,6.572},
				{-148046.183,-23687.389,10.000,6.194},
				{-150414.922,-23687.389,10.000,5.809},
				{-152783.661,-23687.389,10.000,5.419},
				{-155152.399,-23687.389,10.000,5.025},
				{-157521.138,-23687.389,10.000,4.631},
				{-159889.877,-23687.389,10.000,4.237},
				{-162258.616,-23687.389,10.000,3.846},
				{-164627.355,-23687.389,10.000,3.460},
				{-166996.094,-23687.389,10.000,3.082},
				{-169364.833,-23687.389,10.000,2.713},
				{-171733.572,-23687.389,10.000,2.357},
				{-174102.311,-23687.389,10.000,2.015},
				{-176471.050,-23687.389,10.000,1.691},
				{-178839.789,-23687.389,10.000,1.387},
				{-181208.528,-23687.389,10.000,1.105},
				{-183577.267,-23687.389,10.000,0.849},
				{-185946.005,-23687.389,10.000,0.621},
				{-188314.744,-23687.389,10.000,0.423},
				{-190683.483,-23687.389,10.000,0.260},
				{-193052.222,-23687.389,10.000,0.134},
				{-195420.961,-23687.389,10.000,0.047},
				{-197789.700,-23687.389,10.000,0.004},
				{-200158.439,-23687.389,10.000,0.000},
				{-202527.178,-23687.389,10.000,0.000},
				{-204895.917,-23687.389,10.000,0.000},
				{-207264.656,-23687.389,10.000,0.000},
				{-209633.395,-23687.389,10.000,0.000},
				{-212002.134,-23687.389,10.000,0.000},
				{-214370.873,-23687.389,10.000,0.000},
				{-216739.611,-23687.389,10.000,0.000},
				{-219108.350,-23687.389,10.000,0.000},
				{-221477.089,-23687.389,10.000,0.000},
				{-223845.828,-23687.389,10.000,0.000},
				{-226214.567,-23687.389,10.000,0.000},
				{-228583.306,-23687.389,10.000,0.000},
				{-230952.045,-23687.389,10.000,0.000},
				{-233320.784,-23687.389,10.000,0.000},
				{-235689.523,-23687.389,10.000,0.000},
				{-238058.262,-23687.389,10.000,0.000},
				{-240427.001,-23687.389,10.000,0.000},
				{-242795.740,-23687.389,10.000,0.000},
				{-245164.479,-23687.389,10.000,0.000},
				{-247533.217,-23687.389,10.000,0.000},
				{-249901.956,-23687.389,10.000,0.000},
				{-252270.695,-23687.389,10.000,0.000},
				{-254639.434,-23687.389,10.000,0.000},
				{-257008.173,-23687.389,10.000,0.000},
				{-259376.912,-23687.389,10.000,0.000},
				{-261745.651,-23687.389,10.000,0.000},
				{-264114.390,-23687.389,10.000,0.000},
				{-266483.129,-23687.389,10.000,0.000},
				{-268851.868,-23687.389,10.000,0.000},
				{-271220.607,-23687.389,10.000,0.000},
				{-273589.346,-23687.389,10.000,0.000},
				{-275958.085,-23687.389,10.000,0.000},
				{-278326.823,-23687.389,10.000,0.000},
				{-280695.562,-23687.389,10.000,0.000},
				{-283064.301,-23687.389,10.000,0.000},
				{-285433.040,-23687.389,10.000,0.000},
				{-287801.779,-23687.389,10.000,0.000},
				{-290170.518,-23687.389,10.000,0.000},
				{-292539.257,-23687.389,10.000,0.000},
				{-294907.996,-23687.389,10.000,0.000},
				{-297276.735,-23687.389,10.000,0.000},
				{-299645.474,-23687.389,10.000,0.000},
				{-302014.213,-23687.389,10.000,0.000},
				{-304382.952,-23687.389,10.000,0.000},
				{-306751.691,-23687.389,10.000,0.000},
				{-309120.430,-23687.389,10.000,0.000},
				{-311489.168,-23687.389,10.000,0.000},
				{-313857.907,-23687.389,10.000,0.000},
				{-316226.646,-23687.389,10.000,0.000},
				{-318595.385,-23687.389,10.000,0.000},
				{-320964.124,-23687.389,10.000,0.000},
				{-323332.863,-23687.389,10.000,0.000},
				{-325701.602,-23687.389,10.000,0.000},
				{-328070.341,-23687.389,10.000,0.000},
				{-330439.080,-23687.389,10.000,0.000},
				{-332807.819,-23687.389,10.000,0.000},
				{-335176.558,-23687.389,10.000,0.000},
				{-337545.297,-23687.389,10.000,0.000},
				{-339914.036,-23687.389,10.000,0.000},
				{-342282.774,-23687.389,10.000,0.000},
				{-344651.513,-23687.389,10.000,0.000},
				{-347020.252,-23687.389,10.000,0.000},
				{-349388.991,-23687.389,10.000,0.000},
				{-351757.730,-23687.389,10.000,0.000},
				{-354126.469,-23687.389,10.000,0.000},
				{-356495.208,-23687.389,10.000,0.000},
				{-358863.947,-23687.389,10.000,0.000},
				{-361232.686,-23687.389,10.000,0.000},
				{-363601.425,-23687.389,10.000,0.000},
				{-365970.164,-23687.389,10.000,0.000},
				{-368338.903,-23687.389,10.000,0.000},
				{-370707.642,-23687.389,10.000,0.000},
				{-373076.380,-23687.389,10.000,0.000},
				{-375445.119,-23687.389,10.000,0.000},
				{-377813.858,-23687.389,10.000,0.000},
				{-380182.597,-23687.389,10.000,0.000},
				{-382551.336,-23687.389,10.000,0.000},
				{-384920.075,-23687.389,10.000,0.000},
				{-387288.814,-23687.389,10.000,0.000},
				{-389657.553,-23687.389,10.000,0.000},
				{-392026.292,-23687.389,10.000,0.000},
				{-394395.031,-23687.389,10.000,0.000},
				{-396763.770,-23687.389,10.000,0.000},
				{-399132.509,-23687.389,10.000,0.000},
				{-401501.248,-23687.389,10.000,0.000},
				{-403869.520,-23678.054,10.000,0.000},
				{-406236.266,-23656.876,10.000,-0.000},
				{-408600.303,-23623.854,10.000,-0.078},
				{-410960.445,-23578.988,10.000,-0.288},
				{-413315.508,-23522.278,10.000,-0.629},
				{-415664.308,-23453.725,10.000,-1.102},
				{-418005.661,-23373.328,10.000,-1.710},
				{-420338.382,-23281.087,10.000,-2.458},
				{-422661.286,-23177.003,10.000,-3.353},
				{-424973.190,-23061.075,10.000,-4.405},
				{-427272.909,-22933.303,10.000,-5.626},
				{-429559.259,-22793.688,10.000,-7.029},
				{-431831.054,-22642.229,10.000,-8.630},
				{-434087.112,-22478.926,10.000,-10.447},
				{-436326.247,-22303.779,10.000,-12.498},
				{-438547.276,-22116.789,10.000,-14.801},
				{-440749.013,-21917.955,10.000,-17.373},
				{-442930.275,-21707.278,10.000,-20.227},
				{-445089.876,-21484.756,10.000,-23.367},
				{-447226.634,-21250.391,10.000,-26.785},
				{-449339.362,-21004.183,10.000,-30.460},
				{-451426.878,-20746.130,10.000,-34.349},
				{-453487.996,-20476.234,10.000,-38.391},
				{-455521.533,-20194.494,10.000,-42.509},
				{-457526.303,-19900.911,10.000,-46.619},
				{-459501.123,-19595.484,10.000,-50.637},
				{-461444.808,-19278.213,10.000,-54.488},
				{-463356.173,-18949.098,10.000,-58.117},
				{-465234.035,-18608.140,10.000,-61.486},
				{-467077.209,-18255.338,10.000,-64.576},
				{-468884.511,-17890.693,10.000,-67.386},
				{-470654.755,-17514.203,10.000,-69.922},
				{-472386.759,-17125.870,10.000,-72.200},
				{-474079.337,-16725.693,10.000,-74.239},
				{-475731.305,-16313.673,10.000,-76.060},
				{-477341.480,-15889.809,10.000,-77.683},
				{-478908.675,-15454.101,10.000,-79.129},
				{-480431.708,-15006.550,10.000,-80.416},
				{-481909.393,-14547.154,10.000,-81.561},
				{-483340.546,-14075.916,10.000,-82.578},
				{-484724.451,-13602.168,10.000,-83.482},
				{-486060.980,-13128.420,10.000,-84.285},
				{-487350.135,-12654.672,10.000,-84.997},
				{-488591.914,-12180.924,10.000,-85.630},
				{-489786.319,-11707.177,10.000,-86.191},
				{-490933.350,-11233.429,10.000,-86.687},
				{-492033.005,-10759.681,10.000,-87.127},
				{-493085.286,-10285.933,10.000,-87.514},
				{-494090.192,-9812.186,10.000,-87.856},
				{-495047.723,-9338.438,10.000,-88.156},
				{-495958.346,-8874.025,10.000,-88.419},
				{-496823.120,-8421.455,10.000,-88.648},
				{-497643.229,-7980.730,10.000,-88.849},
				{-498419.858,-7551.848,10.000,-89.023},
				{-499154.191,-7134.810,10.000,-89.175},
				{-499847.412,-6729.615,10.000,-89.306},
				{-500500.706,-6336.264,10.000,-89.418},
				{-501115.257,-5954.757,10.000,-89.515},
				{-501692.250,-5585.094,10.000,-89.598},
				{-502232.868,-5227.274,10.000,-89.668},
				{-502738.297,-4881.298,10.000,-89.727},
				{-503209.720,-4547.166,10.000,-89.778},
				{-503648.322,-4224.877,10.000,-89.819},
				{-504055.288,-3914.432,10.000,-89.854},
				{-504431.801,-3615.831,10.000,-89.883},
				{-504779.046,-3329.073,10.000,-89.906},
				{-505098.208,-3054.159,10.000,-89.925},
				{-505390.470,-2791.089,10.000,-89.940},
				{-505657.018,-2539.863,10.000,-89.953},
				{-505899.035,-2300.480,10.000,-89.962},
				{-506117.706,-2072.941,10.000,-89.970},
				{-506314.215,-1857.245,10.000,-89.975},
				{-506489.747,-1653.394,10.000,-89.980},
				{-506645.486,-1461.386,10.000,-89.983},
				{-506782.617,-1281.221,10.000,-89.985},
				{-506902.323,-1112.901,10.000,-89.987},
				{-507005.789,-956.424,10.000,-89.988},
				{-507094.200,-811.791,10.000,-89.989},
				{-507168.739,-679.001,10.000,-89.989},
				{-507230.592,-558.055,10.000,-89.990},
				{-507280.942,-448.953,10.000,-89.990},
				{-507320.975,-351.695,10.000,-89.990},
				{-507351.874,-266.280,10.000,-89.990},
				{-507374.823,-192.709,10.000,-89.990},
				{-507391.008,-130.981,10.000,-89.990},
				{-507401.611,-81.098,10.000,-89.990},
				{-507407.819,-43.058,10.000,-89.990},
				{-507410.815,-16.861,10.000,-89.990},
				{-507411.784,-2.509,10.000,-89.990},
				{-507411.909,-0.000,10.000,-89.990},
				{-507411.909,-0.000,10.000,-89.990}		};

}