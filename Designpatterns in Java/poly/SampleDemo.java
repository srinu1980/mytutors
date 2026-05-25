package com.cts.poly;

class Demo1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {

			for (int i = 1; i <= 10; i++) {
				System.out.println("run method is invoked....." + i);

				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}

public class SampleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo1 ob = new Demo1();
		Thread t = new Thread(ob);
		t.start();
		try {

			for (int i = 100; i <= 110; i++) {
				System.out.println("main thread is invoked....." + i);

				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
