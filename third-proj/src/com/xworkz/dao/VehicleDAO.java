package com.xworkz.dao;
import com.xworkz.dto.StatueDTO;
import com.xworkz.dto.VehicleDTO; 
public class VehicleDAO {
	private VehicleDTO[] vehicle=new VehicleDTO[3];
	private int color;
	public VehicleDAO()
	{
		
	}
	public void add(VehicleDTO vehicleDTO )
	{
		if (this.color<this.vehicle.length && vehicleDTO!=null )
		{
		this. vehicle[color]= vehicleDTO;
		
			System.out.println("LEVEL AT INDEX".concat(" ").concat(String.valueOf(this.color).concat(" ").concat("COLOR ").concat(" ").concat( vehicleDTO.getColor())));
		      this.color++;
		}
		   else
		   {
			   System.err.println(" AT MAX OR NULL!!");  
		}
	}
	public void delete(int index)
	{
		System.out.println("INVOKED THE DELETE INDEX".concat(String.valueOf(index)));
		if(index>=0 && index<this.vehicle.length)
		{
			this.vehicle[index]=null;
			System.out.println("DELETED");
		}
		else
		{
			System.err.println("INDEX IS NOT GOOD");
		}
	}

}
