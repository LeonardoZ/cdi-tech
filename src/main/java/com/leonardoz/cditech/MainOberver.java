package com.leonardoz.cditech;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.jboss.weld.environment.se.events.ContainerInitialized;

import com.leonardoz.cditech.weapon.Shotgun;

public class MainOberver {

	@Inject
	private Shotgun shotgun;

	public void main(@Observes ContainerInitialized event) {
		System.out.println("=============================");
		System.out.println("Observer execution Initialized.");
		shotgun.shoot();
		System.out.println("=============================");
	}

}
