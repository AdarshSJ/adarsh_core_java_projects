package com.exceptionhandling;

public class TryCatchFinallyDemo02 {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		System.out.println("In main method!!");
		
		try {
			System.out.println("in try block !!");
			String s = "Sri";
			System.out.println(s.length());
			
			System.out.println(10/0);
			System.out.println("Hello guys!! Good Morning!!");
			
			String s1 = null;
			System.out.println(s1.lastIndexOf('n'));
			System.out.println("Hello Guys!! Welcome to Try catch Combination");
		} catch (NullPointerException e) {
			System.out.println("In catch block of NP !!");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("In catch block of AE !!");
			e.printStackTrace();	
		}
		
		System.out.println("Main Method Ended!!");
	}

}
