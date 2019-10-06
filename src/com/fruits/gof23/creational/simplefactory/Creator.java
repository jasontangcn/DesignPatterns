package com.fruits.gof23.creational.simplefactory;

public class Creator {
	public static Product create(String type) {
		if ("productType".equals(type)) {
			return new ConcreteProduct();
		}
		return null;
	}
}