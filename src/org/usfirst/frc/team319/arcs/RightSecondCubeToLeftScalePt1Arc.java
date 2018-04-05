package org.usfirst.frc.team319.arcs;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class RightSecondCubeToLeftScalePt1Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (8.50,12.58,60.00)
	// (6.50,8.58,90.00)
	
    public RightSecondCubeToLeftScalePt1Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public RightSecondCubeToLeftScalePt1Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.549,-10.984,10.000,60.000},
				{-2.746,-32.953,10.000,60.000},
				{-7.689,-65.906,10.000,60.000},
				{-16.476,-109.843,10.000,60.000},
				{-30.207,-164.764,10.000,60.000},
				{-49.979,-230.670,10.000,60.000},
				{-76.890,-307.560,10.000,60.000},
				{-112.040,-395.434,10.000,60.000},
				{-156.526,-494.293,10.000,59.999},
				{-211.448,-604.136,10.000,59.998},
				{-277.902,-724.963,10.000,59.997},
				{-356.989,-856.774,10.000,59.995},
				{-449.807,-999.570,10.000,59.993},
				{-557.453,-1153.350,10.000,59.989},
				{-680.477,-1307.130,10.000,59.983},
				{-818.879,-1460.910,10.000,59.976},
				{-972.659,-1614.690,10.000,59.966},
				{-1141.817,-1768.470,10.000,59.953},
				{-1326.353,-1922.250,10.000,59.937},
				{-1526.267,-2076.031,10.000,59.917},
				{-1741.559,-2229.811,10.000,59.892},
				{-1972.229,-2383.591,10.000,59.863},
				{-2218.277,-2537.371,10.000,59.828},
				{-2479.703,-2691.151,10.000,59.787},
				{-2756.507,-2844.931,10.000,59.739},
				{-3048.689,-2998.711,10.000,59.683},
				{-3356.249,-3152.491,10.000,59.619},
				{-3679.187,-3306.271,10.000,59.547},
				{-4017.503,-3460.051,10.000,59.466},
				{-4371.198,-3613.831,10.000,59.374},
				{-4740.270,-3767.611,10.000,59.272},
				{-5124.720,-3921.391,10.000,59.160},
				{-5524.548,-4075.171,10.000,59.036},
				{-5939.754,-4228.951,10.000,58.900},
				{-6370.338,-4382.731,10.000,58.752},
				{-6816.300,-4536.511,10.000,58.591},
				{-7277.640,-4690.291,10.000,58.418},
				{-7754.358,-4844.071,10.000,58.232},
				{-8246.455,-4997.851,10.000,58.033},
				{-8753.929,-5151.631,10.000,57.822},
				{-9276.781,-5305.411,10.000,57.597},
				{-9815.011,-5459.191,10.000,57.359},
				{-10368.619,-5612.971,10.000,57.109},
				{-10937.605,-5766.751,10.000,56.847},
				{-11521.969,-5920.531,10.000,56.573},
				{-12121.711,-6074.311,10.000,56.289},
				{-12736.832,-6228.092,10.000,55.994},
				{-13367.330,-6381.872,10.000,55.689},
				{-14013.206,-6535.652,10.000,55.376},
				{-14674.460,-6689.432,10.000,55.056},
				{-15351.092,-6843.212,10.000,54.730},
				{-16043.102,-6996.992,10.000,54.399},
				{-16750.491,-7150.772,10.000,54.064},
				{-17473.257,-7304.552,10.000,53.727},
				{-18211.401,-7458.332,10.000,53.390},
				{-18964.923,-7612.112,10.000,53.055},
				{-19733.823,-7765.892,10.000,52.722},
				{-20518.102,-7919.672,10.000,52.396},
				{-21317.758,-8073.452,10.000,52.076},
				{-22132.792,-8227.232,10.000,51.766},
				{-22963.204,-8381.012,10.000,51.467},
				{-23808.994,-8534.792,10.000,51.183},
				{-24670.163,-8688.572,10.000,50.915},
				{-25546.709,-8842.352,10.000,50.665},
				{-26438.633,-8996.132,10.000,50.437},
				{-27345.935,-9149.912,10.000,50.232},
				{-28268.615,-9303.692,10.000,50.054},
				{-29206.674,-9457.472,10.000,49.904},
				{-30160.110,-9611.252,10.000,49.786},
				{-31128.924,-9765.032,10.000,49.703},
				{-32112.567,-9907.828,10.000,49.657},
				{-33109.941,-10039.640,10.000,49.651},
				{-34119.946,-10160.467,10.000,49.688},
				{-35141.485,-10270.310,10.000,49.770},
				{-36173.459,-10369.168,10.000,49.900},
				{-37214.769,-10457.043,10.000,50.080},
				{-38264.318,-10533.933,10.000,50.311},
				{-39321.006,-10599.838,10.000,50.596},
				{-40383.736,-10654.760,10.000,50.936},
				{-41451.409,-10698.697,10.000,51.333},
				{-42522.926,-10731.650,10.000,51.786},
				{-43597.190,-10753.618,10.000,52.298},
				{-44672.983,-10762.235,10.000,52.867},
				{-45748.538,-10748.883,10.000,53.494},
				{-46822.210,-10724.546,10.000,54.177},
				{-47892.898,-10689.226,10.000,54.915},
				{-48959.506,-10642.921,10.000,55.706},
				{-50020.933,-10585.631,10.000,56.547},
				{-51076.083,-10517.358,10.000,57.436},
				{-52123.856,-10438.100,10.000,58.370},
				{-53163.154,-10347.858,10.000,59.342},
				{-54192.878,-10246.631,10.000,60.351},
				{-55211.931,-10134.421,10.000,61.389},
				{-56219.213,-10011.225,10.000,62.452},
				{-57213.626,-9877.046,10.000,63.534},
				{-58194.073,-9731.883,10.000,64.628},
				{-59159.572,-9578.103,10.000,65.729},
				{-60109.693,-9424.323,10.000,66.832},
				{-61044.437,-9270.542,10.000,67.930},
				{-61963.802,-9116.762,10.000,69.020},
				{-62867.789,-8962.982,10.000,70.098},
				{-63756.398,-8809.202,10.000,71.159},
				{-64629.630,-8655.422,10.000,72.200},
				{-65487.483,-8501.642,10.000,73.217},
				{-66329.958,-8347.862,10.000,74.208},
				{-67157.055,-8194.082,10.000,75.170},
				{-67968.774,-8040.302,10.000,76.102},
				{-68765.116,-7886.522,10.000,77.000},
				{-69546.079,-7732.742,10.000,77.865},
				{-70311.664,-7578.962,10.000,78.695},
				{-71061.871,-7425.182,10.000,79.489},
				{-71796.701,-7271.402,10.000,80.247},
				{-72516.152,-7117.622,10.000,80.970},
				{-73220.225,-6963.842,10.000,81.656},
				{-73908.920,-6810.062,10.000,82.307},
				{-74582.237,-6656.282,10.000,82.923},
				{-75240.176,-6502.502,10.000,83.504},
				{-75882.738,-6348.722,10.000,84.051},
				{-76509.921,-6194.942,10.000,84.566},
				{-77121.726,-6041.162,10.000,85.048},
				{-77718.153,-5887.382,10.000,85.500},
				{-78299.202,-5733.602,10.000,85.921},
				{-78864.873,-5579.822,10.000,86.314},
				{-79415.167,-5426.042,10.000,86.678},
				{-79950.082,-5272.262,10.000,87.017},
				{-80469.619,-5118.481,10.000,87.329},
				{-80973.778,-4964.701,10.000,87.618},
				{-81462.559,-4810.921,10.000,87.883},
				{-81935.962,-4657.141,10.000,88.126},
				{-82393.987,-4503.361,10.000,88.348},
				{-82836.635,-4349.581,10.000,88.550},
				{-83263.904,-4195.801,10.000,88.734},
				{-83675.795,-4042.021,10.000,88.900},
				{-84072.308,-3888.241,10.000,89.050},
				{-84453.443,-3734.461,10.000,89.184},
				{-84819.200,-3580.681,10.000,89.303},
				{-85169.579,-3426.901,10.000,89.409},
				{-85504.580,-3273.121,10.000,89.503},
				{-85824.204,-3119.341,10.000,89.585},
				{-86128.449,-2965.561,10.000,89.657},
				{-86417.316,-2811.781,10.000,89.719},
				{-86690.805,-2658.001,10.000,89.772},
				{-86948.916,-2504.221,10.000,89.817},
				{-87191.649,-2350.441,10.000,89.855},
				{-87419.004,-2196.661,10.000,89.887},
				{-87630.981,-2042.881,10.000,89.913},
				{-87827.580,-1889.101,10.000,89.935},
				{-88008.801,-1735.321,10.000,89.952},
				{-88174.644,-1581.541,10.000,89.965},
				{-88325.109,-1427.761,10.000,89.975},
				{-88460.196,-1273.981,10.000,89.983},
				{-88579.905,-1120.200,10.000,89.989},
				{-88684.355,-968.788,10.000,89.993},
				{-88774.212,-828.360,10.000,89.995},
				{-88850.576,-698.917,10.000,89.997},
				{-88914.545,-580.457,10.000,89.998},
				{-88967.217,-472.982,10.000,89.999},
				{-89009.691,-376.492,10.000,90.000},
				{-89043.064,-290.985,10.000,90.000},
				{-89068.437,-216.463,10.000,90.000},
				{-89086.906,-152.925,10.000,90.000},
				{-89099.571,-100.372,10.000,90.000},
				{-89107.530,-58.802,10.000,90.000},
				{-89111.881,-28.217,10.000,90.000},
				{-89113.722,-8.616,10.000,90.000},
				{-89114.153,-0.000,10.000,90.000},
				{-89114.153,-0.000,10.000,90.000}		};

}