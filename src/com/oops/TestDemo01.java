package com.oops;

public class TestDemo01 {

	public static void main(String[] args) {


		Abstract01 t = new MyInterfaceDemoImpl2();
		Abstract01 t1 = new MyInterfaceDemoImpl3();
		
		t.method1();
		t.method2();
		t.method3();		
		
		t1.method4();
		t1.method5();
		t1.method6();
		
	}

}
