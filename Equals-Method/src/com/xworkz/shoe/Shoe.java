package com.xworkz.shoe;

public class Shoe {
	private String brand;
	private int size;
	private String color;
	private String gender;

	@Override
	public boolean equals(Object obj) {
		System.out.println("Object is invoked");
		if (obj != null) {
			System.out.println("obj is not pointing to null");
			if (obj instanceof Shoe) {
				System.out.println("refrence is Shoe");
				Shoe casted = (Shoe) obj;
				String castedcolor = casted.getColor();
				String castedBrand = casted.getBrand();
				if (this.brand.equals(castedBrand) && this.color.equals(castedcolor)) {
					System.out.println("brand and color is matching");
					return true;
				} else {
					System.err.println("brand and color not is matching");
				}
			} else {
				System.err.println("refrence is not shoe");
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
