package com.interviewproblems;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 54321;

		int reversed = 0;

		while (num != 0) {
			int remainder = num % 10;
			reversed = reversed * 10 + remainder;
			num /= 10;
		}
		System.out.println("Reversed Number: " + reversed);

	}

}
