package com.fairchild.gof23.behavioral.command;

public class Save implements EditCommand {
	public Receiver receiver;

	public Save(Receiver receiver) {
		this.receiver = receiver;
	}

	public void execute() {
		receiver.action();
	}
}