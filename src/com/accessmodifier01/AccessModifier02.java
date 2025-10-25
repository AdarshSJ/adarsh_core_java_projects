package com.accessmodifier01;

import com.accessmodifier.AccessModifier01;

public class AccessModifier02 extends AccessModifier01 {

	public static void main(String[] args) {
		AccessModifier01 a1 = new AccessModifier01();

		// default data members we cannot able to access outside of the package
//		System.out.println(a1.id2);
//		System.out.println(a1.name2);
//		a1.method2();

		System.out.println(a1.id3);
		System.out.println(a1.name3);
		a1.method3();

//	Even though we are in a child class, we cannot able to access protected data 
//		by using parent reference variable 
//		System.out.println(a1.id4);
//		System.out.println(a1.name4);
//		a1.method4();

// By using child reference we can able to call parent class protected data		
		AccessModifier02 a3 = new AccessModifier02();
		System.out.println(a3.id4);
		System.out.println(a3.name4);
		a3.method4();

	}

}
