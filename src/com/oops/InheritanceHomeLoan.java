package com.oops;

public class InheritanceHomeLoan extends InheritanceLoan {

	public static void main(String[] args) {
		
		InheritanceHomeLoan h = new InheritanceHomeLoan();
		int cs = h.getCibilScore();
		double sal = h.getSalInfo();
		
		if(cs >= 600 && sal > 40000) {
			System.out.println("Congraulations you are eligible for Home Loan !!");
			System.out.println("Home Loan Rate of Interest is: " +h.getROI());
			System.out.println("Customer Address: " +h.getEmpAddressInfo());
		}
		else {
			System.out.println("Sorry for the inconvience, you are not elgibile for Home Loan!!");
		}

	}

	
}
