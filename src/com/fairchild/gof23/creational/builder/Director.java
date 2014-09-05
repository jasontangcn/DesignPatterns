package com.fairchild.gof23.creational.builder;


public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public Product construct() {
		builder.buildPart1();
		builder.buildPart2();
		return builder.retrieveResult();
	}
}