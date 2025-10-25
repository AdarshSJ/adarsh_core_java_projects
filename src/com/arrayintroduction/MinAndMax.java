// Program to find the minimum (or maximum) element of an array

package com.arrayintroduction;

public class MinAndMax {

	public static void main(String[] args) {
		
		int[] num = {873, 6, 2, 7, 9, 35, 85, -4, -35, 32};
		
		int min =num[0];
		int max = num[0];
		
		for(int i=0; i< num.length; i++) {
			if (num[i] < min) {
				min = num[i];
//				System.out.println(min);
			}
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println(min);
		System.out.println(max);	
		

	}

}
