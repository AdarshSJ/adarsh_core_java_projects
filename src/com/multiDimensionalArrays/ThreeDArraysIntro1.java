package com.multiDimensionalArrays;

public class ThreeDArraysIntro1 {

	public static void main(String[] args) {
		int[][][] numbers = new int[3][3][3];
		int[][][] ages = new int[3][3][3];

		// Positions
		// 0 1 2 0 1 2 0 1 2
		// 000 001 002 100 101 102 200 201 202
		// 010 011 012 110 111 112 210 211 212
		// 020 021 022 120 121 122 220 221 222

		// Using for Loop
		numbers[0][0][0] = 100;
		numbers[1][1][1] = 200;
		numbers[2][2][2] = 300;

		System.out.println("Numbers");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				for (int k = 0; k < numbers[i][j].length; k++) {
					System.out.print(numbers[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

		System.out.println("--------------------------------------");

		// Using forEach Loop
		ages[0][0][0] = 23;
		ages[1][1][1] = 25;
		ages[2][2][2] = 24;

		System.out.println("Ages");
		for (int[][] ages2 : ages) {
			for (int[] ages1 : ages2) {
				for (int age : ages1) {
					System.out.print(age + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
