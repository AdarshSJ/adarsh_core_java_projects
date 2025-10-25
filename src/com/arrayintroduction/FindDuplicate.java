// Finding Duplicate elements from an Array 

package com.arrayintroduction;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] num = {12, 43, 11, 12, 56, 43, 65, 24, 24};
		
		for(int i=0; i<num.length; i++) {
			for(int j= i+1; j<num.length; j++) {
				if(num[i] == num[j]) {
					System.out.println(num[j]);
				}
			}
		}
		

	}

}
