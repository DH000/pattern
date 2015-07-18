package pattern.abstrac.factory;

/**
 * 
 * 原料工厂
 * 
 * @author Lin.Pc
 *
 */
public class ChicagoSourceFactory implements SourceFactory {

	@Override
	public Cheese createCheese() {
		System.out.println("chicago source");
		return new ReggianoCheese();
	}

}
