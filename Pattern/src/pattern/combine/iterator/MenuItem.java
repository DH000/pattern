package pattern.combine.iterator;

import java.util.Iterator;

/**
 * 
 * 
 * @ClassName: MenuItem 
 * @Description: 叶子菜单
 * @author:	xuelin
 * @date: Jul 18, 2015 8:10:39 PM 
 *
 */
public class MenuItem extends MenuComponent{
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
	
	/**
	 * 是否为素菜
	 * 
	 */
	private boolean isVeg;
	
	/**
	 * 菜单价格
	 * 
	 */
	private double price;

	public MenuItem(String name, String desc, boolean isVeg, double price) {
		super();
		this.name = name;
		this.desc = desc;
		this.isVeg = isVeg;
		this.price = price;
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
	public boolean isVeg() {
		return isVeg;
	}

	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}

	@Override
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public Iterator<MenuComponent> iterator() {
		return new NullIterator();
	}
	
	@Override
	public void print(){
		System.out.print(" " + getName());
		if(isVeg()){
			System.out.print("(V)");
		}
		System.out.println(", " + getPrice());
		System.out.println("   --- " + getDesc());
	}
}

