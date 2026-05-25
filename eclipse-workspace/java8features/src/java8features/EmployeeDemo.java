package java8features;

import java.util.ArrayList;
import java.util.List;

class Employee {
	private int id;
	private String name;
	private String city;
	private int age;
	private String gender;
	private String department;
	private int yearOfJoining;
	private double salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, String city, int age, String gender, String department, int yearOfJoining,
			double salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", gender=" + gender
				+ ", department=" + department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

}

public class EmployeeDemo {

	public static List<Employee> employeesList() {

		List<Employee> employeList = new ArrayList<Employee>();

		employeList.add(new Employee(6, "Six", "Hyderabad", 43, "Male", "Security", 2006, 45000.43));
		employeList.add(new Employee(3, "Three", "Hyderabad", 43, "Male", "Security", 2006, 45000.43));
		employeList.add(new Employee(7, "Seven", "Chennai", 42, "Male", "Security", 2006, 4000.43));
		employeList.add(new Employee(2, "Two", "Hyderabad", 53, "Female", "Security", 2006, 25000.43));
		employeList.add(new Employee(5, "Five", "Chennai", 43, "Male", "Security", 2006, 45000.43));
		employeList.add(new Employee(1, "One", "Hyderabad", 33, "Female", "Security", 2006, 35000.43));
		employeList.add(new Employee(4, "Four", "Hyderabad", 53, "Male", "Security", 2006, 15000.43));
		employeList.add(new Employee(9, "Nine", "Chennai", 63, "Male", "Security", 2006, 85000.43));
		employeList.add(new Employee(8, "Eight", "Hyderabad", 48, "Female", "Security", 2006, 4000.43));

		return employeList;

	}

	public static void main(String[] args) {

		List<Employee> employeList = new ArrayList<Employee>();

		employeList.add(new Employee(6, "Six", "Hyderabad", 43, "Male", "Security", 2006, 45000.43));
		employeList.add(new Employee(3, "Three", "Hyderabad", 43, "Male", "Security", 2006, 45000.43));
		employeList.add(new Employee(7, "Seven", "Chennai", 42, "Male", "Security", 2006, 4000.43));
		employeList.add(new Employee(2, "Two", "Hyderabad", 53, "Female", "Security", 2006, 25000.43));
		employeList.add(new Employee(5, "Five", "Chennai", 43, "Male", "Security", 2006, 45000.43));
		employeList.add(new Employee(1, "One", "Hyderabad", 33, "Female", "Security", 2006, 35000.43));
		employeList.add(new Employee(4, "Four", "Hyderabad", 53, "Male", "Security", 2006, 15000.43));
		employeList.add(new Employee(9, "Nine", "Chennai", 63, "Male", "Security", 2006, 85000.43));
		employeList.add(new Employee(8, "Eight", "Hyderabad", 48, "Female", "Security", 2006, 4000.43));

		employeList.stream().filter(e -> e.getSalary() > 5000).forEach(e -> System.out.println(e.getName()));

	}

}
