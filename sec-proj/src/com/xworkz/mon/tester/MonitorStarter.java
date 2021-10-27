package com.xworkz.mon.tester;
import com.xworkz.mon.Monitor;
public class MonitorStarter {

	public static void main(String[] args) {
	Monitor mon=new Monitor();
	mon.add("LENOVO");
	mon.add(null);
	mon.displayBrandName();
	mon.add("DELL");
	mon.add("HP");
	mon.add("HCL");
	mon.add("MAC");
	
	mon.displayBrandName();
	}

}
