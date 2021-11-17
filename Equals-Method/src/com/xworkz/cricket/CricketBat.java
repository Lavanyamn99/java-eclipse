package com.xworkz.cricket;

public class CricketBat {

	private String companyName;
	private Type type;
	private double price;
	private String wood;
public CricketBat()
{
	
}
	@Override
	public boolean equals(Object o) {
		System.out.println("Object is invoked");
		if (o != null) {
			System.out.println("object is not pointing to null");
			if (o instanceof CricketBat) {
				System.out.println("refrence is CricketBat ");
				CricketBat casted = (CricketBat) o;
				String castedCompany = casted.getCompanyName();
				Type castedtype = casted.getType();
				if (this.companyName.equals(castedCompany) && this.type.equals(castedtype)) {
					System.out.println("company and type is matching");
					return true;
				} else {
					System.err.println("company and type is not matching");
				}
			} else {
				System.err.println("refrence is not CricketBat");
			}

		} else {
			System.err.println("object is pointing to null");
		}
		return false;
	}

	public String toString()
	{
		System.out.println("String invoked");
		
		System.out.println(this.companyName);
		System.out.println(this.price);
		System.out.println(this.wood);
		System.out.println(this.type);
		return "string";
	}
	public int hashCode()
	{
		System.out.println("hashcode invoked");
		return 45;
	}
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getWood() {
		return wood;
	}

	public void setWood(String wood) {
		this.wood = wood;
	}
}
