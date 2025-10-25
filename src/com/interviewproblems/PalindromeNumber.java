package com.interviewproblems;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num = 12321;
		int reversed = 0;
		int original = num;
		
		while(num!=0) {
			int remainder = num%10;
			reversed = reversed*10+remainder;
			num/=10;
		}
		
		if(original == reversed) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is not Palindrome");
		}

	}

}
