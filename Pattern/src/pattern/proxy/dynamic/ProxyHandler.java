package pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 
 * 
 * @desc   代理handler
 * @author Harlin
 * @date
 */
public class ProxyHandler implements InvocationHandler {
	private Object subject;
	
	public ProxyHandler(Object subject){
		this.subject = subject;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		// 代理前
		System.out.println("pre...");
		
		// 执行代理
		Object obj = method.invoke(this.subject, args);
		
		// 代理后
		System.out.println("post...");
		return obj;
	}
	
}
