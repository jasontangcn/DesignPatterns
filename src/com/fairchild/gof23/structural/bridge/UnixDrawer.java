package com.fairchild.gof23.structural.bridge;

public class UnixDrawer implements Drawer {
	public void drawLine(Point start, Point end) {
		System.out.println("UnixDrawer");
	}
}