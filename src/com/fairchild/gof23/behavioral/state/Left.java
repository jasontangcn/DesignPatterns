package com.fairchild.gof23.behavioral.state;

public class Left implements Position {
	public Position goDown() throws Exception {
		throw new Exception("Can not move.");
	}

	public Position goUp() throws Exception {
		throw new Exception("Can not move.");
	}

	public Position goRight() throws Exception {
		return new Center();
	}

	public Position goLeft() throws Exception {
		throw new Exception("Can not move.");
	}
}