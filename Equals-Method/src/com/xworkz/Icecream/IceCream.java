package com.xworkz.Icecream;

public class IceCream {
	private Flavour flavour;
	private String name;
	private IceType type;

	@Override
	public boolean equals(Object obj) {
		System.out.println("Object is invoked");
		if (obj != null) {
			System.out.println("obj is not pointing to null");
			if (obj instanceof IceCream) {
				System.out.println("refrence is IceCream");
				IceCream casted = (IceCream) obj;
				Flavour castedFlavour = casted.getFlavour();
				String castedName = casted.getName();
				if (this.flavour.equals(castedFlavour) && this.name.equals(castedName)) {
					System.out.println("flavour and name is matching");
					return true;
				} else {
					System.err.println("flavour and name not is matching");
				}
			} else {
				System.err.println("refrence is not IceCream");
			}
		} else {
			System.err.println("obj is  pointing to null");
		}
		return false;

	}

	public Flavour getFlavour() {
		return flavour;
	}

	public void setFlavour(Flavour flavour) {
		this.flavour = flavour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IceType getType() {
		return type;
	}

	public void setType(IceType type) {
		this.type = type;
	}

}
