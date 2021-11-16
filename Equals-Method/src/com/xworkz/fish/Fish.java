package com.xworkz.fish;

public class Fish {
// name,price,color,type
	private String name;
	private String color;
	private String type;
	private double price;

	@Override
	public boolean equals(Object obj) {
		System.out.println("Object is invoked");
		if (obj != null) {
			System.out.println("obj is not pointing to null");
			if (obj instanceof Fish) {
				System.out.println("refrence is Fish");
				Fish casted = (Fish) obj;
				String castedName = casted.getName();
				String castedColor = casted.getColor();
				if (this.name.equals(castedName) && this.color.equals(castedColor)) {
					System.out.println("name and color is matching");
					return true;
				} else {
					System.err.println("name and Color not is matching");
				}
			} else {
				System.err.println("refrence is not Fish");
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
