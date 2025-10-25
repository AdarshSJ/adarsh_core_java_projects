package com.collections;

import java.util.Enumeration;
import java.util.Vector;

public class TestVectorDemo01 {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();

		v.addElement(100);
		v.addElement(200);
		v.addElement(300);
		v.addElement(400);
		v.addElement(600);
		v.addElement(500);
		
		Enumeration<Integer> e1 = v.elements();
		
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
		
		System.out.println(v);;
	}

}
