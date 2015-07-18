package pattern.decorator;

/**
 * (被装饰者)
 * 浓咖啡
 * 
 * @author Lin.Pc
 *
 */
public class Espresso extends Beverage {
	
	@Override
	public String getDescription() {
		return "Espresso";
	}
	
	@Override
	public double cost() {
		return 2;
	}
}
