package com.xworkz.food;

public class FoodStarter {

	public static void main(String[] args) {
		Food food = new Food();
		food.setName("Pizza");
		food.setPrice(162);
		food.setQuality(true);
		food.setQuantity(19.4f);

		Food food1 = new Food();
		food1.setName("Pizza");
		food1.setPrice(162);
		food1.setQuality(true);
		food1.setQuantity(19.4f);

		if (food == food1) {
			System.out.println("same memory");
		}
		boolean same = food.equals(food1);
		System.out.println(same);

	}

}

