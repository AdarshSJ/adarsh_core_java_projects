package com.collections;

import java.util.HashMap;
import java.util.Map;

public class TestCollectionMap01 {

	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "Adarsh");
		m.put(2, "Adarsh");
		m.put(1, "--");
		m.put(3, "Gopi");
		m.put(2, ";;");
		m.put(3, "shravani");
		m.put(2, "jaya");
		m.put(1, "Gopi");
		
		System.out.println(m);
	}

}
