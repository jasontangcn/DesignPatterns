package com.fruits.gof23.behavioral.mediator;

public abstract class Colleague {
	private Mediator mediator;

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return this.mediator;
	}

	public abstract void action();

	public void change() {
		mediator.colleagueChanged(this);
	}
}