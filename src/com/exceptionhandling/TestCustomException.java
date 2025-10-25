package com.exceptionhandling;

import java.util.Scanner;

public class TestCustomException {
	
	public static void main(String[] args) throws AdarshException {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Can you please enter your age: ");
		
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("Congratulations!! You are eligible for voting and Driving");
		} else {
			throw new AdarshException("We are not allowing age under 18");
		}
		
		
		System.out.println("Main Method Ended!!");
		
	}

}