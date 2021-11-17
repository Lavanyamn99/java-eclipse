package com.xworkz.camera;

public class CameraStarter {

	public static void main(String[] args) {
		Camera camera = new Camera();
		camera.setBrand("nikon");
		camera.setCompany("bell");
		camera.setModelNo(78);
		camera.setPrice(98090);

		Camera camera1 = new Camera();
		camera1.setBrand("nikon");
		camera1.setCompany("bell");
		camera1.setModelNo(789);
		camera1.setPrice(98090);
		camera1.hashCode();
		camera1.toString();
		Camera camera2 = new Camera();
		Class cls = camera2.getClass();
		System.out.println(cls.getMethods().length);
		System.out.println(cls.getFields().length);
		System.out.println(cls.getConstructors().length);
		boolean same = camera.equals(camera1);
		System.out.println(same);
	}

}
