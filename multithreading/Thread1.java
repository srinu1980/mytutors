package com.cts.multithreading;

public class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread is Running......");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 ob=new Thread1();
		ob.start();
	
	}

}
