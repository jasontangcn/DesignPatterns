/*
 * Created on 2004-9-23
 */
package com.fairchild.gof23.behavioral.command;

/**
 * @author TomHornson(at)hotmail.com
 */
public class Main {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		EditCommand save = new Save(receiver);
		Invoker invoker = new Invoker(save);
		invoker.action();
	}
}
