package com.interviewproblems;

public class Sorting1 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 2, 4, 1, 5, 8, 3 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length - 1; j++) {
				if (arr1[j] > arr1[j + 1]) {
					int temp = arr1[j];
					arr1[j] = arr1[j + 1];
					arr1[j + 1] = temp;
				}

			}
		}

		for (int k = 0; k < arr1.length; k++) {
			System.out.print(arr1[k] + " ");
		}
	}

}
