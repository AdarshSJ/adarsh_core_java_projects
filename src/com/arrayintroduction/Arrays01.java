package com.arrayintroduction;

public class Arrays01 {

	public static void main(String[] args) {
		int[] numbers = { 21, 25, 131, -95, -23, 151, 61, 87 };
		System.out.println("The total numbers of arrays present are:" + numbers.length);
		double num1 = numbers[0];
		double num2 = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < num1) {
				num1 = numbers[i];
			}
			if (numbers[i] > num2) {
				num2 = numbers[i];
			}

		}
		System.out.println("The minimum number in an array is:" + num1);
		System.out.println("The maximum number in an array is:" + num2);

		for (int i = 0; i < numbers.length; i++) {
			num1 = num1 + numbers[i];
		}
		num2 = num1 / numbers.length;
		System.out.println("The sum of an array is:" + num1);
		System.out.println("The average od an array is:" + num2);
	}

}