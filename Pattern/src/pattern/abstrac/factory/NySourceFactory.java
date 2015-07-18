package pattern.abstrac.factory;

public class NySourceFactory implements SourceFactory {

	@Override
	public Cheese createCheese() {
		System.out.println("Ny source.");
		return new MozzCheese();
	}

}
