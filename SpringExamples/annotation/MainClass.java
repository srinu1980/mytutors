package com.cts.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();

		HelloWorld helloWorld2 = ctx.getBean(HelloWorld.class);
		helloWorld2.getMessage();

		ctx.registerShutdownHook(); // call the PreDestroy()
	}

}
