/*
 * Created on 2004-9-23
 *
 */
package com.fairchild.gof23.behavioral.mediator;

/**
 * @author TomHornson(at)hotmail.com
 *
 */
public class Main {
	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		Colleague1 colleague1 = new Colleague1(mediator);
		Colleague2 colleague2 = new Colleague2(mediator);
		mediator.colleagueChanged(colleague1);
	}
}
