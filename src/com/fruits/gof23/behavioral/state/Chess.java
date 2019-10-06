package com.fruits.gof23.behavioral.state;

public class Chess {
	private Position position;

	public Position getPosition() {
		return this.position;
	}

	public void goDown() throws Exception {
		this.position = position.goDown();
	}

	public void goUp() throws Exception {
		this.position = position.goUp();
	}

	public void goRight() throws Exception {
		this.position = position.goRight();
	}

	public void goLeft() throws Exception {
		this.position = position.goLeft();
	}
}