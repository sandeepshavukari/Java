package com.sandeep.Core;
class School{
    private String name;
    public School()
    {
        System.out.println("School Default Constructor");
    }
    public School(String name)
    {
        this.name = name;
        System.out.println(name);
    }

}
class Stud extends School{
    private int StudId;
    public Stud()
    {
        System.out.println("It is Stud Default Constructor");
    }
    public Stud(int Id)
    {
        this();
        StudId = Id;
        System.out.println(StudId);
    }
}
public class ThisMethod {
    public static void main(String[] args) {
        String name="Chaitanya";
        int id=123;
        // School school = new School(name);
        Stud Stud = new Stud(id);
    }
}
