package com.cts.loggersdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsingParametrs {

	public static void main(String args[]) {
		// Creating the Logger object
		Logger logger = LoggerFactory.getLogger(UsingParametrs.class);
		Integer age = 23;
		String role = "Developer";
		String company = "Cognizant";
		// Logging the information
		logger.info("At the age of {}, Rahul got his first job as a {} in {} ", age, role, company);

		logger.warn("Job is Getting Worning...");
	}

}
