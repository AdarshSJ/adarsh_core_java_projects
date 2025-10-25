package com.exceptionhandling;

import java.util.Scanner;

public class UncheckedException01 {

	//ArithmeticException
	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("in try");
			System.out.println("Enter value for a");
			int a = sc.nextInt();

			System.out.println("Enter value for b");
			int b = sc.nextInt();

			System.out.println("Division of two values:" + a / b);
			sc.close();
		} catch (ArithmeticException a) {
			System.out.println("in catch");
			a.printStackTrace();
			System.err.println("Boss b value should not be zero !!");
			System.out.println(a.getMessage());
			System.out.println(a.toString());
		}
		System.out.println("Good morning guys!!");
		System.out.println("Welcome to exception handling!!");
		System.out.println("Hello UnChecked Exception!!");
	}

}