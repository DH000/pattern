package pattern.adapter;

/**
 * 某种火鸡
 * 
 * @author Lin.Pc
 *
 */
public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("咯咯叫...");
	}

	@Override
	public void fly() {
		System.out.println("turkey fly.");
	}

}
