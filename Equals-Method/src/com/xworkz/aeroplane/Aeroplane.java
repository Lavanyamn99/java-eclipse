package com.xworkz.aeroplane;

public class Aeroplane {

	private int no;
	private String company;
	private String govt;

	@Override
	public boolean equals(Object obj) {
		System.out.println("Object is invoked");
		if (obj != null) {
			System.out.println("obj is not pointing to null");
			if (obj instanceof Aeroplane) {
				System.out.println("refrence is Aeroplane");
				Aeroplane casted = (Aeroplane) obj;
				String castedCompany = casted.getCompany();
				int castedNo = casted.getNo();
				if (this.company.equals(castedCompany) && this.no == castedNo) {
					System.out.println("company and no is matching");
					return true;
				} else {
					System.err.println(" company and no not is matching");
				}
			} else {
				System.err.println("refrence is not Aeroplane");
			}
		} else {
			System.err.println("obj is  pointing to null");
		}
		return false;

	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getGovt() {
		return govt;
	}

	public void setGovt(String govt) {
		this.govt = govt;
	}

		
	}


