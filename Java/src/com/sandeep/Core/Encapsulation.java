package com.sandeep.Core;
class Person{
    private int age;
    private String name;
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    
}
public class Encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
       p.setAge(25);
       p.setName("Sandeep");
        System.out.println(p.getName()+"-"+p.getAge());
    }
}
