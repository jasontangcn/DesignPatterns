package com.fairchild.gof23.structural.proxy;

public class ForumFactoryProxy extends ForumFactory {
	protected ForumFactory factory;
	protected Authorization authorization;
	protected ForumPermissions permissions;

	public ForumFactoryProxy(Authorization authorization, ForumFactory factory, ForumPermissions permissions) {
		this.factory = factory;
		this.authorization = authorization;
		this.permissions = permissions;
	}

	public Forum createForum(String name, String description) throws Exception {
		if (permissions.get(ForumPermissions.SYSTEM_ADMIN)) {
			Forum forum = factory.createForum(name, description);
			return new ForumProxy(forum, authorization, permissions);
		} else {
			throw new Exception();
		}
	}
}