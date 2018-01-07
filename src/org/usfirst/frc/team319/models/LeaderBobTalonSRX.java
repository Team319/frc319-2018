package org.usfirst.frc.team319.models;

import java.util.ArrayList;
import java.util.List;

import com.ctre.phoenix.motorcontrol.NeutralMode;

public class LeaderBobTalonSRX extends BobTalonSRX{
	// a list of talons to follow the leader
	private List<BobTalonSRX> followers;
	
	// the constructor
	public LeaderBobTalonSRX(int leaderDeviceNumber, int[] followerDeviceNumbers) {
		// the superconstructor
		super(leaderDeviceNumber);
		
		// create an empty list of followers
		this.followers = new ArrayList<BobTalonSRX>(); 
		
		// for each number in the array, create a BobTalonSRX
		// tell it to follow the leader, and add it to the list
		// of followers
		for (int followerDeviceNumber : followerDeviceNumbers) {
			BobTalonSRX follower = new BobTalonSRX(followerDeviceNumber);
			follower.follow(this);
			this.followers.add(follower);
		}
	}
	
	@Override
	public void setNeutralMode(NeutralMode neutralMode) {
		this.setNeutralMode(neutralMode);
		for (BobTalonSRX bobTalonSRX : followers) {
			bobTalonSRX.setNeutralMode(neutralMode);
		}
	}

}
