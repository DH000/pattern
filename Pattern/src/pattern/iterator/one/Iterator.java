package pattern.iterator.one;

/**
 * 
 * 
 * @ClassName: Iterator 
 * @Description: 自定义对象村迭代器
 * @author:	xuelin
 * @date: Jul 18, 2015 5:47:10 PM 
 *
 */
public interface Iterator<T> {
	
	public boolean hasNext();
	
	public T next(); 
	
}
