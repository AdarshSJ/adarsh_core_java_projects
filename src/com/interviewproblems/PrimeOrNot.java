package com.interviewproblems;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		if (isPrime(num)) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
		sc.close();
	}

	public static boolean isPrime(int num) {
		boolean b = true;
		if (num <= 1) {
			b = false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				b = false;
				break;
			}
		}
		return b;
	}

}
