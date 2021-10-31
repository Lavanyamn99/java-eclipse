package com.xworkz.dao;
import com.xworkz.dto.StatueDTO; 
public class StatueDAO {
	private StatueDTO[] statue=new StatueDTO[3];
	private int level;
	public StatueDAO()
	{
		
	}
	public void add(StatueDTO statueDTO )
	{
		if (this.level<this.statue.length && statueDTO!=null )
		{
		this.statue[level]=statueDTO;
		
			System.out.println("LEVEL AT INDEX".concat(" ").concat(String.valueOf(this.level).concat(" ").concat("NAME ").concat(" ").concat(statueDTO.getName())));
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
		if(index>=0 && index<this.statue.length)
		{
			this.statue[level]=null;
			System.out.println("DELETED");
		}
		else
		{
			System.err.println("INDEX IS NOT GOOD");
		}
	}
}
