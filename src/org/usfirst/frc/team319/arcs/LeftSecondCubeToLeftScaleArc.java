package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class LeftSecondCubeToLeftScaleArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (9.00,13.53,-89.99)
	// (9.00,19.53,-89.99)
	
    public LeftSecondCubeToLeftScaleArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public LeftSecondCubeToLeftScaleArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.424,-8.482,10.000,90.010},
				{-2.121,-25.447,10.000,90.010},
				{-5.938,-50.894,10.000,90.010},
				{-12.724,-84.824,10.000,90.010},
				{-23.326,-127.235,10.000,90.010},
				{-38.595,-178.129,10.000,90.010},
				{-59.376,-237.506,10.000,90.010},
				{-86.520,-305.365,10.000,90.010},
				{-120.874,-381.706,10.000,90.010},
				{-163.285,-466.529,10.000,90.010},
				{-214.604,-559.835,10.000,90.010},
				{-275.677,-661.624,10.000,90.010},
				{-347.352,-771.894,10.000,90.010},
				{-430.479,-890.647,10.000,90.010},
				{-525.482,-1009.400,10.000,90.010},
				{-632.360,-1128.153,10.000,90.010},
				{-751.112,-1246.906,10.000,90.010},
				{-881.741,-1365.659,10.000,90.010},
				{-1024.244,-1484.412,10.000,90.010},
				{-1178.623,-1603.165,10.000,90.010},
				{-1344.877,-1721.918,10.000,90.010},
				{-1523.007,-1840.671,10.000,90.010},
				{-1713.011,-1959.424,10.000,90.010},
				{-1914.891,-2078.177,10.000,90.010},
				{-2128.647,-2196.930,10.000,90.010},
				{-2354.277,-2315.683,10.000,90.010},
				{-2591.783,-2434.436,10.000,90.010},
				{-2841.165,-2553.189,10.000,90.010},
				{-3102.421,-2671.942,10.000,90.010},
				{-3375.553,-2790.695,10.000,90.010},
				{-3660.560,-2909.448,10.000,90.010},
				{-3957.442,-3028.200,10.000,90.009},
				{-4266.200,-3146.953,10.000,90.009},
				{-4586.833,-3265.706,10.000,90.009},
				{-4919.341,-3384.459,10.000,90.009},
				{-5263.725,-3503.212,10.000,90.009},
				{-5619.984,-3621.965,10.000,90.009},
				{-5988.118,-3740.718,10.000,90.009},
				{-6368.127,-3859.471,10.000,90.009},
				{-6760.012,-3978.224,10.000,90.009},
				{-7163.772,-4096.977,10.000,90.008},
				{-7579.408,-4215.730,10.000,90.008},
				{-8006.918,-4334.483,10.000,90.008},
				{-8446.304,-4453.236,10.000,90.008},
				{-8897.566,-4571.989,10.000,90.008},
				{-9360.702,-4690.742,10.000,90.007},
				{-9835.714,-4809.495,10.000,90.007},
				{-10322.601,-4928.248,10.000,90.007},
				{-10821.363,-5047.001,10.000,90.007},
				{-11332.001,-5165.754,10.000,90.006},
				{-11854.514,-5284.507,10.000,90.006},
				{-12388.903,-5403.260,10.000,90.006},
				{-12935.166,-5522.013,10.000,90.005},
				{-13493.305,-5640.766,10.000,90.005},
				{-14063.319,-5759.519,10.000,90.005},
				{-14645.209,-5878.272,10.000,90.004},
				{-15238.974,-5997.024,10.000,90.004},
				{-15844.614,-6115.777,10.000,90.004},
				{-16462.129,-6234.530,10.000,90.003},
				{-17091.520,-6353.283,10.000,90.003},
				{-17732.786,-6472.036,10.000,90.002},
				{-18385.927,-6590.789,10.000,90.002},
				{-19050.944,-6709.542,10.000,90.002},
				{-19727.835,-6828.295,10.000,90.001},
				{-20416.603,-6947.048,10.000,90.001},
				{-21117.245,-7065.801,10.000,90.000},
				{-21829.763,-7184.554,10.000,90.000},
				{-22554.156,-7303.307,10.000,89.999},
				{-23290.424,-7422.060,10.000,89.999},
				{-24038.568,-7540.813,10.000,89.998},
				{-24798.587,-7659.566,10.000,89.998},
				{-25570.481,-7778.319,10.000,89.998},
				{-26354.251,-7897.072,10.000,89.997},
				{-27149.895,-8015.825,10.000,89.997},
				{-27957.416,-8134.578,10.000,89.996},
				{-28776.811,-8253.331,10.000,89.996},
				{-29608.082,-8372.084,10.000,89.995},
				{-30451.228,-8490.837,10.000,89.995},
				{-31306.249,-8609.590,10.000,89.995},
				{-32173.146,-8728.343,10.000,89.994},
				{-33051.918,-8847.096,10.000,89.994},
				{-33942.141,-8957.366,10.000,89.993},
				{-34842.967,-9059.154,10.000,89.993},
				{-35753.547,-9152.460,10.000,89.993},
				{-36673.035,-9237.284,10.000,89.993},
				{-37600.580,-9313.625,10.000,89.992},
				{-38535.336,-9381.484,10.000,89.992},
				{-39476.453,-9440.860,10.000,89.992},
				{-40423.083,-9491.754,10.000,89.992},
				{-41374.380,-9534.166,10.000,89.991},
				{-42329.493,-9568.096,10.000,89.991},
				{-43287.575,-9593.543,10.000,89.991},
				{-44247.777,-9610.507,10.000,89.991},
				{-45209.051,-9614.964,10.000,89.991},
				{-46169.922,-9602.456,10.000,89.991},
				{-47129.118,-9581.466,10.000,89.991},
				{-48085.791,-9551.994,10.000,89.991},
				{-49039.092,-9514.039,10.000,89.992},
				{-49988.174,-9467.602,10.000,89.992},
				{-50932.189,-9412.682,10.000,89.992},
				{-51870.287,-9349.280,10.000,89.992},
				{-52801.620,-9277.396,10.000,89.992},
				{-53725.342,-9197.029,10.000,89.993},
				{-54640.602,-9108.180,10.000,89.993},
				{-55546.554,-9010.849,10.000,89.993},
				{-56442.348,-8905.035,10.000,89.994},
				{-57327.136,-8790.739,10.000,89.994},
				{-58200.273,-8671.986,10.000,89.994},
				{-59061.534,-8553.233,10.000,89.995},
				{-59910.919,-8434.480,10.000,89.995},
				{-60748.430,-8315.727,10.000,89.996},
				{-61574.065,-8196.974,10.000,89.996},
				{-62387.824,-8078.221,10.000,89.996},
				{-63189.709,-7959.468,10.000,89.997},
				{-63979.718,-7840.715,10.000,89.997},
				{-64757.852,-7721.962,10.000,89.998},
				{-65524.110,-7603.209,10.000,89.998},
				{-66278.494,-7484.456,10.000,89.999},
				{-67021.002,-7365.703,10.000,89.999},
				{-67751.634,-7246.950,10.000,90.000},
				{-68470.392,-7128.197,10.000,90.000},
				{-69177.274,-7009.444,10.000,90.001},
				{-69872.281,-6890.691,10.000,90.001},
				{-70555.412,-6771.938,10.000,90.001},
				{-71226.668,-6653.185,10.000,90.002},
				{-71886.049,-6534.433,10.000,90.002},
				{-72533.555,-6415.680,10.000,90.003},
				{-73169.185,-6296.927,10.000,90.003},
				{-73792.940,-6178.174,10.000,90.003},
				{-74404.820,-6059.421,10.000,90.004},
				{-75004.824,-5940.668,10.000,90.004},
				{-75592.953,-5821.915,10.000,90.005},
				{-76169.207,-5703.162,10.000,90.005},
				{-76733.586,-5584.409,10.000,90.005},
				{-77286.089,-5465.656,10.000,90.006},
				{-77826.717,-5346.903,10.000,90.006},
				{-78355.469,-5228.150,10.000,90.006},
				{-78872.347,-5109.397,10.000,90.006},
				{-79377.349,-4990.644,10.000,90.007},
				{-79870.476,-4871.891,10.000,90.007},
				{-80351.727,-4753.138,10.000,90.007},
				{-80821.103,-4634.385,10.000,90.008},
				{-81278.604,-4515.632,10.000,90.008},
				{-81724.230,-4396.879,10.000,90.008},
				{-82157.980,-4278.126,10.000,90.008},
				{-82579.855,-4159.373,10.000,90.008},
				{-82989.855,-4040.620,10.000,90.008},
				{-83387.979,-3921.867,10.000,90.009},
				{-83774.228,-3803.114,10.000,90.009},
				{-84148.602,-3684.361,10.000,90.009},
				{-84511.100,-3565.609,10.000,90.009},
				{-84861.724,-3446.856,10.000,90.009},
				{-85200.471,-3328.103,10.000,90.009},
				{-85527.344,-3209.350,10.000,90.009},
				{-85842.341,-3090.597,10.000,90.009},
				{-86145.463,-2971.844,10.000,90.010},
				{-86436.710,-2853.091,10.000,90.010},
				{-86716.082,-2734.338,10.000,90.010},
				{-86983.578,-2615.585,10.000,90.010},
				{-87239.199,-2496.832,10.000,90.010},
				{-87482.944,-2378.079,10.000,90.010},
				{-87714.814,-2259.326,10.000,90.010},
				{-87934.809,-2140.573,10.000,90.010},
				{-88142.929,-2021.820,10.000,90.010},
				{-88339.173,-1903.067,10.000,90.010},
				{-88523.542,-1784.314,10.000,90.010},
				{-88696.036,-1665.561,10.000,90.010},
				{-88856.655,-1546.808,10.000,90.010},
				{-89005.398,-1428.055,10.000,90.010},
				{-89142.266,-1309.302,10.000,90.010},
				{-89267.258,-1190.549,10.000,90.010},
				{-89380.375,-1071.796,10.000,90.010},
				{-89481.617,-953.043,10.000,90.010},
				{-89570.984,-834.290,10.000,90.010},
				{-89648.677,-719.563,10.000,90.010},
				{-89715.321,-613.318,10.000,90.010},
				{-89771.764,-515.555,10.000,90.010},
				{-89818.856,-426.275,10.000,90.010},
				{-89857.444,-345.477,10.000,90.010},
				{-89888.375,-273.161,10.000,90.010},
				{-89912.500,-209.328,10.000,90.010},
				{-89930.665,-153.977,10.000,90.010},
				{-89943.719,-107.108,10.000,90.010},
				{-89952.511,-68.722,10.000,90.010},
				{-89957.888,-38.818,10.000,90.010},
				{-89960.698,-17.396,10.000,90.010},
				{-89961.791,-4.457,10.000,90.010},
				{-89962.014,-0.000,10.000,90.010},
				{-89962.014,-0.000,10.000,90.010}		};

}