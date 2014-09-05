package com.fairchild.gof23.behavioral.state;

public interface Position {
	public Position goDown() throws Exception;

	public Position goUp() throws Exception;

	public Position goRight() throws Exception;

	public Position goLeft() throws Exception;
}