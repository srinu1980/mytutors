package com.cts.collections;

public class Student
{

	public int getSno() {
		return sno;
	}

	@Override
	public String toString() {
		return "\nsno=" + sno + ", sname=" + sname;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	int sno;
	String sname;
	
	public Student(int sno, String sname)
	{

	this.sno = sno;
		this.sname = sname;
	}
	
	
	
}
