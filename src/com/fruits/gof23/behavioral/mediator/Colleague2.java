package com.fruits.gof23.behavioral.mediator;

public class Colleague2 extends Colleague {
	public Colleague2(Mediator mediator) {
		super(mediator);
	}

	public void action() {
		System.out.println("Colleague2 action.");
	}
}