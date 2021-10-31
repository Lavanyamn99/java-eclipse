package com.xworkz.dao.starter;
import com.xworkz.dto.CementDTO;
import com.xworkz.dao.CementDAO;
public class CementDAOStarter {

	public static void main(String[] args) {
		
		CementDAO cementDAO=new CementDAO();
		cementDAO.add(null);
		CementDTO cement=new CementDTO("ACC",310.0f,32.65f,true,"Rapid-hardening");
		cementDAO.add(cement);
		CementDTO cement1=new CementDTO("BIRLA",310.0f,32.65f,true,"Rapid-hardening");
		cementDAO.add(cement1);
		CementDTO cement2=new CementDTO("BIRLA",310.0f,32.65f,true,"Rapid-hardening");
		cementDAO.add(cement2);
		CementDTO cement3=new CementDTO("BIRLA",310.0f,32.65f,true,"Rapid-hardening");
		cementDAO.add(cement3);
	}

}
