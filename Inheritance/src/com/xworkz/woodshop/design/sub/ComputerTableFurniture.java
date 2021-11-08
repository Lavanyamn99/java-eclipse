package com.xworkz.woodshop.design.sub; 
import com.xworkz.woodshop.design.Furniture;
public class ComputerTableFurniture extends Furniture {
	
	public ComputerTableFurniture()
	{
		super();
		System.out.println("INVOKED NO-ARG SUBCLASS CONSTRUCTOR");
		super.type="TEAK WOOD";
		super.quantity=8;
		System.out.println("Quantity:"+quantity);
		
	} 
	

}
