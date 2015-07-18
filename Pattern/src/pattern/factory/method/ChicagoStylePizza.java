package pattern.factory.method;

public class ChicagoStylePizza extends Pizza {
	@Override
	public void cut() {
		System.out.println("cut for square.");
	}

	@Override
	public String getName() {
		return "芝加哥风味";
	}
}
