package pattern.decorator;


/**
 * 装饰者模式
 * 
 * @author Lin.Pc
 *
 */
public class MainClass {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println("Espresso: " + beverage.cost());
		
		
		beverage = new HouseBlend();
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Soy(beverage);
		beverage = new Whip(beverage);
		System.out.println("综合：" + beverage.cost());
	}
}
