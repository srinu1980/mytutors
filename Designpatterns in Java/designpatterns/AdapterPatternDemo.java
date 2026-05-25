package com.cts.designpatterns;

//Adapter Design Pattern

// Step 1: Define the target interface.
interface Target {
	void request();
}

// Step 2: Implement an adapter class.
class Adapter implements Target {
	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		adaptee.specificRequest();
	}
}

// Existing incompatible class.
class Adaptee {
	public void specificRequest() {
		System.out.println("Called specificRequest() of Adaptee.");
	}
}

// Demonstration
public class AdapterPatternDemo {
	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Target target = new Adapter(adaptee);

		target.request();
	}
}
