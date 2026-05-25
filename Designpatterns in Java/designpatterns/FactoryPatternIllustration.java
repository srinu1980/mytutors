package com.cts.designpatterns;

//Factory Design Pattern

//Step 1: Define a common product interface.
interface Drink {
	void prepare();
}

//Step 2: Implement concrete classes of the product.
class Coffee implements Drink {
	@Override
	public void prepare() {
		System.out.println("Preparing coffee.");
	}
}

class Tea implements Drink {
	@Override
	public void prepare() {
		System.out.println("Preparing tea.");
	}
}

//Step 3: Define the factory and provide its concrete implementation.
class DrinkFactory {
	public Drink getDrink(String drinkType) {
		if (drinkType == null) {
			return null;
		}
		if (drinkType.equalsIgnoreCase("COFFEE")) {
			return new Coffee();
		} else if (drinkType.equalsIgnoreCase("TEA")) {
			return new Tea();
		}
		return null;
	}
}

//Demonstrate the Factory Design Pattern.
public class FactoryPatternIllustration {
	public static void main(String[] args) {
		DrinkFactory drinkFactory = new DrinkFactory();

		Drink drink1 = drinkFactory.getDrink("COFFEE");
		drink1.prepare();

		Drink drink2 = drinkFactory.getDrink("TEA");
		drink2.prepare();
	}
}
