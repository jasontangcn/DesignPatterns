package com.fruits.gof23.structural.Decorator;

public class FooterDecorator implements Decoratee {
	private Decoratee decoratee = null;

	public FooterDecorator(Decoratee decoratee) {
		this.decoratee = decoratee;
	}

	public String getContent() {
		return decoratee.getContent() + "\nPage Footer";
	}
}