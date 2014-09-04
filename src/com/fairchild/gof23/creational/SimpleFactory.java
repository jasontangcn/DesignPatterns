package com.fairchild.gof23.creational;

/*
 * 
 * @author TomHornson@hotmail.com
 *
 * 简单工厂又叫静态工厂方法，是由一个工厂对象决定创建出哪一种产品类的实例。
 * 模式的核心是工厂类。这个类含有必要的判断逻辑，可以决定在什么时候创建哪一个 产品类的实例。而客户端则可以免除直接创建产品对象的责任，而仅仅负责“消费”产品。
 * 简单工厂模式通过这种做法实现了对责任的分割。
 * 
 * 模式的缺点
 * 正如同在本章前面所讨论的，当产品类有复杂的多层次等级结构时，工厂类只有它自己。以不变应万变，就是模式的缺点。
 * 
 * 这个工厂类集中了所有的产品创建逻辑，形成一个无所不知的全能类，
 * 有人把这种类叫做上帝类（God Class）。
 * 如果这个全能类代表的是农场的一个具体园丁的话，那么这个园丁就需要对所有的产品负责，成了农场的关键人物，他什么时候不能正常工作了，整个农 场都要受到影响。
 * 
 * 将这么多的逻辑集中放在一个类里面的另外一个缺点是，当产品类有不同的接口种类时，
 * 工厂类需要判断在什么时候创建某种产品。这种对时机的判断和对哪一种具体产品的判断逻辑混合在一起，使得系统在将来进行功能扩展时较为困难。
 * 这一缺点在工厂方法模式中得到克服。
 * 
 * 由于简单工厂模式使用静态方法作为工厂方法，而静态方法无法由子类继承，因此，工厂角色无法形成基于继承的等级结构。这一缺点会在工厂方法模式中得到克服。
 *
 * “开–闭”原则
 * “开–闭”原则要求一个系统的设计能够允许系统在无需修改的情况下，扩展其功能。
 * 那么简单工厂模式是否满足这个条件？
 * 
 * 
 */
public class SimpleFactory {
	public static interface Product {
	}

	public static class ConcreteProduct implements Product {
	}

	public static class Creator {
		public static Product create(String type) {
			if ("productType".equals(type)) {
				return new ConcreteProduct();
			}
			return null;
		}
	}
}
