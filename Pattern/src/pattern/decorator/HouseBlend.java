package pattern.decorator;

/**
 * (被装饰者)
 * 综合咖啡
 * 
 * @author Lin.Pc
 *
 */
public class HouseBlend extends Beverage {

	@Override
	public String getDescription() {
		return "House Blend";
	}
	
	@Override
	public double cost() {
		return 3.5;
	}

}
