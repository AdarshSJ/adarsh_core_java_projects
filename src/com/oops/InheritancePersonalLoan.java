package com.oops;

public class InheritancePersonalLoan extends InheritanceLoan {

	public static void main(String[] args) {
		System.out.println("Hello Main Method from Personal Loan!!");

		//Storing Parent Object into child reference is not possible
//		InheritancePersonalLoan p1 = new InheritancelLoan();
		
		
		// Creating an object of child and storing it into a parent is possible
		// By using child Object and Parent reference we call only Parent class
		InheritanceLoan l1 = new InheritancePersonalLoan();
		l1.getCibilScore();
		l1.getEmpAddressInfo();
		l1.getROI();
		l1.getSalInfo();

		// By using parent object and parent reference we can only call the Parent data
		// members
		InheritanceLoan l = new InheritanceLoan();
		l.getCibilScore();
		l.getEmpAddressInfo();
		l.getROI();
		l.getSalInfo();

		// By Using Child Object and Child Reference We can call both parent class data
		// members as well as child class data members
		InheritancePersonalLoan p = new InheritancePersonalLoan();

		int cs = p.getCibilScore();
		double sal = p.getSalInfo();
		p.method1();
		p.getPersonalLoanInfo();

		if (cs >= 700 && sal > 700000) {
			System.out.println("Congraulations you are eligible for Personal Loan !!");
			System.out.println("Personal Loan Rate of Interest is: " + p.getROI());
			System.out.println("Customer Address: " + p.getEmpAddressInfo());
		} else {
			System.out.println("Sorry for the inconvience, you are not elgibile for Personal Loan!!");
		}

	}

	void getPersonalLoanInfo() {
		System.out.println("Hello Personal Loan Info !!");
	}

	void method1() {
		System.out.println("Hello Method1 !!");
	}

}
