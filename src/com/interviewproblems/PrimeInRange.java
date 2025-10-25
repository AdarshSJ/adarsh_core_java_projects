package com.interviewproblems;

public class PrimeInRange {

	public static void main(String[] args) {
		int start =2;
		int end = 100;
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	public static boolean isPrime(int num) {
		boolean b = true;
		if(num<=1) {
			b = false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				b = false;
				break;
			}
		}
		return b;
	}

}
