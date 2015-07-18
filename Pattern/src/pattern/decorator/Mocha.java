package pattern.decorator;

/**
 * (装饰者)
 * 摩卡
 * @author Lin.Pc
 *
 */
public class Mocha extends Seasoning {
	private Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return "Mocha";
	}

	@Override
	public double cost() {
		return 0.5 + beverage.cost();
	}

}
