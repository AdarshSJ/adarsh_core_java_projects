package com.oops;

public class InheritanceLoan {

	String getEmpAddressInfo() {
		String flatNo = "123";
		String streetName = "LIG";
		String area = "KPHB";
		String city = "Hyderabad";
		long pin = 500072;

		String address = "Flat Number: " + flatNo + ", " + "Street Name: " + streetName + ", " + "Area: " + area + ", "
				+ "City: " + city + ", " + "Pin Code: " + pin;

		return address;
	}

	double getROI() {
		double roi = 10.5;
		return roi;
	}

	double getSalInfo() {
		double sal = 750000.00;
		return sal;
	}

	int getCibilScore() {
		int cibil = 700;
		return cibil;
	}

}
