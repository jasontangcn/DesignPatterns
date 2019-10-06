package com.fruits.gof23.creational.prototype;

public class Disk implements Cloneable {
	private StringBuffer content = new StringBuffer();

	public StringBuffer getContent() {
		return content;
	}

	public void setContent(StringBuffer content) {
		this.content = content;
	}

	public Object clone() throws CloneNotSupportedException {
		Disk obj = (Disk) super.clone();
		obj.setContent(new StringBuffer().append(obj.getContent().toString()));
		return obj;
	}
}