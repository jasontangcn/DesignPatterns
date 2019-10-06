package com.fruits.gof23.behavioral.cor;

public class EncodeResponseFilter implements Filter {
	public void doFilter(FilterChain filterChain) {
		System.out.println("Start EncodeResponseFilter.");
		filterChain.doFilter();
		System.out.println("End EncodeResponseFilter.");
	}
}