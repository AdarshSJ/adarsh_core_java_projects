package com.exceptionhandling;

public class UncheckedException03 {

	//ArrayIndexOutOfBoundsException
	public static void main(String[] args) {

		int[] numbers = {};
		try {
			numbers = new int[5];

			numbers[0] = 100;
			numbers[1] = 200;
			numbers[2] = 300;
			numbers[3] = 400;
			numbers[4] = 500;
			numbers[5] = 600;
		} catch (Exception a) {
			a.printStackTrace();
		}

		for (int number : numbers) {
			System.out.println(number);
		}
	}

}