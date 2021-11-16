package com.xworkz.stadium;

public class StadiumStarter {

	public static void main(String[] args) {
		Stadium stadium = new Stadium();
		stadium.setName("Kanteerava");
		stadium.setCity("Banglore");
		stadium.setAreaInMeters(345.98f);

		Stadium stadium1 = new Stadium();
		stadium1.setName("chinnaswamy");
		stadium1.setCity("Banglore");
		stadium1.setAreaInMeters(345.98f);

		if (stadium == stadium1) {
			System.out.println("same memory");
		}
		boolean same = stadium.equals(stadium1);
		System.out.println(same);

	}

}


