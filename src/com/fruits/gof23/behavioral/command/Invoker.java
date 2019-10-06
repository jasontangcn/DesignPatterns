package com.fruits.gof23.behavioral.command;

public class Invoker {
	private EditCommand command;

	public Invoker(EditCommand command) {
		this.command = command;
	}

	public void action() {
		command.execute();
	}
}