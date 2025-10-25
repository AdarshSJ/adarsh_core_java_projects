package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionRetainAllDemo04 {

	public static void main(String[] args) {
		
		Collection<String> fruites = new ArrayList<>();
		fruites.add("Apple");
		fruites.add("Mango");
		fruites.add("Banana");
		fruites.add("Papaya");
		fruites.add("Gouva");
		fruites.add("Carrot");
		fruites.add("Cucumber");
		
		Collection<String> veggies = new ArrayList<>();
		veggies.add("Carrot");
		veggies.add("Cucumber");
		veggies.add("Brinjal");
		veggies.add("AshGaurd");
		veggies.add("Capsicum");
		veggies.add("Raddish");
		veggies.add("Banana");
		
		//retainAll
		veggies.retainAll(fruites);
		
		System.out.println(veggies);

	}

}
