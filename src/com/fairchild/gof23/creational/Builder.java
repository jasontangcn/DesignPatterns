/*
 * Created on 2004-9-23
 */
package com.fairchild.gof23.creational;

/**
 * @author TomHornson(at)hotmail.com
 */
public class Builder {
	public static class Product {
	}

	abstract public static class $Builder {
		public abstract void buildPart1();

		public abstract void buildPart2();

		public abstract Product retrieveResult();
	}

	public static class ConcreteBuilder extends $Builder {
		private Product product = new Product();

		public void buildPart1() {

		}

		public void buildPart2() {

		}

		public Product retrieveResult() {
			return product;
		}
	}

	public static class Director {
		private $Builder builder;

		public Director($Builder builder) {
			this.builder = builder;
		}

		public Product construct() {
			builder.buildPart1();
			builder.buildPart2();
			return builder.retrieveResult();
		}
	}
}
