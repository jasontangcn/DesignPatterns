package com.fairchild.gof23.structural.bridge;


public class DrawerFactory {
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