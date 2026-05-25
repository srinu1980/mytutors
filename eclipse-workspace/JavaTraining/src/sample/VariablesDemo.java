package sample;

public class VariablesDemo {

	
	public static void main(String[] args) 
	{

		int a,b,c;
		
		a=10;
		b=20;
		c=30;
		
		System.out.println("a value "+a);   //+ is  concatination
		System.out.println("b value "+b);
		System.out.println("c value "+c);
		
		
		c=a+b;   // =  is called assignment operator
		System.out.println("Addition is "+c);

		c=a-b;
		System.out.println("Subtraction is "+c);
		
		c=a*b;
		System.out.println("Multiplication is "+c);
		
		c=a/b;
		System.out.println("Division is "+c);
		
		c=a%b;
		System.out.println("Remainder is "+c);
		

		System.out.println(" a >b ="+(a!=b));
		
		
		
		
	}

}
