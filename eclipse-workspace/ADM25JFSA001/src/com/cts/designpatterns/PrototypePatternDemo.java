package com.cts.designpatterns;

//Prototype Design Pattern

// Step 1: Create a prototype interface.
interface Prototype {
	Prototype clone();
}

// Step 2: Implement the prototype interface in concrete class.
class ConcretePrototype implements Prototype {
	private String attribute;

	public ConcretePrototype(String attribute) {
		this.attribute = attribute;
	}

	public String getAttribute() {
		return attribute;
	}

	@Override
	public Prototype clone() {
		return new ConcretePrototype(this.attribute);
	}

	@Override
	public String toString() {
		return "Attribute: " + attribute;
	}
}

// Demonstration
public class PrototypePatternDemo {
	public static void main(String[] args) {
		ConcretePrototype original = new ConcretePrototype("Initial Value");
		ConcretePrototype cloned = (ConcretePrototype) original.clone();

		System.out.println("Original Object: " + original);
		System.out.println("Cloned Object: " + cloned);
	}
}
