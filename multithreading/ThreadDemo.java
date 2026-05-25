package com.cts.multithreading;

public class ThreadDemo implements Runnable 
{
	@Override
	public void run()
	{

		for(int i=1;i<=10;i++)
		{
			System.out.println("Child Thread i value ="+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}

		
	}

	public static void main(String[] args) {


		ThreadDemo ob=new ThreadDemo();
		Thread t=new Thread(ob);
		t.start();
		
		for(int i=100;i<=110;i++)
		{
			System.out.println("Main Thread i value ="+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		

	}

	

}
