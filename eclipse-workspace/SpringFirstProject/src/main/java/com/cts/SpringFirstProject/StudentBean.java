package com.cts.SpringFirstProject;

public class StudentBean {

	private int studentId;
	private String studentName;
	private String city;

	public StudentBean(int studentId, String studentName, String city) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.city = city;
	}

	public void display() {
		System.out.println("Student Id :" + studentId + "  Student Name :" + studentName + " City :" + city);
	}
}
