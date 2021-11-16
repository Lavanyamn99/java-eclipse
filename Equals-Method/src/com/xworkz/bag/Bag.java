package com.xworkz.bag;

public class Bag {
	private double price;
	private BagType color;
	private String sections;

	@Override
	public boolean equals(Object obj) {
		System.out.println("Object is invoked");
		if (obj != null) {
			System.out.println("obj is not pointing to null");
			if (obj instanceof Bag) {
				System.out.println("refrence is Bag");
				Bag casted = (Bag) obj;
				String castedSections = casted.getSections();
				double castedPrice = casted.getPrice();
				if (this.price == castedPrice && this.sections.equals(castedSections)) {
					System.out.println("sections and price matching");
					return true;
				} else {
					System.err.println("sections and price  not is matching");
				}
			} else {
				System.err.println("refrence is not Bag");
			}
		} else {
			System.err.println("obj is  pointing to null");
		}
		return false;

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public BagType getColor() {
		return color;
	}

	public void setColor(BagType color) {
		this.color = color;
	}

	public String getSections() {
		return sections;
	}

	public void setSections(String sections) {
		this.sections = sections;
	}

}
