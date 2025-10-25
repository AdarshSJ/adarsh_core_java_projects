package com.patterns;

public class CharPattern33 {

	public static void main(String[] args) {

		char c = 'A';
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(c);
			}
			System.out.println();
			c++;
		}

		System.out.println("*-*-*-*");

		for (char i = 'A'; i <= 'C'; i++) {
			for (char j = 'A'; j <= 'C'; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
