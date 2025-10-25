package com.oops;

public class InheritanceInterfImplDemo01 extends Inheritance03 implements InheritanceInterf03{
	public static void main(String[] args) {
	
		//Multiple Inheritance
		InheritanceInterf01 i = new InheritanceInterfImplDemo01();
		
		System.out.println(i.toString());
		System.out.println(i.hashCode());
		
		i.method1();
		i.method2();
		i.method3();
		i.method4();
//		i.method5();
//		i.method6();
	}

	@Override
	public void method2() {
		System.out.println("Hello Method2");
	}

	@Override
	public void method1() {
		System.out.println("Hello Method1");
		
	}

	@Override
	public void method3() {
		System.out.println("Hello Method3");
	}

	@Override
	public void method4() {
		System.out.println("Hello Method4");
	}

	@Override
	public void method5() {
		System.out.println("Hello Method5");
	}

	@Override
	public void method6() {
		System.out.println("Hello Method6");
	}

	
}
