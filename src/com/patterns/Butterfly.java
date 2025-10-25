package com.patterns;

public class Butterfly {
	public static void main(String[] args) {
		int n = 6;
		for (int i = 1; i <= n; i++) { // outer loop for upper half
			for (int j = 1; j <= i; j++) { // inner loop for left stars
				System.out.print("*");
			}
			for (int j = 1; j <= 2 * (n - i); j++) { // inner loop for spaces
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) { // inner loop for right stars
				System.out.print("*");
			}
			System.out.println(); // move to next line
		}

		for (int i = n; i >= 1; i--) { // outer loop for lower half
			for (int j = 1; j <= i; j++) { // inner loop for left stars
				System.out.print("*");
			}
			for (int j = 1; j <= 2 * (n - i); j++) { // inner loop for spaces
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) { // inner loop for right stars
				System.out.print("*");
			}
			System.out.println(); // move to next line
		}

	}
}
