package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestListDemo04 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(100);
		a.add(101);
		a.add(102);
		a.add(103);
		a.add(104);
		a.add(105);
		a.add(null);
		a.add(null);
		System.out.println(a);
		
		System.out.println("------------------");

		LinkedList<Integer> a1 = new LinkedList<>();
		a1.add(100);
		a1.add(101);
		a1.add(102);
		a1.add(103);
		a1.add(104);
		a1.add(105);
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
	}

}
