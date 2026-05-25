package com.cts;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employ ob=new Employ();

		ob.setEmpId(1000);
		ob.setEmployName("Suresh");
		ob.setSalary(50000);
		
		System.out.println(ob.getEmpId());
		System.out.println(ob.getEmployName());
		System.out.println(ob.getSalary());
		
		
}

}
