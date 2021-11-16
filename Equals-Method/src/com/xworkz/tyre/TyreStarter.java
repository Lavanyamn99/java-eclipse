package com.xworkz.tyre;

public class TyreStarter {

	public static void main(String[] args) {
	Tyre tyre=new Tyre();
	tyre.setBrand("JK");
	tyre.setPrice(4567);
	tyre.setType(TyreType.ALL_SEASON);
	
	
	Tyre tyre1=new Tyre();
	tyre1.setBrand("JK");
	tyre1.setPrice(4567);
	tyre1.setType(TyreType.ALL_SEASON);
	
	
	if (tyre== tyre1) {
		System.out.println("same memory");
	}
	boolean same =tyre.equals(tyre1);
	System.out.println(same);
	}

	}

