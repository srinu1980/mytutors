package com.cts.SpringCoreModuleProject;

public class StudentBean {

	private int studentId;
	private String studentName;

	public void display() {
		System.out.println("Student Id  :" + studentId + " Student Name :" + studentName);
	}

	public StudentBean(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

}
