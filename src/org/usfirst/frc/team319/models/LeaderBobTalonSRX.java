package org.usfirst.frc.team319.models;

import java.util.ArrayList;
import java.util.List;

import com.ctre.phoenix.motorcontrol.NeutralMode;
 
/**
 * @author BigBa
 *
 */
public class LeaderBobTalonSRX extends BobTalonSRX{
	// a list of talons to follow the leader
	private final List<BobTalonSRX> followers;
	
	// the constructor
	/**
	 * @param leaderDeviceNumber
	 * @param followerDeviceNumbers
	 */
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
	
	/* (non-Javadoc)
	 * @see com.ctre.phoenix.motorcontrol.can.BaseMotorController#setNeutralMode(com.ctre.phoenix.motorcontrol.NeutralMode)
	 */
	@Override
	public void setNeutralMode(NeutralMode neutralMode) {
		super.setNeutralMode(neutralMode);
		for (BobTalonSRX bobTalonSRX : followers) {
			bobTalonSRX.setNeutralMode(neutralMode);
		}
	}
	
	@Override
	public void setInverted(boolean invert) {
		super.setInverted(invert);
		for (BobTalonSRX bobTalonSRX : followers) {
			bobTalonSRX.setInverted(invert);
		}
	}

}
