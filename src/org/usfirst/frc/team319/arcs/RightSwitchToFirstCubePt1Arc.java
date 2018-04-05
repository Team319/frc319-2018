package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class RightSwitchToFirstCubePt1Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (10.00,9.08,0.00)
	// (5.50,8.08,60.00)
	
    public RightSwitchToFirstCubePt1Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public RightSwitchToFirstCubePt1Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.548,-10.959,10.000,-0.000},
				{-2.740,-32.876,10.000,-0.000},
				{-7.671,-65.752,10.000,-0.000},
				{-16.438,-109.587,10.000,-0.000},
				{-30.136,-164.380,10.000,-0.000},
				{-49.862,-230.132,10.000,-0.000},
				{-76.711,-306.843,10.000,-0.000},
				{-111.778,-394.512,10.000,-0.001},
				{-156.161,-493.140,10.000,-0.001},
				{-210.954,-602.727,10.000,-0.003},
				{-277.254,-723.272,10.000,-0.005},
				{-356.157,-854.777,10.000,-0.007},
				{-448.758,-997.239,10.000,-0.012},
				{-556.153,-1150.661,10.000,-0.018},
				{-678.890,-1304.082,10.000,-0.027},
				{-816.969,-1457.504,10.000,-0.039},
				{-970.391,-1610.925,10.000,-0.054},
				{-1139.154,-1764.346,10.000,-0.074},
				{-1323.260,-1917.768,10.000,-0.100},
				{-1522.708,-2071.189,10.000,-0.131},
				{-1737.498,-2224.611,10.000,-0.170},
				{-1967.630,-2378.032,10.000,-0.216},
				{-2213.104,-2531.454,10.000,-0.272},
				{-2473.921,-2684.875,10.000,-0.337},
				{-2750.079,-2838.297,10.000,-0.413},
				{-3041.580,-2991.718,10.000,-0.500},
				{-3348.423,-3145.139,10.000,-0.600},
				{-3670.608,-3298.561,10.000,-0.714},
				{-4008.135,-3451.982,10.000,-0.842},
				{-4361.004,-3605.404,10.000,-0.986},
				{-4729.216,-3758.825,10.000,-1.145},
				{-5112.769,-3912.247,10.000,-1.321},
				{-5511.665,-4065.668,10.000,-1.514},
				{-5925.903,-4219.089,10.000,-1.726},
				{-6355.483,-4372.511,10.000,-1.955},
				{-6800.405,-4525.932,10.000,-2.204},
				{-7260.669,-4679.354,10.000,-2.471},
				{-7736.276,-4832.775,10.000,-2.757},
				{-8227.224,-4986.197,10.000,-3.062},
				{-8733.515,-5139.618,10.000,-3.386},
				{-9255.148,-5293.039,10.000,-3.729},
				{-9792.123,-5446.461,10.000,-4.089},
				{-10344.440,-5599.882,10.000,-4.466},
				{-10912.100,-5753.304,10.000,-4.860},
				{-11495.101,-5906.725,10.000,-5.269},
				{-12093.445,-6060.147,10.000,-5.693},
				{-12707.130,-6213.568,10.000,-6.129},
				{-13336.158,-6366.990,10.000,-6.577},
				{-13980.528,-6520.411,10.000,-7.035},
				{-14640.240,-6673.832,10.000,-7.500},
				{-15315.295,-6827.254,10.000,-7.973},
				{-16005.691,-6980.675,10.000,-8.449},
				{-16711.430,-7134.097,10.000,-8.928},
				{-17432.510,-7287.518,10.000,-9.407},
				{-18168.933,-7440.940,10.000,-9.883},
				{-18920.698,-7594.361,10.000,-10.355},
				{-19687.806,-7747.782,10.000,-10.820},
				{-20470.255,-7901.204,10.000,-11.275},
				{-21268.046,-8054.625,10.000,-11.719},
				{-22081.180,-8208.047,10.000,-12.148},
				{-22909.656,-8361.468,10.000,-12.561},
				{-23753.474,-8514.890,10.000,-12.954},
				{-24612.634,-8668.311,10.000,-13.325},
				{-25487.136,-8821.732,10.000,-13.671},
				{-26376.980,-8975.154,10.000,-13.990},
				{-27282.167,-9128.575,10.000,-14.279},
				{-28202.695,-9281.997,10.000,-14.536},
				{-29138.566,-9435.418,10.000,-14.757},
				{-30089.779,-9588.840,10.000,-14.939},
				{-31056.334,-9742.261,10.000,-15.080},
				{-32038.231,-9895.683,10.000,-15.176},
				{-33035.470,-10049.104,10.000,-15.224},
				{-34048.052,-10202.525,10.000,-15.221},
				{-35075.975,-10355.947,10.000,-15.162},
				{-36119.241,-10509.368,10.000,-15.043},
				{-37177.301,-10651.831,10.000,-14.860},
				{-38249.059,-10783.335,10.000,-14.608},
				{-39333.420,-10903.881,10.000,-14.283},
				{-40429.288,-11013.467,10.000,-13.879},
				{-41535.566,-11112.095,10.000,-13.391},
				{-42651.159,-11199.765,10.000,-12.814},
				{-43774.971,-11276.475,10.000,-12.143},
				{-44905.906,-11342.227,10.000,-11.371},
				{-46042.868,-11397.021,10.000,-10.492},
				{-47184.762,-11440.856,10.000,-9.501},
				{-48330.491,-11473.732,10.000,-8.391},
				{-49478.961,-11495.649,10.000,-7.158},
				{-50628.839,-11501.914,10.000,-5.795},
				{-51778.247,-11486.262,10.000,-4.301},
				{-52925.543,-11459.651,10.000,-2.674},
				{-54069.630,-11422.081,10.000,-0.913},
				{-55209.411,-11373.553,10.000,0.979},
				{-56343.792,-11314.066,10.000,2.997},
				{-57471.677,-11243.621,10.000,5.132},
				{-58591.969,-11162.216,10.000,7.373},
				{-59703.572,-11069.853,10.000,9.703},
				{-60805.391,-10966.532,10.000,12.103},
				{-61896.330,-10852.251,10.000,14.551},
				{-62975.294,-10727.012,10.000,17.022},
				{-64041.185,-10590.815,10.000,19.492},
				{-65092.909,-10443.658,10.000,21.935},
				{-66129.603,-10290.237,10.000,24.329},
				{-67150.956,-10136.816,10.000,26.656},
				{-68156.966,-9983.394,10.000,28.901},
				{-69147.635,-9829.973,10.000,31.052},
				{-70122.961,-9676.551,10.000,33.101},
				{-71082.945,-9523.130,10.000,35.043},
				{-72027.587,-9369.708,10.000,36.876},
				{-72956.887,-9216.287,10.000,38.599},
				{-73870.844,-9062.866,10.000,40.215},
				{-74769.460,-8909.444,10.000,41.726},
				{-75652.733,-8756.023,10.000,43.136},
				{-76520.664,-8602.601,10.000,44.450},
				{-77373.253,-8449.180,10.000,45.672},
				{-78210.500,-8295.758,10.000,46.809},
				{-79032.405,-8142.337,10.000,47.865},
				{-79838.968,-7988.915,10.000,48.846},
				{-80630.188,-7835.494,10.000,49.756},
				{-81406.067,-7682.073,10.000,50.600},
				{-82166.603,-7528.651,10.000,51.383},
				{-82911.797,-7375.230,10.000,52.109},
				{-83641.649,-7221.808,10.000,52.782},
				{-84356.158,-7068.387,10.000,53.405},
				{-85055.326,-6914.965,10.000,53.982},
				{-85739.152,-6761.544,10.000,54.516},
				{-86407.635,-6608.123,10.000,55.010},
				{-87060.776,-6454.701,10.000,55.466},
				{-87698.575,-6301.280,10.000,55.888},
				{-88321.032,-6147.858,10.000,56.278},
				{-88928.147,-5994.437,10.000,56.637},
				{-89519.919,-5841.015,10.000,56.968},
				{-90096.350,-5687.594,10.000,57.273},
				{-90657.438,-5534.173,10.000,57.553},
				{-91203.184,-5380.751,10.000,57.810},
				{-91733.588,-5227.330,10.000,58.046},
				{-92248.650,-5073.908,10.000,58.261},
				{-92748.370,-4920.487,10.000,58.458},
				{-93232.748,-4767.065,10.000,58.637},
				{-93701.783,-4613.644,10.000,58.800},
				{-94155.476,-4460.222,10.000,58.947},
				{-94593.828,-4306.801,10.000,59.080},
				{-95016.837,-4153.380,10.000,59.201},
				{-95424.504,-3999.958,10.000,59.309},
				{-95816.828,-3846.537,10.000,59.405},
				{-96193.811,-3693.115,10.000,59.491},
				{-96555.451,-3539.694,10.000,59.567},
				{-96901.750,-3386.272,10.000,59.635},
				{-97232.706,-3232.851,10.000,59.694},
				{-97548.320,-3079.430,10.000,59.746},
				{-97848.592,-2926.008,10.000,59.790},
				{-98133.521,-2772.587,10.000,59.829},
				{-98403.109,-2619.165,10.000,59.862},
				{-98657.355,-2465.744,10.000,59.890},
				{-98896.258,-2312.322,10.000,59.913},
				{-99119.819,-2158.901,10.000,59.932},
				{-99328.038,-2005.480,10.000,59.948},
				{-99520.915,-1852.058,10.000,59.961},
				{-99698.450,-1698.637,10.000,59.971},
				{-99860.642,-1545.215,10.000,59.979},
				{-100007.493,-1391.794,10.000,59.986},
				{-100139.001,-1238.372,10.000,59.990},
				{-100255.167,-1084.951,10.000,59.993},
				{-100356.226,-936.223,10.000,59.996},
				{-100442.960,-798.454,10.000,59.997},
				{-100516.465,-671.643,10.000,59.998},
				{-100577.836,-555.791,10.000,59.999},
				{-100628.171,-450.898,10.000,60.000},
				{-100668.564,-356.964,10.000,60.000},
				{-100700.112,-273.988,10.000,60.000},
				{-100723.909,-201.971,10.000,60.000},
				{-100741.054,-140.912,10.000,60.000},
				{-100752.640,-90.813,10.000,60.000},
				{-100759.764,-51.671,10.000,60.000},
				{-100763.522,-23.489,10.000,60.000},
				{-100765.010,-6.265,10.000,60.000},
				{-100765.323,-0.000,10.000,60.000},
				{-100765.323,-0.000,10.000,60.000}		};

}