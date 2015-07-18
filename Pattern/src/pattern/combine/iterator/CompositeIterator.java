package pattern.combine.iterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * 
 * 
 * @ClassName: CompositeIterator
 * @Description: 自定义迭代器
 * @author: xuelin
 * @date: Jul 18, 2015 8:49:39 PM
 *
 */
public class CompositeIterator implements Iterator<MenuComponent> {
	private Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

	public CompositeIterator(Iterator<MenuComponent> iter) {
		super();
		this.stack.push(iter);
	}

	@Override
	public boolean hasNext() {
		if (stack.isEmpty()) {
			return false;
		}
		
		// 递归调用
		Iterator<MenuComponent> iter = stack.peek();
		if (!iter.hasNext()) {
			stack.pop();
			return hasNext();
		}

		return true;
	}

	@Override
	public MenuComponent next() {
		if(hasNext()){
			Iterator<MenuComponent> iter = stack.peek();
			MenuComponent menuComponent = iter.next();
			if(menuComponent instanceof Menu){
				// 父菜单
				stack.push(menuComponent.iterator());
			}
			return menuComponent;
		}
		
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
