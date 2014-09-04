/*
 * Created on 2004-9-23
 */
package com.fairchild.gof23.behavioral;

/**
 * @author TomHornson@hotmail.com
 */
public class State {
	public static interface Position {
		public Position goDown() throws Exception;

		public Position goUp() throws Exception;

		public Position goRight() throws Exception;

		public Position goLeft() throws Exception;
	}

	public static class Chess {
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

	public static class Down implements Position {
		public Position goDown() throws Exception {
			throw new Exception("Can not move.");
		}

		public Position goUp() throws Exception {
			return new Center();
		}

		public Position goRight() throws Exception {
			throw new Exception("Can not move.");
		}

		public Position goLeft() throws Exception {
			throw new Exception("Can not move.");
		}
	}

	public static class Center implements Position {
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

	public static class Up implements Position {
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

	public static class Left implements Position {
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

	public static class Right implements Position {
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
}
