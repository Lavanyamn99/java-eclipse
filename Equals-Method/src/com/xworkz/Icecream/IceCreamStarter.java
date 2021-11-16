package com.xworkz.Icecream;

public class IceCreamStarter {

	public static void main(String[] args) {
		IceCream ice = new IceCream();
		ice.setFlavour(Flavour.CHOCOLATE);
		ice.setType(IceType.CANDY);
		ice.setName("cornetto");

		IceCream ice1 = new IceCream();
		ice1.setFlavour(Flavour.VANILLA);
		ice1.setType(IceType.BAR);
		ice1.setName("cornetto");
	
		if (ice == ice1) {
			System.out.println("same memory");
		}
		boolean same = ice.equals(ice1);
		System.out.println(same);
	}

}
