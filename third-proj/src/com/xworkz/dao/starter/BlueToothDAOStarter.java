package com.xworkz.dao.starter;
 import com.xworkz.dto.BlueToothDTO;
import com.xworkz.dao.BlueToothDAO;
public class BlueToothDAOStarter {

	public static void main(String[] args) {
		BlueToothDAO blueToothDAO=new BlueToothDAO();
		blueToothDAO.add(null);
		BlueToothDTO bluetooth=new BlueToothDTO("One-plus","head-set",9900.0f,2.45f,2.0f);
		blueToothDAO.add(bluetooth);
		BlueToothDTO bluetooth1=new BlueToothDTO("SONY","head-set",9900.0f,2.45f,2.0f);
		blueToothDAO.add(bluetooth1);
		BlueToothDTO bluetooth2=new BlueToothDTO("SAMSUNG","head-set",9900.0f,2.45f,2.0f);
		blueToothDAO.add(bluetooth2);
		BlueToothDTO bluetooth3=new BlueToothDTO("SAMSUNG","head-set",9900.0f,2.45f,2.0f);
		blueToothDAO.add(bluetooth3);
		blueToothDAO.delete(1);
	}

}
