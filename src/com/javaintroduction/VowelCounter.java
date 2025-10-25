package com.javaintroduction;

public class VowelCounter {
	    public static void main(String[] args) {
	       String s = "We are the programmers";
	       int c =0;
	       for(int i=0; i<s.length(); i++){
	           if(s.charAt(i)=='a'||s.charAt(i)=='A'
	            ||s.charAt(i)=='e'||s.charAt(i)=='E'
	            ||s.charAt(i)=='i'||s.charAt(i)=='I'
	            ||s.charAt(i)=='o'||s.charAt(i)=='O'
	            ||s.charAt(i)=='u'||s.charAt(i)=='U') 
	           c++;
	       }
	       
	       System.out.println(c);
	       
	}
}
