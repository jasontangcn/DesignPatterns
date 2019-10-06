package com.fairchild.gof23.behavioral.mediator;

public class ConcreteMediator extends Mediator {
	private Colleague1 colleague1;
	private Colleague2 colleague2;

	public ConcreteMediator() {
		this.colleague1 = new Colleague1(this);
		this.colleague2 = new Colleague2(this);
	}

	public void colleagueChanged(Colleague colleague) {
		colleague1.action();
		colleague2.action();
	}

	public Colleague1 getColleague1() {
		return this.colleague1;
	}

	public Colleague2 getColleague2() {
		return this.colleague2;
	}
}