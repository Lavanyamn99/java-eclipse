package com.xworkz.pendrive;

public class Pendrive {
	private int capacity;
	private boolean working;
	private String brand;
	private double price;
public Pendrive()
{
	
}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Object is invoked");
		if (obj != null) {
			System.out.println("obj is not pointing to null");
			if (obj instanceof Pendrive) {
				System.out.println("refrence is Pendrive");
				Pendrive casted = (Pendrive) obj;
				String castedBrand = casted.getBrand();
				boolean castedWorking = casted.working;
				if (this.brand.equals(castedBrand) && this.working == castedWorking) {
					System.out.println("year and name matching");
					return true;
				} else {
					System.err.println("year and name not is matching");
				}
			} else {
				System.err.println("refrence is not Bridge");
			}
		} else {
			System.err.println("obj is  pointing to null");
		}
		return false;
	}

	public String toString() {
		System.out.println(this.brand);
		System.out.println(this.capacity);
		System.out.println(this.working);
		System.out.println(this.price);
		return "pendrive";
	}

	public int hashCode() {
		return 45;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
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
}
