package com.fairchild.gof23.structural.Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Computer extends Device {
	private List<Device> children = new ArrayList<Device>();

	public Computer(String name) {
		super(name);
	}

	public float getPrice() {
		float price = 0;
		for (Device device : children) {
			price += device.getPrice();
		}

		return price;
	}

	public boolean addDevice(Device child) {
		return children.add(child);
	}

	public boolean removeDevice(Device child) {
		return children.remove(child);
	}

	public Iterator iterator() {
		return children.iterator();
	}
}