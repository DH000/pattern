package pattern.decorator;

/**
 * (装饰者) 奶泡
 * 
 * @author Lin.Pc
 *
 */
public class Whip extends Seasoning {
	private Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return "Mocha";
	}

	@Override
	public double cost() {
		return 0.8 + beverage.cost();
	}

}
