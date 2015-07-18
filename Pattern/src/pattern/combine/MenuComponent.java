package pattern.combine;

/**
 * 
 * 
 * @ClassName: MenuComponent 
 * @Description: 菜单组件
 * @author:	xuelin
 * @date: Jul 18, 2015 8:14:41 PM 
 *
 */
public abstract class MenuComponent {
	
	public void add(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	
	public MenuComponent getChild(int i){
		throw new UnsupportedOperationException();
	}
	
	public String getName(){
		throw new UnsupportedOperationException();
	}
	
	public String getDesc(){
		throw new UnsupportedOperationException();
	}
	
	public double getPrice(){
		throw new UnsupportedOperationException();
	}
	
	public boolean isVeg() {
		throw new UnsupportedOperationException();
	}
	
	public void print(){
		throw new UnsupportedOperationException();
	}
	
}
