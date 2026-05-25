package com.cts.designpatterns;

//Builder Design Pattern

//Step 1: Create the product class.
class Car {
	private String engine;
	private String wheels;
	private String color;

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public void setWheels(String wheels) {
		this.wheels = wheels;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", wheels=" + wheels + ", color=" + color + "]";
	}

}

//Step 2: Create the builder interface.
interface CarBuilder {
	void buildEngine();

	void buildWheels();

	void buildColor();

	Car getCar();
}

//Step 3: Implement the builder.
class SportsCarBuilder implements CarBuilder {
	private Car car = new Car();

	@Override
	public void buildEngine() {
		car.setEngine("Sports Engine");
	}

	@Override
	public void buildWheels() {
		car.setWheels("Racing Wheels");
	}

	@Override
	public void buildColor() {
		car.setColor("Red");
	}

	@Override
	public Car getCar() {
		return car;
	}
}

//Step 4: Define a director class.
class CarDirector {
	private CarBuilder builder;

	public CarDirector(CarBuilder builder) {
		this.builder = builder;
	}

	public Car construct() {
		builder.buildEngine();
		builder.buildWheels();
		builder.buildColor();
		return builder.getCar();
	}
}

//Demonstration
public class BuilderPatternDemo {
	public static void main(String[] args) {
		CarBuilder sportsCarBuilder = new SportsCarBuilder();
		CarDirector director = new CarDirector(sportsCarBuilder);

		Car car = director.construct();
		System.out.println(car);
	}
}
