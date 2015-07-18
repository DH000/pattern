package pattern.strategy;

/**
 * 计算器
 * 
 * @author Lin.Pc
 *
 */
public class Calculator {
	private Arithmetic arithmetic;
	
	public void showResult(double a, double b){
		arithmetic.count(a, b);
	}

	public void setArithmetic(Arithmetic arithmetic) {
		this.arithmetic = arithmetic;
	}
}
