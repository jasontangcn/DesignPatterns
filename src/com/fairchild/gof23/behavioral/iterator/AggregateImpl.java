package com.fairchild.gof23.behavioral.iterator;

public class AggregateImpl extends Aggregate {
	private Object[] objs = { "Hello", "World", "Hello", "Smart" };

	public Iterator iterator() {
		return new IteratorImpl();
	}

	private class IteratorImpl implements Iterator {
		private int index = 0;

		public void first() {
			index = 0;
		}

		public Object next() {
			return objs[index++];
		}

		public boolean hasNext() {
			return (index < objs.length);
		}
	}
}