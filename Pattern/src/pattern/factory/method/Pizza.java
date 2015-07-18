package pattern.factory.method;

/**
 * 
 * 工厂方法
 * 
 * @author Lin.Pc
 *
 */
public abstract class Pizza {
	public void prepare() {
		System.out.println("prepare...");
	}
	
	public void bake(){
		System.out.println("bake...");
	}
	
	public void cut(){
		System.out.println("cut...");
	}
	
	public void box(){
		System.out.println("box...");
	}
	
	public abstract String getName();
}
