package pattern.iterator.two;

import java.util.Iterator;

import pattern.iterator.one.MenuItem;

/**
 * 
 * 
 * @ClassName: DinerMenuIterator
 * @Description: 使用java提供迭代器
 * @author: xuelin
 * @date: Jul 18, 2015 6:44:24 PM
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
		if (position >= menuItems.length || null == menuItems[position]) {
			return false;
		}

		return true;
	}

	@Override
	public MenuItem next() {
		return menuItems[position++];
	}

	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalArgumentException("不能删除该元素直到完成最后一次next");
		}

		if (null != menuItems[position - 1]) {
			for (int i = position - 1, len = menuItems.length; i < len - 1; i++) {
				menuItems[i] = menuItems[i + 1];
			}
			menuItems[menuItems.length - 1] = null;
		}
	}
	
}
