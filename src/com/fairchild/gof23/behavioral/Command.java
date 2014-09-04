/*
 * Created on 2004-9-23
 */
package com.fairchild.gof23.behavioral;

/**
 * @author TomHornson(at)hotmail.com
 */
public class Command {
	public static class CommandContext {

	}

	public static interface EditCommand {
		public void execute();
	}

	public static class Save implements EditCommand {
		public Receiver receiver;

		public Save(Receiver receiver) {
			this.receiver = receiver;
		}

		public void execute() {
			receiver.action();
		}
	}

	public static class Delete implements EditCommand {
		public Receiver receiver;

		public Delete(Receiver receiver) {
			this.receiver = receiver;
		}

		public void execute() {
			receiver.action();
		}
	}

	public static class Replace implements EditCommand {
		public Receiver receiver;

		public Replace(Receiver receiver) {
			this.receiver = receiver;
		}

		public void execute() {
			receiver.action();
		}
	}

	public static class Invoker {
		private EditCommand command;

		public Invoker(EditCommand command) {
			this.command = command;
		}

		public void action() {
			command.execute();
		}
	}

	public static class Receiver {
		public void action() {

		}
	}

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		EditCommand save = new Save(receiver);
		Invoker invoker = new Invoker(save);
		invoker.action();
	}
}
