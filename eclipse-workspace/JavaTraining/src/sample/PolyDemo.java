package sample;


 class Vehicle
{
	 	final double pi=3.14;//const
	 	
	 void run()
	{
		 //pi=4.235;
		 
		System.out.println("Vehicle is Running....");
	}
}

class Bus extends Vehicle
{
	void run()
	{
		System.out.println("Bus is Running safelly....");
	}
}
public class PolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle ob=new Vehicle();
		ob.run();
		
		Vehicle ob2=new Bus();
		ob.run();
		
		Bus b=new Bus();
		b.run();
		
		
		ob=new Bus();  //Dynamic binding
		
		ob.run();
	}

}
