package com.fruits.gof23.creational.abstractfactory;

public class Creator1 implements Creator {
	public ProductA createProductA() {
		return new ProductA1();
	}

	public ProductB createProductB() {
		return new ProductB1();
	}
}