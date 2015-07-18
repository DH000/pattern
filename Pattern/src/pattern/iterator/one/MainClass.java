package pattern.iterator.one;

/**
 * 
 * 
 * @ClassName: MainClass
 * @Description: 测试类
 * @author: xuelin
 * @date: Jul 18, 2015 6:39:11 PM
 *
 */
public class MainClass {
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		waitress.printMenu();
	}
}
