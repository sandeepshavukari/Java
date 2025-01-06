package com.sandeep.Core;
//final-class
final class Square {
    public void details() {
        System.out.println("It's a Square");
    }
}
class Circle {
    //final-method
    final public void details() {
        System.out.println("It's a Circle");
    }
}
class CircleProperties extends Circle {
    // final variable
    final double pi = 3.14;
    public void area(int r) {
        double area = pi * r * r;
        System.out.println("Area of the circle: " + area);
    }
}
public class FinalKeyword {
    public static void main(String[] args) {
        CircleProperties obj = new CircleProperties();
        obj.details(); 
        obj.area(5); 
        Square obj2 = new Square();
        obj2.details(); 
    }
}
