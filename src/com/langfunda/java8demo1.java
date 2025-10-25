package com.langfunda;

public class java8demo1  {

	public static void main(String[] args) {
		
		
		Runnable r = ()->{
			for(int i=0; i<=15;i++) {
				System.out.println(i);
			}
		};
		r.getClass();
	}

}
