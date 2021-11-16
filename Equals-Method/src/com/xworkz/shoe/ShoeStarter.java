package com.xworkz.shoe;

public class ShoeStarter {

	public static void main(String[] args) {
		Shoe shoe = new Shoe();
		shoe.setBrand("roadster");
		shoe.setColor("white");
		shoe.setGender("female");
		shoe.setSize(7);

		Shoe shoe1 = new Shoe();
		shoe1.setBrand("roadster");
		shoe1.setColor("white");
		shoe1.setGender("male");
		shoe1.setSize(7);

		if (shoe == shoe1) {
			System.out.println("same memory");
		}
		boolean same = shoe.equals(shoe1);
		System.out.println(same);

	}

}
