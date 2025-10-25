package com.oops;

// Single Inheritance
public class Inheritance02 extends Inheritance01{
	
	// Constructors
	Inheritance02(){
		System.out.println("IN Constructor Inheritance02 ");
		System.out.println(super.id);
		System.out.println(super.age);
		System.out.println(super.name);
		System.out.println(this.id);
	}
	int id = 20;

	public static void main(String[] args) {

		
		Inheritance02  t2 = new Inheritance02();
		t2.id = 18;
		t2.age = 34;
		t2.name = "Virat";
		System.out.println(t2.id);
		System.out.println(t2.age);
		System.out.println(t2.name);
		t2.method1();
		t2.method2();
		t2.method3();
	}
	
	void method3() {
		System.out.println("Hello Method3 !!");
	}

}
