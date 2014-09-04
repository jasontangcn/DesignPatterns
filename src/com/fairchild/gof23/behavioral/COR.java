/*
 * Created on 2004-9-23
 */
package com.fairchild.gof23.behavioral;

import java.util.Stack;

/**
 * @author TomHornson(at)hotmail.com
 *
 */
public class COR {
	public static interface Filter {
		public void doFilter(FilterChain filterChain);
	}

	public static class DecodeRequestFilter implements Filter {
		public void doFilter(FilterChain filterChain) {
			System.out.println("Start EncodingFilter.");
			filterChain.doFilter();
			System.out.println("End EncodingFilter.");
		}
	}

	public static class EncodeResponseFilter implements Filter {
		public void doFilter(FilterChain filterChain) {
			System.out.println("Start EncodeResponseFilter.");
			filterChain.doFilter();
			System.out.println("End EncodeResponseFilter.");
		}
	}

	public static interface FilterChain {
		public void doFilter();
	}

	public static class FilterChainImpl implements FilterChain {
		private Stack filters = new Stack();

		public void doFilter() {
			Filter nextFilter = getFilter();
			if (null != nextFilter)
				nextFilter.doFilter(this);
		}

		public void addFilter(Filter filter) {
			this.filters.push(filter);
		}

		public Filter getFilter() {
			if (!filters.isEmpty())
				return (Filter) filters.pop();
			return null;
		}
	}

	public static void main(String[] args) {
		FilterChainImpl filterChain = new FilterChainImpl();
		Filter decodeRequestFilter = new DecodeRequestFilter();
		Filter encodeResponseFilter = new EncodeResponseFilter();
		filterChain.addFilter(decodeRequestFilter);
		filterChain.addFilter(encodeResponseFilter);
		filterChain.doFilter();
	}
}
