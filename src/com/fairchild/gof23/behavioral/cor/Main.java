/*
 * Created on 2004-9-23
 */
package com.fairchild.gof23.behavioral.cor;

/**
 * @author TomHornson(at)hotmail.com
 *
 */
public class Main {
	public static void main(String[] args) {
		FilterChainImpl filterChain = new FilterChainImpl();
		Filter decodeRequestFilter = new DecodeRequestFilter();
		Filter encodeResponseFilter = new EncodeResponseFilter();
		filterChain.addFilter(decodeRequestFilter);
		filterChain.addFilter(encodeResponseFilter);
		filterChain.doFilter();
	}
}
