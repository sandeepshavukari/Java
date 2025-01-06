package com.sandeep.Core;

import java.util.Scanner;

public class PerfectNumber {
	public String isPerfect(int n) {
		String msg;
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;

			}
		}
		if (sum == n)
			msg = "Perfect Number";
		else
			msg = "Not a Perfect Number";
		return msg;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		PerfectNumber p = new PerfectNumber();
		System.out.println(p.isPerfect(n));
	}
}
