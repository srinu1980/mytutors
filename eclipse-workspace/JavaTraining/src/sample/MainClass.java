package sample;

public class MainClass {

	public static void main(String[] args) 
	{

	Student s=new Student();  //s is an object  or reference variable 
	
	Student s2=new Student(110,"Mahesh",4500.45);
	
	//s.display();
	
	//System.out.println("Student number  :"+s.sno);
	//System.out.println("Student name :"+s.sname);
	//System.out.println("Course Fees  :"+s.fees);

	//s.sno=100;
	//s.sname="Rohit";
	//s.fees=4000.45;

	//System.out.println("Student number  :"+s.sno);
	//System.out.println("Student name :"+s.sname);
	//System.out.println("Course Fees  :"+s.fees);
	
	//s.input();
	//s.display();
	
	
	System.out.println("Sno :"+s.getSno());
	System.out.println("Sname :"+s.getSname());
	System.out.println("Fees :"+s.getFees());
	
	
	s.setSno(111);
	s.setSname("Rohit");
	s.setFees(5000.35);
	
	System.out.println("Sno :"+s.getSno());
	System.out.println("Sname :"+s.getSname());
	System.out.println("Fees :"+s.getFees());
	
	System.out.println(s);
	
	System.out.println(s2);  //to return the toString()
	
	}

}
