package com.fairchild.gof23.structural.proxy;

public class ForumProxy implements Forum {
	private Forum forum;
	private Authorization authorization;
	private ForumPermissions permissions;

	public ForumProxy(Forum forum, Authorization authorization, ForumPermissions permissions) {
		this.forum = forum;
		this.authorization = authorization;
		this.permissions = permissions;
	}

	public void setName(String name) throws Exception {
		if (permissions.isSystemOrForumAdmin()) {
			forum.setName(name);
		} else {
			throw new Exception();
		}
	}
}