package com.cts.multithreading;

public class ThreadDemo2 extends Thread
{	
public ThreadDemo2()
	{
		System.out.println("Child Thread Constructor....");
		start();
	}
	public void run()
	{
		System.out.println("Running Child Thread ....");
		for(int i=0;i<10;i++)
		{	System.out.println("Child  i value ="+i);
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		}
	public static void main(String[] args) throws InterruptedException 
	{
		ThreadDemo2  ob=new ThreadDemo2();
		
System.out.println("Running Main Thread ....");

		for(int i=0;i<10;i++)
		{
			System.out.println("Main  i value ="+i);
			Thread.sleep(500);

		}
	}

}
