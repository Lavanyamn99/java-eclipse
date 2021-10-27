package com.xworkz.veh.tester;
import com.xworkz.veh.Vehicle;
public class VehicleStarter {

	public static void main(String[] args) {
		Vehicle vehi=new Vehicle();
		vehi.add("Honda");
		vehi.add("null");
		vehi.add("Dio");
		vehi.add("RE");
		vehi.displayBrandName();
	}

}
