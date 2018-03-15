package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SwitchCubeToScaleRightSideArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (18.13,8.29,0.00)
	// (24.13,6.79,0.00)
	
    public SwitchCubeToScaleRightSideArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public SwitchCubeToScaleRightSideArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.445,-8.895,10.000,0.000},
				{-2.224,-26.684,10.000,-0.000},
				{-6.226,-53.367,10.000,-0.000},
				{-13.342,-88.945,10.000,-0.000},
				{-24.460,-133.418,10.000,-0.000},
				{-40.470,-186.785,10.000,-0.000},
				{-62.262,-249.046,10.000,-0.000},
				{-90.724,-320.202,10.000,-0.000},
				{-126.747,-400.253,10.000,-0.001},
				{-171.219,-489.198,10.000,-0.001},
				{-225.031,-587.037,10.000,-0.002},
				{-289.071,-693.771,10.000,-0.004},
				{-364.230,-809.400,10.000,-0.006},
				{-451.396,-933.923,10.000,-0.009},
				{-551.459,-1067.341,10.000,-0.014},
				{-665.309,-1209.653,10.000,-0.020},
				{-793.835,-1360.859,10.000,-0.028},
				{-937.926,-1520.960,10.000,-0.039},
				{-1098.471,-1689.956,10.000,-0.053},
				{-1276.361,-1867.846,10.000,-0.072},
				{-1472.041,-2045.736,10.000,-0.095},
				{-1685.509,-2223.626,10.000,-0.124},
				{-1916.766,-2401.516,10.000,-0.160},
				{-2165.812,-2579.406,10.000,-0.203},
				{-2432.647,-2757.297,10.000,-0.255},
				{-2717.271,-2935.187,10.000,-0.316},
				{-3019.684,-3113.077,10.000,-0.388},
				{-3339.887,-3290.967,10.000,-0.472},
				{-3677.878,-3468.857,10.000,-0.568},
				{-4033.658,-3646.747,10.000,-0.679},
				{-4407.227,-3824.637,10.000,-0.804},
				{-4798.586,-4002.527,10.000,-0.946},
				{-5207.733,-4180.417,10.000,-1.105},
				{-5634.669,-4358.308,10.000,-1.283},
				{-6079.394,-4536.198,10.000,-1.480},
				{-6541.909,-4714.088,10.000,-1.699},
				{-7022.212,-4891.978,10.000,-1.939},
				{-7520.304,-5069.868,10.000,-2.202},
				{-8036.185,-5247.758,10.000,-2.489},
				{-8569.856,-5425.648,10.000,-2.801},
				{-9121.315,-5603.538,10.000,-3.139},
				{-9690.563,-5781.428,10.000,-3.504},
				{-10277.601,-5959.318,10.000,-3.895},
				{-10882.427,-6137.209,10.000,-4.315},
				{-11505.042,-6315.099,10.000,-4.763},
				{-12145.447,-6492.989,10.000,-5.239},
				{-12803.640,-6670.879,10.000,-5.744},
				{-13479.623,-6848.769,10.000,-6.277},
				{-14173.394,-7026.659,10.000,-6.839},
				{-14884.954,-7204.549,10.000,-7.429},
				{-15613.859,-7373.545,10.000,-8.046},
				{-16359.219,-7533.646,10.000,-8.688},
				{-17120.143,-7684.852,10.000,-9.354},
				{-17895.744,-7827.165,10.000,-10.040},
				{-18685.132,-7960.582,10.000,-10.745},
				{-19487.416,-8085.105,10.000,-11.465},
				{-20301.708,-8200.734,10.000,-12.197},
				{-21127.118,-8307.468,10.000,-12.939},
				{-21962.757,-8405.307,10.000,-13.688},
				{-22807.735,-8494.252,10.000,-14.438},
				{-23661.163,-8574.303,10.000,-15.188},
				{-24522.151,-8645.459,10.000,-15.933},
				{-25389.810,-8707.721,10.000,-16.671},
				{-26263.250,-8761.088,10.000,-17.397},
				{-27141.582,-8805.560,10.000,-18.109},
				{-28023.917,-8841.138,10.000,-18.803},
				{-28909.365,-8867.822,10.000,-19.477},
				{-29797.037,-8885.611,10.000,-20.127},
				{-30686.043,-8894.505,10.000,-20.752},
				{-31575.493,-8894.505,10.000,-21.349},
				{-32464.944,-8894.505,10.000,-21.917},
				{-33354.394,-8894.505,10.000,-22.453},
				{-34243.845,-8894.505,10.000,-22.959},
				{-35133.295,-8894.505,10.000,-23.431},
				{-36022.746,-8894.505,10.000,-23.870},
				{-36912.196,-8894.505,10.000,-24.276},
				{-37801.647,-8894.505,10.000,-24.646},
				{-38691.097,-8894.505,10.000,-24.982},
				{-39580.548,-8894.505,10.000,-25.282},
				{-40469.998,-8894.505,10.000,-25.546},
				{-41359.449,-8894.505,10.000,-25.774},
				{-42248.899,-8894.505,10.000,-25.965},
				{-43138.350,-8894.505,10.000,-26.120},
				{-44027.800,-8894.505,10.000,-26.239},
				{-44917.251,-8894.505,10.000,-26.321},
				{-45806.701,-8894.505,10.000,-26.366},
				{-46696.152,-8894.505,10.000,-26.374},
				{-47585.602,-8894.505,10.000,-26.345},
				{-48475.053,-8894.505,10.000,-26.280},
				{-49364.504,-8894.505,10.000,-26.178},
				{-50253.954,-8894.505,10.000,-26.039},
				{-51143.405,-8894.505,10.000,-25.863},
				{-52032.855,-8894.505,10.000,-25.651},
				{-52922.306,-8894.505,10.000,-25.403},
				{-53811.756,-8894.505,10.000,-25.119},
				{-54701.207,-8894.505,10.000,-24.800},
				{-55590.657,-8894.505,10.000,-24.445},
				{-56480.108,-8894.505,10.000,-24.055},
				{-57369.558,-8894.505,10.000,-23.631},
				{-58259.009,-8894.505,10.000,-23.173},
				{-59148.459,-8894.505,10.000,-22.682},
				{-60037.910,-8894.505,10.000,-22.159},
				{-60927.360,-8894.505,10.000,-21.605},
				{-61816.811,-8894.505,10.000,-21.021},
				{-62706.014,-8889.562,10.000,-20.408},
				{-63594.278,-8875.724,10.000,-19.769},
				{-64480.714,-8852.992,10.000,-19.105},
				{-65364.432,-8821.365,10.000,-18.420},
				{-66244.543,-8780.844,10.000,-17.716},
				{-67120.156,-8731.428,10.000,-16.996},
				{-67990.384,-8673.118,10.000,-16.263},
				{-68854.335,-8605.914,10.000,-15.521},
				{-69711.122,-8529.814,10.000,-14.773},
				{-70559.853,-8444.821,10.000,-14.022},
				{-71399.641,-8350.932,10.000,-13.272},
				{-72229.595,-8248.150,10.000,-12.527},
				{-73048.826,-8136.472,10.000,-11.790},
				{-73856.445,-8015.901,10.000,-11.064},
				{-74651.562,-7886.434,10.000,-10.352},
				{-75433.287,-7748.074,10.000,-9.658},
				{-76200.732,-7600.818,10.000,-8.983},
				{-76953.006,-7444.669,10.000,-8.330},
				{-77689.220,-7279.624,10.000,-7.702},
				{-78408.486,-7105.686,10.000,-7.100},
				{-79110.160,-6927.795,10.000,-6.525},
				{-79794.045,-6749.905,10.000,-5.979},
				{-80460.141,-6572.015,10.000,-5.461},
				{-81108.448,-6394.125,10.000,-4.972},
				{-81738.966,-6216.235,10.000,-4.512},
				{-82351.695,-6038.345,10.000,-4.080},
				{-82946.635,-5860.455,10.000,-3.676},
				{-83523.786,-5682.565,10.000,-3.299},
				{-84083.148,-5504.675,10.000,-2.950},
				{-84624.721,-5326.785,10.000,-2.626},
				{-85148.505,-5148.894,10.000,-2.328},
				{-85654.500,-4971.004,10.000,-2.054},
				{-86142.706,-4793.114,10.000,-1.804},
				{-86613.123,-4615.224,10.000,-1.576},
				{-87065.751,-4437.334,10.000,-1.369},
				{-87500.590,-4259.444,10.000,-1.183},
				{-87917.639,-4081.554,10.000,-1.015},
				{-88316.900,-3903.664,10.000,-0.866},
				{-88698.372,-3725.774,10.000,-0.733},
				{-89062.055,-3547.883,10.000,-0.616},
				{-89407.949,-3369.993,10.000,-0.513},
				{-89736.054,-3192.103,10.000,-0.424},
				{-90046.370,-3014.213,10.000,-0.347},
				{-90338.896,-2836.323,10.000,-0.281},
				{-90613.634,-2658.433,10.000,-0.225},
				{-90870.583,-2480.543,10.000,-0.178},
				{-91109.743,-2302.653,10.000,-0.140},
				{-91331.113,-2124.763,10.000,-0.108},
				{-91534.695,-1946.873,10.000,-0.082},
				{-91720.488,-1768.982,10.000,-0.061},
				{-91888.739,-1596.036,10.000,-0.045},
				{-92040.140,-1431.983,10.000,-0.033},
				{-92175.580,-1276.825,10.000,-0.023},
				{-92295.950,-1130.562,10.000,-0.016},
				{-92402.137,-993.193,10.000,-0.011},
				{-92495.033,-864.719,10.000,-0.007},
				{-92575.526,-745.139,10.000,-0.005},
				{-92644.505,-634.453,10.000,-0.003},
				{-92702.861,-532.662,10.000,-0.002},
				{-92751.483,-439.766,10.000,-0.001},
				{-92791.259,-355.764,10.000,-0.001},
				{-92823.080,-280.657,10.000,-0.000},
				{-92847.835,-214.444,10.000,-0.000},
				{-92866.414,-157.126,10.000,-0.000},
				{-92879.705,-108.702,10.000,-0.000},
				{-92888.599,-69.172,10.000,-0.000},
				{-92893.984,-38.537,10.000,-0.000},
				{-92896.751,-16.797,10.000,-0.000},
				{-92897.788,-3.951,10.000,0.000},
				{-92897.986,-0.000,10.000,-360.000},
				{-92897.986,-0.000,10.000,-360.000}		};

}