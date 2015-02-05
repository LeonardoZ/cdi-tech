package com.leonardoz.cditech.weapon;

import javax.enterprise.event.Event;
import javax.enterprise.inject.Any;
import javax.inject.Inject;


public class Shotgun {
	
	@Inject 
	@Any
	private Event<ShotgunFired> shotgunFiredEvent;
	
	public Shotgun() {

	}
	
	public void shoot() {
		System.out.println("Omar shooting some random drug dealer.");
		ShotgunFired shotgunFired = new ShotgunFired(this);
		shotgunFiredEvent.fire(shotgunFired);
	}

	public void putSomeAmmo() {
		System.out.println("Reloaded!");
		
	}
	
	
}
