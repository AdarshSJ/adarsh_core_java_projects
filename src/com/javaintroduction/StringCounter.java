package com.javaintroduction;

public class StringCounter {

	    public static void main(String[] args) {
	       String s = "zabcdabceabcfaeiouabc";
	       String t = "abc";
	       int c =0;
	       for(int i=0; i<s.length()-t.length()+1; i++){
	           String q = s.substring(i, i+t.length());
	           if(q.equals(t))
	           c++;
	       }
	       
	       System.out.println(c);
	       
	       	       
	    
	}
}
