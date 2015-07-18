package pattern.iterator.one;

/**
 * 
 * 
 * @ClassName: DinerMenu 
 * @Description: 对象村煎饼店
 * @author:	xuelin
 * @date: Jul 18, 2015 5:35:02 PM 
 *
 */
public class DinerMenu {
	private static final int MAX_ITEMS = 6;
	private int numberOfItems = 0;
	private MenuItem[] menuItems;

	public DinerMenu() {
		super();
		this.menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Vegetarian BLT", "('Fakin') Bacon with letter & tomato on whole wheat", true, 2.99);
		addItem("BLT", "Bacon with letter & tomato on whole wheat", false, 2.99);
		addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
		addItem("Hotdog", "A hot dog, with saurkraut, relish, conions, topped with cheese", false, 3.05);
	}
	
	public void addItem(String name, String desc, boolean isVeg, double price){
		MenuItem menuItem = new MenuItem(name, desc, isVeg, price);
		
		if(numberOfItems >= MAX_ITEMS){
			System.out.println("Sorry, menu is full! cant't add item to menu");
		}else{
			menuItems[numberOfItems] = menuItem;
			numberOfItems += 1;
		}
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}
	
}
