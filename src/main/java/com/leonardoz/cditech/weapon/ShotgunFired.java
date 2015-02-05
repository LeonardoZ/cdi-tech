package com.leonardoz.cditech.weapon;

public class ShotgunFired {

	private Shotgun shotgun;

	public ShotgunFired(Shotgun shotgun) {
		this.shotgun = shotgun;
	}

	public void info() {
		System.out.println("Good!");
	}
	
	public Shotgun getUsedShotgun() {
		return shotgun;
	}

}
