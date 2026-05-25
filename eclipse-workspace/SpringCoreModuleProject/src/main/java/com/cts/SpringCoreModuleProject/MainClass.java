package com.cts.SpringCoreModuleProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("myBean.xml");

		StudentBean student = (StudentBean) context.getBean("studentBean1");

		student.display();
	}

}
