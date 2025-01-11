package com.sandeep.Core;

abstract class Shape {
    abstract void draw();
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle2 extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Shape c = new Circle2();
        Triangle t = new Triangle();

        c.display();
        c.draw();

        t.display();
        t.draw();
    }
}
