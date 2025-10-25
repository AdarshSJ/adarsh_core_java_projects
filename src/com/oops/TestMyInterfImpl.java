package com.oops;

public class TestMyInterfImpl implements MyInterf {
	
	static int a = 1000;
	static int b = 2000;

	@Override
	public void method1() {
		System.out.println("Hello Method1 !!");
	}

	@Override
	public int method2() {
		System.out.println("Hello Method2 !!");
		return 100;
	}

	@Override
	public String method3() {
		System.out.println("Hello Method3 !!");
		return "Hello";
	}

	@Override
	public void addition() {
		int c = a + b;
		System.out.println("Addition:" +c +" !!");
		
	}

	

}
