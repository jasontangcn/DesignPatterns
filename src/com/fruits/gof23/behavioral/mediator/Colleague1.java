package com.fruits.gof23.behavioral.mediator;

public class Colleague1 extends Colleague {
	public Colleague1(Mediator mediator) {
		super(mediator);
	}

	public void action() {
		System.out.println("Colleague1 action.");
	}
}