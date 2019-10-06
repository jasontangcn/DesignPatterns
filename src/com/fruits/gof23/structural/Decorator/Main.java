/*
 * Created on 2004-9-23
 *
 */
package com.fairchild.gof23.structural.Decorator;

/**
 * @author TomHornson(at)hotmail.com
 * Add extra responsibilities. 
 * Use Decorator instead of inheritance.
 */
public class Main {
	public static void main(String[] args) {
		HtmlPage htmlPage = new HtmlPage("Hello World!");
		System.out.println(new FooterDecorator(new HeaderDecorator(htmlPage)).getContent());
	}
}
