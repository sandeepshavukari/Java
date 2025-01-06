package com.sandeep.Core;

import java.util.Scanner;

public class PrimeNumber {
	public String isPrime(int n) {
		if (n <= 1)
			return "Not a prime number";
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return "Not a prime number";

		}
		return "Prime number";
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		PrimeNumber p = new PrimeNumber();
		System.out.println(p.isPrime(n));
	}
}
