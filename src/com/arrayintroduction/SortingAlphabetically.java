// Sorting an Array of Strings in an Alphabetical order

package com.arrayintroduction;

import java.util.Arrays;

public class SortingAlphabetically {

	public static void main(String[] args) {
		String[] names = {"Apple", "Cat", "Ball", "Ant", "Biscuit", "Carrot" };
		
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));

	}

}
