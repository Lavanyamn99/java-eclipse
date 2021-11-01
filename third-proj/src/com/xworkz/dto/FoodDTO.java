package com.xworkz.dto;
import com.xworkz.dao.FoodType;
public class FoodDTO {
private int id;
private String name;
private FoodType type;
private double price;
private int quantity;

 public FoodDTO()
 {
	 
 }
public FoodDTO(int id, String name,FoodType type, double price,int quantity ) {
	super();
	this.id = id;
	this.name = name;
	this.type=type;
	this.price = price;
	this.quantity = quantity;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public FoodType getType() {
	return type;
}
public void setType(FoodType type) {
	this.type = type;
}
public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
 
}
