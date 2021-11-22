package com.xworkz.hospital;

public class HostelHospital implements Hospital {
	public String register() {
		System.out.println(" Method register invoked");
		return "Registered";
	}

	public double payAdvance() {
		System.out.println(" Method payAdvance invoked");
		return 54765;
	}

	public boolean validInsurance() {
		System.out.println(" Method validInsurance invoked");
		return true;
	}

}
