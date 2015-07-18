package pattern.observer;

/**
 * 观察者模式
 * 
 * @author Lin.Pc
 *
 */
public interface Subject {
	public void update(SubjectData data);
	
	public void addObserver(Observer observer);
	
	public void removeObserver(Observer observer);
}
