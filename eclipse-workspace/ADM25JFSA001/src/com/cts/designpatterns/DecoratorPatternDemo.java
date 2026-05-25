package com.cts.designpatterns;

//Step 1: Define the component interface
interface Beverage {
	String getDescription();

	double cost();
}

//Step 2: Implement concrete components
class Espresso implements Beverage {
	public String getDescription() {
		return "Espresso";
	}

	public double cost() {
		return 1.99;
	}
}

//Step 3: Create abstract decorator class
abstract class BeverageDecorator implements Beverage {
	protected Beverage beverage;
}

//Step 4: Implement concrete decorators
class Milk extends BeverageDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return beverage.cost() + 0.30;
	}
}

class Sugar extends BeverageDecorator {
	public Sugar(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Sugar";
	}

	public double cost() {
		return beverage.cost() + 0.10;
	}
}

//Step 5: Demonstrate the Decorator Pattern
public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() + " $" + espresso.cost());

		Beverage espressoWithMilk = new Milk(espresso);
		System.out.println(espressoWithMilk.getDescription() + " $" + espressoWithMilk.cost());

		Beverage espressoWithMilkSugar = new Sugar(espressoWithMilk);
		System.out.println(espressoWithMilkSugar.getDescription() + " $" + espressoWithMilkSugar.cost());
	}
}
