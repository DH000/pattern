package pattern.decorator;

/**
 * (被装饰者)
 * 焦炒咖啡
 * 
 * @author Lin.Pc
 *
 */
public class DarkRoast extends Beverage {
	@Override
	public String getDescription() {
		return "Dark Roast";
	}
	
	@Override
	public double cost() {
		return 5.3;
	}

}
