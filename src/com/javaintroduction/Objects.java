package com.javaintroduction;

public class Objects {
	private int id;
	private int age;
	private String name;
	private static String instituteName;
	private static int joinId;
	private static String studentName;

	public Objects(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}
	

	public void vcube() {
		System.out.println("Welcome to Vcube course.");
	}

	public static void  java() {
		instituteName = "Vcube";
		joinId = 32;
		studentName = "naveen";
		System.out.println("Students joined Java at institute: " + instituteName);
		System.out.println("Join ID: " + joinId);
		System.out.println("Student name: " + studentName);
		System.out.println("Java student data complete.");
		return;
	}

	public static void python() {
		instituteName = "Vcube";
		joinId = 33;
		studentName = "sasi";
		System.out.println("Students joined Python at institute: " + instituteName);
		System.out.println("Join ID: " + joinId);
		System.out.println("Student name: " + studentName);
		System.out.println("Python student data complete.");
		return;
	}

	public static void testing() {
		instituteName = "Vcube";
		joinId = 34;
		studentName = "vasanth";
		System.out.println("Students joined Testing at institute: " + instituteName);
		System.out.println("Join ID: " + joinId);
		System.out.println("Student name: " + studentName);
		System.out.println("Testing student data complete.");
	}

	public static void devops() {
		instituteName = "Vcube";
		joinId = 35;
		studentName = "siva";
		System.out.println("Students joined Devops at institute: " + instituteName);
		System.out.println("Join ID: " + joinId);
		System.out.println("Student name: " + studentName);
		System.out.println("Devops student data complete.");
		return;
	}

public static void main(String[] args) {
        Objects obj = new Objects(1, 22, "naveen");
        obj.vcube();
        System.out.println("Calling static methods:");
        java();
        python();
        testing();
        devops();
        System.out.println(obj.id);
        System.out.println(obj.age);
        System.out.println(obj.name);
}
}
