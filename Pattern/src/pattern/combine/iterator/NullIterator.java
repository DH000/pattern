package pattern.combine.iterator;

import java.util.Iterator;

/**
 * 
 * @ClassName: NullIterator 
 * @Description: 叶子迭代器
 * @author:	xuelin
 * @date: Jul 18, 2015 9:04:06 PM 
 *
 */
public class NullIterator implements Iterator<MenuComponent> {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public MenuComponent next() {
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
