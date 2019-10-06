package com.fairchild.gof23.behavioral.command;

public class Replace implements EditCommand {
	public Receiver receiver;

	public Replace(Receiver receiver) {
		this.receiver = receiver;
	}

	public void execute() {
		receiver.action();
	}
}