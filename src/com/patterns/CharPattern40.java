package com.patterns;

public class CharPattern40 {

	public static void main(String[] args) {

		char c = 65;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i > j) {
					System.out.print(c);
					c++;
				} else {
					System.out.print("*");

				}
			}
			System.out.println();
		}
	}

}
