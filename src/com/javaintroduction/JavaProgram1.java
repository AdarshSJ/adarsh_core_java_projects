package com.javaintroduction;

public class JavaProgram1 {

	int a = 100;
	String name = "Samarth";

	static int id = 6;
	static String CollegeName = "PDA";

	public static void main(String[] args) {
		System.out.println("Welcome to My JAVA World:)");
		
		hello();
		
		JavaProgram1 h = new JavaProgram1();
		
		h.hi();
		
		System.out.println(id);
		System.out.println(CollegeName);
		
		System.out.println(h.a);
		System.out.println(h.name);

	}

	static void hello() {
		System.out.println("Hello Method!!");
	}

	void hi() {
		System.out.println("Hi MethodS!!");
	}

	static {
		System.out.println("Have a Good Day:)");
	}

}
