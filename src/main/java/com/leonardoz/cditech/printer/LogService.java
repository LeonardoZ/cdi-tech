package com.leonardoz.cditech.printer;

import java.util.logging.Logger;

import com.leonardoz.cditech.identifiers.Log;

@Log
public class LogService implements PrinterService{

	private Logger LOGGER = Logger.getLogger(LogService.class.toString());

	@Override
	public void print() {
		LOGGER.info("Printing with log");
	}
	
}
