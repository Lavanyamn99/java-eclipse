package com.xworkz.Headset;

public class HeadSet {

	private String brand;
	private HeadsetType type;
	private float battery;
	private int warranty;

	@Override
	public boolean equals(Object o) {
		System.out.println("Object is invoked");
		if (o != null) {
			System.out.println("o is not pointing to null");
			if (o instanceof HeadSet) {
				System.out.println("refrence is Headset");
				HeadSet casted = (HeadSet) o;
				String castedBrand = casted.getBrand();
				float castedBattery = casted.getBattery();
				if (this.brand.equals(castedBrand) && this.battery == castedBattery) {
					System.out.println("brand and battery is matching");
					return true;
				} else {
					System.err.println("brand and battery is not matching");
				}
			} else {
				System.err.println("refrence is not Headset");
			}
		} else {
			System.err.println("o is pointing to null");
		}
		return false;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public HeadsetType getType() {
		return type;
	}

	public void setType(HeadsetType type) {
		this.type = type;
	}

	public float getBattery() {
		return battery;
	}

	public void setBattery(float battery) {
		this.battery = battery;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

}
