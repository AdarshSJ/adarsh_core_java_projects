package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestListDemo02 {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		l.add("Bengaluru");
		l.add("Hyderabad");
		l.add("Chennai");
		l.add("Kochi");
		l.add("Mumbai");
		
		
		
		
		
		ListIterator<String> litr = l.listIterator();
		
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("--------");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
		
	}

}
