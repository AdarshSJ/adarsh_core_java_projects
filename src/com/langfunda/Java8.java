package com.langfunda;

@FunctionalInterface
interface TestA{
	
	int method1(int age);
}
public class Java8 {

	public static void main(String[] args) {
		
		TestA s = (s1)-> {
			System.out.println("Hello");
			return s1*s1;
		};
		System.out.println(s.method1(23));

	}

}
