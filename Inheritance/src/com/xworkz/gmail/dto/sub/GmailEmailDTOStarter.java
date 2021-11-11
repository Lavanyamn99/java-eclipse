package com.xworkz.gmail.dto.sub;

public class GmailEmailDTOStarter {

	public static void main(String[] args) {
		
		GmailEmailDTO gmail=new GmailEmailDTO();
		gmail.setThemeColor("BLUE");
		gmail.setSubscribed(true);
		
		
		System.out.println(gmail.getThemeColor());
		System.out.println(gmail.isSubscribed());
		
	}

}
