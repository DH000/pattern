package pattern.decorator;
/**
 * 
 * 饮料
 * 
 * @author Lin.Pc
 *
 */
public abstract class Beverage {
	private String description = "Unknown Beveage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
