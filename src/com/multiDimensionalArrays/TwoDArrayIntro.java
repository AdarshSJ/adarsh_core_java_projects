package com.multiDimensionalArrays;

public class TwoDArrayIntro {

	public static void main(String[] args) {

		int[][] numbers = new int[4][3];
		System.out.println(numbers.length);

		numbers[0][0] = 100;
		numbers[0][1] = 400;
		numbers[0][2] = 300;

		numbers[1][0] = 200;
		numbers[1][1] = 600;
		numbers[1][2] = 500;

		numbers[2][0] = 800;
		numbers[2][1] = 700;
		numbers[2][2] = 900;
		
		numbers[3][0] = 850;
		numbers[3][1] = 670;
		numbers[3][2] = 910;

		// Using for loop
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		// Using ForEach loop
		int[][] ages = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		for (int[] age1 : ages) {
			for (int age : age1) {
				System.out.print(age + " ");
			}
			System.out.println();
		}
	}

}