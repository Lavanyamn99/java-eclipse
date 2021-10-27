package com.xworkz.veh;

public class Vehicle {
	private String[] name =new String[5];
	private int count=0;
	public void VehicleName()
	{
		System.out.println("Invoked ");
	}
	
public void add(String brand)
{
	System.out.println("Invoked Method ");
	
if(brand!=null && this.count<this.name.length)
	
{
	this.name[count]=brand;
	count++;
	System.out.println("Added brand ".concat(brand));
}
else {
           System.err.println("Brand is not pointing to null");
	} 
}
public void displayBrandName()
{
	System.out.println("DisplayBrandName");
	for(int brand=0;brand<this.name.length;brand++)
	{
		String reference =this.name[brand];
		System.out.println(reference);
		
	}
}

}
