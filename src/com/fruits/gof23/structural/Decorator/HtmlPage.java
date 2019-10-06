package com.fruits.gof23.structural.Decorator;

public class HtmlPage implements Decoratee {
	private String content = null;

	public HtmlPage(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}
}