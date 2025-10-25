package com.oops;

public class Inheritance01 {
	int id = 8;
	int age = 32;
	String name = "Jadeja";
	
	Inheritance01(){
		System.out.println("IN Constructor Inheritance01");
	}

	public static void main(String[] args) {
		Inheritance01 i = new Inheritance01();
		i.id = 45;
		i.age = 35;
		i.name = "Rohit Sharma";
		
		System.out.println(i.id);
		System.out.println(i.age);
		System.out.println(i.name);

		
	}
	void method1() {
		System.out.println("Hello Method1 !!");
	}
	
	void method2() {
		System.out.println("Hello Method2 !!");
	}

}
