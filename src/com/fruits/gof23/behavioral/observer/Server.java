package com.fruits.gof23.behavioral.observer;

import java.util.Observable;

public class Server extends Observable {
	public void shutdown() {
		this.notifyObservers(new ServerEvent("shutdown"));
	}
}