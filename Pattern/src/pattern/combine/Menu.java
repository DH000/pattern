package pattern.combine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @ClassName: Menu 
 * @Description: 菜单项 可包含子菜单
 * @author:	xuelin
 * @date: Jul 18, 2015 8:13:20 PM 
 *
 */
public class Menu extends MenuComponent{
	/**
	 * 菜单名称
	 * 
	 */
	private String name;
	
	/**
	 * 菜单描述
	 * 
	 */
	private String desc;
	
	private List<MenuComponent> menus = new ArrayList<MenuComponent>();
	
	public Menu(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}
	
	@Override
	public void add(MenuComponent menuComponent) {
		menus.add(menuComponent);
	}
	
	@Override
	public void remove(MenuComponent menuComponent) {
		menus.remove(menuComponent);
	}
	
	@Override
	public MenuComponent getChild(int i) {
		return menus.get(i);
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public void print(){
		System.out.print("\n" + getName());
		System.out.println(", " + getDesc());
		System.out.println("-----------------");
		
		// 修正
		Iterator<MenuComponent> iter = menus.iterator();
		while(iter.hasNext()){
			iter.next().print();
		}
	}
}
