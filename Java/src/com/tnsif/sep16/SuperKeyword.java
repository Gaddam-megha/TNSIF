package com.tnsif.sep16;
class Parent {
    void display() {
        System.out.println("Hello from Parent class");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Hello from Child class");
        super.display();  // calls the Parent class method
    }
}

public class SuperKeyword {
	public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }

}
