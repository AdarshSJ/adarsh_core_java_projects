package com.oops;

public class Encapsulation001 {

	public static void main(String[] args) {
		Encapsulation01 e = new Encapsulation01();

		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println();

		// Read the Data
//		System.out.println(e.getEno());
//		System.out.println(e.getEname());

		// Modify the data
		e.setEno(18);
		e.setEname("Kohli");

		// Read the Data
		System.out.println(e.getEno());
		System.out.println(e.getEname());
		System.out.println();

		// Modify the data
		e.setEno(17);
		e.setEname("ABD");

		// Read the Data
		System.out.println(e.getEno());
		System.out.println(e.getEname());
		System.out.println();

		e.setEno(01);
		e.setEname("Rahul");

		System.out.println(e.getEno());
		System.out.println(e.getEname());
		System.out.println();
		
		e.setEsalary(50000);
		e.setEdept("Tech");
		
		System.out.println(e.getEsalary());
		System.out.println(e.getEdept());

	}

}