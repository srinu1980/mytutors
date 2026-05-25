package com.cts;

/*
class Demo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method is invoked...");
	}

}
*/
public class LambdaExpressionDemo {

	public static void main(String[] args) {

		/*
		 * Demo ob = new Demo(); Thread t = new Thread(ob); t.start();
		 * 
		 */

		Runnable r = () -> System.out.println("run method is invoked....");

		Thread t = new Thread(r);
		t.start();
	}

}
