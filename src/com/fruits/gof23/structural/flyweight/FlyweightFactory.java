package com.fruits.gof23.structural.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
	private HashMap flyweights = new HashMap();

	public Flyweight factory(String compositeState) {
		ConcreteCompositeFlyweight compositeFlyweight = new ConcreteCompositeFlyweight();
		if (null != compositeState) {
			for (int i = 0; i < compositeState.length(); i++) {
				Character state = new Character(compositeState.charAt(i));
				System.out.println("factory(" + state + ")");
				compositeFlyweight.add(state, this.factory(state));
			}
		}
		return compositeFlyweight;
	}

	public Flyweight factory(Character state) {
		if (this.flyweights.containsKey(state)) {
			return (Flyweight) flyweights.get(state);
		} else {
			Flyweight flyweight = new ConcreteFlyweight(state);
			flyweights.put(state, flyweight);
			return flyweight;
		}
	}

	public void checkFlyweights() {
		System.out.println(this.flyweights);
	}
}