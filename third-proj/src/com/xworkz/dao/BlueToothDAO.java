package com.xworkz.dao;
import com.xworkz.dto.BlueToothDTO;
public class BlueToothDAO {
	private BlueToothDTO[] blue=new BlueToothDTO[3];
	private int level;
	public BlueToothDAO()
	{
		
	}
	public void add(BlueToothDTO blueTooth )
	{
		if (this.level<this.blue.length && blueTooth!=null )
		{
		this.blue[level]=blueTooth;
		
			System.out.println("LEVEL AT INDEX".concat(" ").concat(String.valueOf(this.level).concat(" ").concat("BRAND ").concat(" ").concat(blueTooth.getBrand())));
		      this.level++;
		}
		   else
		   {
			   System.err.println("THE LEVEL IS AT MAX OR NULL!!");  
		}
	}
public void delete(int index)
{
	System.out.println("INVOKED THE DELETE INDEX".concat(String.valueOf(index)));
	if(index>=0 && index<this.blue.length)
	{
		this.blue[level]=null;
		System.out.println("DELETED");
	}
	else
	{
		System.err.println("INDEX IS NOT GOOD");
	}
}
}
