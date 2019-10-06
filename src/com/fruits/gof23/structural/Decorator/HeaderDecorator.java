package com.fruits.gof23.structural.Decorator;

public class HeaderDecorator implements Decoratee {
	private Decoratee decoratee = null;

	public HeaderDecorator(Decoratee decoratee) {
		this.decoratee = decoratee;
	}

	public String getContent() {
		return "Page Header\n" + decoratee.getContent();
	}
}