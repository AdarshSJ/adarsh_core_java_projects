package com.javaintroduction;

import java.util.ArrayList;
import java.util.List;

public class Streams {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student(1, "guna", 30000);
		Student s2 = new Student(2, "muni", 4000);
		Student s3 = new Student(3, "Bhuvan", 20000);
		Student s4 = new Student(4, "sudhakar", 30000);
		Student s5 = new Student(5, "dhoni", 300000);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
//		List<Student> collect = list.stream().filter(a->a.getFee()>=30000 && a.getName().startsWith("g")).collect(Collectors.toList());
//		System.out.println(collect);
//		System.out.println("working");
		list.stream().map(a -> a.getId() + "").forEach(System.out::println);

	}

}
