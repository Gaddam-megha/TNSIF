package com.tnsif.sep16;
class Shape {
    void draw() { System.out.println("Drawing a shape"); }
}

class Circle extends Shape {
    void area() { System.out.println("Circle area = πr^2"); }
}

class Rectangle extends Shape {
    void area() { System.out.println("Rectangle area = l × b"); }
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.area();

        Rectangle r = new Rectangle();
        r.draw();
        r.area();
    }
}


