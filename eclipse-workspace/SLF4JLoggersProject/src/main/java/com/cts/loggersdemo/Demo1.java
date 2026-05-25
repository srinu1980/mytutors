package com.cts.loggersdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo1 {

	public static void main(String[] args) {

		Logger logger = LoggerFactory.getLogger(Demo1.class);

		logger.info("Info Logger is Running....");
		logger.warn("Worning logger is Running");
		logger.error("Error", new RuntimeException("Error Occurs"));

	}

}
