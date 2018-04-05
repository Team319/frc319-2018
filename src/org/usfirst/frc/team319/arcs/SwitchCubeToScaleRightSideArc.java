package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SwitchCubeToScaleRightSideArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (19.13,7.29,0.00)
	// (25.13,5.79,0.00)
	
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
				{-0.547,-10.950,10.000,-0.000},
				{-2.737,-32.849,10.000,-0.000},
				{-7.665,-65.698,10.000,-0.000},
				{-16.425,-109.497,10.000,-0.000},
				{-30.112,-164.246,10.000,-0.000},
				{-49.821,-229.944,10.000,-0.000},
				{-76.648,-306.593,10.000,-0.000},
				{-111.687,-394.190,10.000,-0.000},
				{-156.034,-492.738,10.000,-0.001},
				{-210.782,-602.235,10.000,-0.001},
				{-277.028,-722.682,10.000,-0.002},
				{-355.866,-854.079,10.000,-0.003},
				{-448.392,-996.426,10.000,-0.005},
				{-555.699,-1149.722,10.000,-0.008},
				{-678.336,-1303.018,10.000,-0.012},
				{-816.303,-1456.314,10.000,-0.017},
				{-969.599,-1609.611,10.000,-0.025},
				{-1138.225,-1762.907,10.000,-0.034},
				{-1322.180,-1916.203,10.000,-0.045},
				{-1521.465,-2069.499,10.000,-0.060},
				{-1736.080,-2222.796,10.000,-0.078},
				{-1966.024,-2376.092,10.000,-0.099},
				{-2211.298,-2529.388,10.000,-0.125},
				{-2471.902,-2682.684,10.000,-0.156},
				{-2747.835,-2835.981,10.000,-0.192},
				{-3039.098,-2989.277,10.000,-0.233},
				{-3345.691,-3142.573,10.000,-0.281},
				{-3667.613,-3295.869,10.000,-0.337},
				{-4004.865,-3449.166,10.000,-0.399},
				{-4357.446,-3602.462,10.000,-0.470},
				{-4725.357,-3755.758,10.000,-0.550},
				{-5108.598,-3909.054,10.000,-0.639},
				{-5507.168,-4062.351,10.000,-0.738},
				{-5921.068,-4215.647,10.000,-0.848},
				{-6350.297,-4368.943,10.000,-0.969},
				{-6794.856,-4522.239,10.000,-1.102},
				{-7254.745,-4675.536,10.000,-1.247},
				{-7729.963,-4828.832,10.000,-1.406},
				{-8220.512,-4982.128,10.000,-1.578},
				{-8726.389,-5135.424,10.000,-1.765},
				{-9247.596,-5288.721,10.000,-1.967},
				{-9784.133,-5442.017,10.000,-2.184},
				{-10336.000,-5595.313,10.000,-2.417},
				{-10903.196,-5748.609,10.000,-2.667},
				{-11485.722,-5901.906,10.000,-2.933},
				{-12083.577,-6055.202,10.000,-3.218},
				{-12696.762,-6208.498,10.000,-3.520},
				{-13325.277,-6361.794,10.000,-3.840},
				{-13969.121,-6515.091,10.000,-4.179},
				{-14628.295,-6668.387,10.000,-4.536},
				{-15302.798,-6821.683,10.000,-4.912},
				{-15992.631,-6974.979,10.000,-5.308},
				{-16697.794,-7128.276,10.000,-5.722},
				{-17418.287,-7281.572,10.000,-6.156},
				{-18154.109,-7434.868,10.000,-6.608},
				{-18905.260,-7588.164,10.000,-7.080},
				{-19671.742,-7741.461,10.000,-7.569},
				{-20453.552,-7894.757,10.000,-8.077},
				{-21250.693,-8048.053,10.000,-8.602},
				{-22063.163,-8201.349,10.000,-9.144},
				{-22890.963,-8354.646,10.000,-9.702},
				{-23734.092,-8507.942,10.000,-10.275},
				{-24592.551,-8661.238,10.000,-10.863},
				{-25466.340,-8814.534,10.000,-11.463},
				{-26355.458,-8967.831,10.000,-12.075},
				{-27259.906,-9121.127,10.000,-12.697},
				{-28179.683,-9274.423,10.000,-13.329},
				{-29114.791,-9427.719,10.000,-13.967},
				{-30065.227,-9581.016,10.000,-14.612},
				{-31030.994,-9734.312,10.000,-15.259},
				{-32012.090,-9887.608,10.000,-15.909},
				{-33008.515,-10040.904,10.000,-16.558},
				{-34020.271,-10194.201,10.000,-17.205},
				{-35047.356,-10347.497,10.000,-17.848},
				{-36089.770,-10500.793,10.000,-18.483},
				{-37147.514,-10654.089,10.000,-19.110},
				{-38220.588,-10807.386,10.000,-19.725},
				{-39308.991,-10960.682,10.000,-20.327},
				{-40412.724,-11113.978,10.000,-20.913},
				{-41531.787,-11267.275,10.000,-21.481},
				{-42666.179,-11420.571,10.000,-22.028},
				{-43815.901,-11573.867,10.000,-22.553},
				{-44980.953,-11727.163,10.000,-23.053},
				{-46160.786,-11869.510,10.000,-23.526},
				{-47354.307,-12000.907,10.000,-23.969},
				{-48560.420,-12121.354,10.000,-24.380},
				{-49778.030,-12230.851,10.000,-24.758},
				{-51006.043,-12329.399,10.000,-25.099},
				{-52243.363,-12416.996,10.000,-25.403},
				{-53488.895,-12493.645,10.000,-25.667},
				{-54741.544,-12559.343,10.000,-25.891},
				{-56000.216,-12614.092,10.000,-26.074},
				{-57263.815,-12657.891,10.000,-26.214},
				{-58531.246,-12690.740,10.000,-26.311},
				{-59801.415,-12712.639,10.000,-26.364},
				{-61072.911,-12717.276,10.000,-26.374},
				{-62343.775,-12700.013,10.000,-26.339},
				{-63612.366,-12671.800,10.000,-26.260},
				{-64877.588,-12632.637,10.000,-26.138},
				{-66138.346,-12582.525,10.000,-25.974},
				{-67393.545,-12521.463,10.000,-25.767},
				{-68642.091,-12449.451,10.000,-25.520},
				{-69882.888,-12366.490,10.000,-25.233},
				{-71114.842,-12272.579,10.000,-24.907},
				{-72336.856,-12167.718,10.000,-24.545},
				{-73547.838,-12051.907,10.000,-24.148},
				{-74746.690,-11925.147,10.000,-23.718},
				{-75932.320,-11787.437,10.000,-23.258},
				{-77103.630,-11638.777,10.000,-22.769},
				{-78259.843,-11485.481,10.000,-22.254},
				{-79400.726,-11332.184,10.000,-21.716},
				{-80526.280,-11178.888,10.000,-21.157},
				{-81636.504,-11025.592,10.000,-20.578},
				{-82731.398,-10872.296,10.000,-19.983},
				{-83810.963,-10718.999,10.000,-19.373},
				{-84875.198,-10565.703,10.000,-18.751},
				{-85924.104,-10412.407,10.000,-18.119},
				{-86957.680,-10259.111,10.000,-17.479},
				{-87975.926,-10105.814,10.000,-16.834},
				{-88978.843,-9952.518,10.000,-16.185},
				{-89966.430,-9799.222,10.000,-15.536},
				{-90938.687,-9645.926,10.000,-14.887},
				{-91895.615,-9492.629,10.000,-14.241},
				{-92837.213,-9339.333,10.000,-13.600},
				{-93763.481,-9186.037,10.000,-12.965},
				{-94674.420,-9032.741,10.000,-12.339},
				{-95570.030,-8879.444,10.000,-11.722},
				{-96450.309,-8726.148,10.000,-11.116},
				{-97315.259,-8572.852,10.000,-10.523},
				{-98164.880,-8419.556,10.000,-9.944},
				{-98999.170,-8266.259,10.000,-9.380},
				{-99818.131,-8112.963,10.000,-8.831},
				{-100621.763,-7959.667,10.000,-8.298},
				{-101410.065,-7806.371,10.000,-7.783},
				{-102183.037,-7653.074,10.000,-7.286},
				{-102940.680,-7499.778,10.000,-6.807},
				{-103682.993,-7346.482,10.000,-6.346},
				{-104409.976,-7193.186,10.000,-5.905},
				{-105121.630,-7039.889,10.000,-5.482},
				{-105817.954,-6886.593,10.000,-5.079},
				{-106498.948,-6733.297,10.000,-4.694},
				{-107164.613,-6580.001,10.000,-4.329},
				{-107814.949,-6426.704,10.000,-3.982},
				{-108449.954,-6273.408,10.000,-3.654},
				{-109069.630,-6120.112,10.000,-3.344},
				{-109673.977,-5966.816,10.000,-3.052},
				{-110262.993,-5813.519,10.000,-2.778},
				{-110836.680,-5660.223,10.000,-2.521},
				{-111395.038,-5506.927,10.000,-2.281},
				{-111938.066,-5353.631,10.000,-2.057},
				{-112465.764,-5200.334,10.000,-1.849},
				{-112978.133,-5047.038,10.000,-1.656},
				{-113475.172,-4893.742,10.000,-1.478},
				{-113956.881,-4740.446,10.000,-1.313},
				{-114423.261,-4587.149,10.000,-1.162},
				{-114874.311,-4433.853,10.000,-1.024},
				{-115310.031,-4280.557,10.000,-0.898},
				{-115730.422,-4127.261,10.000,-0.783},
				{-116135.484,-3973.964,10.000,-0.680},
				{-116525.215,-3820.668,10.000,-0.587},
				{-116899.617,-3667.372,10.000,-0.503},
				{-117258.690,-3514.076,10.000,-0.429},
				{-117602.432,-3360.779,10.000,-0.362},
				{-117930.845,-3207.483,10.000,-0.304},
				{-118243.929,-3054.187,10.000,-0.253},
				{-118541.683,-2900.891,10.000,-0.209},
				{-118824.107,-2747.594,10.000,-0.171},
				{-119091.202,-2594.298,10.000,-0.138},
				{-119342.967,-2441.002,10.000,-0.110},
				{-119579.402,-2287.706,10.000,-0.087},
				{-119800.508,-2134.409,10.000,-0.067},
				{-120006.284,-1981.113,10.000,-0.051},
				{-120196.730,-1827.817,10.000,-0.038},
				{-120371.847,-1674.521,10.000,-0.028},
				{-120531.635,-1521.224,10.000,-0.020},
				{-120676.092,-1367.928,10.000,-0.014},
				{-120805.220,-1214.632,10.000,-0.010},
				{-120919.018,-1061.336,10.000,-0.006},
				{-121017.803,-914.353,10.000,-0.004},
				{-121102.437,-778.319,10.000,-0.003},
				{-121174.014,-653.236,10.000,-0.002},
				{-121233.631,-539.102,10.000,-0.001},
				{-121282.382,-435.918,10.000,-0.000},
				{-121321.362,-343.684,10.000,-0.000},
				{-121351.666,-262.399,10.000,-0.000},
				{-121374.390,-192.065,10.000,-0.000},
				{-121390.627,-132.679,10.000,-0.000},
				{-121401.473,-84.244,10.000,-0.000},
				{-121408.023,-46.758,10.000,-0.000},
				{-121411.372,-20.223,10.000,-0.000},
				{-121412.615,-4.636,10.000,-0.000},
				{-121412.847,-0.000,10.000,0.000},
				{-121412.847,-0.000,10.000,0.000}		};

}