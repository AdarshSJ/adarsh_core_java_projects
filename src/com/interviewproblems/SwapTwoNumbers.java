package com.interviewproblems;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp =0;
		
		System.out.println("Before swaping:");
		System.out.println(a);
		System.out.println(b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swaping:");
		System.out.println(a);
		System.out.println(b);

	}

}
