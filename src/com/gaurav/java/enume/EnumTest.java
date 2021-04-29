package com.gaurav.java.enume;

public class EnumTest {
	public static void main(String[] args) {
		BeerEnum beerEnum = BeerEnum.KF;
		System.out.println(BeerEnum.RC);
		System.out.println(beerEnum);

		BeerEnum beerEnum2 = BeerEnum.KF;

		AdvBeerEnum[] advBeerEnum = AdvBeerEnum.values();

		for (AdvBeerEnum advBeerEnum2 : advBeerEnum) {
			System.out.println(advBeerEnum2 + ",,,,,," + advBeerEnum2.ordinal());
		}
		switch (beerEnum2) {
		case KF:

			break;
		case RC:
		default:
			break;
		}
	}
}
