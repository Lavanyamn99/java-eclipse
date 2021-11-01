package com.xworkz.dao;
import com.xworkz.dto.FoodDTO;
public class FoodDAO {
private FoodDTO[] foodContainer=new FoodDTO[5];
private int count;
private static int totalItems;
public FoodDAO()
{
	System.out.println("INVOKED FOODDAO");
}
public void add(FoodDTO foodDTO)
{
	if(foodDTO!=null && this.count<this.foodContainer.length)
	{
		this.foodContainer[count]=foodDTO;
		System.out.println("ADDED FOODDTO AT INDEX ".concat(" ").concat(String.valueOf(this.count)).concat(" ").concat("Id -").concat(String.valueOf(foodDTO.getId())));
		this.count++;
	}
		else
		{
			System.err.println("CONTAINER IS FULL OR PASSED NULL");
		}
}

public void updatePriceByName(String name,double price)
{
	if(name!=null && price>0)
	{
		for(int plate=0;plate<this.foodContainer.length;plate++)
		{
			FoodDTO food1=this.foodContainer[plate];
			if(food1!=null)
			{
				String nameOfFood =food1.getName();
				if(nameOfFood.equals(name))
				{
					System.out.println("NAME MATCHED".concat(" ").concat(nameOfFood).concat(" ").concat("AND UPATING PRICE").concat(" ").concat(String.valueOf(food1.getPrice())));
					food1.setPrice(price);
					System.out.println("UPDATED PRICE - ".concat(String.valueOf(food1.getPrice())));
				}
				else
				{
					System.out.println("NOT MATCHED");
				}
			}
			else
			{
				System.out.println("NULL");
			}
			}
			
		}
	}

public void updateQuantityByName(String name,int quantity)
{
	if(name!=null && quantity>0)
	{
		for(int quan=0;quan<this.foodContainer.length;quan++)
		{
			FoodDTO food1=this.foodContainer[quan];
			if(food1!=null)
			{
				String nameOfFood =food1.getName();
				
				if(nameOfFood.equals(name))
				{
					System.out.println("NAME MATCHED".concat(" ").concat(nameOfFood).concat(" ").concat("AND UPADATING QUANTITY").concat(" ").concat(String.valueOf(food1.getQuantity())));
					food1.setQuantity(quantity);
					System.out.println("UPDATED QUANTITY - ".concat(String.valueOf(food1.getQuantity())));
				}
				else
				{
					System.out.println("FOOD IS NOT MATCHED");
				}	
				
		   }
		}
	}
}
public void findByName(String name) 
{
	if(name!=null)
	{
		for(int jar=0;jar<this.foodContainer.length;jar++)
		{
			FoodDTO food1=this.foodContainer[jar];
			if(food1!=null)
			{
				String nameOfFood =food1.getName();
				if(nameOfFood.equals(name))
				{
					System.out.println("NAME IS MATCHED -".concat(food1.getName()));
					
				}
				else
				{
					System.out.println("NAME IS NOT MATCHED");
				}
			}
		}
	}
}
public void findByNameAndPrice(String name,double price) 
{
	if(name!=null && price>0)
	{
		for(int jar=0;jar<this.foodContainer.length;jar++)
		{
			FoodDTO food1=this.foodContainer[jar];
			if(food1!=null)
			{
				String nameOfFood =food1.getName();
				double amt=food1.getPrice();
				if(nameOfFood.equals(name)&& amt==price)
				{
					System.out.println("NAME-".concat(food1.getName()).concat(" ").concat("AND PRICE -").concat(" ").concat(String.valueOf(food1.getPrice())).concat(" ").concat("IS MATCHED"));
					
				}
				else
				{
					System.out.println("NAME AND PRICE IS NOT MATCHED");
				}
			}
		}
	}
}
public void findByNameAndType(String name,FoodType type) 
{
	if(name!=null && type!=null)
	{
		for(int cup=0;cup<this.foodContainer.length;cup++)
		{
			FoodDTO food1=this.foodContainer[cup];
			if(food1!=null)
			{
				String nameOfFood =food1.getName();
				FoodType foodType=food1.getType();
				if(nameOfFood.equals(name)&& foodType==type )
				{
					System.out.println("NAME-".concat(food1.getName()).concat(" ").concat("AND TYPE-").concat(" ").concat(String.valueOf(food1.getType())).concat(" ").concat("IS MATCHED"));
					
				}
				else
				{
					System.out.println("NAME AND TYPE IS NOT MATCHED");
				}
			}
		}
	}
}
public void displayDetails()
{
	for(int test=0;test<this.foodContainer.length;test++)
	{
		FoodDTO food1=this.foodContainer[test];
		if(food1!=null)
		{
		 
			System.out.println(String.valueOf(food1.getId()).concat(" ").concat(food1.getName()).concat(" ").concat(String.valueOf(food1.getType())).concat(" ").concat(String.valueOf(food1.getPrice())).concat(" ").concat(String.valueOf(food1.getQuantity())));
		}
		
	}
	
}
	public void printTotalFoodItems()
	{
		for(int totalItem=0;totalItem<this.foodContainer.length;totalItem++)
		{
			FoodDTO food1=this.foodContainer[totalItem];
			if(food1!=null)
			{
				int totalItems1=food1.getQuantity();
			FoodDAO.totalItems=FoodDAO.totalItems+totalItems1;
			}
			
		}
		System.out.println(FoodDAO.totalItems);
	}
}

