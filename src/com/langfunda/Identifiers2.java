package com.langfunda;

public class Identifiers2 {

	public static void main(String[] args) {
		
		int x = 123;
		int x1 = 1230;
		int x2 = 5678;
		int x3 = 6789;
		
		System.out.println("Below are examples of Octal and Hexadecimal Literals !!");
		
  //    Octal Literal: base8(0 to 7) starts with 0
//		0*8^3	+1*8^2	+2*8^1	+3*8^0 = 0+64+16+3 = 83		
		int x4 = 0123;
		
//		0*8^3	+5*8^2	+6*8^1	+7*8^0 = 0+320+48+7 = 375		
		int x5 = 0567;
		
//		int x6 = 0568; //The literal 0568 of type int is out of range 
		
//	Hexadecimal Literal: base16 (0 to 9 and a=10, b=11, c=12, d=13, e=14, f=15)
//		1*16^2	+2*16^1	+3*16^0 = 256+32+3 = 291
		int x7 = 0x123;
		
// 		11*8^2	+14*8^1	+14*8^0		
		int x8 = 0xbee;
		int x9 = 0xbeef;
//		int x10 = oxbeer; //oxbeer cannot be resolved to a variable
		
		System.out.println(x);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
		System.out.println(x7);
		System.out.println(x8);
		System.out.println(x9);

	}

}
