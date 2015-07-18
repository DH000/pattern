package pattern.abstrac.factory;

import pattern.factory.method.Pizza;

public class CheesePizza extends Pizza {
	private SourceFactory sourceFactory;

	public CheesePizza(SourceFactory sourceFactory) {
		this.sourceFactory = sourceFactory;
	}
	
	@Override
	public String getName() {
		return "Cheese Pizza";
	}
	
	@Override
	public void prepare() {
		sourceFactory.createCheese();
	}

}
