package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCollectionRetainAllDemo02 {
	
	    public static void main(String[] args) {
	        List<String> list1 = new ArrayList<>();
	        list1.add("Java");
	        list1.add("Python");
	        list1.add("C++");

	        List<String> list2 = new ArrayList<>();
	        list2.add("Java");
	        list2.add("Ruby");
	        list2.add("JavaScript");

	        boolean isJavaPresent = false;

	        // Use Iterator to check if "Java" is present in both lists
	        Iterator<String> iter1 = list1.iterator();
	        Iterator<String> iter2 = list2.iterator();

	        while (iter1.hasNext()) {
	            String element = iter1.next();
	            if (element.equals("Java") && iter2.hasNext()) {
	                while (iter2.hasNext()) {
	                    if (iter2.next().equals("Java")) {
	                        isJavaPresent = true;
	                        break;
	                    }
	                }
	                if (isJavaPresent) {
	                    break;
	                }
	            }
	        }

	        if (isJavaPresent) {
	            System.out.println("Java");
	        } else {
	            System.out.println("No");
	        }
	    }
	}


