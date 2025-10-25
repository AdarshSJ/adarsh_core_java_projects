package com.multiDimensionalArrays;

public class TwoDArraysIntro2 {

	public static void main(String[] args) {

		int[][] numbers = new int[2][3];
//		numbers[0][0] = 1;
//		numbers[0][1] = 2;
//		numbers[0][2] = 3;
//		numbers[1][0] = 4;
//		numbers[1][1] = 5;
//		numbers[1][2] = 6;
		System.out.println("Numbers");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] num = new int[2] [];
		
		num[0] = new int[3];
		num[1] = new int[3];
		
		System.out.println("Num");
		
		for(int i=0; i<num.length;i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}

		String[][] names = new String[2][3];
		System.out.println("Names");
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.print(names[i][j] + " ");
			}
			System.out.println();
		}

	}

}
