package com.xworkz.Headset.starter;

import com.xworkz.Headset.HeadSet;
import com.xworkz.Headset.HeadsetType;

public class HeadsetStarter {

	public static void main(String[] args) {

		HeadSet set = new HeadSet();
		set.setBrand("JBL");
		set.setBattery(67.8f);
		set.setType(HeadsetType.CIRCUMAURAL);
		set.setWarranty(3);

		HeadSet set1 = new HeadSet();
		set1.setBrand("JBL");
		set1.setBattery(67.8f);
		set1.setType(HeadsetType.EAR_BUD);
		set1.setWarranty(3);

		if (set == set1) {
			System.out.println("pointing to same location");
		}

		boolean value = set.equals(set1);
		System.out.println(value);
	}

}
