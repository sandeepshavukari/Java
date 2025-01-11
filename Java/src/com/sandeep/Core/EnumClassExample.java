package com.sandeep.Core;

enum Phone{
	Iphone(145000), Samusng(120000), OnePlus(65000), Readmi(30000), Realme(35000), Oppo(29000);
	int money;

	private Phone(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
public class EnumClassExample {

	public static void main(String[] args) {
		for(Phone p:Phone.values())
		{
			System.out.println(p+" :"+p.getMoney());
		}

	}

}
