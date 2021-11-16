package com.xworkz.sock;

public class Sock {
	private char size;
	private double price;
	private SockMaterial material;
	private SockType type;

	@Override
	public boolean equals(Object obj) {
		System.out.println("Object is invoked");
		if (obj != null) {
			System.out.println("obj is not pointing to null");
			if (obj instanceof Sock) {
				System.out.println("refrence is Sock");
				Sock casted = (Sock) obj;
				char castedsize = casted.getSize();
				SockMaterial castedMaterial = casted.getMaterial();
				if (this.material.equals(castedMaterial) && this.size == castedsize) {
					System.out.println("size and material is matching");
					return true;
				} else {
					System.err.println("size and material not is matching");
				}
			} else {
				System.err.println("refrence is not sock");
			}
		} else {
			System.err.println("obj is  pointing to null");
		}
		return false;

	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public SockMaterial getMaterial() {
		return material;
	}

	public void setMaterial(SockMaterial material) {
		this.material = material;
	}

	public SockType getType() {
		return type;
	}

	public void setType(SockType type) {
		this.type = type;
	}

}
