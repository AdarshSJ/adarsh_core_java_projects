package com.interviewproblems;

import java.util.Scanner;

public class OddEvenCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int even = 0;
		int odd = 0;
		while (num != 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			num /= 10;
		}
		System.out.println("Even number count is: " + even);
		System.out.println("Odd number count is:  " + odd);
		sc.close();
	}

}
