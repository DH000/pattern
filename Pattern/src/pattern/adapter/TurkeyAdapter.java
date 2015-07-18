/**
 * 
 */
package pattern.adapter;

/**
 * 火鸡适配器
 * 
 * 本质是火鸡  火鸡->鸭子
 * 
 * @author Lin.Pc
 *
 */
public class TurkeyAdapter implements Duck {
	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey){
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		turkey.fly();
	}
}
