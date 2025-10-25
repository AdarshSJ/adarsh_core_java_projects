package com.arrayintroduction;

public class FindDuplicates2 {
	public static void findDuplicates(int[] arr) {
	    // Iterate through the array
	    for (int i = 0; i < arr.length; i++) {
	        // Check if the current element is a duplicate
	        boolean isDuplicate = false;
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[i] == arr[j]) {
	                isDuplicate = true;
	                break;
	            }
	        }
	        
	        // If the current element is a duplicate and hasn't been printed yet
	        if (isDuplicate) {
	            boolean hasPrinted = false;
	            for (int k = 0; k < i; k++) {
	                if (arr[i] == arr[k]) {
	                    hasPrinted = true;
	                    break;
	                }
	            }
	            if (!hasPrinted) {
	                System.out.print(arr[i] + " ");
	            }
	        }
	    }
	}

	


	public static void main(String[] args) {

		int[] arr = {2, 3, 4, 5, 6,3, 2, 3, 2, 3,3, 4};
	    findDuplicates(arr);
		
	}

}
