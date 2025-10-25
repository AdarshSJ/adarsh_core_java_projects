package com.exceptionhandling;

import java.util.Scanner;

public class TryFinallyDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(s);

		try {
			System.out.println("In try block !!");
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("In catch !!");
			e.printStackTrace();
			System.out.println(e.toString());
		} finally {
			sc.close();
			System.out.println("In finally block !!");
		}
		
		System.out.println("Main method ended !!");
	}

}
