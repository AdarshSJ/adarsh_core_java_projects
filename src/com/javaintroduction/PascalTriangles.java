package com.javaintroduction;

public class PascalTriangles {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			int c = 1;
			for (int k = 0; k <= i; k++) {
				System.out.print(c + " ");
				c = c * (i - k) / (k + 1);
			}
			System.out.println();
		}

	}

}
