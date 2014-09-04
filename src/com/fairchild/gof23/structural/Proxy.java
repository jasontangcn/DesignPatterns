/*
 * Created on 2004-9-23
 */
package com.fairchild.gof23.structural;

/**
 * @author TomHornson(at)hotmail.com
 */
public class Proxy {
	public static class ForumPermissions {
		/**
		 * Permission to read object.
		 */
		public static final int READ = 0;

		/**
		 * Permission to administer the entire sytem.
		 */
		public static final int SYSTEM_ADMIN = 1;

		/**
		 * Permission to administer a particular forum.
		 */
		public static final int FORUM_ADMIN = 2;

		/**
		 * Permission to administer a particular user.
		 */
		public static final int USER_ADMIN = 3;

		/**
		 * Permission to administer a particular group.
		 */
		public static final int GROUP_ADMIN = 4;

		/**
		 * Permission to moderate threads.
		 */
		public static final int MODERATE_THREADS = 5;

		/**
		 * Permission to create a new thread.
		 */
		public static final int CREATE_THREAD = 6;

		/**
		 * Permission to create a new message.
		 */
		public static final int CREATE_MESSAGE = 7;

		/**
		 * Permission to moderate messages.
		 */
		public static final int MODERATE_MESSAGES = 8;

		private boolean[] values = new boolean[9];

		public boolean isSystemOrForumAdmin() {
			return (values[FORUM_ADMIN] || values[SYSTEM_ADMIN]);
		}

		public boolean get(int permission) {
			return values[permission];
		}

	}

	public static interface Authorization {
	}

	public static interface Forum {
		public void setName(String name) throws Exception;
	}

	public static class ForumProxy implements Forum {
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

	public static class ForumImpl implements Forum {
		private String name;

		public void setName(String name) throws Exception {
			this.name = name;
		}
	}

	public abstract static class ForumFactory {
		public abstract Forum createForum(String name, String description) throws Exception;
	}

	public static class ForumFactoryProxy extends ForumFactory {
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
}
