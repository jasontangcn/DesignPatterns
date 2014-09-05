package com.fairchild.gof23.creational.builder;


public class ConcreteBuilder extends Builder {
	private Product product = new Product();

	public void buildPart1() {

	}

	public void buildPart2() {

	}

	public Product retrieveResult() {
		return product;
	}
}