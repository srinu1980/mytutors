package com.cts.multithreading;

 class NewThread  implements Runnable
{
	String threadName;
	Thread t;
	
	public NewThread(String threadName)
	{
		this.threadName=threadName;
		t=new Thread(this,threadName);
		
		System.out.println("Current Thread is  "+t.getName());
		t.start();
	}

	@Override
	public void run() {

		for(int i=1;i<=5;i++)
		{
			System.out.println(threadName+"        ="+i);
			try {
				t.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	System.out.println(t.getName()+" Thread exited.............");
	}
}



public class MultiThreadDemo {

	public static void main(String[] args)  
	{

		NewThread t1=new NewThread("One");
		NewThread t2=new NewThread("Two");
		NewThread t3=new NewThread("Three");

		System.out.println("Thread t1 object  before Join method isAlive ?  :"+t1.t.isAlive());
		System.out.println("Thread t2 object  before Join method isAlive ?  :"+t2.t.isAlive());
		System.out.println("Thread t13 object  before Join method isAlive ?  :"+t3.t.isAlive());

		try {
			t1.t.join();
			t2.t.join();  //wait for thread to kill/die
			t3.t.join();
			
			Thread.sleep(1000);
		} catch (InterruptedException e) 
			{
			e.printStackTrace();
			}

		System.out.println("Thread t1 object  after Join method isAlive ?  :"+t1.t.isAlive());
		System.out.println("Thread t2 object  after Join method isAlive ?  :"+t2.t.isAlive());
		System.out.println("Thread t13 object  after Join method isAlive ?  :"+t3.t.isAlive());

		
		
	}

}
