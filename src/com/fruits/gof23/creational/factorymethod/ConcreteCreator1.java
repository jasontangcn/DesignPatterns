package com.fairchild.gof23.creational.factorymethod;

public class ConcreteCreator1 implements Creator {
	public Product create() {
		return new Product1();
	}
}