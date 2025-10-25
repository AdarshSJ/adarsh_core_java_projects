package com.arrayintroduction;

public class Array05 {

	public static void main(String[] args) {
		
		        String name = "John Doe";
		        int times = 5; // specify the number of times to print the name
		        String repeatedName = "";

		        for (int i = 0; i < times; i++) {
		            repeatedName += name + "\n";
		        }

		        System.out.println(repeatedName);
		        System.out.println("Name printed " + countName(repeatedName, name) + " times.");
		    }

		    public static int countName(String str, String name) {
		        int count = 0;
		        int index = 0;

		        while (true) {
		            index = str.indexOf(name, index);
		            if (index == -1) {
		                break;
		            }
		            count++;
		            index += name.length();
		        }

		        return count;
		    }
		}


