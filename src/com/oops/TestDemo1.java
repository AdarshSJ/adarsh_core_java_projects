package com.oops;

public class TestDemo1 {

	public static void main(String[] args) {
//		TestMyInterfLmpl t = new TestMyInterfLmpl();
		MyInterf t = new TestMyInterfImpl();
		t.method1();
		t.method2();
		t.method3();
		t.method4();
		t.addition();

	}

}
