package com.interviewproblems;

public class MissingNoInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5};
		int n = arr.length+1;
		int sum = (n*(n+1))/2;
		int missingNum = sum;
		for(int i=0; i<arr.length;i++) {
			missingNum-=arr[i];
		}
		System.out.println("Missing number from given array is: "+missingNum);
	}

}