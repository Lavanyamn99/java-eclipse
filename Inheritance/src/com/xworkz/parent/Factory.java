package com.xworkz.parent;

public class Factory {

	public void manyfacture()
	{
		System.out.println("manufacture method from parent class is invoked");
	}
	public void open()
	{
		System.out.println("open method from parent class is invoked");
	}
	public void shutDown()
	{
		System.out.println("shutdown method from parent class is invoked");
	}
	public String toString()
	{
		System.out.println("String method from parent class is invoked");
		return "String";
	}
	public int hashCode()
	{
		System.out.println("hashcode method from parent class is invoked");
		return 25;
	}
	
}
