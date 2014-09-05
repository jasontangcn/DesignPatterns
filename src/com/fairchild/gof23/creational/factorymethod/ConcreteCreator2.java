package com.fairchild.gof23.creational.factorymethod;


public class ConcreteCreator2 implements Creator {
	public Product create() {
		return new Product2();
	}
}