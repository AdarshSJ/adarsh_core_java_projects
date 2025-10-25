package com.interviewproblems;

public class PalindromeString {

	public static void main(String[] args) {
		String a = "DaD";
		String rev = "";
		String org = a;
		for(int i=a.length()-1;i>=0;i--) {
			rev+=a.charAt(i);
		}
		if(org.equalsIgnoreCase(rev)) {
			System.out.println(org+" is palindrome");
		} else {
			System.out.println(org+" is not palindrome");
		}
	}

}