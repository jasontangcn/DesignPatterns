package com.fairchild.gof23.structural.proxy;

public abstract class ForumFactory {
	public abstract Forum createForum(String name, String description) throws Exception;
}