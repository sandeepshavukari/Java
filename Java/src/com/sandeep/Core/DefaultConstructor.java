package com.sandeep.Core;

class Human {
	private int age;
	private String name;

	public Human() {
		age = 12;
		name = "Sandeep";
		System.out.println(name + "-" + age);
	}
}

public class DefaultConstructor {
	public static void main(String[] args) {
		Human obj = new Human();
	}
}
