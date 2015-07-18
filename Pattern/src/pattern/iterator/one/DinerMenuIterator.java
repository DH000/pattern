package pattern.iterator.one;


/**
 * 
 * @ClassName: DinerMenuIterator 
 * @Description: 对象村煎饼店迭代器
 * @author:	xuelin
 * @date: Jul 18, 2015 5:59:51 PM 
 *
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
	private MenuItem[] menuItems;
	private int position = 0;

	public DinerMenuIterator(MenuItem[] menuItems) {
		super();
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if(position >= menuItems.length || null == menuItems[position]){
			return false;
		}
		
		return true;
	}

	@Override
	public MenuItem next() {
		return menuItems[position ++];
	}

}
