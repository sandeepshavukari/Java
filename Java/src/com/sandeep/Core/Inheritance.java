package com.sandeep.Core;
class FatherProperty{

    public void bike()
    {
        System.out.println("It is Fathers bike");
    }
} 
class SonPeropery extends FatherProperty{
    public void car()
    {
        System.out.println("It is sons Car");
    }

}
public class Inheritance {
    public static void main(String[] args) {
        SonPeropery sp=new SonPeropery();
        sp.bike();
        sp.car();
    }
}
