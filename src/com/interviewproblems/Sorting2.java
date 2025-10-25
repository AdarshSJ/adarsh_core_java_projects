package com.interviewproblems;

public class Sorting2 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 1, 1, 5, 2, 4, 1, 5, 8, 3 };

		for (int i = 0; i < arr1.length; i++) {
			int count = 0;
			for (int j = 0; j < arr1.length; j++) {
				if(arr1[i]==arr1[j]) {
					count++;
				}

			}
			if(count==1) {
				System.out.print(arr1[i]+" ");
			}
		}

		
	}

}
