/*
 * Created on 2004-9-23
 */
package com.fairchild.gof23.structural;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author TomHornson(at)hotmail.com
 *
 */
public class Flyweight {
	public static abstract class $Flyweight {
		abstract public void operation(String extrinsicState);
	}

	public static class ConcreteFlyweight extends $Flyweight {
		private Character intrinsicState = null;

		public ConcreteFlyweight(Character intrinsicState) {
			this.intrinsicState = intrinsicState;
		}

		public void operation(String extrinsicState) {
			System.out.println("Internal state = " + this.intrinsicState + " ; Extrinsic state = " + extrinsicState);
		}
	}

	public static class ConcreteCompositeFlyweight extends $Flyweight {
		private HashMap flyweights = new HashMap(10);

		public ConcreteCompositeFlyweight() {
		}

		public void add(Character key, $Flyweight flyweight) {
			flyweights.put(key, flyweight);
		}

		public void operation(String extrinsicState) {
			for (Iterator it = flyweights.entrySet().iterator(); it.hasNext();) {
				Map.Entry entry = (Map.Entry) it.next();
				(($Flyweight) entry.getValue()).operation(extrinsicState);
			}
		}
	}

	public static class FlyweightFactory {
		private HashMap flyweights = new HashMap();

		public $Flyweight factory(String compositeState) {
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

		public $Flyweight factory(Character state) {
			if (this.flyweights.containsKey(state)) {
				return ($Flyweight) flyweights.get(state);
			} else {
				$Flyweight flyweight = new ConcreteFlyweight(state);
				flyweights.put(state, flyweight);
				return flyweight;
			}
		}

		public void checkFlyweights() {
			System.out.println(this.flyweights);
		}
	}
}
