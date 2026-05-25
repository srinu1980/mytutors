package com.cts.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	@PostConstruct
	public void postConstructMethod() {
		System.out.println(" @PostConstruct method called (Initialization)");
	}

	@PreDestroy
	public void preDestroyMethod() {
		System.out.println(" @PreDestroy method called (Destruction)");
	}



}
