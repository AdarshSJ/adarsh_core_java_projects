package com.langfunda;

public class ElseIf {
	public static void main(String[] args) {
	int age = 18;

//	if (time < 10) {
//	    System.out.println("Good morning.");
//	} else if (time < 18) {
//	    System.out.println("Good day.");
//	} else {
//	    System.out.println("Good evening.");
//	}
	
	if(age<=12) {
		System.out.println("Child");
	} else if(age<=19 && age>12) {
		System.out.println("Teen age");
	} else if(age<=40&&age>19) {
		System.out.println("Millineal");
	} else {
		System.out.println("Old age");
	}

}
}