package com.cts.aopxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cts/aopxml/beans.xml");

		Student student = (Student) context.getBean("student");
		student.getName();
		student.getAge();
		// student.printThrowException();

	}

}
