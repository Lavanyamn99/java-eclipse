package com.xworkz.watch;

public class Watch {

	private String brand;
	private double price;
	private Type type;

	@Override
	public boolean equals(Object obj) {
		System.out.println("Object is invoked");
		if (obj != null) {
			System.out.println("obj is not pointing to null");
			if (obj instanceof Watch) {
				System.out.println("refrence is Watch");
				Watch casted = (Watch) obj;
				String castedBrand = casted.getBrand();
				Type castedType = casted.getType();
				if (this.brand.equals(castedBrand) && this.type.equals(castedType)) {
					System.out.println("brand is price matching");
					return true;
				} else {
					System.err.println("brand and price  not is matching");
				}
			} else {
				System.err.println("refrence is not Watch");
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	
}
