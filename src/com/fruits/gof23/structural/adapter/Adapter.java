package com.fairchild.gof23.structural.adapter;

/**
 * @author TomHornson(at)hotmail.com
 */
public class Adapter implements Target {
	private Adaptee adaptee = null;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	public void method1() {
		this.adaptee.method3();
	}

	public void method2() {
		this.adaptee.method4();
	}
}