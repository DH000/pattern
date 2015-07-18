package pattern.strategy;

/**
 * 策略模式
 * 
 * @author Lin.Pc
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.setArithmetic(new Adding());
		calculator.showResult(10, 5);
	}
}
