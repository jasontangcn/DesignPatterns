package com.fairchild.gof23.creational;

// New concept: Product Family
// JDK java.awt.ToolKit
public class AbstractFactory {
	public static interface ProductA {
	}

	public static class ProductA1 implements ProductA {
	}

	public static class ProductA2 implements ProductA {
	}

	public static interface ProductB {
	}

	public static class ProductB1 implements ProductB {
	}

	public static class ProductB2 implements ProductB {
	}

	public static interface Creator {
		public ProductA createProductA();

		public ProductB createProductB();
	}

	public static class Creator1 implements Creator {
		public ProductA createProductA() {
			return new ProductA1();
		}

		public ProductB createProductB() {
			return new ProductB1();
		}
	}

	public static class Creator2 implements Creator {
		public ProductA createProductA() {
			return new ProductA2();
		}

		public ProductB createProductB() {
			return new ProductB2();
		}
	}
}
