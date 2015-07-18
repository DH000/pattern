package pattern.iterator.one;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: PancakeHouseMenu
 * @Description: 对象村餐厅菜单
 * @author: xuelin
 * @date: Jul 18, 2015 5:23:06 PM
 *
 */
public class PancakeHouseMenu {
	private List<MenuItem> menuItems;

	public PancakeHouseMenu() {
		this.menuItems = new ArrayList<MenuItem>();

		addItem("K&B Pancake Breakfast", "Pancakes with scambaled eggs", true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fire eggs, sausage", false, 2.99);
		addItem("Blueberry Pancakes", "Pancake with fresh blueberries", true, 3.94);
		addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
	}
	
	public void addItem(String name, String desc, boolean isVeg, double price){
		menuItems.add(new MenuItem(name, desc, isVeg, price));
	}
	
	public Iterator<MenuItem> iterator(){
		return new PancakeHouseMenuIterator(menuItems);
	}
}
