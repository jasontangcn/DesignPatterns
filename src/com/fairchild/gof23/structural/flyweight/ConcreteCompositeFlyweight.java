package com.fairchild.gof23.structural.flyweight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcreteCompositeFlyweight extends Flyweight {
	private HashMap flyweights = new HashMap(10);

	public ConcreteCompositeFlyweight() {
	}

	public void add(Character key, Flyweight flyweight) {
		flyweights.put(key, flyweight);
	}

	public void operation(String extrinsicState) {
		for (Iterator it = flyweights.entrySet().iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			((Flyweight) entry.getValue()).operation(extrinsicState);
		}
	}
}