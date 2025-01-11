package com.sandeep.Core;

interface Menu{
	void cheickenBiriyani();
	void butterChicken();
	void pannerTikka();
}
class Mishra implements Menu{

	@Override
	public void butterChicken() {
		System.out.println("Mishra Paneer Tikka");
	}

	@Override
	public void pannerTikka() {
		System.out.println("Mishra Paneer Tikka");
	}

	@Override
	public void cheickenBiriyani() {
		System.out.println("Mishra Chicken Biriyani");
		
	}
	
}
class Paradise implements Menu{

	@Override
	public void cheickenBiriyani() {
		System.out.println("Paradise Paneer Tikka");
		
	}

	@Override
	public void butterChicken() {
		System.out.println("Paradise Paneer Tikka");
		
	}

	@Override
	public void pannerTikka() {
		System.out.println("Paradise Chicken Biriyani");
		
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {
		Menu m= new Mishra();
		Menu p=new Paradise();
//		Menu me=new Menu(); --> it can't be done as it's interface so we cannot instantiate

	}

}
