package pattern.adapter;


/**
 * 绿头鸭
 * 
 * @author Lin.Pc
 *
 */
public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("呱呱叫...");
	}

	@Override
	public void fly() {
		System.out.println("duck fly.");
	}

}
