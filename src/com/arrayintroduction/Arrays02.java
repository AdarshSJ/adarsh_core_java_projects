package com.arrayintroduction;

public class Arrays02 {

	public static void main(String[] args) {

		String[] names = new String[5];
		names[0] = "Adarsh";
		names[1] = "Warad";
		names[2] = "Samarth";
		names[3] = "Joshi";
		names[4] = "Akash";
		
		System.out.print("    For Loop: ");
		// for loop
		for (int i = 0; i < names.length; i++) {
			
			System.out.print(names[i] + " ");

		}

		System.out.println();
		
		System.out.print("ForEach Loop: ");
		// for each loop
		for (String name : names) {
			
			System.out.print(name + " ");
		}

		System.out.println();

		// Ends with alphabets		
		for (int i = 0; i < names.length; i++) {
			if (names[i].endsWith("h")) {
				System.out.println("Names ends with H: " + names[i]);
			}	
		}
		
		// Starts with alphabets
		for (int i = 0; i < names.length; i++) {
			if (names[i].startsWith("A")) {
				System.out.println("Names starts with A: " + names[i]);
			}
			
		}
		
		// Contains an alphabets
		for (int i = 0; i < names.length; i++) {
			if (names[i].contains("s")) {
				System.out.println("Names contains alphabet s: " + names[i]);
			}
			
		}
	}

}
