package com.sandeep.Core;
class Ab{
    public Ab(int a)
    {
        System.out.println("Inside Def parametarized constructor");
    }
    public Ab()
    {
        System.out.println("Inside the Ab Default Constructor");
    }
}
class Def extends Ab{
    public Def(int a)
    {
        super(5);
        System.out.println("Inside Def parametarized constructor");
    }
    public Def()
    {
        System.out.println("Inside the Def Default Constructor");
    }
}
public class SuperMethod {
    public static void main(String[] args) {
        // Def obj= new Def();
        Def obj1= new Def(1);
    }
}