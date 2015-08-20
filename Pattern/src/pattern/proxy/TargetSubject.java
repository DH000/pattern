package pattern.proxy;

/**
 * 
 * @desc   目标
 * @author Harlin
 * @date   2015-08-20
 */
public class TargetSubject implements Subject {
	
	@Override
	public void doSomething() {
		System.out.println("doing...");
	}
	
}
