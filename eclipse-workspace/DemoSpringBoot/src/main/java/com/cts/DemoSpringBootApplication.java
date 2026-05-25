package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to SpringBoot");
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}

}
