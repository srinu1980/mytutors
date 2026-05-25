package com.cts.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerDemo {

	public static void main(String[] args) {
		// Creating the Logger object
		Logger logger = LoggerFactory.getLogger(LoggerDemo.class);

		// Logging the information
		logger.info("Hi This is my first SLF4J program");

	}

}
