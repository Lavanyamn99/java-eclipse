package com.xworkz.dao;
import com.xworkz.dto.CementDTO;
public class CementDAO {
	private CementDTO[] cement=new CementDTO[2];
	private int name;
	public CementDAO()
	{
		
	}
	public void add(CementDTO cementDTO) {
		
	if(this.name<this.cement.length && cementDTO!=null)
	{
		this.cement[name]=cementDTO;
		System.out.println("NAME AT INDEX".concat(" ").concat(String.valueOf(this.name).concat(" ").concat("COMPANY ").concat(" ").concat(cementDTO.getCompany())));
		 this.name++;
	}
	   else
	   {
		   System.err.println("THE NAME IS FULL OR NULL!!");  
	}
}
	public void delete(int index)
	{
		System.out.println("INVOKED THE DELETE INDEX".concat(String.valueOf(index)));
		if(index>=0 && index<this.cement.length)
		{
			this.cement[name]=null;
			System.out.println("DELETED");
		}
		else
		{
			System.err.println("INDEX IS NOT GOOD");
		}
	}
	}
	
