/*
 * Created on 2004-9-23
 *
 */
package com.fairchild.gof23.structural.Composite;


/**
 * @author TomHornson(at)hotmail.com
 */
public class Main {
	public static void main(String[] args) {
		DisplayCard displayCard = new DisplayCard("Nvidia");
		Disk disk = new Disk("Segate");
		Memory memory = new Memory("Samsung");
		Computer computer = new Computer("ASUS");
		computer.addDevice(displayCard);
		computer.addDevice(disk);
		computer.addDevice(memory);
		System.out.println(computer.getPrice());
	}
}
