package com.fruits.gof23.behavioral.strategy;

import com.fruits.gof23.behavioral.strategy.Main.SortAlgorithm;

public class Computer {
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