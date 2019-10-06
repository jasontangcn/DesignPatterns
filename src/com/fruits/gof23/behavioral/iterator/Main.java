/*
 * Created on 2004-9-23
 */
package com.fruits.gof23.behavioral.iterator;

/**
 * @author TomHornson(at)hotmail.com
 *
 */
public class Main {
	public static void main(String[] args) {
		Iterator it = new AggregateImpl().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
