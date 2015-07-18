/**
 * Project Name:Pattern
 * File Name:MenuItem.java
 * Package Name:pattern.iterator.one
 * Date:Jul 18, 20155:04:14 PM
 * Copyright (c) 2015, chenzhou1025@126.com All Rights Reserved.
 *
*/

package pattern.iterator.one;
/**
 * ClassName:MenuItem <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     Jul 18, 2015 5:04:14 PM <br/>
 * @author   Lin.Pc
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class MenuItem {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean isVeg() {
		return isVeg;
	}

	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}

