package com.xworkz.belt;

public class Belt {
	private double price;
	private String material;
	private String size;
	private String gender;

	@Override
	public boolean equals(Object obj) {
		System.out.println("Object is invoked");
		if (obj != null) {
			System.out.println("obj is not pointing to null");
			if (obj instanceof Belt) {
				System.out.println("refrence is belt");
				Belt casted = (Belt) obj;
				String castedsize = casted.getSize();
				String castedMaterial = casted.getMaterial();
				if (this.material.equals(castedMaterial) && this.size.equals(castedsize)) {
					System.out.println("size and material is matching");
					return true;
				} else {
					System.err.println("size and material not is matching");
				}
			} else {
				System.err.println("refrence is not belt");
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
		
	}

