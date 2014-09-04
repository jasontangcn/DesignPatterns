/*
 * Created on 2004-9-23
 */
package com.fairchild.gof23.structural;

/**
 * @author TomHornson(at)hotmail.com
 */
public class Adapter {
	public static interface Target {
		public void method1();

		public void method2();
	}

	public static class Adaptee {
		public void method3() {
		}

		public void method4() {
		}
	}

	public static class $Adapter implements Target {
		private Adaptee adaptee;

		public $Adapter(Adaptee adaptee) {
			this.adaptee = adaptee;
		}

		public void method1() {
			adaptee.method3();
		}

		public void method2() {
			adaptee.method4();
		}
	}
}
