package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class ScaleLeftStartRightArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,3.79,0.00)
	// (10.13,2.79,0.00)
	// (16.38,7.79,80.00)
	// (17.38,17.79,80.00)
	// (23.38,20.79,0.00)
	
    public ScaleLeftStartRightArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public ScaleLeftStartRightArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.568,-11.351,10.000,-0.000},
				{-2.838,-34.054,10.000,-0.000},
				{-7.946,-68.107,10.000,-0.000},
				{-17.027,-113.512,10.000,-0.000},
				{-31.216,-170.268,10.000,-0.000},
				{-51.648,-238.376,10.000,-0.000},
				{-79.459,-317.834,10.000,-0.000},
				{-115.783,-408.644,10.000,-0.000},
				{-161.755,-510.805,10.000,-0.000},
				{-218.511,-624.318,10.000,-0.000},
				{-287.186,-749.181,10.000,-0.001},
				{-368.915,-885.396,10.000,-0.001},
				{-464.833,-1032.962,10.000,-0.001},
				{-576.075,-1191.879,10.000,-0.002},
				{-703.209,-1350.797,10.000,-0.003},
				{-846.234,-1509.714,10.000,-0.005},
				{-1005.152,-1668.631,10.000,-0.007},
				{-1179.961,-1827.548,10.000,-0.009},
				{-1370.661,-1986.466,10.000,-0.013},
				{-1577.254,-2145.383,10.000,-0.017},
				{-1799.738,-2304.300,10.000,-0.022},
				{-2038.114,-2463.217,10.000,-0.028},
				{-2292.381,-2622.135,10.000,-0.035},
				{-2562.541,-2781.052,10.000,-0.043},
				{-2848.592,-2939.969,10.000,-0.053},
				{-3150.534,-3098.886,10.000,-0.065},
				{-3468.369,-3257.804,10.000,-0.079},
				{-3802.095,-3416.721,10.000,-0.094},
				{-4151.713,-3575.638,10.000,-0.112},
				{-4517.223,-3734.555,10.000,-0.132},
				{-4898.624,-3893.472,10.000,-0.154},
				{-5295.917,-4052.390,10.000,-0.179},
				{-5709.102,-4211.307,10.000,-0.207},
				{-6138.179,-4370.224,10.000,-0.239},
				{-6583.147,-4529.141,10.000,-0.273},
				{-7044.007,-4688.059,10.000,-0.311},
				{-7520.759,-4846.976,10.000,-0.352},
				{-8013.402,-5005.893,10.000,-0.398},
				{-8521.937,-5164.810,10.000,-0.447},
				{-9046.364,-5323.728,10.000,-0.501},
				{-9586.683,-5482.645,10.000,-0.558},
				{-10142.893,-5641.562,10.000,-0.621},
				{-10714.995,-5800.479,10.000,-0.688},
				{-11302.989,-5959.397,10.000,-0.760},
				{-11906.875,-6118.314,10.000,-0.838},
				{-12526.652,-6277.231,10.000,-0.920},
				{-13162.321,-6436.148,10.000,-1.008},
				{-13813.881,-6595.066,10.000,-1.102},
				{-14481.334,-6753.983,10.000,-1.201},
				{-15164.678,-6912.900,10.000,-1.306},
				{-15863.914,-7071.817,10.000,-1.416},
				{-16579.042,-7230.735,10.000,-1.533},
				{-17310.061,-7389.652,10.000,-1.656},
				{-18056.972,-7548.569,10.000,-1.785},
				{-18819.775,-7707.486,10.000,-1.921},
				{-19598.469,-7866.404,10.000,-2.063},
				{-20393.055,-8025.321,10.000,-2.211},
				{-21203.533,-8184.238,10.000,-2.365},
				{-22029.903,-8343.155,10.000,-2.526},
				{-22872.164,-8502.073,10.000,-2.693},
				{-23730.318,-8660.990,10.000,-2.867},
				{-24604.362,-8819.907,10.000,-3.047},
				{-25494.299,-8978.824,10.000,-3.233},
				{-26400.127,-9137.742,10.000,-3.425},
				{-27321.847,-9296.659,10.000,-3.624},
				{-28259.459,-9455.576,10.000,-3.828},
				{-29212.962,-9614.493,10.000,-4.038},
				{-30182.358,-9773.411,10.000,-4.253},
				{-31167.645,-9932.328,10.000,-4.474},
				{-32168.823,-10091.245,10.000,-4.700},
				{-33185.894,-10250.162,10.000,-4.930},
				{-34218.856,-10409.080,10.000,-5.166},
				{-35267.709,-10567.997,10.000,-5.405},
				{-36332.455,-10726.914,10.000,-5.649},
				{-37413.092,-10885.831,10.000,-5.896},
				{-38509.621,-11044.748,10.000,-6.146},
				{-39622.042,-11203.666,10.000,-6.400},
				{-40750.354,-11362.583,10.000,-6.655},
				{-41894.559,-11521.500,10.000,-6.913},
				{-43054.654,-11680.417,10.000,-7.172},
				{-44230.642,-11839.335,10.000,-7.432},
				{-45422.521,-11998.252,10.000,-7.692},
				{-46630.292,-12157.169,10.000,-7.952},
				{-47853.955,-12316.086,10.000,-8.212},
				{-49093.510,-12475.004,10.000,-8.471},
				{-50348.956,-12633.921,10.000,-8.727},
				{-51620.294,-12792.838,10.000,-8.982},
				{-52907.524,-12951.755,10.000,-9.233},
				{-54210.645,-13110.673,10.000,-9.480},
				{-55529.658,-13269.590,10.000,-9.723},
				{-56864.563,-13428.507,10.000,-9.961},
				{-58215.360,-13587.424,10.000,-10.193},
				{-59582.048,-13746.342,10.000,-10.419},
				{-60964.628,-13905.259,10.000,-10.637},
				{-62363.100,-14064.176,10.000,-10.848},
				{-63777.463,-14223.093,10.000,-11.050},
				{-65207.718,-14382.011,10.000,-11.243},
				{-66653.865,-14540.928,10.000,-11.426},
				{-68115.904,-14699.845,10.000,-11.598},
				{-69593.834,-14858.762,10.000,-11.759},
				{-71087.656,-15017.680,10.000,-11.908},
				{-72597.370,-15176.597,10.000,-12.043},
				{-74122.976,-15335.514,10.000,-12.166},
				{-75664.473,-15494.431,10.000,-12.274},
				{-77221.862,-15653.349,10.000,-12.367},
				{-78795.143,-15812.266,10.000,-12.444},
				{-80384.315,-15971.183,10.000,-12.506},
				{-81989.379,-16130.100,10.000,-12.551},
				{-83610.335,-16289.018,10.000,-12.578},
				{-85247.183,-16447.935,10.000,-12.587},
				{-86899.922,-16606.852,10.000,-12.578},
				{-88568.553,-16765.769,10.000,-12.550},
				{-90253.076,-16924.687,10.000,-12.502},
				{-91953.491,-17083.604,10.000,-12.434},
				{-93669.797,-17242.521,10.000,-12.346},
				{-95401.995,-17401.438,10.000,-12.237},
				{-97150.085,-17560.356,10.000,-12.107},
				{-98914.066,-17719.273,10.000,-11.956},
				{-100693.939,-17878.190,10.000,-11.783},
				{-102489.704,-18037.107,10.000,-11.588},
				{-104301.361,-18196.025,10.000,-11.372},
				{-106128.909,-18354.942,10.000,-11.134},
				{-107972.349,-18513.859,10.000,-10.875},
				{-109831.681,-18672.776,10.000,-10.594},
				{-111706.904,-18831.693,10.000,-10.293},
				{-113597.452,-18979.259,10.000,-9.971},
				{-115502.188,-19115.474,10.000,-9.629},
				{-117419.979,-19240.338,10.000,-9.269},
				{-119349.688,-19353.850,10.000,-8.892},
				{-121290.182,-19456.011,10.000,-8.498},
				{-123240.323,-19546.821,10.000,-8.090},
				{-125198.978,-19626.280,10.000,-7.669},
				{-127165.012,-19694.387,10.000,-7.238},
				{-129137.288,-19751.143,10.000,-6.797},
				{-131114.673,-19796.548,10.000,-6.350},
				{-133096.030,-19830.602,10.000,-5.898},
				{-135080.225,-19853.304,10.000,-5.444},
				{-137066.123,-19864.656,10.000,-4.991},
				{-139052.589,-19864.656,10.000,-4.541},
				{-141039.055,-19864.656,10.000,-4.096},
				{-143025.520,-19864.656,10.000,-3.660},
				{-145011.986,-19864.656,10.000,-3.235},
				{-146998.451,-19864.656,10.000,-2.824},
				{-148984.917,-19864.656,10.000,-2.429},
				{-150971.382,-19864.656,10.000,-2.053},
				{-152957.848,-19864.656,10.000,-1.699},
				{-154944.313,-19864.656,10.000,-1.370},
				{-156930.779,-19864.656,10.000,-1.069},
				{-158917.245,-19864.656,10.000,-0.798},
				{-160903.710,-19864.656,10.000,-0.561},
				{-162890.176,-19864.656,10.000,-0.362},
				{-164876.641,-19864.656,10.000,-0.203},
				{-166863.107,-19864.656,10.000,-0.087},
				{-168849.572,-19864.656,10.000,-0.019},
				{-170836.038,-19864.656,10.000,0.000},
				{-172822.503,-19864.656,10.000,0.017},
				{-174808.969,-19864.656,10.000,0.059},
				{-176795.435,-19864.656,10.000,0.127},
				{-178781.900,-19864.656,10.000,0.220},
				{-180768.366,-19864.656,10.000,0.338},
				{-182754.831,-19864.656,10.000,0.482},
				{-184741.297,-19864.656,10.000,0.652},
				{-186727.762,-19864.656,10.000,0.849},
				{-188714.228,-19864.656,10.000,1.071},
				{-190700.693,-19864.656,10.000,1.321},
				{-192687.159,-19864.656,10.000,1.599},
				{-194673.625,-19864.656,10.000,1.905},
				{-196660.090,-19864.656,10.000,2.240},
				{-198646.556,-19864.656,10.000,2.605},
				{-200633.021,-19864.656,10.000,3.000},
				{-202619.487,-19864.656,10.000,3.427},
				{-204605.952,-19864.656,10.000,3.887},
				{-206592.418,-19864.656,10.000,4.381},
				{-208578.883,-19864.656,10.000,4.910},
				{-210565.349,-19864.656,10.000,5.475},
				{-212551.815,-19864.656,10.000,6.077},
				{-214538.280,-19864.656,10.000,6.719},
				{-216524.746,-19864.656,10.000,7.402},
				{-218511.211,-19864.656,10.000,8.127},
				{-220497.677,-19864.656,10.000,8.896},
				{-222484.142,-19864.656,10.000,9.710},
				{-224470.608,-19864.656,10.000,10.572},
				{-226457.073,-19864.656,10.000,11.482},
				{-228443.539,-19864.656,10.000,12.444},
				{-230430.005,-19864.656,10.000,13.457},
				{-232416.470,-19864.656,10.000,14.524},
				{-234402.936,-19864.656,10.000,15.646},
				{-236389.401,-19864.656,10.000,16.824},
				{-238375.867,-19864.656,10.000,18.059},
				{-240362.332,-19864.656,10.000,19.352},
				{-242348.798,-19864.656,10.000,20.702},
				{-244335.263,-19864.656,10.000,22.109},
				{-246321.729,-19864.656,10.000,23.573},
				{-248308.195,-19864.656,10.000,25.091},
				{-250294.660,-19864.656,10.000,26.662},
				{-252281.126,-19864.656,10.000,28.282},
				{-254267.591,-19864.656,10.000,29.948},
				{-256254.057,-19864.656,10.000,31.655},
				{-258240.522,-19864.656,10.000,33.397},
				{-260226.988,-19864.656,10.000,35.169},
				{-262213.454,-19864.656,10.000,36.963},
				{-264199.919,-19864.656,10.000,38.772},
				{-266186.385,-19864.656,10.000,40.590},
				{-268172.850,-19864.656,10.000,42.407},
				{-270159.316,-19864.656,10.000,44.216},
				{-272145.781,-19864.656,10.000,46.009},
				{-274132.247,-19864.656,10.000,47.780},
				{-276118.712,-19864.656,10.000,49.521},
				{-278105.178,-19864.656,10.000,51.227},
				{-280091.644,-19864.656,10.000,52.891},
				{-282078.109,-19864.656,10.000,54.509},
				{-284064.575,-19864.656,10.000,56.078},
				{-286051.040,-19864.656,10.000,57.594},
				{-288037.506,-19864.656,10.000,59.055},
				{-290023.971,-19864.656,10.000,60.459},
				{-292010.437,-19864.656,10.000,61.806},
				{-293996.902,-19864.656,10.000,63.095},
				{-295983.368,-19864.656,10.000,64.325},
				{-297969.834,-19864.656,10.000,65.498},
				{-299956.299,-19864.656,10.000,66.615},
				{-301942.765,-19864.656,10.000,67.676},
				{-303929.230,-19864.656,10.000,68.682},
				{-305915.696,-19864.656,10.000,69.635},
				{-307902.161,-19864.656,10.000,70.537},
				{-309888.627,-19864.656,10.000,71.389},
				{-311875.092,-19864.656,10.000,72.192},
				{-313861.558,-19864.656,10.000,72.949},
				{-315848.024,-19864.656,10.000,73.660},
				{-317834.489,-19864.656,10.000,74.327},
				{-319820.955,-19864.656,10.000,74.952},
				{-321807.420,-19864.656,10.000,75.536},
				{-323793.886,-19864.656,10.000,76.080},
				{-325780.351,-19864.656,10.000,76.586},
				{-327766.817,-19864.656,10.000,77.054},
				{-329753.282,-19864.656,10.000,77.485},
				{-331739.748,-19864.656,10.000,77.881},
				{-333726.214,-19864.656,10.000,78.241},
				{-335712.679,-19864.656,10.000,78.567},
				{-337699.145,-19864.656,10.000,78.860},
				{-339685.610,-19864.656,10.000,79.118},
				{-341672.076,-19864.656,10.000,79.344},
				{-343658.541,-19864.656,10.000,79.537},
				{-345645.007,-19864.656,10.000,79.696},
				{-347631.472,-19864.656,10.000,79.823},
				{-349617.938,-19864.656,10.000,79.916},
				{-351604.404,-19864.656,10.000,79.975},
				{-353590.869,-19864.656,10.000,79.999},
				{-355577.335,-19864.656,10.000,80.008},
				{-357563.800,-19864.656,10.000,80.039},
				{-359550.266,-19864.656,10.000,80.094},
				{-361536.731,-19864.656,10.000,80.169},
				{-363523.197,-19864.656,10.000,80.264},
				{-365509.662,-19864.656,10.000,80.377},
				{-367496.128,-19864.656,10.000,80.508},
				{-369482.594,-19864.656,10.000,80.655},
				{-371469.059,-19864.656,10.000,80.816},
				{-373455.525,-19864.656,10.000,80.990},
				{-375441.990,-19864.656,10.000,81.176},
				{-377428.456,-19864.656,10.000,81.374},
				{-379414.921,-19864.656,10.000,81.581},
				{-381401.387,-19864.656,10.000,81.796},
				{-383387.852,-19864.656,10.000,82.020},
				{-385374.318,-19864.656,10.000,82.249},
				{-387360.784,-19864.656,10.000,82.484},
				{-389347.249,-19864.656,10.000,82.723},
				{-391333.715,-19864.656,10.000,82.966},
				{-393320.180,-19864.656,10.000,83.211},
				{-395306.646,-19864.656,10.000,83.457},
				{-397293.111,-19864.656,10.000,83.704},
				{-399279.577,-19864.656,10.000,83.950},
				{-401266.042,-19864.656,10.000,84.196},
				{-403252.508,-19864.656,10.000,84.438},
				{-405238.974,-19864.656,10.000,84.679},
				{-407225.439,-19864.656,10.000,84.915},
				{-409211.905,-19864.656,10.000,85.147},
				{-411198.370,-19864.656,10.000,85.374},
				{-413184.836,-19864.656,10.000,85.594},
				{-415171.301,-19864.656,10.000,85.809},
				{-417157.767,-19864.656,10.000,86.016},
				{-419144.232,-19864.656,10.000,86.216},
				{-421130.698,-19864.656,10.000,86.408},
				{-423117.164,-19864.656,10.000,86.591},
				{-425103.629,-19864.656,10.000,86.765},
				{-427090.095,-19864.656,10.000,86.929},
				{-429076.560,-19864.656,10.000,87.083},
				{-431063.026,-19864.656,10.000,87.227},
				{-433049.491,-19864.656,10.000,87.360},
				{-435035.957,-19864.656,10.000,87.482},
				{-437022.423,-19864.656,10.000,87.592},
				{-439008.888,-19864.656,10.000,87.691},
				{-440995.354,-19864.656,10.000,87.778},
				{-442981.819,-19864.656,10.000,87.853},
				{-444968.285,-19864.656,10.000,87.916},
				{-446954.750,-19864.656,10.000,87.967},
				{-448941.216,-19864.656,10.000,88.004},
				{-450927.681,-19864.656,10.000,88.030},
				{-452914.147,-19864.656,10.000,88.043},
				{-454900.613,-19864.656,10.000,88.043},
				{-456887.078,-19864.656,10.000,88.030},
				{-458873.544,-19864.656,10.000,88.005},
				{-460860.009,-19864.656,10.000,87.967},
				{-462846.475,-19864.656,10.000,87.917},
				{-464832.940,-19864.656,10.000,87.855},
				{-466819.406,-19864.656,10.000,87.780},
				{-468805.871,-19864.656,10.000,87.693},
				{-470792.337,-19864.656,10.000,87.594},
				{-472778.803,-19864.656,10.000,87.484},
				{-474765.268,-19864.656,10.000,87.362},
				{-476751.734,-19864.656,10.000,87.229},
				{-478738.199,-19864.656,10.000,87.086},
				{-480724.665,-19864.656,10.000,86.932},
				{-482711.130,-19864.656,10.000,86.768},
				{-484697.596,-19864.656,10.000,86.594},
				{-486684.061,-19864.656,10.000,86.412},
				{-488670.527,-19864.656,10.000,86.220},
				{-490656.993,-19864.656,10.000,86.020},
				{-492643.458,-19864.656,10.000,85.813},
				{-494629.924,-19864.656,10.000,85.599},
				{-496616.389,-19864.656,10.000,85.378},
				{-498602.855,-19864.656,10.000,85.151},
				{-500589.320,-19864.656,10.000,84.919},
				{-502575.786,-19864.656,10.000,84.683},
				{-504562.251,-19864.656,10.000,84.443},
				{-506548.717,-19864.656,10.000,84.200},
				{-508535.183,-19864.656,10.000,83.955},
				{-510521.648,-19864.656,10.000,83.709},
				{-512508.114,-19864.656,10.000,83.462},
				{-514494.579,-19864.656,10.000,83.216},
				{-516481.045,-19864.656,10.000,82.971},
				{-518467.510,-19864.656,10.000,82.728},
				{-520453.976,-19864.656,10.000,82.489},
				{-522440.441,-19864.656,10.000,82.254},
				{-524426.907,-19864.656,10.000,82.024},
				{-526413.373,-19864.656,10.000,81.801},
				{-528399.838,-19864.656,10.000,81.585},
				{-530386.304,-19864.656,10.000,81.378},
				{-532372.769,-19864.656,10.000,81.180},
				{-534359.235,-19864.656,10.000,80.993},
				{-536345.700,-19864.656,10.000,80.819},
				{-538332.166,-19864.656,10.000,80.658},
				{-540318.631,-19864.656,10.000,80.511},
				{-542305.097,-19864.656,10.000,80.380},
				{-544291.563,-19864.656,10.000,80.266},
				{-546278.028,-19864.656,10.000,80.171},
				{-548264.494,-19864.656,10.000,80.095},
				{-550250.959,-19864.656,10.000,80.040},
				{-552237.425,-19864.656,10.000,80.008},
				{-554223.890,-19864.656,10.000,79.999},
				{-556210.356,-19864.656,10.000,79.960},
				{-558196.821,-19864.656,10.000,79.864},
				{-560183.287,-19864.656,10.000,79.714},
				{-562169.753,-19864.656,10.000,79.509},
				{-564156.218,-19864.656,10.000,79.249},
				{-566142.684,-19864.656,10.000,78.934},
				{-568129.149,-19864.656,10.000,78.563},
				{-570115.615,-19864.656,10.000,78.134},
				{-572102.080,-19864.656,10.000,77.644},
				{-574088.546,-19864.656,10.000,77.091},
				{-576075.011,-19864.656,10.000,76.471},
				{-578061.383,-19862.769,10.000,75.779},
				{-580046.998,-19849.530,10.000,75.012},
				{-582030.721,-19824.941,10.000,74.164},
				{-584011.418,-19789.000,10.000,73.229},
				{-585987.954,-19741.708,10.000,72.202},
				{-587959.192,-19683.065,10.000,71.074},
				{-589923.999,-19613.070,10.000,69.840},
				{-591881.239,-19531.725,10.000,68.490},
				{-593829.776,-19439.028,10.000,67.017},
				{-595768.477,-19334.980,10.000,65.413},
				{-597696.205,-19219.580,10.000,63.669},
				{-599611.825,-19092.830,10.000,61.778},
				{-601514.203,-18954.728,10.000,59.734},
				{-603402.203,-18805.275,10.000,57.534},
				{-605274.785,-18646.357,10.000,55.177},
				{-607131.475,-18487.440,10.000,52.665},
				{-608972.273,-18328.523,10.000,50.006},
				{-610797.179,-18169.606,10.000,47.212},
				{-612606.194,-18010.688,10.000,44.303},
				{-614399.317,-17851.771,10.000,41.302},
				{-616176.548,-17692.854,10.000,38.242},
				{-617937.888,-17533.937,10.000,35.157},
				{-619683.336,-17375.019,10.000,32.083},
				{-621412.892,-17216.102,10.000,29.058},
				{-623126.556,-17057.185,10.000,26.114},
				{-624824.329,-16898.268,10.000,23.281},
				{-626506.210,-16739.351,10.000,20.582},
				{-628172.199,-16580.433,10.000,18.032},
				{-629822.296,-16421.516,10.000,15.643},
				{-631456.502,-16262.599,10.000,13.417},
				{-633074.816,-16103.682,10.000,11.356},
				{-634677.238,-15944.764,10.000,9.456},
				{-636263.769,-15785.847,10.000,7.711},
				{-637834.408,-15626.930,10.000,6.113},
				{-639389.155,-15468.013,10.000,4.653},
				{-640928.010,-15309.095,10.000,3.322},
				{-642450.974,-15150.178,10.000,2.112},
				{-643958.046,-14991.261,10.000,1.013},
				{-645449.226,-14832.344,10.000,0.017},
				{-646924.514,-14673.426,10.000,-0.884},
				{-648383.911,-14514.509,10.000,-1.698},
				{-649827.416,-14355.592,10.000,-2.431},
				{-651255.030,-14196.675,10.000,-3.089},
				{-652666.751,-14037.757,10.000,-3.679},
				{-654062.581,-13878.840,10.000,-4.206},
				{-655442.519,-13719.923,10.000,-4.674},
				{-656806.566,-13561.006,10.000,-5.088},
				{-658154.720,-13402.088,10.000,-5.452},
				{-659486.983,-13243.171,10.000,-5.770},
				{-660803.355,-13084.254,10.000,-6.044},
				{-662103.834,-12925.337,10.000,-6.278},
				{-663388.422,-12766.419,10.000,-6.474},
				{-664657.118,-12607.502,10.000,-6.636},
				{-665909.922,-12448.585,10.000,-6.765},
				{-667146.835,-12289.668,10.000,-6.864},
				{-668367.856,-12130.750,10.000,-6.935},
				{-669572.985,-11971.833,10.000,-6.980},
				{-670762.223,-11812.916,10.000,-7.000},
				{-671935.568,-11653.999,10.000,-6.998},
				{-673093.022,-11495.081,10.000,-6.974},
				{-674234.585,-11336.164,10.000,-6.931},
				{-675360.255,-11177.247,10.000,-6.869},
				{-676470.034,-11018.330,10.000,-6.791},
				{-677563.921,-10859.412,10.000,-6.697},
				{-678641.916,-10700.495,10.000,-6.589},
				{-679704.020,-10541.578,10.000,-6.467},
				{-680750.232,-10382.661,10.000,-6.334},
				{-681780.552,-10223.743,10.000,-6.190},
				{-682794.981,-10064.826,10.000,-6.036},
				{-683793.517,-9905.909,10.000,-5.873},
				{-684776.162,-9746.992,10.000,-5.703},
				{-685742.916,-9588.074,10.000,-5.526},
				{-686693.777,-9429.157,10.000,-5.343},
				{-687628.747,-9270.240,10.000,-5.156},
				{-688547.825,-9111.323,10.000,-4.965},
				{-689451.012,-8952.406,10.000,-4.770},
				{-690338.307,-8793.488,10.000,-4.574},
				{-691209.709,-8634.571,10.000,-4.376},
				{-692065.221,-8475.654,10.000,-4.178},
				{-692904.840,-8316.737,10.000,-3.980},
				{-693728.568,-8157.819,10.000,-3.783},
				{-694536.404,-7998.902,10.000,-3.588},
				{-695328.348,-7839.985,10.000,-3.394},
				{-696104.401,-7681.068,10.000,-3.204},
				{-696864.562,-7522.150,10.000,-3.017},
				{-697608.831,-7363.233,10.000,-2.834},
				{-698337.209,-7204.316,10.000,-2.655},
				{-699049.694,-7045.399,10.000,-2.481},
				{-699746.288,-6886.481,10.000,-2.312},
				{-700426.991,-6727.564,10.000,-2.149},
				{-701091.801,-6568.647,10.000,-1.992},
				{-701740.720,-6409.730,10.000,-1.841},
				{-702373.747,-6250.812,10.000,-1.696},
				{-702990.882,-6091.895,10.000,-1.558},
				{-703592.126,-5932.978,10.000,-1.426},
				{-704177.478,-5774.061,10.000,-1.301},
				{-704746.938,-5615.143,10.000,-1.183},
				{-705300.507,-5456.226,10.000,-1.072},
				{-705838.183,-5297.309,10.000,-0.967},
				{-706359.968,-5138.392,10.000,-0.869},
				{-706865.862,-4979.474,10.000,-0.778},
				{-707355.863,-4820.557,10.000,-0.693},
				{-707829.973,-4661.640,10.000,-0.615},
				{-708288.191,-4502.723,10.000,-0.543},
				{-708730.518,-4343.805,10.000,-0.477},
				{-709156.952,-4184.888,10.000,-0.416},
				{-709567.495,-4025.971,10.000,-0.361},
				{-709962.147,-3867.054,10.000,-0.312},
				{-710340.906,-3708.136,10.000,-0.267},
				{-710703.774,-3549.219,10.000,-0.227},
				{-711050.750,-3390.302,10.000,-0.192},
				{-711381.834,-3231.385,10.000,-0.161},
				{-711697.027,-3072.467,10.000,-0.133},
				{-711996.328,-2913.550,10.000,-0.110},
				{-712279.737,-2754.633,10.000,-0.089},
				{-712547.254,-2595.716,10.000,-0.072},
				{-712798.880,-2436.798,10.000,-0.057},
				{-713034.614,-2277.881,10.000,-0.044},
				{-713254.456,-2118.964,10.000,-0.034},
				{-713458.407,-1960.047,10.000,-0.026},
				{-713646.466,-1801.130,10.000,-0.019},
				{-713818.633,-1642.212,10.000,-0.014},
				{-713974.908,-1483.295,10.000,-0.010},
				{-714115.292,-1324.378,10.000,-0.007},
				{-714239.784,-1165.461,10.000,-0.005},
				{-714348.478,-1008.430,10.000,-0.003},
				{-714442.037,-862.751,10.000,-0.002},
				{-714521.596,-728.424,10.000,-0.001},
				{-714588.290,-605.447,10.000,-0.001},
				{-714643.253,-493.822,10.000,-0.000},
				{-714687.622,-393.548,10.000,-0.000},
				{-714722.530,-304.625,10.000,-0.000},
				{-714749.114,-227.054,10.000,-0.000},
				{-714768.508,-160.833,10.000,-0.000},
				{-714781.848,-105.964,10.000,-0.000},
				{-714790.269,-62.446,10.000,-0.000},
				{-714794.905,-30.280,10.000,-0.000},
				{-714796.892,-9.464,10.000,-0.000},
				{-714797.366,-0.000,10.000,-0.000},
				{-714797.366,-0.000,10.000,-0.000}		};

}