package com.fairchild.gof23.structural.bridge;

public abstract class Shape {
	Drawer drawer = DrawerFactory.getInstance();

	public abstract void draw();
}