package sample;

public class StaticDemo {

	public StaticDemo()
	{
		System.out.println("Constructor called...");
	}
	 void show()
	{
		System.out.println("This is show()");
	}
	
	 static void disp()
	 {
		 System.out.println("This is Static method()");
	 }
	 
	 static
	 {
		 System.out.println("Frist static block");
	 }
	 
	 static
	 {
		 System.out.println("Second static block");
	 }
	 static
	 {
		 System.out.println("Third static block");
	 }
	 
	public static void main(String[] args) 
	{

		StaticDemo ob=new StaticDemo();
		
		//ob.show();

		//ob.disp();
		//disp();
	}

}
