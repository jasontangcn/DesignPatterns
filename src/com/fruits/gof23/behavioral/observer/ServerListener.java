package com.fairchild.gof23.behavioral.observer;

import java.util.Observable;

public class ServerListener implements java.util.Observer {
	public void update(Observable o, Object arg) {
		System.out.println(arg);
	}
}