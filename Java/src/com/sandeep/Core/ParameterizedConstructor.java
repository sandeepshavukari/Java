package com.sandeep.Core;
class Student1{
    private String name;
    private int age;
    private int Student1Id;
    public Student1(String name,int age,int Student1Id)
    {
        this.name=name;
        this.age=age;
        this.Student1Id=Student1Id;
        System.out.println(Student1Id+"-"+name+":"+age);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student1 s= new Student1("Sandeep",21,1);
    }
}
