package com.fruits.gof23.behavioral.command;

public class Delete implements EditCommand {
	public Receiver receiver;
	public Delete(Receiver receiver) {
		this.receiver = receiver;
	}

	public void execute() {
		receiver.action();
	}
}