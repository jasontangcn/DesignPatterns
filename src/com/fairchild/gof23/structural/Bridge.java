/*
 * Created on 2004-9-23
 *
 */
package com.fairchild.gof23.structural;

/**
 * @author TomHornson(at)hotmail.com
 * 
 * Separate behaviors and abstraction. 
 * Difference between Bridge and Abstract Factory.
 */
public class Bridge {
	public static class Point {
		private int x;
		private int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
	}

	public static interface Drawer {
		public void drawLine(Point start, Point end);
	}

	public static class WinDrawer implements Drawer {
		public void drawLine(Point start, Point end) {
			System.out.println("WinDrawer");
		}
	}

	public static class UnixDrawer implements Drawer {
		public void drawLine(Point start, Point end) {
			System.out.println("UnixDrawer");
		}
	}

	public static class DrawerFactory {
		private static Drawer drawer = null;

		public synchronized static Drawer getInstance() {
			boolean isWinSystem = true;

			if (null == drawer) {
				if (isWinSystem) {
					drawer = new WinDrawer();
				} else {
					drawer = new UnixDrawer();
				}
			}
			return drawer;

		}
	}

	public abstract static class Shape {
		Drawer drawer = DrawerFactory.getInstance();

		public abstract void draw();
	}

	public static class Triangle extends Shape {
		public void draw() {
			drawer.drawLine(new Point(0, 0), new Point(10, 0));
			drawer.drawLine(new Point(0, 0), new Point(5, 10));
			drawer.drawLine(new Point(5, 10), new Point(10, 0));
		}
	}

	public static class Square extends Shape {
		public void draw() {
			drawer.drawLine(new Point(0, 0), new Point(10, 0));
			drawer.drawLine(new Point(0, 0), new Point(0, 10));
			drawer.drawLine(new Point(0, 10), new Point(10, 10));
			drawer.drawLine(new Point(10, 0), new Point(10, 10));
		}
	}
}
