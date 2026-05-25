package sample;

import java.util.Scanner;

public class Student
{

	private int sno;
	private String sname;
	 private double fees;



	 
	public Student() 
	{

		
	}

	public Student(int sno, String sname, double fees) 
	{
		super();
		this.sno = sno;
		this.sname = sname;
		this.fees = fees;
	}

	public int getSno() {
		return sno;
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
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	@Override
	public String toString() 
	{
		return "sno=" + sno + ", sname=" + sname + ", fees=" + fees;
	}
	
	
	
	
	
	 /*Scanner sc=new Scanner(System.in);
	 
	 void display()
	 {
		 System.out.println("Sno  :"+sno);
		 System.out.println("Sname  :"+sname);
		 System.out.println("course fees  :"+fees);
	 }
	 
	 void input()
	 {
		System.out.println("Enter sno :");
		sno=sc.nextInt();
		
		System.out.println("Enter sname ");
		sname=sc.next();
		
		System.out.println("Enter course fees :");
		fees=sc.nextDouble();
	 }
	 */
	 

	 
}
