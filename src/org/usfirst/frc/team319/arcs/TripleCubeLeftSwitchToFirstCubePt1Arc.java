package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class TripleCubeLeftSwitchToFirstCubePt1Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (10.30,17.58,0.00)
	// (3.93,12.58,0.00)
	
    public TripleCubeLeftSwitchToFirstCubePt1Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public TripleCubeLeftSwitchToFirstCubePt1Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.427,-8.545,10.000,0.000},
				{-2.136,-25.635,10.000,0.000},
				{-5.982,-51.270,10.000,0.000},
				{-12.818,-85.450,10.000,0.000},
				{-23.499,-128.175,10.000,0.000},
				{-38.880,-179.446,10.000,0.000},
				{-59.815,-239.261,10.000,0.000},
				{-87.159,-307.621,10.000,0.000},
				{-121.767,-384.526,10.000,0.001},
				{-164.492,-469.976,10.000,0.001},
				{-216.189,-563.972,10.000,0.002},
				{-277.713,-666.512,10.000,0.003},
				{-349.919,-777.597,10.000,0.004},
				{-433.660,-897.228,10.000,0.007},
				{-529.364,-1016.858,10.000,0.010},
				{-637.032,-1136.488,10.000,0.014},
				{-756.662,-1256.119,10.000,0.020},
				{-888.255,-1375.749,10.000,0.027},
				{-1031.812,-1495.379,10.000,0.037},
				{-1187.331,-1615.010,10.000,0.049},
				{-1354.814,-1734.640,10.000,0.063},
				{-1534.259,-1854.270,10.000,0.081},
				{-1725.668,-1973.901,10.000,0.102},
				{-1929.039,-2093.531,10.000,0.127},
				{-2144.374,-2213.161,10.000,0.157},
				{-2371.671,-2332.792,10.000,0.192},
				{-2610.932,-2452.422,10.000,0.232},
				{-2862.156,-2572.052,10.000,0.278},
				{-3125.343,-2691.683,10.000,0.331},
				{-3400.492,-2811.313,10.000,0.391},
				{-3687.605,-2930.943,10.000,0.458},
				{-3986.681,-3050.574,10.000,0.535},
				{-4297.720,-3170.204,10.000,0.620},
				{-4620.722,-3289.834,10.000,0.715},
				{-4955.687,-3409.465,10.000,0.821},
				{-5302.615,-3529.095,10.000,0.938},
				{-5661.506,-3648.725,10.000,1.067},
				{-6032.360,-3768.356,10.000,1.209},
				{-6415.177,-3887.986,10.000,1.365},
				{-6809.957,-4007.616,10.000,1.535},
				{-7216.700,-4127.247,10.000,1.721},
				{-7635.406,-4246.877,10.000,1.924},
				{-8066.075,-4366.507,10.000,2.145},
				{-8508.708,-4486.138,10.000,2.384},
				{-8963.303,-4605.768,10.000,2.643},
				{-9429.861,-4725.398,10.000,2.923},
				{-9908.383,-4845.029,10.000,3.226},
				{-10398.867,-4964.659,10.000,3.553},
				{-10901.314,-5084.289,10.000,3.904},
				{-11415.725,-5203.920,10.000,4.282},
				{-11942.098,-5323.550,10.000,4.688},
				{-12480.435,-5443.180,10.000,5.124},
				{-13030.734,-5562.811,10.000,5.592},
				{-13592.997,-5682.441,10.000,6.092},
				{-14167.223,-5802.071,10.000,6.628},
				{-14753.411,-5921.702,10.000,7.201},
				{-15351.563,-6041.332,10.000,7.813},
				{-15961.678,-6160.962,10.000,8.466},
				{-16583.755,-6280.593,10.000,9.163},
				{-17217.796,-6400.223,10.000,9.906},
				{-17863.800,-6519.853,10.000,10.697},
				{-18521.767,-6639.484,10.000,11.538},
				{-19191.697,-6759.114,10.000,12.433},
				{-19873.590,-6878.744,10.000,13.382},
				{-20567.446,-6998.375,10.000,14.389},
				{-21273.265,-7118.005,10.000,15.456},
				{-21991.047,-7237.635,10.000,16.584},
				{-22720.792,-7357.266,10.000,17.775},
				{-23462.500,-7476.896,10.000,19.031},
				{-24216.171,-7596.526,10.000,20.352},
				{-24981.805,-7716.157,10.000,21.739},
				{-25759.402,-7835.787,10.000,23.192},
				{-26548.962,-7955.417,10.000,24.708},
				{-27350.486,-8075.048,10.000,26.286},
				{-28163.972,-8194.678,10.000,27.923},
				{-28989.421,-8314.308,10.000,29.615},
				{-29826.834,-8433.939,10.000,31.356},
				{-30676.209,-8553.569,10.000,33.140},
				{-31537.548,-8673.199,10.000,34.960},
				{-32410.849,-8792.830,10.000,36.807},
				{-33296.113,-8912.460,10.000,38.672},
				{-34193.341,-9032.090,10.000,40.546},
				{-35102.532,-9151.721,10.000,42.418},
				{-36023.685,-9271.351,10.000,44.279},
				{-36956.802,-9390.981,10.000,46.118},
				{-37901.881,-9510.612,10.000,47.926},
				{-38858.924,-9630.242,10.000,49.696},
				{-39827.930,-9749.872,10.000,51.418},
				{-40808.899,-9869.503,10.000,53.087},
				{-41801.830,-9989.133,10.000,54.696},
				{-42806.725,-10108.763,10.000,56.242},
				{-43823.583,-10228.394,10.000,57.720},
				{-44852.404,-10348.024,10.000,59.127},
				{-45893.188,-10467.654,10.000,60.463},
				{-46945.508,-10578.740,10.000,61.725},
				{-48008.509,-10681.280,10.000,62.912},
				{-49081.336,-10775.275,10.000,64.024},
				{-50163.136,-10860.726,10.000,65.061},
				{-51253.054,-10937.631,10.000,66.023},
				{-52350.235,-11005.991,10.000,66.913},
				{-53453.825,-11065.806,10.000,67.730},
				{-54562.969,-11117.076,10.000,68.477},
				{-55676.813,-11159.801,10.000,69.155},
				{-56794.502,-11193.982,10.000,69.767},
				{-57915.182,-11219.617,10.000,70.313},
				{-59037.998,-11236.707,10.000,70.797},
				{-60162.096,-11245.252,10.000,71.218},
				{-61286.622,-11245.252,10.000,71.580},
				{-62411.147,-11245.252,10.000,71.883},
				{-63535.672,-11245.252,10.000,72.130},
				{-64660.197,-11245.252,10.000,72.321},
				{-65784.722,-11245.252,10.000,72.457},
				{-66909.247,-11245.252,10.000,72.540},
				{-68033.773,-11245.252,10.000,72.568},
				{-69158.298,-11245.252,10.000,72.544},
				{-70282.823,-11245.252,10.000,72.466},
				{-71407.348,-11245.252,10.000,72.333},
				{-72531.873,-11245.252,10.000,72.147},
				{-73656.398,-11245.252,10.000,71.904},
				{-74780.924,-11245.252,10.000,71.606},
				{-75905.449,-11245.252,10.000,71.248},
				{-77029.580,-11237.366,10.000,70.831},
				{-78152.495,-11220.934,10.000,70.353},
				{-79273.339,-11195.958,10.000,69.811},
				{-80391.259,-11162.437,10.000,69.205},
				{-81505.399,-11120.371,10.000,68.532},
				{-82614.906,-11069.760,10.000,67.790},
				{-83718.924,-11010.604,10.000,66.978},
				{-84816.599,-10942.902,10.000,66.095},
				{-85907.077,-10866.656,10.000,65.138},
				{-86989.503,-10781.865,10.000,64.107},
				{-88063.023,-10688.528,10.000,63.001},
				{-89126.782,-10586.647,10.000,61.819},
				{-90179.925,-10476.221,10.000,60.563},
				{-91221.599,-10357.249,10.000,59.233},
				{-92251.342,-10237.619,10.000,57.831},
				{-93269.122,-10117.989,10.000,56.359},
				{-94274.940,-9998.358,10.000,54.818},
				{-95268.794,-9878.728,10.000,53.214},
				{-96250.685,-9759.098,10.000,51.549},
				{-97220.614,-9639.467,10.000,49.831},
				{-98178.579,-9519.837,10.000,48.065},
				{-99124.581,-9400.207,10.000,46.259},
				{-100058.620,-9280.576,10.000,44.422},
				{-100980.696,-9160.946,10.000,42.563},
				{-101890.809,-9041.316,10.000,40.691},
				{-102788.959,-8921.685,10.000,38.818},
				{-103675.146,-8802.055,10.000,36.951},
				{-104549.370,-8682.425,10.000,35.103},
				{-105411.631,-8562.794,10.000,33.280},
				{-106261.929,-8443.164,10.000,31.493},
				{-107100.264,-8323.534,10.000,29.748},
				{-107926.636,-8203.903,10.000,28.053},
				{-108741.045,-8084.273,10.000,26.411},
				{-109543.490,-7964.642,10.000,24.828},
				{-110333.973,-7845.012,10.000,23.307},
				{-111112.493,-7725.382,10.000,21.850},
				{-111879.049,-7605.751,10.000,20.458},
				{-112633.643,-7486.121,10.000,19.131},
				{-113376.274,-7366.491,10.000,17.871},
				{-114106.941,-7246.860,10.000,16.674},
				{-114825.646,-7127.230,10.000,15.541},
				{-115532.387,-7007.600,10.000,14.470},
				{-116227.166,-6887.969,10.000,13.458},
				{-116909.981,-6768.339,10.000,12.504},
				{-117580.834,-6648.709,10.000,11.606},
				{-118239.723,-6529.078,10.000,10.760},
				{-118886.649,-6409.448,10.000,9.966},
				{-119521.613,-6289.818,10.000,9.219},
				{-120144.613,-6170.187,10.000,8.519},
				{-120755.650,-6050.557,10.000,7.862},
				{-121354.724,-5930.927,10.000,7.247},
				{-121941.835,-5811.296,10.000,6.671},
				{-122516.983,-5691.666,10.000,6.133},
				{-123080.169,-5572.036,10.000,5.629},
				{-123631.391,-5452.405,10.000,5.159},
				{-124170.650,-5332.775,10.000,4.721},
				{-124697.946,-5213.145,10.000,4.313},
				{-125213.279,-5093.514,10.000,3.933},
				{-125716.649,-4973.884,10.000,3.579},
				{-126208.055,-4854.254,10.000,3.251},
				{-126687.499,-4734.623,10.000,2.946},
				{-127154.980,-4614.993,10.000,2.664},
				{-127610.498,-4495.363,10.000,2.403},
				{-128054.053,-4375.732,10.000,2.163},
				{-128485.644,-4256.102,10.000,1.941},
				{-128905.273,-4136.472,10.000,1.737},
				{-129312.939,-4016.841,10.000,1.549},
				{-129708.641,-3897.211,10.000,1.377},
				{-130092.381,-3777.581,10.000,1.220},
				{-130464.157,-3657.950,10.000,1.077},
				{-130823.971,-3538.320,10.000,0.947},
				{-131171.821,-3418.690,10.000,0.829},
				{-131507.709,-3299.059,10.000,0.723},
				{-131831.633,-3179.429,10.000,0.627},
				{-132143.595,-3059.799,10.000,0.541},
				{-132443.593,-2940.168,10.000,0.464},
				{-132731.628,-2820.538,10.000,0.396},
				{-133007.701,-2700.908,10.000,0.335},
				{-133271.810,-2581.277,10.000,0.282},
				{-133523.956,-2461.647,10.000,0.235},
				{-133764.139,-2342.017,10.000,0.195},
				{-133992.359,-2222.386,10.000,0.160},
				{-134208.617,-2102.756,10.000,0.130},
				{-134412.911,-1983.126,10.000,0.104},
				{-134605.242,-1863.495,10.000,0.083},
				{-134785.610,-1743.865,10.000,0.065},
				{-134954.015,-1624.235,10.000,0.050},
				{-135110.457,-1504.604,10.000,0.038},
				{-135254.936,-1384.974,10.000,0.028},
				{-135387.451,-1265.344,10.000,0.020},
				{-135508.004,-1145.713,10.000,0.015},
				{-135616.594,-1026.083,10.000,0.010},
				{-135713.221,-906.453,10.000,0.007},
				{-135797.885,-786.822,10.000,0.004},
				{-135870.980,-675.078,10.000,0.003},
				{-135933.328,-571.879,10.000,0.002},
				{-135985.783,-477.225,10.000,0.001},
				{-136029.200,-391.115,10.000,0.001},
				{-136064.433,-313.551,10.000,0.000},
				{-136092.337,-244.532,10.000,0.000},
				{-136113.767,-184.058,10.000,0.000},
				{-136129.576,-132.129,10.000,0.000},
				{-136140.620,-88.745,10.000,0.000},
				{-136147.752,-53.906,10.000,0.000},
				{-136151.828,-27.612,10.000,0.000},
				{-136153.702,-9.863,10.000,0.000},
				{-136154.228,-0.659,10.000,0.000},
				{-136154.261,-0.000,10.000,0.000},
				{-136154.261,-0.000,10.000,0.000}		};

}