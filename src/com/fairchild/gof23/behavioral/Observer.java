/*
 * Created on 2004-9-23
 *
 */
package com.fairchild.gof23.behavioral;

import java.util.Observable;

/**
 * @author TomHornson(at)hotmail.com
 *
 */
public class Observer {
	public static class ServerEvent {
		public ServerEvent(String type) {
		}
	}

	public static class ServerListener implements java.util.Observer {
		public void update(Observable o, Object arg) {
			System.out.println(arg);
		}
	}

	public static class Server extends Observable {
		public void shutdown() {
			this.notifyObservers(new ServerEvent("shutdown"));
		}
	}
}
