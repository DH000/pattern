package pattern.combine;

/**
 * 
 * 
 * @ClassName: MaiNClass
 * @Description: 组合模式测试类
 * @author: xuelin
 * @date: Jul 18, 2015 8:27:41 PM
 *
 */
public class MainClass {
	public static void main(String[] args) {
		// 父菜单
		MenuComponent pancakeHouseMenu = new Menu("Pancake house menu", "Breakfast");
		MenuComponent dinerMenu = new Menu("Diner menu", "Lunch");
		MenuComponent dessertMenu = new Menu("Dessert menu", "Dessert of course");
		
		MenuComponent allMenus = new Menu("All menus", "All menus combined");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		
		// 叶子菜单
		dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));
		
		dinerMenu.add(dessertMenu);
		
		// 叶子菜单
		dessertMenu.add(new MenuItem("Apple pine", "Apple pine with a flaky crust, topped with vanilla ice cream", true, 1.59));
	
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}
}
