package com.fairchild.gof23.creational.abstractfactory;

public class Creator2 implements Creator {
	public ProductA createProductA() {
		return new ProductA2();
	}

	public ProductB createProductB() {
		return new ProductB2();
	}
}