package com.fairchild.gof23.behavioral.state;

public class Right implements Position {
	public Position goDown() throws Exception {
		throw new Exception("Can not move.");
	}

	public Position goUp() throws Exception {
		throw new Exception("Can not move.");
	}

	public Position goRight() throws Exception {
		throw new Exception("Can not move.");
	}

	public Position goLeft() throws Exception {
		return new Center();
	}
}