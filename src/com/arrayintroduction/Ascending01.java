package com.arrayintroduction;

public class Ascending01 {

	public static void main(String[] args) {
		
		int[] a1 = {1,3,5,2,4,6};
		int temp = 0;
		
		for(int i = 0; i<a1.length-1; i++) {
			for(int j=i+1; j<a1.length;j++) {
				if(a1[i]<a1[j]) {
					temp = a1[i];
					a1[i] = a1[j];
					a1[j] = temp;
				}
				
			}
			
		}
		for(int k: a1)System.out.println(k);

	}

}
