package pattern.singleton;

/**
 * 单例模式
 * 
 * @author Lin.Pc
 *
 */
public class Singleton {
	private static Singleton obj = null;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(null == obj){
			synchronized(Singleton.class){
				if(null == obj){
					obj = new Singleton();
				}
			}
		}
		
		return obj;
	}
	
	public void doSomething(){
		System.out.println("我是单例模式！");
	}
}
