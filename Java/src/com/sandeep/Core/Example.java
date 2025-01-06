package com.sandeep.Core;
class Student{
    private String name;
    private int age;
    private int grade;
    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade=grade;
    }
    void show()
    {
        System.out.println(name+" "+age+" "+grade);
    }
}
public class Example {
    public static void main(String[] args) {
        Student s = new Student("Sandeep", 20, 90);
        s.show();
    }
}
