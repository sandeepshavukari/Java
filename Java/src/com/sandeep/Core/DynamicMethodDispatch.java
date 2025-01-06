package com.sandeep.Core;
class Abc
{
    void display()
    {
        System.out.println("Inside Abc's display method");
    }
}
class Xyx extends Abc
{
    void display()
    {
        System.out.println("Inside Xyx's display method");
    }
}
class Pqr extends Abc
{
    void display()
    {
        System.out.println("Inside Pqr's display method");
    }
}
public class DynamicMethodDispatch
{
    public static void main(String args[])
    {
        Abc x = new Abc();
        Xyx y = new Xyx();
        Pqr z = new Pqr();
        Abc ref;
        ref = x;
        ref.display();
        ref = y;
        ref.display();
        ref = z;
        ref.display();
    }
}
