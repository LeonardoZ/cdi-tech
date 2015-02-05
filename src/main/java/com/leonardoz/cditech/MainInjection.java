package com.leonardoz.cditech;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.weld.environment.se.events.ContainerInitialized;

import com.leonardoz.cditech.identifiers.Log;
import com.leonardoz.cditech.printer.PrinterService;

//Executar class org.jboss.weld.se como "principal"
public class MainInjection {

	@Inject
	@Named("console")
	private PrinterService console;
	
	@Inject
	@Log
	private PrinterService log;
	
	public void main(@Observes ContainerInitialized event) {
		System.out.println("=============================");
		System.out.println("Injection execution Initialized.");
		console.print();
		log.print();
		System.out.println("=============================");
	}

	@Inject
	void printWithLog(@Log PrinterService printer) {
		System.out.println("Method invoked and parameter type: "+printer.getClass().toString());
	}

	@Inject
	void printWithConsole(@Named("console") PrinterService printer) {
		System.out.println("Method invoked and parameter type: "+printer.getClass().toString());
	}

}
