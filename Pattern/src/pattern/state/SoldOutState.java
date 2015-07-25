package pattern.state;

/**
 * 
 * @ClassName: SoldOutState 
 * @Description: 售出状态
 * @author:	xuelin
 * @date: Jul 25, 2015 11:14:15 AM 
 *
 */
public class SoldOutState implements State {
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("you can't eject, you haven't inserted a quarter yet");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there are no quarter");
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispense");
	}

}
