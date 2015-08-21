package pattern.proxy.dynamic;

import java.lang.reflect.Proxy;

import pattern.proxy.Subject;
import pattern.proxy.TargetSubject;

/**
 * 
 * @desc 被代理人
 * @author Harlin
 * @date
 */
public class MainClass {
	public static void main(String[] args) {
		Subject targetSubject = new TargetSubject();
		ProxyHandler handler = new ProxyHandler(targetSubject);
		
		// 代理
		Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), targetSubject.getClass().getInterfaces(), handler);
		subject.doSomething();
	}
}
