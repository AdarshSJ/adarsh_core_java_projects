package com.constructors;

public class Constructors01 {
	int jerseyNo = 18;
	String name = "Virat";
	// Constructor is special method which does not have any return type.
	// Constructor name should be your class name only.

	// no arg constructors
	// Whenever I am Creating an object, I want to load some data then will go and
	// create no arg constructors
	Constructors01() {
		System.out.println("Hello no arg constructor !!");
		
		Constructors01 c = new Constructors01(8, "Jadeja");
		System.out.println(c.jerseyNo);
		System.out.println(c.name);
	}
	
	// Parameterized Constructors
	Constructors01(int jerseyNo, String name) {
		System.out.println("Hello  parameterized constructor !!");
		this.jerseyNo = jerseyNo;
		this.name = name;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello main method !!");

		// default constructor with an object
		Constructors01 c = new Constructors01();

		System.out.println(c.jerseyNo);
		System.out.println(c.name);

		Constructors01 c1 = new Constructors01(10, "Sachin");

		System.out.println(c1.jerseyNo);
		System.out.println(c1.name);

	}

}
