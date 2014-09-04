/*
 * Created on 2004-9-23
 */
package com.fairchild.gof23.behavioral;

/**
 * @author TomHornson(at)hotmail.com
 *
 */
public class TemplateMethod {
	public abstract static class AbstractClass {
		public void doOperations() {
			operation1();
			operation2();
			operation3();
		}

		public abstract void operation1();

		public abstract void operation2();

		public void operation3() {
		}
	}

	public static class ConcreteClass extends AbstractClass {
		@Override
		public void operation1() {
			System.out.println("operations1 implementation");
		}

		@Override
		public void operation2() {
			System.out.println("operations2 implementation");
		}

		@Override
		public void operation3() {
		}
	}
}
