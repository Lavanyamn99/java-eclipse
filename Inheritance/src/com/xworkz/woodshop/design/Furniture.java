package com.xworkz.woodshop.design;

public class Furniture {

	public String type;
	private double price=678.00;
	String color;
	protected int quantity;
	
    public Furniture()
    {
    	System.out.println("INVOKED NO-ARG CONSTRUCTOR");
    }
    public Furniture(String type,String color)
    {
    	super();
    	this.type=type;
    	this.color=color;
    	System.out.println("INVOKED PARAMETERIZED CONSTRUCTOR");
        System.out.println("Price:"+this.price);
        
    }
    
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		
	}

}

