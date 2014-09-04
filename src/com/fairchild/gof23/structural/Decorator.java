/*
 * Created on 2004-9-23
 *
 */
package com.fairchild.gof23.structural;

/**
 * @author TomHornson(at)hotmail.com Add extra responsibilities. Use Decorator
 *         instead of inheritance.
 */
public class Decorator {
	public static class HeaderDecorator implements Decoratee {
		private Decoratee decoratee = null;

		public HeaderDecorator(Decoratee decoratee) {
			this.decoratee = decoratee;
		}

		public String getContent() {
			return "Page Header\n" + decoratee.getContent();
		}
	}

	public static class FooterDecorator implements Decoratee {
		private Decoratee decoratee = null;

		public FooterDecorator(Decoratee decoratee) {
			this.decoratee = decoratee;
		}

		public String getContent() {
			return decoratee.getContent() + "\nPage Footer";
		}
	}

	public static interface Decoratee {
		public String getContent();
	}

	public static class HtmlPage implements Decoratee {
		private String content = null;

		public HtmlPage(String content) {
			this.content = content;
		}

		public String getContent() {
			return this.content;
		}
	}

	public static void main(String[] args) {
		HtmlPage htmlPage = new HtmlPage("Hello World!");
		System.out.println(new FooterDecorator(new HeaderDecorator(htmlPage)).getContent());
	}
}
