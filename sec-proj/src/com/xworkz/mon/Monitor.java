package com.xworkz.mon;

public class Monitor {
	
	private String[] name =new String[5];
	private int count=0;
	public void MonitorName()
	{
		System.out.println("Invoked ");
	}
	
public void add(String brandName)
{
	System.out.println("Invoked Method ");
	
if(brandName!=null && this.count<this.name.length)
	
{
	this.name[count]=brandName;
	count++;
	System.out.println("Added brand ".concat(brandName));
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
