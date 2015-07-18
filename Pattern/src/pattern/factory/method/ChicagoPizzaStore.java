package pattern.factory.method;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		
		if("cheese".equals(type)){
			return new ChicagoStylePizza();
		}else{
			// 第二类
		}
		
		return null;
	}

}
