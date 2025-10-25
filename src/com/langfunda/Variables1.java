package com.langfunda;

public class Variables1 {
	
	int x =100; // Primitive + Instance Variable
	static int x1 = 200; // Primitive + Static Variable
	
	String name = "Kosmik"; // Object + Instance Variable
	static String name1 = "Adarsh"; // Object + Static Variable
	
	void method1() {
		System.out.println("Hello");
	}
	static void method2() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		
		Variables1 v = new Variables1();
		
		int x1 = 500; // Primitive + Local Variable
		String name1 = "Srikant"; //Object + Local
		
		
		
		System.out.println(x1);
		System.out.println(name1);
		
		System.out.println(Variables1.x1);
		System.out.println(Variables1.name1);
		
		System.out.println(v.x);
		System.out.println(v.name);
		v.method1();
		

	}

}
