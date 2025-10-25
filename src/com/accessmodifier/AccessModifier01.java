package com.accessmodifier;

interface MyInterf{
	
}

public class AccessModifier01 {
	
	private static int id =18;
	private static String name = "Kohli";
	
	private int id1 = 17;
	private String name1 = "ABD";
	
	int id2 = 1;
	String name2 = "Rahul";
	
	public int id3 = 32;
	public String name3 = "Maxwell";
	
	public void method3() {
		System.out.println("Hello Method3 !!");
	}
	
	protected int id4 = 73;
	protected String name4 = "Siraj";
	
	protected void method4() {
		System.out.println("Hello Method4 !!");
	}

	//	// inner class
//	private class TestAccessModifier01 {
//
//		public static void main(String[] args) {
//			System.out.println("Hello main method fromTest Demo2 !!");
//		}
//	}
	
	// Main Method 
	public static void main(String[] args) {
		System.out.println("Hello main method Test Demo1 !!");
		
		// creating an object of my class
		AccessModifier01 a1 = new AccessModifier01();
		
		System.out.println(id);
		System.out.println(name);
		
		System.out.println(a1.id1);
		System.out.println(a1.name1);
		
		a1.method1();
		
		System.out.println(a1.id2);
		System.out.println(a1.name2);
		
		a1.method2();
		
		System.out.println(a1.id3);
		System.out.println(a1.name3);
		
		a1.method3();
		
		System.out.println(a1.id4);
		System.out.println(a1.name4);
		
		a1.method4();

	}
	
	void method2()
	{
		System.out.println("Hello Method2 !!");
	}
	private void method1() {
		System.out.println("Hello Method1 !!");
	}
	
	static {
		System.out.println("Static Block !!");
	}
	{
		System.out.println("Instance Block !!");
	}

}