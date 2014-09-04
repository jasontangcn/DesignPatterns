/*
 * Created on 2004-9-23
 */
package com.fairchild.gof23.creational;

/**
 * @author TomHornson@hotmail.com
 */
public class Prototype {
	public static class InnerClass1 implements Cloneable {
		private StringBuffer content = new StringBuffer();

		public StringBuffer getContent() {
			return content;
		}

		public void setContent(StringBuffer content) {
			this.content = content;
		}

		public Object clone() throws CloneNotSupportedException {
			InnerClass1 obj = (InnerClass1) super.clone();
			obj.setContent(new StringBuffer().append(obj.getContent().toString()));
			return obj;
		}
	}

	public static class InnerClass2 implements Cloneable {
		private InnerClass1 innerClass1Obj = new InnerClass1();

		public Object clone() throws CloneNotSupportedException {
			InnerClass2 innerClass2Obj = (InnerClass2) super.clone();
			innerClass2Obj.innerClass1Obj = (InnerClass1) this.innerClass1Obj.clone();
			return innerClass2Obj;
		}
	}
}
