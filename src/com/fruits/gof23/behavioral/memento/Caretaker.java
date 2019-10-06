package com.fairchild.gof23.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	private Originator originator;
	private List mementos = new ArrayList();

	private int current;

	public Caretaker(Originator originator) {
		this.originator = originator;
	}

	public int createMementor() {
		Memento memento = originator.createMemento();
		mementos.add(memento);
		return current++;
	}

	public void restoreMemento(int index) {
		Memento memento = (Memento) mementos.get(index);
		originator.restoreMemento(memento);
	}

	public void removeMemento(int index) {
		this.mementos.remove(index);
	}
}