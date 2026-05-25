package com.cts.SpringFirstProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		StudentBean student1 = (StudentBean) context.getBean("mybean1");

		student1.display();

	}

}
