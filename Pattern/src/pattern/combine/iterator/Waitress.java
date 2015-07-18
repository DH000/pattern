package pattern.combine.iterator;

import java.util.Iterator;

/**
 * 
 * 
 * @ClassName: Waitress 
 * @Description: 服务员
 * @author:	xuelin
 * @date: Jul 18, 2015 9:05:03 PM 
 *
 */
public class Waitress {
	private MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		super();
		this.allMenus = allMenus;
	}
	
	public void printMenu(){
		allMenus.print();
	}
	
	public void printVegMenu(){
		Iterator<MenuComponent> iter = allMenus.iterator();
		System.out.println("\nVeg menu\n---");
		while(iter.hasNext()){
			MenuComponent menu = iter.next();
			try{
				if(menu.isVeg()){
					menu.print();
				}
			}catch(UnsupportedOperationException e){
				e.printStackTrace();
			}
		}
	}
}
