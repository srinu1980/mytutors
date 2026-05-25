package com.cts.annotation;

import org.springframework.context.annotation.Bean;

public class HelloWorldConfig {

	/*
	 * <bean name="helloWorld" class="com.cts.javabased.HelloWorld">
	 */

	@Bean(initMethod = "postConstructMethod", destroyMethod = "preDestroyMethod")
//	@Scope("singleton")
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}

}
