package com.oops;

public class Poly02 extends Poly01{

	public static void main(String[] args) {

		System.out.println("Hello main method from Poly01");
		
		//Poly02 p = new Poly02();
		int totalAmount = addition(10000, 50);
		System.out.println(totalAmount);
	}
	
	//Method hiding
	public static int addition(int i, int j) {
		int bonus = 10000;
		int total = i + j + bonus;
		return total;
		
	}

}
