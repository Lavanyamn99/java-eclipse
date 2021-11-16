package com.xworkz.food;

public class Food {
// name,price,quantity,quality,

	private String name;
	private double price;
	private float quantity;
	private boolean quality;

	@Override
	public boolean equals(Object obj) {
		System.out.println("Object is invoked");
		if (obj != null) {
			System.out.println("obj is not pointing to null");
			if (obj instanceof Food) {
				System.out.println("refrence is Food");
				Food casted = (Food) obj;
				String castedName = casted.getName();
				boolean castedQuality = casted.isQuality();
				if (this.name.equals(castedName) && this.quality == castedQuality) {
					System.out.println("name and quality is matching");
					return true;
				} else {
					System.err.println("name and quality not is matching");
				}
			} else {
				System.err.println("refrence is not food");
			}
		} else {
			System.err.println("obj is  pointing to null");
		}
		return false;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
	}

}
