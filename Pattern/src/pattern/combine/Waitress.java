package pattern.combine;

/**
 * 
 * 
 * @ClassName: Waitress 
 * @Description: 服务员
 * @author:	xuelin
 * @date: Jul 18, 2015 8:26:20 PM 
 *
 */
public class Waitress {
	/**
	 * 根菜单
	 * 
	 */
	private MenuComponent allMenu;

	public Waitress(MenuComponent allMenu) {
		super();
		this.allMenu = allMenu;
	}
	
	public void printMenu(){
		allMenu.print();
	}
}
