/*
 * Created on 2004-9-23
 *
 */
package com.fairchild.gof23.creational;

/**
 * @author TomHornson@hotmail.com
 */
public class FactoryMethod {
	public static interface Product {
	}

	public static class Product1 implements Product {
	}

	public static class Product2 implements Product {
	}

	public static interface Creator {
		public Product create();
	}

	public static class ConcreteCreator1 implements Creator {
		public Product create() {
			return new Product1();
		}
	}

	public static class ConcreteCreator2 implements Creator {
		public Product create() {
			return new Product2();
		}
	}
}
