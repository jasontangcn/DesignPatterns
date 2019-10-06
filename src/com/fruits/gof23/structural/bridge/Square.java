package com.fairchild.gof23.structural.bridge;

public class Square extends Shape {
	public void draw() {
		drawer.drawLine(new Point(0, 0), new Point(10, 0));
		drawer.drawLine(new Point(0, 0), new Point(0, 10));
		drawer.drawLine(new Point(0, 10), new Point(10, 10));
		drawer.drawLine(new Point(10, 0), new Point(10, 10));
	}
}