package com.xworkz.dao.starter;

import com.xworkz.dto.VehicleDTO;

import com.xworkz.dao.VehicleDAO;
public class VehicleDAOStarter {

	public static void main(String[] args) {
		VehicleDAO vehicleDAO=new VehicleDAO();
		vehicleDAO.add(null);
		VehicleDTO vehicle=new VehicleDTO("Toyota","Red",5,15.0f,"Diesel");
		vehicleDAO.add(vehicle);
		VehicleDTO vehicle1=new VehicleDTO("Inova","Red",5,15.0f,"Diesel");
		vehicleDAO.add(vehicle1);
		

	}

}
