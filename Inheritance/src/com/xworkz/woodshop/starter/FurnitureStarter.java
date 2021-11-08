package com.xworkz.woodshop.starter;
import com.xworkz.woodshop.design.Furniture;
import com.xworkz.woodshop.design.sub.ComputerTableFurniture;
import com.xworkz.woodshop.sell.DineTableFurniture;
public class FurnitureStarter {

	public static void main(String[] args) {
		
		
		ComputerTableFurniture comp=new ComputerTableFurniture();
        System.out.println(comp.type);
        Furniture furniture =new Furniture("SOFA","BLACK");
        System.out.println(furniture.type);
        DineTableFurniture dine=new DineTableFurniture();
        System.out.println(dine.type);
       
        
       
	}

}
