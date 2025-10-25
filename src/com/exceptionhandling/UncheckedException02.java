package com.exceptionhandling;

public class UncheckedException02 {

	//NullPointerException
	@SuppressWarnings("null")
	public static void main(String[] args) {

		String s = "Java";
		System.out.println(s.length());
		
		try {
		String s2 = null;
		//System.out.println(s2.length());
		

		String s1 = "null";

		if (s2.equalsIgnoreCase(s1)) {
			System.out.println("Both strings are same!!");
		} else {
			System.out.println("Both strings are not same!!");
		}
		} catch(Exception a) {
			a.printStackTrace();
			System.out.println(a.toString());
		}
		System.out.println("Ended");
		
		
	}

}
