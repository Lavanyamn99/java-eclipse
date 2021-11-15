package com.xworkz.FactoryStarter;
import com.xworkz.parent.Factory;
import com.xworkz.subclass.CarFactory;
import com.workz.sub.SugarFactory;
public class FactoryStarter {

	public static void main(String[] args) {
		Factory factory=new Factory();
		factory.manyfacture();
		System.out.println(factory.toString());
	    factory.open();
		factory.shutDown();
		factory.hashCode();
		System.out.println(factory.hashCode());
		
		

		Factory factory1=new CarFactory();
		factory1.manyfacture();
		factory1.open();
		factory1.toString();
		System.out.println(factory1.toString());
		factory1.hashCode();
		System.out.println(factory1.hashCode());
		
		SugarFactory sugar=new SugarFactory();
		sugar.manyfacture();
		sugar.shutDown();
		sugar.toString();
		System.out.println(sugar.toString());
		sugar.hashCode();
		System.out.println(sugar.hashCode());
		
	}

}
