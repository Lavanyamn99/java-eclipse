package com.xworkz.bridge;

public class Bridge {
//name,length,cost,openyear
	private String name;
	private float length;
	private double cost;
	private double openYear;
public Bridge()
{
	
}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Object is invoked");
		if (obj != null) {
			System.out.println("obj is not pointing to null");
			if (obj instanceof Bridge) {
				System.out.println("refrence is Bridge");
				Bridge casted = (Bridge) obj;
				String castedName = casted.getName();
				double castedOpenYear = casted.getOpenYear();
				if (this.name.equals(castedName) && this.openYear == castedOpenYear) {
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
		System.out.println(this.cost);
		System.out.println(this.length);
		System.out.println(this.name);
		System.out.println(this.openYear);
		return "String";
	}

	public int hashCode() {
		return 45;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getOpenYear() {
		return openYear;
	}

	public void setOpenYear(double openYear) {
		this.openYear = openYear;
	}

}
