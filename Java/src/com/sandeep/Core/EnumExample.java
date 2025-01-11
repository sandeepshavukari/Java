package com.sandeep.Core;

enum Week{
	Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;
}
public class EnumExample {

	public static void main(String[]args) {
		Week day=Week.Friday;
		System.out.println(day);
		for (Week today : Week.values()) {
		    System.out.println(today+" :"+ today.ordinal());
		}

	}
}
