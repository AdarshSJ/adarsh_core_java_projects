package com.patterns;

public class CharPattern32 {

	public static void main(String[] args) {

		char c = 'A'; // Or char c = 65;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}

}
