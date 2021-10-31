package com.xworkz.dao.starter;
import com.xworkz.dto.StatueDTO;
import com.xworkz.dao.StatueDAO;
public class StatueDAOStarter {

	public static void main(String[] args) {
		StatueDAO statueDAO=new StatueDAO();
		statueDAO.add(null);
		StatueDTO statue1=new StatueDTO("SHIVA",100.0f,"Black","Kore","stone");
		statueDAO.add(statue1);
		StatueDTO statue2=new StatueDTO("SHIVA",100.0f,"Black","Kore","stone");
		statueDAO.add(statue2);
		StatueDTO statue3=new StatueDTO("SHIVA",100.0f,"Black","Kore","stone");
		statueDAO.add(statue3);
	}

}
