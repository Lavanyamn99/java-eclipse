package com.xworkz.hospital;

public class Starter {

	public static void main(String[] args) {
		HostelHospital hospital = new HostelHospital();
		String value = hospital.register();
		System.out.println(value);
		double value1 = hospital.payAdvance();
		System.out.println(value1);
		boolean value2 = hospital.validInsurance();
		System.out.println(value2);

	}

}
