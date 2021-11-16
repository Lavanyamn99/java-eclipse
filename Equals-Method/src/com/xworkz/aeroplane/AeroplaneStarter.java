package com.xworkz.aeroplane;

public class AeroplaneStarter {

	public static void main(String[] args) {
	Aeroplane areo=new Aeroplane();
	areo.setNo(98);
	areo.setGovt("indian");
	areo.setCompany("airlines");
	
	Aeroplane areo1=new Aeroplane();
	areo1.setNo(99);
	areo1.setGovt("american");
	areo1.setCompany("airlines");
	if (areo== areo1) {
		System.out.println("same memory");
	}
	boolean same =areo.equals(areo1);
	System.out.println(same);
	}

}
