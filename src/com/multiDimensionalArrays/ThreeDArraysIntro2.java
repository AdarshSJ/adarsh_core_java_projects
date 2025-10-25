package com.multiDimensionalArrays;

public class ThreeDArraysIntro2 {

	public static void main(String[] args) {

		int[][][] forms = { 
				{ { 10, 20, 30 }, { 10, 20, 30 }, { 10, 20, 30 } }, 
				{ { 40, 50, 60 }, { 40, 50, 60 }, { 40, 50, 60 } },
				{ { 70, 80, 90 }, { 70, 80, 90 }, { 70, 80, 90 } } 
						};
		
		for(int form2[][]: forms) {
			for(int form1[] : form2) {
				for(int form: form1) {
					System.out.print(form +" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
