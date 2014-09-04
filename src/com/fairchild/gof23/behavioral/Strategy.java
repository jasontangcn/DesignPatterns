/*
 * Created on 2004-9-23
 */
package com.fairchild.gof23.behavioral;

/**
 * @author TomHornson(at)hotmail.com
 *
 */
public class Strategy {
	public static interface SortAlgorithm {
		public void sort(Object[] data);
	}

	public static class BinarySort implements SortAlgorithm {
		public void sort(Object[] data) {

		}
	}

	public static class QuickSort implements SortAlgorithm {
		public void sort(Object[] data) {

		}
	}

	public static class Computer {
		private SortAlgorithm sortAlgo;

		public Computer(SortAlgorithm sortAlgo) {
			this.sortAlgo = sortAlgo;
		}

		public void print(Object[] data) {
			this.sortAlgo.sort(data);
			for (Object obj : data) {
				System.out.println(obj);
			}
		}
	}
}
