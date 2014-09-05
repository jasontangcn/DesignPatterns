package com.fairchild.gof23.behavioral.state;

public class Center implements Position {
	public Position goDown() throws Exception {
		return new Down();
	}

	public Position goUp() throws Exception {
		return new Up();

	}

	public Position goRight() throws Exception {
		return new Right();
	}

	public Position goLeft() throws Exception {
		return new Left();
	}
}