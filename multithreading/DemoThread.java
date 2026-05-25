package com.cts.multithreading;

public class DemoThread {

	public static void main(String[] args) 
	{
	
		Thread t=new Thread();
	//	Thread t=Thread.currentThread();
		System.out.println(t);  //[Thread-name, Priority , Thread-group]
	
		t.setName("CTS");
		System.out.println("Thread Name is  :"+t.getName());
		
		t.setPriority(8);
		System.out.println("Thread Priority :"+t.getPriority());
		
	System.out.println("Is Thread is Alive :"+t.isAlive());
		
	System.out.println("Thread NORM Priory :"+t.NORM_PRIORITY);
	System.out.println("Thread MIN Priory :"+t.MIN_PRIORITY);
	System.out.println("Thread MAX Priory :"+t.MAX_PRIORITY);
	
	t.setDaemon(false);
	System.out.println("Is Daemon Thread or NOt :"+t.isDaemon());
	}
}
