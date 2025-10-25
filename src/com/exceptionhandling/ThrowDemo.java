package com.exceptionhandling;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a value: ");
		int a = sc.nextInt();

		System.out.println("Enter b value: ");
		int b = sc.nextInt();

		sc.close();
		if (b != 0) {
			System.out.println(a / b);

		} else {
			throw new ArithmeticException("b should not be zero");
		}
		
	}

}
