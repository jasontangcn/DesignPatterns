package com.fairchild.gof23.structural.bridge;

public class Triangle extends Shape {
	public void draw() {
		drawer.drawLine(new Point(0, 0), new Point(10, 0));
		drawer.drawLine(new Point(0, 0), new Point(5, 10));
		drawer.drawLine(new Point(5, 10), new Point(10, 0));
	}
}