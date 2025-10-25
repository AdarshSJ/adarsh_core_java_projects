package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class TestCollectionDemo02 {

	public static void main(String[] args) {

		Collection<String> c = new ArrayList<>();

		c.add("BMW");
		c.add("Benz");
		c.add("RangeRover");
		c.add("Tata");
		c.add("Alto");
		c.add("Suzuki");
		c.add("Porch");
		c.add("Aston Martin");
		c.add("Supra");
		c.add("Lambo");

		Collection<String> c1 = new ArrayList<>();
		c1.add("Porch");
		c1.add("Aston Martin");
		c1.add("Supra");
		c1.add("Lambo");
		
		Collection<String> c2 = new ArrayList<>();
		c2.add("Thar");
		c2.add("i10");
		c2.add("Supra");
		c2.add("Lambo");
		
		if(c2.isEmpty()) {
			System.out.println("This Collection is empty!! add some elements!!");
		} else {
			c2.remove("i10");
			c2.add("i20");
			System.out.println(c2);
		}
		
		c2.removeAll(c1);
		System.out.println(c2);

		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
		
		System.out.println(c.containsAll(c1));
		
		System.out.println(c.equals(c1));

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car name: ");
		String name = sc.next();

		if (c.contains(name)) {
			System.out.println("This Car is available in he collection");
		} else {
			System.out.println("This Car not is available in he collection");
		}
		sc.close();

		if (c.contains("Benz")) {
			System.out.println("This Car is available in he collection");
		} else {
			System.out.println("This Car not is available in he collection");
		}

		System.out.println(c.contains("BMW"));

	}

}
