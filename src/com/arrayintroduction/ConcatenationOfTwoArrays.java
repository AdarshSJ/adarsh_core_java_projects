// Concatenation of two Arrays

package com.arrayintroduction;

import java.util.Arrays;

public class ConcatenationOfTwoArrays {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 6, 7, 8, 9 };
		int c = a.length + b.length;
		int[] d = new int[c];
		int pos = 0;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(c);
		System.out.println(Arrays.toString(d));
		for (int i : a) {
			d[pos] = i;
			pos++;
		}
		for (int j : b) {
			d[pos] = j;
			pos++;
		}
		System.out.println(Arrays.toString(d));

	}

}