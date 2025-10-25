package com.exceptionhandling;

public class TryCatchFinallyDemo01 {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		System.out.println("Hello main method");

		try {
			System.out.println("in try block!!");
			System.out.println(10 / 5);
			
			String s1 = null;
			System.out.println(s1.length());
			
			String s = "Adarsh";
			System.out.println(s.length());
			
		} catch (ArithmeticException e) {
			System.out.println("in catch block AE!!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("in catch block Ex!!");
			e.printStackTrace();
		}

		System.out.println("Hello exceptions !!");
		System.out.println("Good morning guys !!");
	}

}
