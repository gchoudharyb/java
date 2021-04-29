package com.gaurav.java.enume;

public enum FishEnum {
	STAR(1000), GUPPY(90), ROHU(250), GOLD(5000), PRONE(9888);
	public static void main(String[] args) {
		System.out.println("In ENUM main method");

	}
	int price;
	 FishEnum(int price) {
		System.out.println("Enum constructor executed");
		this.price=price;
	}
}
