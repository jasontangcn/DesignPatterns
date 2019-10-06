package com.fruits.gof23.behavioral.templatemethod;

public abstract class AbstractClass {
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