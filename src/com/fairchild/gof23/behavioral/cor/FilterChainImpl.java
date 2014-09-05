package com.fairchild.gof23.behavioral.cor;

import java.util.Stack;

public class FilterChainImpl implements FilterChain {
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