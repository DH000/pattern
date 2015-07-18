package pattern.abstrac.factory;

import pattern.factory.method.Pizza;

/**
 * 抽象工厂模式
 * 
 * 
 * @author Lin.Pc
 *
 */
public class MainClass {
	public static void main(String[] args) {
		NyPizzaStore nyStore = new NyPizzaStore();
		Pizza pizza = nyStore.orderPizza("cheese");

		ChicagoPizzaStore chStore = new ChicagoPizzaStore();
		pizza = chStore.orderPizza("cheese");
	}
}
