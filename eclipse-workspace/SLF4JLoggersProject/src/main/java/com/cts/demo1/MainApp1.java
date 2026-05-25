package com.cts.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApp1 {

	private static final Logger logger = LoggerFactory.getLogger(MainApp1.class);

	public static void main(String[] args) {
		logger.info("Application started");
		logger.debug("Debugging information");

		logger.error("An error occurred", new RuntimeException("Test error"));

	}
}
