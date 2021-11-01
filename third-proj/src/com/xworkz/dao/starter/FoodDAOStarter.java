package com.xworkz.dao.starter;
import com.xworkz.dao.FoodDAO;
import com.xworkz.dao.FoodType;
import com.xworkz.dto.FoodDTO;
public class FoodDAOStarter {

	public static void main(String[] args) {
		
	FoodDAO foodDAO=new FoodDAO();
	FoodDTO foodDTO=new FoodDTO(1,"BIRYANI",FoodType.SEA_FOOD,560.00,3);
    foodDAO.add(foodDTO);
    FoodDTO foodDTO1=new FoodDTO(2,"CHILLY CHICKEN",FoodType.NON_VEG,60.00,8);
    foodDAO.add(foodDTO1);
    FoodDTO foodDTO2=new FoodDTO(2,"FRENCH FRIES",FoodType.ITALIAN,80.00,7);
    foodDAO.add(foodDTO2);
    FoodDTO foodDTO3=new FoodDTO(2,"ICE-CREAM",FoodType.SOUTH_INDIAN,40.00,6);
    foodDAO.add(foodDTO3);
    FoodDTO foodDTO4=new FoodDTO(2,"LEMON CHICKEN",FoodType.VEG,70.00,2);
    foodDAO.add(foodDTO4);
    foodDAO.updatePriceByName("BIRYANI",60.00);
    foodDAO.updateQuantityByName("CHILLY CHICKEN",7);
    foodDAO.findByName("NOODLES");
    foodDAO.findByName("LEMON CHICKEN");
    foodDAO.findByNameAndPrice("ICE-CREAM",40.00);
    foodDAO.findByNameAndType("FISH",FoodType.NON_VEG);
    foodDAO.findByNameAndType("LEMON CHICKEN",FoodType.VEG);
    foodDAO.displayDetails();
    foodDAO.printTotalFoodItems();
	}

}
