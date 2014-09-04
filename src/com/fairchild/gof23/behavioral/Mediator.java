/*
 * Created on 2004-9-23
 *
 */
package com.fairchild.gof23.behavioral;

/**
 * @author TomHornson(at)hotmail.com
 *
 */
public class Mediator {
	public static abstract class Colleague {
		private $Mediator mediator;

		public Colleague($Mediator mediator) {
			this.mediator = mediator;
		}

		public $Mediator getMediator() {
			return this.mediator;
		}

		public abstract void action();

		public void change() {
			mediator.colleagueChanged(this);
		}
	}

	public static class Colleague1 extends Colleague {
		public Colleague1($Mediator mediator) {
			super(mediator);
		}

		public void action() {
			System.out.println("Colleague1 action.");
		}
	}

	public static class Colleague2 extends Colleague {
		public Colleague2($Mediator mediator) {
			super(mediator);
		}

		public void action() {
			System.out.println("Colleague2 action.");
		}
	}

	public static abstract class $Mediator {
		public abstract void colleagueChanged(Colleague colleague);

		public static void main(String[] args) {
			ConcreteMediator mediator = new ConcreteMediator();
			Colleague1 colleague1 = new Colleague1(mediator);
			Colleague2 colleague2 = new Colleague2(mediator);
			mediator.colleagueChanged(colleague1);
		}
	}

	public static class ConcreteMediator extends $Mediator {
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
}
