package com.xworkz.subclass;
import com.xworkz.parent.Factory;
public class CarFactory extends Factory {

	public void manyfacture()
	{
		System.out.println("manufacture method from sub class is invoked");
	}
	
	public void shutDown()
	{
		System.out.println("shutdown method from sub class is invoked");
	}
	public String toString()
	{
		System.out.println("String method from sub class is invoked");
		return "sub class";
	}
	public int hashCode()
	{
		System.out.println("hashcode method from sub class is invoked");
		return 45;
	}
}
