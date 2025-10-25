package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollectionDemo03 {

	public static void main(String[] args) {

		Collection<Integer> c = new ArrayList<>();
		c.add(100);
		c.add(200);
		c.add(300);
		c.add(400);
		c.add(500);
		c.add(600);
		c.add(900);

		System.out.println(c);
		
		System.out.println("---");
		
		System.out.println("Without Using Iterator");
		Object[] c1 = c.toArray();
		for(Object c2:c1) {
			System.out.println(c2);
		}
		
		System.out.println("---");

		// iterator()
		System.out.println("Using Iterator");
		Iterator<Integer> itr = c.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
