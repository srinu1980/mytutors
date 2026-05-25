package com.cts.java17;

//Sealed class allowing only specific subclasses
 sealed class Vehicle permits Car, Bike 
 {
 public void start() 
 {
     System.out.println("Vehicle is starting...");
 }
}
 
//Permitted subclass
final class Car extends Vehicle {
  public void drive() {
      System.out.println("Car is driving...");
  }
}

//Permitted subclass
final class Bike extends Vehicle {
 public void ride() {
     System.out.println("Bike is riding...");
 }
}

//The following will cause a compilation error
//class Truck extends Vehicle {} // Not permitted!


public class SealedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Car();
        car.start(); //  Allowed
        ((Car) car).drive(); //  Allowed

        Vehicle bike = new Bike();
        bike.start(); //  Allowed
        ((Bike) bike).ride(); //  Allowed
	}

}
