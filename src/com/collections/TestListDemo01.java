package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListDemo01 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		l.add(100);
		l.add(600);
		l.add(200);
		l.add(400);
		l.add(500);
		l.add(300);
		l.add(700);

		l.add(0, 101);
		l.add(2, 321);
		
		System.out.println(l.get(3));
		l.set(8, 1000);
		l.remove(l.indexOf(400));
		System.out.println(l);
		
		
		System.out.println("--------------");

		List<Integer> l1 = new ArrayList<>();

		l1.add(10);
		l1.add(60);
		l1.add(20);
		l1.add(40);

		//l1.addAll(l);
		l1.addAll(2, l);
		
		Iterator<Integer> itr = l1.iterator();

		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
