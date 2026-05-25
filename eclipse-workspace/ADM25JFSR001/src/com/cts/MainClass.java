package com.cts;

public class MainClass {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1000, "Rohit", 35000.45);

		System.out.println("Employee Id :" + emp1.getEmpId());
		System.out.println("Employee Name :" + emp1.getEmpName());
		System.out.println("Salary  is  :" + emp1.getSalary());

		emp1.setEmpId(1111);
		emp1.setEmpName("Raj");
		emp1.setSalary(5600.434);

		System.out.println("Employee Id :" + emp1.getEmpId());
		System.out.println("Employee Name :" + emp1.getEmpName());
		System.out.println("Salary  is  :" + emp1.getSalary());

		System.out.println(emp1);

	}

}
