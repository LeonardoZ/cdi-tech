package com.leonardoz.cditech.printer;

import javax.inject.Named;

@Named("console")
public class ConsoleService implements PrinterService {

	@Override
	public void print() {
		System.out.println("Printing in console.");
	}

}
