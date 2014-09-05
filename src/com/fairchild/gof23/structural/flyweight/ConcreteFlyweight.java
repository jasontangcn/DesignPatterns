package com.fairchild.gof23.structural.flyweight;

public class ConcreteFlyweight extends Flyweight {
	private Character intrinsicState = null;

	public ConcreteFlyweight(Character intrinsicState) {
		this.intrinsicState = intrinsicState;
	}

	public void operation(String extrinsicState) {
		System.out.println("Internal state = " + this.intrinsicState + " ; Extrinsic state = " + extrinsicState);
	}
}