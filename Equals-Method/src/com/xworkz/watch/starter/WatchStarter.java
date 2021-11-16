package com.xworkz.watch.starter;
import com.xworkz.watch.Type;
import com.xworkz.watch.Watch;

public class WatchStarter {

	public static void main(String[] args) {
		Watch watch=new Watch();
		watch.setBrand("FASTRACK");
		watch.setPrice(6798);
		watch.setType(Type.ANALOG);
       
       
        Watch watch1=new Watch();
		watch1.setBrand("FASTRACK");
		watch1.setPrice(6798);
		watch1.setType(Type.ANALOG);
        
        
        if(watch==watch1)
        {
        	System.out.println("same memory");
        }
        
        	boolean same=watch.equals(watch1);
        	System.out.println(same);
	}

}
