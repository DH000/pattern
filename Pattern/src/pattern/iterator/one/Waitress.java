package pattern.iterator.one;

/**
 * 
 * @ClassName: Waitress 
 * @Description: 菜单服务
 * @author:	xuelin
 * @date: Jul 18, 2015 6:29:27 PM 
 *
 */
public class Waitress {
	
	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		super();
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu(){
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.iterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.iterator();
		
		System.out.println("Menu\n--------\nBreakfast");
		printMenu(pancakeIterator);
		System.out.println("\nLunch");
		printMenu(dinerIterator);
	}
	
	public void printMenu(Iterator<MenuItem> iter){
		while(iter.hasNext()){
			MenuItem menuItem = iter.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDesc());
		}
	}
}
