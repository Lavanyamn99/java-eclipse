package com.xworkz.stadium;

public class Stadium {
// name,city,areaInMeters
	private String name;
	private String city;
	private float areaInMeters;

	@Override
	public boolean equals(Object obj) {
		System.out.println("Object is invoked");
		if (obj != null) {
			System.out.println("obj is not pointing to null");
			if (obj instanceof Stadium) {
				System.out.println("refrence is Stadium");
				Stadium casted = (Stadium) obj;
				String castedName = casted.getName();
				String castedCity = casted.getCity();
				if (this.name.equals(castedName) && this.city.equals(castedCity)) {
					System.out.println("name and city is matching");
					return true;
				} else {
					System.err.println("name and City not is matching");
				}
			} else {
				System.err.println("refrence is not Stadium");
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public float getAreaInMeters() {
		return areaInMeters;
	}

	public void setAreaInMeters(float areaInMeters) {
		this.areaInMeters = areaInMeters;
	}

}
