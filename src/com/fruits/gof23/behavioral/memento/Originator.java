package com.fruits.gof23.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Originator {
	private List states;
	private int index;

	public Originator() {
		states = new ArrayList();
	}

	public Memento createMemento() {
		return new MementoInternal(states, index);
	}

	public void restoreMemento(Memento memento) {
		MementoInternal mementoInternal = (MementoInternal) memento;
		states = mementoInternal.getStates();
		index = mementoInternal.getIndex();
	}

	public void setState(String state) {
		this.states.add(state);
		index++;
	}

	public void printStates() {
		for (Object state : states) {
			System.out.println(state);
		}
	}

	protected class MementoInternal implements Memento {
		private List states;
		private int index;

		public MementoInternal(List states, int index) {
			this.states = states;
			this.index = index;
		}

		public List getStates() {
			return states;
		}

		public void setStates(List states) {
			this.states = states;
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}
	}
}