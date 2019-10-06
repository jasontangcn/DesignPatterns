package com.fruits.gof23.structural.Composite;

import java.util.Iterator;

public abstract class Device {
	private String name;

	public Device(String name) {
		this.name = name;
	}

	public abstract float getPrice();

	public boolean addDevice(Device child) {
		return false;
	}

	public boolean removeDevice(Device child) {
		return false;
	}

	public Iterator iterator() {
		return null;
	}
}