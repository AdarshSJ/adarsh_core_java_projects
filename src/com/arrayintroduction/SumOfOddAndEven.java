// Sum of Odd and Even Integers

package com.arrayintroduction;

public class SumOfOddAndEven {

	public static void main(String[] args) {
		int[] num = {4,1,6,9,4,3,5,2,7,8};
		
		int even = num[0];
		int odd = num[0];
		
		for (int i=0; i<num.length;i++) {
			if(i % 2 == 0) {
				even = even + i;
			}
			else {
				odd = odd + i;
			}
		}
		System.out.println(even);
		System.out.println(odd);

	}

}