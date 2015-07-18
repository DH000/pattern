package pattern.strategy;

public class Adding implements Arithmetic {

	@Override
	public void count(double a, double b) {
		System.out.println("result: " + (a + b));
	}

}
