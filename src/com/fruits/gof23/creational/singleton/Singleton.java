/*
 * Created on 2004-9-23
 */
package com.fairchild.gof23.creational.singleton;

/**
 * @author TomHornson(at)hotmail.com
 */
public class Singleton {
	// private static final Singleton instance = new Singleton();
	private static Singleton instance = null;

	private Singleton() {
	}

	public synchronized static Singleton getInstance() {
		if (null == instance) {
			instance = new Singleton();
			return instance;
		} else {
			return instance;
		}
	}
}
