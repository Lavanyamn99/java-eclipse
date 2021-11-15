package com.workz.sub;
import com.xworkz.parent.Factory;

public class SugarFactory extends Factory {

	public void manyfacture()
	{
		System.out.println("manufacture method from child class is invoked");
	}
	public String toString()
	{
		System.out.println("String method from child class is invoked");
		return "child class";
	}
	public int hashCode()
	{
		System.out.println("hashcode method from child class is invoked");
		return 78;
	}
}
