package com.fruits.gof23.behavioral.cor;

public class DecodeRequestFilter implements Filter {
	public void doFilter(FilterChain filterChain) {
		System.out.println("Start EncodingFilter.");
		filterChain.doFilter();
		System.out.println("End EncodingFilter.");
	}
}