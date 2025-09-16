package com.tnsif.sep16;
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird {
    void eat() { System.out.println("Bird eats"); }
}

class Duck extends Bird implements Flyable, Swimmable {
    public void fly() { System.out.println("Duck flies short distances"); }
    public void swim() { System.out.println("Duck swims well"); }
}

public class HybridInheritance {

	public static void main(String[] args) {
		Duck d = new Duck();
        d.eat();   
        d.fly();   
        d.swim();  
    }
}


