package com.sandeep.Core;

public class Basics {
	public static void main(String[] args) {
		// int n=100;
		// int m=20;
		// //condition?stsement:stement;
		// System.out.println((m>n)?("m is grater"):("N is grater"));
		// int ans=(m>n)?m+n:m-n;
		// System.out.println(ans);
		// int choice='a';
		// switch (choice) {
		// case 'a':
		// System.out.println("hai");
		// break;
		// case 'b':
		// System.out.println("Hello");
		// break;
		// default:
		// System.out.println("choice not there");
		// break;
		// }

		// for(initilization;condition;incriment/decrement)
		// for(int i=1;i<=10;i++)
		// {
		// System.out.println(i);
		// }
		// while(condition)
		// {
		// //body
		// incrment/decrement
		// }
		// System.out.println("------------");
		// int i=10;
		// while(i>0)
		// {
		// System.out.println(i);
		// i-- ;
		// }
		// System.out.println("------------");

		// do-while
		// exit control
		// int j=1;
		// do{
		// System.out.println("hai");
		// j++;
		// }
		// while(j<=5);
		// }
		int ar[] = new int[10];
		int n = ar.length;
		System.out.println(n);
		for (int i = 0; i < n; i++) {
			ar[i] = i + 1;
			System.out.println(ar[i]);
		}

	}

}
