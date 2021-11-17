package com.xworkz.sweet;

public class SweetStarter {

	public static void main(String[] args) {
		Sweet sweet = new Sweet();
		sweet.setColor(Color.BROWN);
		sweet.setName("champakalli");
		sweet.setPrice(455);
		sweet.setShape(Shape.OVAL);
		sweet.toString();
		sweet.hashCode();
		
		Sweet sweet1 = new Sweet();
		sweet1.setColor(Color.BROWN);
		sweet1.setName("champakalli");
		sweet1.setPrice(455);
		sweet1.setShape(Shape.OVAL);
		Sweet sweet2 = new Sweet();
		Class cls = sweet2.getClass();
		System.out.println(cls.getMethods().length);
		System.out.println(cls.getFields().length);
		System.out.println(cls.getConstructors().length);
		boolean same = sweet.equals(sweet1);
		System.out.println(same);
	}

}
