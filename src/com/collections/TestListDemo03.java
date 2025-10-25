package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo03 {

	public static void main(String[] args) {

		List<Double> l = new ArrayList<>();
		l.add(100.00);
		l.add(400.00);
		l.add(200.00);
		l.add(300.00);
		l.add(200.00);
		l.add(200.00);
		
		l.add(2, 800.00);
		l.add(5, 500.00);
		l.add(8, 900.00);
		System.out.println(l.size());
		
		System.out.println(l);
		
		System.out.println(l.indexOf(200.00));
		System.out.println(l.lastIndexOf(200.00));
		
		l.remove(200.00);
		System.out.println(l);
	}

}
