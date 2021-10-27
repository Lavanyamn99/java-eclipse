package com.xworkz.dm;

public class Helmet 
{

	private String[] brand =new String[5];
	private int count=0;
	public void HelmetBrand()
	{
		System.out.println("Invoked ");
	}
	
public void add(String brandName)
{
	System.out.println("Invoked Method ");
	
if(brandName!=null && this.count<this.brand.length)
	
{
	this.brand[count]=brandName;
	count++;
	System.out.println("Added brand ".concat(brandName));
}
else 
     {      System.err.println("Brand is not pointing to null");
	} 
}
public void displayBrandName()
{
	System.out.println("DisplayBrandName");
	for(int name=0;name<this.brand.length;name++)
	{
		String reference =this.brand[name];
		System.out.println(reference);
		
	}
}
}