package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo01 {

	public static void main(String[] args) {

		Collection<Object> c = new ArrayList<>();
		c.add(199);
		c.add(190);
		c.add(191);
		c.add(192);
		c.add(193);
		c.add(194);
		c.add(195);
		c.add(196);
		c.add(197);
		c.add(198);
		c.add(199);
		c.add(200);
		c.add(null);
		c.add("Adarsh");
		c.add("Adarsh1");
		c.add("Adarsh2");
		
		System.out.println(c);
		
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(1000);
		c1.add(2000);
		c1.add(3000);
		c1.add(4000);
		c1.add(5000);
		
//		c1.clear();
		c.addAll(c1);
		System.out.println(c1);
		System.out.println(c);
	}
}