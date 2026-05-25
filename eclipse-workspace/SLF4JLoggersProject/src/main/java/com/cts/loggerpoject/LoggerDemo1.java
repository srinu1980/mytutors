package com.cts.loggerpoject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create logger object

		Logger logger = LoggerFactory.getLogger(LoggerDemo1.class);

		logger.info("Infomation for Loggers");
		logger.warn("Warning or Loggers");
		logger.error("Intrupt the Execution", new RuntimeException("Error Occurs"));

	}

}
