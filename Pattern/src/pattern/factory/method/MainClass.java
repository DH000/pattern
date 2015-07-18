package pattern.factory.method;

/**
 * 工厂方法模式
 * 
 * 
 * @author Lin.Pc
 *
 */
public class MainClass {
	 public static void main(String[] args) {
		// 纽约风味
		NyPizzaStore nyStore = new NyPizzaStore();
		Pizza pizza = nyStore.orderPizza("cheese");
		
		System.out.println("name: " + pizza.getName());
		
		// 芝加哥风味
		ChicagoPizzaStore chStore = new ChicagoPizzaStore();
		pizza = chStore.orderPizza("cheese");
		System.out.println("name: " + pizza.getName());
	}
}
