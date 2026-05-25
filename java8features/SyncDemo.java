package com.cts.java8features;


class PrintMessage {

	public  void print(String msg) 
	{
		System.out.print("[" +msg);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {


			e.printStackTrace();
		}
		
		
		System.out.println("]");
	}
	
	
}


 class PrinterThread1 extends Thread{

	private PrintMessage p;
	private String msg;
	
	public PrinterThread1(PrintMessage p, String msg) {
		
		this.p = p;
		this.msg = msg;
	}
	
	
	public void run()
	{
		synchronized (p) 
		{
			p.print(msg);
		}
		
	}
	
}

public class SyncDemo {

	public static void main(String[] args) {
		
		
		PrintMessage p=new PrintMessage();
		
	PrinterThread1  p1=new PrinterThread1(p,"Java");
	PrinterThread1  p2=new PrinterThread1(p,"Thread1");

	p1.start();
	p2.start();


	}

}
