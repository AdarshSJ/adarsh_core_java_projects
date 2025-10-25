package com.oops;

public interface MyInterf {
	void method1();

	int method2();

	String method3();
	
	public abstract void addition();
	
	default void method4 () {
		System.out.println("Hello Method4 !!");
	}
	
	static void method5() {
		System.out.println("Hello Method5 !!");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Main Method !!");
		method5();
	}

}