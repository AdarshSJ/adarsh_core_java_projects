package com.oops;

public class PolyOverloading {

	public static void main(String[] args) {

		System.out.println("Hello main method");
		PolyOverloading p = new PolyOverloading();
		p.addition();
		p.addition(200);
		p.addition(250, 150);
		p.addition(123.45f);
		p.addition(600.3f, 750.7f);
		p.addition(200, 700.50f);
	}
	
	void addition() {
		
		int a = 100;
		int b = 200;
		int c = a + b;
		System.out.println("no args method!!" +c);
	}
	
	void addition(int a) {
		int b = 200;
		int sum = a + b;
		System.out.println("int args method!!" +sum);
	}
	
	void addition(int a, int b) {
		int sum = a + b;
		System.out.println("int, int args method!!" +sum);
	}
	
	void addition(float a) {
		float b = 200.55f;
		float sum = a + b;
		System.out.println("float args method!!" +sum);
	}
	
	void addition(float a, float b) {
		float sum = a + b;
		System.out.println("float, float args method!!" +sum);
	}

	void addition(int a, float b) {
		float sum = a + b;
		System.out.println("int, float args method!!" +sum);
	}
}
