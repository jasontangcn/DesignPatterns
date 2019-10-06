package com.fruits.gof23.creational.prototype;

public class Computer implements Cloneable {
	private Disk disk = new Disk();

	public Object clone() throws CloneNotSupportedException {
		Computer computer = (Computer) super.clone();
		computer.disk = (Disk) this.disk.clone();
		return computer;
	}
}