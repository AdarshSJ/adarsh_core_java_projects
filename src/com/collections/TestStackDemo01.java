package com.collections;

import java.util.Stack;

public class TestStackDemo01 {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		
		System.out.println(s.empty());
		
		if(s.empty() == true) {
			s.push(100);
			s.push(900);
			s.push(800);
			s.push(600);
			s.push(200);
			s.push(500);
			s.push(400);
		}
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search(600));

	}

}
