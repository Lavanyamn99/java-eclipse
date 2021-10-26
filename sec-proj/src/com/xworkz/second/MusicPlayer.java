package com.xworkz.second;
public class MusicPlayer 
{
	public static String color="Black";
	private int volumeLevel=9;
	public static void brand()
		{
			
			System.out.println("BRAND INVOKED");
			
		}
	
	protected void madeIn()
	 {
		 System.out.println("MADE IN INDIA");
	 }
	public static void main(String[] args) 
	{
	   MusicPlayer obj= new MusicPlayer();
	    obj.madeIn();
	  System.out.println(obj.volumeLevel);
	}
}
