package com.xworkz.bag;

public class BagStarter {

	public static void main(String[] args) {
		Bag bag = new Bag();
		bag.setSections("college");
		bag.setColor(BagType.BLACK);
		bag.setPrice(789);

		Bag bag1 = new Bag();
		bag1.setSections("college");
		bag1.setColor(BagType.BLACK);
		bag1.setPrice(789);

		if (bag == bag1) {
			System.out.println("same memory");
		}
		boolean same = bag.equals(bag1);
		System.out.println(same);
	}

}
