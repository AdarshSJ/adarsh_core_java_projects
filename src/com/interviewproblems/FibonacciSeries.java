package com.interviewproblems;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n =10;
		int[] fibSeries = new int[1000];
		
		fibSeries[0] = 0;
		fibSeries[1] = 1;
		
		for(int i = 2; i<n; i++) {
			fibSeries[i] = fibSeries[i-1]+fibSeries[i-2];
		}
		for(int i=0; i<n; i++) {
			System.out.print(fibSeries[i] +" ");
		}

	}

}
