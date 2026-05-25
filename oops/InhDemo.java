package com.cts.oops;


//Dynamic Polymorphism

class Animal
{

	void speak()
	{
     System.out.println("This animal will speak.");
 
	}
}

//Child class (Derived class)
class Dog extends Animal
{

	void speak()
	{
     System.out.println("Bow  Bow.....");
 
	}
	
}

class Cat extends Animal
{

	void speak()
	{
     System.out.println("Mew Mew......");
 
	}

}



public class InhDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal ob;
		
		ob=new Dog();
		
		ob.speak();
		
		
		ob=new Cat();
	
		ob.speak();
		
	}

}
