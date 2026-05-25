package com.cts.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ApplicationContext context=new ClassPathXmlApplicationContext("com/cts/collections/beans.xml");

Emp emp=(Emp)context.getBean("collectionBean");

System.out.println(emp.getName());
System.out.println(emp.getAddress());
System.out.println(emp.getCourses());
System.out.println(emp.getPhones());

		
	}

}
