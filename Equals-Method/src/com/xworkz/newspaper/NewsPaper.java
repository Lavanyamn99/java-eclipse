package com.xworkz.newspaper;

public class NewsPaper {
	private String name;
	private String lang;
	private double since;

	@Override
	public boolean equals(Object obj) {
		System.out.println("Object is invoked");
		if (obj != null) {
			System.out.println("obj is not pointing to null");
			if (obj instanceof NewsPaper) {
				System.out.println("refrence is NewsPaper");
				NewsPaper casted = (NewsPaper) obj;
				String castedName = casted.getName();
				double castedSince = casted.getSince();
				if (this.name.equals(castedName) && this.since == castedSince) {
					System.out.println("name and since is matching");
					return true;
				} else {
					System.err.println("name and since not is matching");
				}
			} else {
				System.err.println("refrence is not NewsPaper");
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

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public double getSince() {
		return since;
	}

	public void setSince(double since) {
		this.since = since;
	}

}
