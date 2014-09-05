/*
 * Created on 2004-9-23
 *
 */
package com.fairchild.gof23.structural;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author TomHornson(at)hotmail.com
 *
 */
public class Composite {
	public static abstract class Device {
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

	public static class MotherBoard extends Device {
		private List<Device> children = new ArrayList<Device>();

		public MotherBoard(String name) {
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

	public static class Memory extends Device {
		public Memory(String name) {
			super(name);
		}

		public float getPrice() {
			return 200;
		}
	}

	public static class Disk extends Device {
		public Disk(String name) {
			super(name);
		}

		public float getPrice() {
			return 500;
		}
	}

	public static class DisplayCard extends Device {
		public DisplayCard(String name) {
			super(name);
		}

		public float getPrice() {
			return 800;
		}
	}

	public static void main(String[] args) {
		DisplayCard displayCard = new DisplayCard("Nvidia");
		Disk disk = new Disk("Segate");
		Memory memory = new Memory("Samsung");
		MotherBoard motherBoard = new MotherBoard("ASUS");
		motherBoard.addDevice(displayCard);
		motherBoard.addDevice(disk);
		motherBoard.addDevice(memory);
		System.out.println(motherBoard.getPrice());
	}
}
