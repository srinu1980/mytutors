package sample;

class A  //base class
{
	protected int x;
	
	void disp()
	{
		System.out.println("Base class disp()");
	}
}
class B extends A
{
	protected int x;
	

	void disp()
	{
		super.disp(); // to call base class disp()
		
		System.out.println("Derived class disp()");
	} 
	B(int x, int y)
	{
		super.x=x; //to refers base class x
		this.x=y;
	}
	
	void show()
	{
		System.out.println("Base x ="+super.x+" Derived  x ="+x);
	}
	
}

public class InhDemo {

	public static void main(String[] args) {

		B ob=new B(11,55);
		ob.show();
		ob.disp();
		
	}

}
