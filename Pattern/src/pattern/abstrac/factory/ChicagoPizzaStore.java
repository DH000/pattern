package pattern.abstrac.factory;

import pattern.factory.method.Pizza;
import pattern.factory.method.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		SourceFactory sourceFactory = new ChicagoSourceFactory();

		if ("cheese".equals(type)) {
			return new CheesePizza(sourceFactory);
		} else {
			/**
			 * more
			 * 
			 * 
			 */
		}

		return null;
	}

}
