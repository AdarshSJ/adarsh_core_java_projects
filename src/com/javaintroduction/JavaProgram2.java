package com.javaintroduction;

public class JavaProgram2 {

	// instance data variable
	int id;
	String name;
	char gender;

	// static data variable
	static int collegeId;
	static String collegeName;

	public static void main(String[] args) {
		System.out.println("Hello main method");
		System.out.println(collegeId);
		System.out.println(collegeName);
		// calling the static method
		method2();
		
		JavaProgram2 j = new JavaProgram2();
		System.out.println(j.id);
		System.out.println(j.name);
		System.out.println(j.gender);
		j.method1();
		
	}

	// static method
	static void method2() {
		System.out.println("Hello Method 2 !!");
	}

	// instance method

	void method1() {
		System.out.println("Hello Method 1 !!");

	}

	// static block
	static {
		System.out.println("Hello Static Block !!");

	}
	// instance block
	{
		System.out.println("Instance Block");
	}

}
