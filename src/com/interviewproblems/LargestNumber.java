package com.interviewproblems;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value1: ");
		int value1 = sc.nextInt();

		System.out.println("Enter a value2: ");
		int value2 = sc.nextInt();

		System.out.println("Enter a value3: ");
		int value3 = sc.nextInt();

		int max = value1;

		if (value2 > max) {
			max = value2;
		}

		if (value3 > max) {
			max = value3;
		}
		System.out.println("Largest number is: " + max);
		sc.close();
	}

}
