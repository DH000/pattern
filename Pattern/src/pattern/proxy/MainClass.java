package pattern.proxy;

/**
 * 
 * @desc   被代理人
 * @author Harlin
 * @date
 */
public class MainClass {
	public static void main(String[] args) {
		Subject subject = new ProxySubject();
		subject.doSomething();
	}
}
