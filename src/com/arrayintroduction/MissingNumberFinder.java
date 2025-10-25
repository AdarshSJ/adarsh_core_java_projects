package com.arrayintroduction;



	public class MissingNumberFinder {

	    public static int findMissingNumber(int[] arr) {
	        int minNum = Integer.MAX_VALUE;
	        int maxNum = Integer.MIN_VALUE;
	        int arraySum = 0;
	        
	        // Find the minimum, max, and sum of the array
	        for (int num : arr) {
	            if (num < minNum) {
	                minNum = num;
	            }
	            if (num > maxNum) {
	                maxNum = num;
	            }
	            arraySum += num;
	        }
	        
	        // Calculate the expected sum of the range from minNum to maxNum
	        int totalSum = (maxNum * (maxNum + 1) / 2) - ((minNum - 1) * minNum / 2);
	        
	        return totalSum - arraySum; // the missing number
	    }

	    public static void main(String[] args) {
	        int[] arr = {7, 8, 9, 10, 12}; // 11 is missing in this array
	        System.out.println("The missing number is: " + findMissingNumber(arr));
	    }
	}


