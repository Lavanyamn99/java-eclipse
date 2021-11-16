package com.xworkz.fish;

public class FishStarter {

	public static void main(String[] args) {
		Fish fish = new Fish();
		fish.setColor("orange");
		fish.setName("guppy");
		fish.setPrice(300);
		fish.setType("goldfish");
		FishType type = FishType.GOLD_FISH;
		System.out.println(type);

		Fish fish1 = new Fish();
		fish1.setColor("blue");
		fish1.setName("guppy");
		fish1.setPrice(300);
		fish1.setType("goldfish");
		FishType type1 = FishType.SALMON;
		System.out.println(type1);

		if (fish == fish1) {
			System.out.println("same memory");
		}
		boolean same = fish.equals(fish1);
		System.out.println(same);
	}

}
