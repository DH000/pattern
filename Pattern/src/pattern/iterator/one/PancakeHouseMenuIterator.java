package pattern.iterator.one;

import java.util.List;

/**
 * 
 * 
 * @ClassName: PancakeHouseMenuIterator 
 * @Description: 对象村餐厅自定义迭代器
 * @author:	xuelin
 * @date: Jul 18, 2015 6:18:30 PM 
 *
 */
public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
	private List<MenuItem> menuItems;
	private int position = 0;
	
	public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
		super();
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if(position >= menuItems.size()){
			return false;
		}
		
		return true;
	}

	@Override
	public MenuItem next() {
		return menuItems.get(position ++);
	}

}
