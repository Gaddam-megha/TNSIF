package com.tnsif.sep16;

class Vehicle {
    void start() { System.out.println("Vehicle starts"); }
}

class Car extends Vehicle {
    void drive() { System.out.println("Car drives"); }
}

class ElectricCar extends Car {
    void charge() { System.out.println("Electric car charging"); }
}

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
	        ElectricCar tesla = new ElectricCar();
	        tesla.start();   
	        tesla.drive();   
	        tesla.charge();  
	    
	}

}
