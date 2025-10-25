package com.interviewproblems;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int sum = 0;
		int original = num;
		while(num!=0) {
			int rem = num%10;
			sum = sum+(rem*rem*rem);
			num = num/10;
		}
		if(original==sum) {
			System.out.println(original+" is armstrong");
		}else {
			System.out.println(original+" is not armstrong");
		}
		sc.close();
	}

}
