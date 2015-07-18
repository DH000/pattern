package pattern.decorator;

/**
 * (装饰者)
 * 豆浆
 * 
 * @author Lin.Pc
 *
 */
public class Soy extends Seasoning {
	private Beverage beverage;
	
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return "Mocha";
	}

	@Override
	public double cost() {
		return 0.6 + beverage.cost();
	}
}
