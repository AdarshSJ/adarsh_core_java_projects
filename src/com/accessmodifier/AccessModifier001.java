package com.accessmodifier;

public class AccessModifier001 {

	public static void main(String[] args) {
		
		AccessModifier01 a1 = new AccessModifier01();
		
		// default data members we can able to access outside of class !!
		System.out.println(a1.id2);
		System.out.println(a1.name2);
		a1.method2();
		
		// public data members we can able to access within the package also
		System.out.println(a1.id3);
		System.out.println(a1.name3);
		a1.method3();
		
		// protected data members we can able to access within the package also
		System.out.println(a1.id4);
		System.out.println(a1.name4);
		a1.method4();
		

	}

}