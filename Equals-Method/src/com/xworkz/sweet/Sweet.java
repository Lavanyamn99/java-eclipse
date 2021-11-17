package com.xworkz.sweet;

public class Sweet {
	private Color color;
	private Shape shape;
	private String name;
	private double price;
public  Sweet()
{
	
}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Object is invoked");
		if (obj != null) {
			System.out.println("obj is not pointing to null");
			if (obj instanceof Sweet) {
				System.out.println("refrence is Sweet");
				Sweet casted = (Sweet) obj;
				String castedName = casted.getName();
				Shape castedShape = casted.getShape();
				if (this.name.equals(castedName) && this.shape.equals(castedShape)) {
					System.out.println("name and shape matching");
					return true;
				} else {
					System.err.println("name and shape  not is matching");
				}
			} else {
				System.err.println("refrence is not Sweet");
			}
		} else {
			System.err.println("obj is  pointing to null");
		}
		return false;
	}

	public String toString() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.color);
		System.out.println(this.shape);
		return "Sweet";
	}

	public int hashCode() {
		return 67;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public String getName() {
		return name;
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
}
