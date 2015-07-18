package pattern.observer;

/**
 * 观察者模式
 * 
 * @author Lin.Pc
 *
 */
public class MainClass {
	public static void main(String[] args) {
		ManObserver manObserver = new ManObserver();
		WomanObserver womanObserver = new WomanObserver();
		
		PaperSubject paperSubject = new PaperSubject();
		paperSubject.addObserver(manObserver);
		paperSubject.addObserver(womanObserver);
		
		paperSubject.update(new SubjectData());
	}
}
