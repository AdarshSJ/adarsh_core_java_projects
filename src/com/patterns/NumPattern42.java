package com.patterns;

public class NumPattern42 {

	public static void main(String[] args) {

		int num = 1, space = 4;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= num; k++) {
				System.out.print(i);
			}
			num = num + 2;
			space--;
			System.out.println();
		}
	}

}
