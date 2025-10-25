// Sum and Average of an Array

package com.arrayintroduction;

public class SumAndAverage {
	public static void main(String[] args) {
	
		int[] numbers = {131, 26, 31, 74, 50, 64};
		
		double sum = 0;
		double avg = 0;
		
		for(int i=0; i<numbers.length; i++) {
			sum = sum + numbers[i];
			
		}
		avg = sum / numbers.length;
		System.out.println(sum);
		System.out.println(avg);
		
	}
}
