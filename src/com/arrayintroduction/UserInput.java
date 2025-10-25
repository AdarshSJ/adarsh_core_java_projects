package com.arrayintroduction;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		

		System.out.println("Please enter array size: ");
		int n = sc.nextInt();

		int[] numbers = new int[n];

		System.out.println("Please enter the elements of an array: ");
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		sc.close();
	}

}
