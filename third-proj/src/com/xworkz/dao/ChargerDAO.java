package com.xworkz.dao;

import com.xworkz.dto.ChargerDTO;

public class ChargerDAO {
	private ChargerDTO[] charger=new ChargerDTO[5];
	private int capacity;
	public ChargerDAO()
	{
		
	}
	public void add(ChargerDTO chargeDAO )
	{
		if (this.capacity<this.charger.length && charger!=null )
		{
		this.charger[capacity]=chargeDAO;
		
			System.out.println("CHARGE AT INDEX".concat(" ").concat(String.valueOf(this.capacity).concat(" ").concat("BRAND ").concat(" ").concat(chargeDAO.getBrand())));
		      this.capacity++;
		}
		   else
		   {
			   System.err.println("THE CAPACITY IS AT MAX OR NULL!!");  
		}
	}
	public void delete(int index)
	{
		if(index>=0 && index<this.charger.length)
		{
		System.out.println("INVOKED THE DELETE INDEX".concat(String.valueOf(index)));
		
		
			this.charger[capacity]=null;
			System.out.println("DELETED");
		}
		else
		{
			System.err.println("INDEX IS NOT GOOD");
		}
	}

}

