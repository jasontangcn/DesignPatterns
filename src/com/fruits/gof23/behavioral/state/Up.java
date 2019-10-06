package com.fruits.gof23.behavioral.state;

public class Up implements Position {
	public Position goDown() throws Exception {
		return new Center();
	}

	public Position goUp() throws Exception {
		throw new Exception("Can not move.");
	}

	public Position goRight() throws Exception {
		throw new Exception("Can not move.");
	}

	public Position goLeft() throws Exception {
		throw new Exception("Can not move.");
	}
}