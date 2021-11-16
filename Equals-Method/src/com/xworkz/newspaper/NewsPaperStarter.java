package com.xworkz.newspaper;

public class NewsPaperStarter {

	public static void main(String[] args) {
		NewsPaper news =new NewsPaper();
		news.setName("Star of Mysore");
        news.setLang("English");
        news.setSince(1999);
        
        NewsPaper news1 =new NewsPaper();
		news1.setName("Deccan Hearld");
        news1.setLang("English");
        news1.setSince(1999);
        
        if (news== news1) {
    		System.out.println("same memory");
    	}
    	boolean same =news.equals(null);
    	System.out.println(same);
    	}

	}
	
