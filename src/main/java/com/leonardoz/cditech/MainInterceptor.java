package com.leonardoz.cditech;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

import org.jboss.weld.environment.se.events.ContainerInitialized;

import com.leonardoz.cditech.math.MathOperations;

public class MainInterceptor {
	
	@Inject
	@Any
	private MathOperations operations;

	public void main(@Observes ContainerInitialized event) {
		System.out.println("=============================");
		System.out.println("Interceptor execution Initialized.");
		operations.sum(2, 3);
		operations.mult(4, 4);
		System.out.println("=============================");
	}

}
