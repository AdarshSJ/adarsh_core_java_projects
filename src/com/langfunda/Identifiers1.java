package com.langfunda;

// Identifiers is nothing but a 
//    	Project name, package name, class name, method name and variables name
// Identifiers rules
// 1) Identifiers can contains A-Z or a-z
// 2) Identifiers should not start with numbers
// 3) Identifiers should not contain special characters except $ and _
// 4) We can also starts with $ and _
// 5) Identifiers should not be Java Keyword


public class Identifiers1 {
	
	int id$ = 100;
	String name = "AdarshJ";
	
	static void method_1() {
		System.out.println("Hello Method1 !!");
	}
	
	static void method_2() {
		System.out.println("Hello Method2 !!");
	}

	public static void main(String[] args) {
		
		Identifiers1 i = new Identifiers1();
		System.out.println("Hello Main Method !! ");
		System.out.println(i.id$);
		System.out.println(i.name);
		
		method_1();
		method_2();
		

	}

}