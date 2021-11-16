package com.xworkz.belt;

public class BeltStarter {

	public static void main(String[] args) {
		Belt belt = new Belt();
		belt.setGender("male");
		belt.setMaterial("leather");
		belt.setSize("medium");
		belt.setPrice(567);

		Belt belt1 = new Belt();
		belt1.setGender("male");
		belt1.setMaterial("leather");
		belt1.setSize("medium");
		belt1.setPrice(567);

		if (belt == belt1) {
			System.out.println("same memory");
		}
		boolean same = belt.equals(belt1);
		System.out.println(same);

	}

}
