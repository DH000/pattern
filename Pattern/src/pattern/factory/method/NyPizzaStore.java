package pattern.factory.method;

public class NyPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		
		if("cheese".equals(type)){
			return new NyStylePizza();
		}else{
			// 第二类
		}
		
		return null;
	}

}
