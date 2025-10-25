package com.patterns;

public class Pattern22 {

	public static void main(String[] args) {

		int star = 1, space = 4, cap = 1;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			for (int l = 1; l <= cap; l++) {
				System.out.print("^");
			}
			star++;
			space--;
			cap++;
			System.out.println();
		}

	}

}
