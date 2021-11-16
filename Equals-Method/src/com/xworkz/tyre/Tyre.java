package com.xworkz.tyre;

public class Tyre {

	private String brand;
	private TyreType type;
	private double price;

	@Override
	public boolean equals(Object obj) {
		System.out.println("Object is invoked");
		if (obj != null) {
			System.out.println("obj is not pointing to null");
			if (obj instanceof Tyre) {
				System.out.println("refrence is Tyre");
				Tyre casted = (Tyre) obj;
				String castedBrand = casted.getBrand();
				TyreType castedType = casted.getType();
				if (this.brand.equals(castedBrand) && this.type.equals(castedType)) {
					System.out.println("brand and price is matching");
					return true;
				} else {
					System.err.println("brand and price not is matching");
				}
			} else {
				System.err.println("refrence is not Tyre");
			}
		} else {
			System.err.println("obj is  pointing to null");
		}
		return false;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public TyreType getType() {
		return type;
	}

	public void setType(TyreType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
