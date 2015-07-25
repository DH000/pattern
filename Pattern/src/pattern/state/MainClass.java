package pattern.state;

/**
 * 
 * @ClassName: MainClass
 * @Description: 状态模式
 * @author: xuelin
 * @date: Jul 25, 2015 11:52:22 AM
 *
 */
public class MainClass {
	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println("=======================");
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println("=======================");
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
	}
}
