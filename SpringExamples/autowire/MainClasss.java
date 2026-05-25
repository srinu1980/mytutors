package com.cts.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ApplicationContext context=new ClassPathXmlApplicationContext("com/cts/autowire/autowirebean.xml");

Emp emp=(Emp)context.getBean("emp");

System.out.println(emp);

	}

}
