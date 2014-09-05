/*
 * Created on 2004-9-23
 */
package com.fairchild.gof23.behavioral;

/**
 * @author TomHornson(at)hotmail.com
 *
 */
public class Iterator {
	public abstract static class Aggregate {
		public abstract $Iterator iterator();
	}

	public static interface $Iterator {
		public void first();

		public Object next();

		public boolean hasNext();
	}

	public static class AggregateImpl extends Aggregate {
		private Object[] objs = { "Hello", "World", "Hello", "Smart" };

		public $Iterator iterator() {
			return new IteratorImpl();
		}

		private class IteratorImpl implements $Iterator {
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

	public static void main(String[] args) {
		$Iterator it = new AggregateImpl().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
