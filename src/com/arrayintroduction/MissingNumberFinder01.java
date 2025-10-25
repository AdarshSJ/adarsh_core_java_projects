package com.arrayintroduction;

public class MissingNumberFinder01 {

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // since one number is missing, the length of the full array should be len(arr) + 1
        int totalSum = n * (n + 1) / 2; // sum of the first n natural numbers
        int arraySum = 0;
        
        for (int num : arr) {
            arraySum += num;
        }
        
        return totalSum - arraySum; // the missing number
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // 3 is missing in this array
        System.out.println("The missing number is: " + findMissingNumber(arr));
    }
}


