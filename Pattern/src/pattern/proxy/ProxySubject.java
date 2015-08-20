package pattern.proxy;

/**
 * 
 * @desc   代理人
 * @author Harlin
 * @date
 */
public class ProxySubject implements Subject {
	private Subject subject;
	
	public ProxySubject(){
		this.subject = new TargetSubject();
	}
	
	public ProxySubject(Subject subject){
		this.subject = subject;
	}
	
	@Override
	public void doSomething() {
		this.subject.doSomething();
	}
	
}
